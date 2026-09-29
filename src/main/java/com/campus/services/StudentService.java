package com.campus.services;

import java.util.*;
public class StudentService { 


    // This class can contain methods to perform operations related to students
// For example, it can have methods to calculate grades, generate report cards, etc.


private List<String> students = new ArrayList<>();

public List<String> getstudents(){
    return students;
}

public void addstudent(String name,String course){
    students.add("Student " + (students.size() + 1) + ": " + name + " - " + course);
}
}
