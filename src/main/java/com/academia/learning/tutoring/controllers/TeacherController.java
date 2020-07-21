package com.academia.learning.tutoring.controllers;

import com.academia.learning.tutoring.domain.CourseDaoImpl;
import com.academia.learning.tutoring.domain.TeacherDao;
import com.academia.learning.tutoring.domain.TeacherDaoImpl;
import com.academia.learning.tutoring.models.Course;
import com.academia.learning.tutoring.models.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    CourseDaoImpl courseDao;
    @Autowired
    TeacherDaoImpl teacherDao;
    @PostMapping (path = "/addCourse", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Course> createCourse(@RequestBody Course course){
        courseDao.save(course);
        return new ResponseEntity<>(course,HttpStatus.CREATED);

    }

    @GetMapping(path = "/teachers", consumes = "application/json", produces = "application/json" )
    public ResponseEntity<List<Teacher>> getListOfTeachers(){
        return new ResponseEntity<>(teacherDao.getAll(),HttpStatus.OK);

    }

}
