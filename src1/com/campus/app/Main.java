package com.campus.app;

import java.util.Scanner;
import com.campus.model.Student;
import com.campus.service.StudentService;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //inputs from users
        System.out.println("Enter the student id ");
        int Studentid = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the student name ");
        String studentname = scanner.nextLine();
        System.out.println("Enter the student age ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the student department ");
        String department = scanner.nextLine();
        System.out.println(" number of subjects ");
        int n = scanner.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter the marks for " + n + " subjects: ");
        for (int i = 0; i < n; i++) {
            System.out.println("enter the marks for subject  + (i + 1) ");
            marks[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Enter the scholarship percentage ");
        double scholarshipPercentage = scanner.nextDouble();
        scanner.nextLine();
        Student student = new ScholarshipStudent(Studentid, studentname, age, department, marks);
        student.displaystudentinfo(true);
        Student.displaystudentcount();
        StudentService studentService = new StudentService();
        studentService.displayReportCard(student);
        scanner.close();
    }
}