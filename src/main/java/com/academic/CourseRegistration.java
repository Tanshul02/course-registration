package com.academic;

import java.util.ArrayList;
import java.util.List;

public class CourseRegistration {

    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {

        if (course != null) {
            courses.add(course);
        }
    }

    public int calculateTotalCredits() {

        int total = 0;

        for (Course course : courses) {
            total += course.getCredits();
        }

        return total;
    }

    public boolean isEligible() {

        return calculateTotalCredits() >= 15;
    }

    public double calculateAverageMarks() {

        if (courses.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (Course course : courses) {
            total += course.getMarks();
        }

        return total / courses.size();
    }

    public String getAcademicPerformance() {

        double average = calculateAverageMarks();

        if (average >= 90) {
            return "Excellent";
        } else if (average >= 75) {
            return "Very Good";
        } else if (average >= 60) {
            return "Good";
        } else if (average >= 50) {
            return "Average";
        } else {
            return "Needs Improvement";
        }
    }

    public void displayReport() {

        System.out.println("----- Academic Performance -----");

        for (Course course : courses) {

            System.out.println(
                    course.getCourseCode()
                    + " - "
                    + course.getCourseName()
                    + " | Credits: "
                    + course.getCredits()
                    + " | Marks: "
                    + course.getMarks()
                    + " | Grade: "
                    + course.getGrade()
            );
        }

        System.out.println("Total Credits: " + calculateTotalCredits());

        System.out.println(
                "Average Marks: " + calculateAverageMarks()
        );

        System.out.println(
                "Registration Eligibility: "
                + (isEligible() ? "Eligible" : "Not Eligible")
        );

        System.out.println(
                "Academic Performance: "
                + getAcademicPerformance()
        );
    }

    public static void main(String[] args) {

        CourseRegistration registration = new CourseRegistration();

        registration.addCourse(
                new Course("ISWE201", "Data Structures", 4, 88)
        );

        registration.addCourse(
                new Course("ISWE202", "Operating Systems", 4, 91)
        );

        registration.addCourse(
                new Course("ISWE203", "Java Programming", 3, 84)
        );

        registration.addCourse(
                new Course("ISWE204", "Software Design", 4, 78)
        );

        registration.displayReport();
    }
}
