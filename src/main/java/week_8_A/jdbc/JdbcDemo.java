//package week_8_A.jdbc;
//
//import java.sql.*;
//
//public class JdbcDemo {
//    public static void main(String[] args) {
//
//        /**
//         * 1. Register the Driver class
//         * 2. Create connection
//         * 3. Create statement
//         * 4. Execute C.R.U.D queries
//         * 5. Close connection
//         * 6. Anonymous
//         */
//
//
//        String url = "jdbc:mysql://localhost:3306/myUser";
//        String username = "root";
//        String password = "PASSword1234!#";
//
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            Connection connection = DriverManager.getConnection(url, username, password);
//
//            Statement statement = connection.createStatement();
//
//            // CREATE
////            int insert = statement.executeUpdate
////                    ("INSERT INTO customer VALUES(3, 'Arya', 'Stark', 'arya@gmail.com', '0801234567')");
////
////            System.out.println(insert + " Records inserted successfully");
//
//            // READ
//            ResultSet result = statement.executeQuery("SELECT * FROM customer WHERE id = 3");
//
//            while (result.next()){
//                System.out.println(result.getInt(1) +
//                        " " + result.getString(2) +
//                        " " + result.getString(3) +
//                        " " + result.getString(4) +
//                        " " + result.getString(5));
//            }
//
//            connection.close();
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
