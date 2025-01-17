package user.dao;

import user.model.UserSignup;
import user.utils.ConnectionUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    private Connection connection;

    public UserDao(Connection connection) {
        this.connection = ConnectionUtils.getConnection();
    }

    public void addUser(UserSignup users){

        try{
            PreparedStatement preparedStatement =
                    connection.prepareStatement("INSERT INTO users (firstName, lastName, email, password) VALUES (?, ?, ?, ?)");
            preparedStatement.setString(1, users.getFirstName());
            preparedStatement.setString(2, users.getLastName());
            preparedStatement.setString(3, users.getEmail());
            preparedStatement.setString(4, users.getPassword());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
