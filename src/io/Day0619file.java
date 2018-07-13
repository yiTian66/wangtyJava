package io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Day0619file {
    public static void main(String[] args) throws IOException {
        //feil类的构造方法,不校验文件是否存在
        String pathName = "D:\\linshi\\1.txt";
        File file = new File(pathName);
        System.out.println(file);
        System.out.println("==========================");
        // feil类的构造方法,不校验文件是否存在
        File file1 = new File("D:\\linshi", "2.txt");
        System.out.println(file1);
        System.out.println("==========================");
        // feil类的构造方法,不校验文件是否存在
        File file2 = new File("D:\\linshi");
        File file3 = new File(file2, "3.txt");
        System.out.println(file3);
        //feil的常用方法
        System.out.println("feil的常用方法");
        file1.length();
        String absolutePath = file1.getAbsolutePath();
        String path = file1.getPath();
        String name = file1.getName();
        long totalSpace = file1.getTotalSpace();
        System.out.println("absolutePath" + absolutePath);
        System.out.println("path" + path);
        System.out.println("name" + name);
        System.out.println("totalSpace" + totalSpace);
        //存在了就不在创建了，没有则创建。只能创建文件
        boolean flag = file.createNewFile();
        System.out.println(flag);
        //创建文件夹，没有则创建，有就不再创建了;mkdir创建单级文件夹，mkdirs创建多级文件夹
        File file4 = new File("d:\\linshi\\文件夹\\文件\\夹\\jia\\ia\\a");
        //boolean mkdir = file4.mkdir();
        boolean mkdirs = file4.mkdirs();
        System.out.println("" + mkdirs);
        //删除方法.删除不走回收站，小心使用。只能删除单级文件夹，只能逐级删除
        boolean delete = file4.delete();
        System.out.println("delete" + delete);
        //list方法
        System.out.println("list方法");
        File file5 = new File("d:\\linshi");
        String[] list = file5.list();
        long l1 = file5.lastModified();
        System.out.println(l1);
        for (String l : list
                ) {
            System.out.println(l);

        }

        filter(new File("d:\\linshi"), ".txt");
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                //判断是否为文件
                if (pathname.isDirectory()) {
                    return false;

                }

                if (pathname.getName().toLowerCase().endsWith(".txt")) {

                    return true;
                }

                return false;
            }
        };


        File file6 = new File("d:\\linshi");
        System.out.println("===========file6==========");
        dg(file6);
        System.out.println("===========file6==========");

        File[] files = file6.listFiles(fileFilter);
        for (File f: files
             ) {
            System.out.println("文件过滤器    "+f.getName());

        }

    }


    /**
     * 文件过滤器，过滤指定条件的文件
     *
     * @param file
     * @param condition
     */
    public static void filter(File file, String condition) {
        //判断file是否存在
        if (file.exists() && file.isDirectory()) {
            //遍历file下的所有文件
            File[] files = file.listFiles();
            for (File f : files
                    ) {
                String name = f.getName();
                if (name.endsWith(condition)) {
                    System.out.println(condition + "====" + name);
                }

            }


        } else {
            System.out.println("file不存在");
        }


    }

    /**
     * 递归打印所有fiel里的子目录
     * @param file
     */
    public static void dg(File file){

        File[] files = file.listFiles();
            for (File f: files
                 ) {
                if (f.isDirectory()){
                    dg(f);
                }else {
                    String absolutePath = f.getAbsolutePath();
                    System.out.println("absolutePath-------------"+absolutePath);

                }

            }




    }





}
