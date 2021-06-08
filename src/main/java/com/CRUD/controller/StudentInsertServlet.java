package com.CRUD.controller;

import com.CRUD.pojo.Message;
import com.CRUD.pojo.Student;
import com.CRUD.service.StudentServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * insert student by Student entity
 * 接受前台参数，添加student信息
 * 并转发到/usr/fetchStudent，重新刷新
 */
@WebServlet(name = "StudentInsertServlet", value = "/usr/insertStudent")
public class StudentInsertServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String stuid = request.getParameter("stuid");
        String stuname = request.getParameter("stuname");
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        String major_id = request.getParameter("major_id");

        Student student = new Student();
        student.setStuid(Integer.valueOf(stuid));
        student.setStuname(stuname);
        student.setAge(Integer.valueOf(age));
        student.setGender(gender);
        student.setMajor_id(Integer.valueOf(major_id));

        StudentServiceImpl studentService = new StudentServiceImpl();
        Message message = studentService.insertStudent(student);
        request.setAttribute("message", message);
        request.getRequestDispatcher("/usr/fetchStudent").forward(request,response);
    }
}
