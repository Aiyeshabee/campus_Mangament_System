package com.campus.model;

public class ScholarshipStudent {
    private double scholarshipAmount;

    public scholarship
    public class ScholarshipStudent extends Student {

    private double scholarshipPercentage;

    public ScholarshipStudent(int studentId, String studentName, double scholarshipPercentage) {
        super(studentId, studentName);
        this.scholarshipPercentage = scholarshipPercentage;
    }

    // getters and setters
    public double getScholarshipPercentage() {
        return scholarshipPercentage;
    }

    public void setScholarshipPercentage(double scholarshipPercentage) {
        this.scholarshipPercentage = scholarshipPercentage;
    }
}

@override
public void studentType() {
    System.out.println("Scholarship Student");
}
@override
public void displayStudentInfo() {
    super.displayStudentInfo();
    System.out.println("Scholarship Percentage: " + scholarshipPercentage);
}
@override
public void displayStudentInfo(boolean showMarks) {
    super.displayStudentInfo(showMarks);
}
