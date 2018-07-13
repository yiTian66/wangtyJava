package wtyDemo;

import java.io.IOException;
import java.util.ArrayList;

public class PingTest {

    public static void main(String[] args) {
        // 执行 cmd 命令 ping
        try {
            Process pro = Runtime.getRuntime().exec("cmd /c ping www.baidu.com>d:/下载/temp.txt");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

//        StringBuffer path = Conver.nsb("d:/下载/temp.txt");
//
//// 读取文件的第10行显示的平均值
//        ArrayList<StringBuffer> fileData = ReadData.readLine(path, 10, 11);
//        StringBuffer str = Conver.arrayStrToStr(fileData); // 转换为一行字符串
//
//// 拷贝从"平均 = " 到末尾中间的字符串
//        StringBuffer speed = SubStr.strInCopyStr(str, Conver.nsb("平均 = "), Conver.nsb("-1"), 0, 0);
//
//        System.out.println(speed);
    }
}
