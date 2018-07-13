package JDBCDemo;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class JDBCDemo1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //注册驱动，告知jvm使用的是哪个数据库驱动
        //DriverManager.registerDriver(new Driver());//可以使用，但是不好，注册驱动注册了两次
        //new Driver();//就可以注册驱动，注册一次，也有缺点。写死了，只是mysql
        Class.forName("com.mysql.jdbc.Driver");//代码更具有通用性

        //获取连接，获取与数据库的连接
        String url = "jdbc:mysql://localhost:3306/wangty";
        String name = "root";
        String passWord = "root";
        Connection c = DriverManager.getConnection(url, name, passWord);
        System.out.println(c);

        //获取执行sql语句的对象，在连接通路中获取一个执行sql语句的对象
        Statement s = c.createStatement();
        //执行sql，返回结果
        String sql = "select * from student";
        String sql1 = "update student set age='188' where name='小明';";
        //s.executeUpdate(sql);只能执行增删改sql
        int i = s.executeUpdate(sql1);
        System.out.println(i);
        //只能查询
        ResultSet rs = s.executeQuery(sql);
        //处理结果集
        while (rs.next()) {
            int id = rs.getInt("id");
            Object NAME = rs.getObject("NAME");
            Object sex = rs.getObject("sex");
            Object age = rs.getObject("age");
            Object score = rs.getObject("score");

            System.out.print(id);
            System.out.print(NAME);
            System.out.print(sex);
            System.out.print(age);
            System.out.print(score);
            System.out.println();
            System.out.println("=================");
        }


        //释放资源
        s.close();
        c.close();

    }
}
