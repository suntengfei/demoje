package cn.yd.oa.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123123");
            //System.out.println(conn.toString());
            return conn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
