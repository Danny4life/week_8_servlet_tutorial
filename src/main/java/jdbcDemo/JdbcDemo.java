package jdbcDemo;


import java.sql.*;

//1. Register the Driver class
//2. Create connection
//3. Create statement
//4. Execute queries
//5. Close connection
//6. create a database and a table and insert data into it manually
public class JdbcDemo {
    public static void main(String[] args) {
        // database name here
        String url = "jdbc:mysql://localhost:3306/user";
        String username = "root";
        String password = "PASSword1234!#";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            // table name here
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) +
                        " " + resultSet.getString(2) +
                        " " + resultSet.getString(3) +
                        " " + resultSet.getString(4) +
                        " " + resultSet.getString(5));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
           e.printStackTrace();
        }

    }
}
