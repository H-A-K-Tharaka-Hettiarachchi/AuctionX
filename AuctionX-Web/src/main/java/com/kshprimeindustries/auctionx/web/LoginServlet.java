package com.kshprimeindustries.auctionx.web;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kshprimeindustries.auctionx.dao.LogInDAO;
import com.kshprimeindustries.auctionx.dto.ResponseDTO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


// LoginServlet.java
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        ResponseDTO responseDTO = new ResponseDTO();

        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();

        LogInDAO logInDAO = gson.fromJson(request.getReader(), LogInDAO.class);

        System.out.println(logInDAO.getUsername());
        System.out.println(logInDAO.getPassword());

        if (logInDAO.getUsername().isEmpty()) {
            responseDTO.setSuccess(false);
            responseDTO.setMessage("Username cannot be empty");
        } else if (logInDAO.getPassword().isEmpty()) {
            responseDTO.setSuccess(false);
            responseDTO.setMessage("Password cannot be empty");
        }else {

        }


        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(gson.toJson(responseDTO));

    }
}
