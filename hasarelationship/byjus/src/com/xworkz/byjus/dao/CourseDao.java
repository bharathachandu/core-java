package com.xworkz.byjus.dao;


import com.xworkz.byjus.dto.CourseDto;

public class CourseDao {

CourseDto dto;
    public boolean addCourse(CourseDto dto) {
        boolean isAdded = false;
        if (dto != null) {
            this.dto = dto;
            isAdded = true;
            System.out.println("Course added: " + dto.courseName);
        }
        return isAdded;
    }

    public void getCourseDetails() {
        System.out.println("Course Name: " + dto.courseName);
        System.out.println("Instructor: " + dto.instructor);
        System.out.println("Duration: " + dto.durationWeeks + " weeks");
        System.out.println("Fee: $" + dto.fee);
    }
}
