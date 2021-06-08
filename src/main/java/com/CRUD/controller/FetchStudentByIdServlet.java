package com.CRUD.controller;

import com.CRUD.service.StudentServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;

/**
 * update修改的业务
 * 查询student根据id
 * 接受前台的parameter stuid
 * 根据id查询student的信息，并回显到/view/studentUpdate.jsp页面中
 */
@WebServlet(name = "FetchStudentByIdServlet", value = "/usr/fetchStudentById")
public class FetchStudentByIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String stuid = request.getParameter("stuid");
        StudentServiceImpl studentService = new StudentServiceImpl();
        Map map = studentService.fetchStudentById(stuid);
        request.setAttribute("student", map);
        request.getRequestDispatcher("/view/studentUpdate.jsp").forward(request, response);
    }
}
