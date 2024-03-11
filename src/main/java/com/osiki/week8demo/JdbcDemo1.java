package com.osiki.week8demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
            int insertData =
                    statement.executeUpdate("INSERT INTO user VALUES(2, 'Arya', 'Stark', 'aya@gmail.com', '12345')");

            System.out.println(insertData + " records inserted");

            connection.close();

        } catch (SQLException e) {
           e.printStackTrace();
        } catch (ClassNotFoundException e) {
           e.printStackTrace();
        }
    }
}
