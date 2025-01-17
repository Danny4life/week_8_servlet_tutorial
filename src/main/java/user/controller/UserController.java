package user.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import user.dao.UserDao;
import user.model.UserSignup;
import user.utils.ConnectionUtils;

import java.io.IOException;

@WebServlet(name = "user", value = "/signup")
public class UserController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");


        UserSignup user = new UserSignup(firstName, lastName, email, password);
        UserDao userDao = new UserDao(ConnectionUtils.getConnection());
        userDao.addUser(user);


        response.sendRedirect("signup-success.jsp");




    }
}
