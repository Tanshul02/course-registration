package com.academic;

public class Course {

    private String courseCode;
    private String courseName;
    private int credits;
    private double marks;

    public Course(String courseCode, String courseName, int credits, double marks) {

        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.marks = marks;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public double getMarks() {
        return marks;
    }

    public String getGrade() {

        if (marks >= 90) {
            return "S";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
