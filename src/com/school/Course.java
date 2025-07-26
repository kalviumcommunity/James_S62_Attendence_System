package com.school;

public class Course {
    // String courseId; // e.g., "CS101"
    int courseId;
    String courseName;
    private static int nextCourseIdCounter = 101;

    // public void setDetails(String id, String cName) {
    //     this.courseId = id;
    //     this.courseName = cName;
    // }

    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

    public void displayDetails() {
        // System.out.println("Course ID: " + this.courseId + ", Name: " + this.courseName);
        System.out.println("Course ID: C" + this.courseId + ", Name: " + this.courseName);
    }
}

