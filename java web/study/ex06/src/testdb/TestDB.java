//package testdb;
//
//import java.sql.*;
//
//public class TestDB {
//    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
//    private static final String URL = "jdbc:mysql://localhost:3307/jspdb?serverTimezone=UTC";
//    private static final String USER_NAME = "root";
//    private static final String PASSWORD = "123456";
//
//    public static void main(String[] args) {
//        Connection con = null;
//        try {
//            Class.forName(DRIVER_NAME);
//            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
//            String sql = "SELECT * FROM goods";
//            PreparedStatement preparedStatement = con.prepareStatement(sql);
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()){
//                System.out.println("商品名称：" + resultSet.getString("goodsname")
//                        + "\t价格" + resultSet.getString("price"));
//
//            }
//            resultSet.close();
//            preparedStatement.close();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            if (con != null){
//                try {
//                    con.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//}
