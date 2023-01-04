package org.example.geeksforgeeks.model;

public class CourseFactory {
    public static GIITCourses getCourses(){
        return new JavaCourses();
    }
}
