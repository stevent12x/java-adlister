package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.Users;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

        // TODO: ensure the submitted information is valid
        // TODO: create a new user based off of the submitted information
        // TODO: if a user was successfully created, send them to their profile
//
//        User newUser = new User(
//                request.getParameter("username"),
//                request.getParameter("email"),
//                request.getParameter("password")
//        );
//
//        DaoFactory.getUsersDao().insert(newUser);
//        if (newUser != null) {
//            response.sendRedirect("/profile");
//        } else {
//            response.sendRedirect("/login");
//        }


//        Or - - a different way without creating a new constructor //
        User newUser = new User();
                newUser.setUsername(request.getParameter("username"));
                newUser.setEmail(request.getParameter("email"));
                newUser.setPassword(request.getParameter("password"));
                long id = DaoFactory.getUsersDao().insert(newUser);
                newUser.setId(id);
                request.getSession().setAttribute("user", newUser);
                response.sendRedirect("/profile");

    }
}
