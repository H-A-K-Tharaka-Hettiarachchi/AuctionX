package com.kshprimeindustries.auctionx.web;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kshprimeindustries.auctionx.dao.SignUpDAO;
import com.kshprimeindustries.auctionx.dto.ResponseDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ResponseDTO responseDTO = new ResponseDTO();

        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();

        SignUpDAO signUpDAO = gson.fromJson(request.getReader(), SignUpDAO.class);


        if (signUpDAO.getUsername().isEmpty()) {
            responseDTO.setSuccess(false);
            responseDTO.setMessage("Username cannot be empty");
        } else if (signUpDAO.getEmail().isEmpty()) {
            responseDTO.setSuccess(false);
            responseDTO.setMessage("Email cannot be empty");
        } else if (signUpDAO.getPassword().isEmpty()) {
            responseDTO.setSuccess(false);
            responseDTO.setMessage("Password cannot be empty");
        } else if (signUpDAO.getConfirmPassword().isEmpty()) {
            responseDTO.setSuccess(false);
            responseDTO.setMessage("Confirm Password cannot be empty");
        } else {

        }


        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(gson.toJson(responseDTO));
    }
}
