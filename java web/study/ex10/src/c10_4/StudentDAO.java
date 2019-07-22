package c10_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class StudentDAO {
    public void testConnect() throws Exception{
        Connection conn = null;
//        ArrayList students = new ArrayList();


        String driver_path = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
        String user_name = "root";
        String password = "Nibuguai0407.";

        Class.forName(driver_path);
        conn = DriverManager.getConnection(url,user_name,password);
        if (conn != null){
            System.out.println("连接成功！");
        }else {
            System.out.println("连接失败！");
        }


    }
}
