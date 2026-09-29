package com.campus.controller;

import jakarta.servlet.annotation.webservlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.campus.services.StudentService;

@webservlet("/student")
public class StudentServlet extends HttpServlet {
    private final StudentService studentService = new StudentService();

    @Override
    public void doGet(httpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>List of Students</title></head>");
        out.println("<body>");

        out.println("<h1>All Students</h1>");
        out.println("<ul>");
        for (String student : studentService.getstudents()) {
            out.println("<li>" + student + "</li>");
        }
        out.println("</ul>");
        out.println("<a href=\"/student.html\">Add New Student</a>");
        out.println("</body>");
        out.println("</html>");
    }
    // This class can be used to handle HTTP requests related to student operations
    // For example, it can have methods to handle GET and POST requests for student data
}