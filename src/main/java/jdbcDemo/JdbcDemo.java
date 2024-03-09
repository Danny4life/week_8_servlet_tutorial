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
            // Register the Driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection connection = DriverManager.getConnection(url, username, password);

            //Create statement
            Statement statement = connection.createStatement();

            //1. CREATE do this first use this to insert data into the db

            int insert = statement.executeUpdate("INSERT INTO users VALUES (1, 'Arya', 'Stark', 'ay@gmail.com', '00000')");

            System.out.println(insert + " records inserted");


            //2. READ do this second table name here -- sql command to read all entries
           // Execute queries

            //ResultSet result = statement.executeQuery("SELECT * FROM users");

            // do this third sql command to get a read a single entry
            //ResultSet result = statement.executeQuery("SELECT * FROM users WHERE id = 1");

//
//            while (result.next()){
//                System.out.println(result.getInt(1) +
//                        " " + result.getString(2) +
//                        " " + result.getString(3) +
//                        " " + result.getString(4) +
//                        " " + result.getString(5));
//            }

            // 3 UPDATE -- do this thirdly

            //int update = statement.executeUpdate("UPDATE users SET firstName='joy', lastName='omo' WHERE id = 1");
           // System.out.println(update + " record affected");

            // 4 DELETE -- do this lastly

            //int delete = statement.executeUpdate("DELETE FROM users WHERE id = 4");
             //System.out.println(delete + " record deleted!");

            //Close connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
           e.printStackTrace();
        }

    }
}
