package com.academic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CourseRegistrationTest {

    @Test
    public void testTotalCredits() {

        CourseRegistration registration = new CourseRegistration();

        registration.addCourse(
                new Course("C1", "Java", 4, 85)
        );

        registration.addCourse(
                new Course("C2", "DSA", 4, 90)
        );

        registration.addCourse(
                new Course("C3", "OS", 4, 80)
        );

        registration.addCourse(
                new Course("C4", "SE", 3, 75)
        );

        assertEquals(15, registration.calculateTotalCredits());
    }

    @Test
    public void testEligibility() {

        CourseRegistration registration = new CourseRegistration();

        registration.addCourse(
                new Course("C1", "Java", 4, 85)
        );

        registration.addCourse(
                new Course("C2", "DSA", 4, 90)
        );

        registration.addCourse(
                new Course("C3", "OS", 4, 80)
        );

        registration.addCourse(
                new Course("C4", "SE", 3, 75)
        );

        assertTrue(registration.isEligible());
    }

    @Test
    public void testAcademicPerformance() {

        CourseRegistration registration = new CourseRegistration();

        registration.addCourse(
                new Course("C1", "Java", 4, 90)
        );

        registration.addCourse(
                new Course("C2", "DSA", 4, 95)
        );

        assertEquals(
                "Excellent",
                registration.getAcademicPerformance()
        );
    }

    @Test
    public void testGrade() {

        Course course =
                new Course("C1", "Java", 4, 85);

        assertEquals("A", course.getGrade());
    }
}
