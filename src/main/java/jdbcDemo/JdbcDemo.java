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
        String url = "jdbc:mysql://localhost:3306/user1";
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

            int insert = statement.executeUpdate("INSERT INTO user VALUES (1, 'Arya', 'Stark', 'ay@gmail.com', '00000')");
            //int insert1 = statement.executeUpdate("INSERT INTO user VALUES (2, 'kit', 'Stark', 'ay@gmail.com', '00000')");

            System.out.println(insert + " records inserted");
            //System.out.println(insert1 + " records inserted");


            //2A. READ do this second table name here -- sql command to read all entries
           // Execute queries

            // use this to select all users from db
           // ResultSet result = statement.executeQuery("SELECT * FROM user");

            //2B do this third sql command to read a single entry from db
            //ResultSet result = statement.executeQuery("SELECT * FROM user WHERE userId = 1");


            // use this to read data
//            while (result.next()){
//                System.out.println(result.getInt(1) +
//                        " " + result.getString(2) +
//                        " " + result.getString(3) +
//                        " " + result.getString(4) +
//                        " " + result.getString(5));
//            }

            // 3 UPDATE -- do this thirdly

            //int update = statement.executeUpdate("UPDATE user SET firstName='joy', lastName='omo' WHERE userId = 1");
             //System.out.println(update + " record affected");

            // 4 DELETE -- do this lastly

//            int delete = statement.executeUpdate("DELETE FROM user WHERE userId = 1");
//             System.out.println(delete + " record deleted!");

            //Close connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
           e.printStackTrace();
        }

    }
}
