package JDBCDemo;

import java.sql.*;

public class Databaseconnection {
    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:" +
                    "//127.0.0.1:3306/wangty?useSSL=false", "root", "root");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) throws SQLException {
        Databaseconnection c = new Databaseconnection();
        Connection cc = c.getConnection();
        Statement s = cc.createStatement();
        ResultSet resultSet = s.executeQuery("SELECT  * FROM student");

        System.out.println("请去输入正确的登录码吧0.0");
    }
}