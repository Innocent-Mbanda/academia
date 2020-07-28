package com.academia.learning.tutoring.controllers;


import com.academia.learning.tutoring.domain.CourseDaoImpl;
import com.academia.learning.tutoring.models.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseDaoImpl courseDao;
    @GetMapping(path ="/courses" ,consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<Course>> searchingCourses(@RequestParam(value = "teacherName",required = false) String teacherName,
                                                         @RequestParam(value = "courseName", required = false) String courseName){
         List<Course> courses =courseDao.search(courseName,teacherName);
        return new ResponseEntity<>(courses, HttpStatus.OK);

    }




}
