package com.campus.controller;

import jakarta.servlet.annotation.webservlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@webservlet("/student")
public class StudentServlet extends HttpServlet {
    // This class can be used to handle HTTP requests related to student operations
    // For example, it can have methods to handle GET and POST requests for student data
}