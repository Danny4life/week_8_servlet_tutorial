import java.sql.*;

public class JdbcDemoClass {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbcDB";
        String username = "root";
        String password = "PASSword1234!#";

        try{
            // Register the Driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection connection = DriverManager.getConnection(url, username, password);


            // Create statement
            Statement statement = connection.createStatement();

            // 1 CREATE
            int insert = statement.executeUpdate("INSERT INTO user VALUES (1, 'John', 'Doe', 'john@gmail.com', '0000')");

            System.out.println(insert + " record inserted");

           //  2 READ
            ResultSet result = statement.executeQuery("SELECT * FROM user");

            while (result.next()){
                System.out.println(result.getInt(1) +
                        " " + result.getString(2) +
                        " " + result.getString(3) +
                        " " + result.getString(4));
            }

           //  3 UPDATE
            int update = statement.executeUpdate("UPDATE user SET firstName='Arya', lastname='Stark' WHERE id = 1");
            System.out.println(update + " record affected");

            // 4 DELETE
            int delete = statement.executeUpdate("DELETE FROM user WHERE id = 1");
            System.out.println(delete + " record affected");


            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
