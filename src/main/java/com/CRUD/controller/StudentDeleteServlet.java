package com.CRUD.controller;

import com.CRUD.pojo.Message;
import com.CRUD.service.StudentServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "StudentDeleteServlet", value = "/usr/deleteStudent")
public class StudentDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String stuid = request.getParameter("stuid");
        StudentServiceImpl studentService = new StudentServiceImpl();
        Message message = studentService.deleteStudent(stuid);
        request.setAttribute("message", message);
        request.getRequestDispatcher("/usr/fetchStudent").forward(request, response);
    }
}
