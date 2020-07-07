package com.academia.learning.tutoring.controllers;

import com.academia.learning.tutoring.domain.CourseDaoImpl;
import com.academia.learning.tutoring.models.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    @Autowired
    CourseDaoImpl courseDao;
    @PostMapping (path = "/addCourse", consumes = "application/json", produces = "application/json")

    public void createCourse( @RequestBody Course course){
        courseDao.save(course);




    }

}
