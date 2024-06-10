package com.osiki.week8demo;

import java.sql.*;

public class JdbcDemo1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/userDB";
        String username = "root";
        String password = "PASSword1234!#";

        try{
            // Register Driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // create a statement
            Statement statement = connection.createStatement();

            // 1. insert data into DB
//            int insertData =
//                    statement.executeUpdate("INSERT INTO user VALUES(3, 'Kit', 'Harrignton', 'kit@gmail.com', '12345')");
//
//            System.out.println(insertData + " records inserted");

            // Read a single entry
//            ResultSet result = statement.executeQuery("SELECT * FROM user WHERE id = 1");
//
//            while (result.next()){
//                System.out.println(result.getInt(1) +
//                        " " + result.getString(2) +
//                        " " + result.getString(3) +
//                        " " + result.getString(4) +
//                        " " + result.getString(5));
//            }

//            int update = statement.executeUpdate("UPDATE user SET " +
//                    "firstName='joy', lastName='omo' WHERE id=1");
//
//            System.out.println(update + " record affected");

            // Delete data
           int delete = statement.executeUpdate("DELETE FROM user");
            System.out.println(delete + " delete record");

            connection.close();

        } catch (SQLException e) {
           e.printStackTrace();
        } catch (ClassNotFoundException e) {
           e.printStackTrace();
        }
    }
}
