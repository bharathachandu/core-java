package com.xworkz.byjus;

import com.xworkz.byjus.dao.CourseDao;
import com.xworkz.byjus.dto.CourseDto;

public class CourseRunner {

    public static void main(String[] args) {

        CourseDto dto = new CourseDto();
        dto.courseName = "Java Programming";
        dto.instructor = "John Doe";
        dto.durationWeeks = 12;
        dto.fee = 299.99;

        CourseDao dao = new CourseDao();
        dao.addCourse(dto);
        dao.getCourseDetails();
    }
}
