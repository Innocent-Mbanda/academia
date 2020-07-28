package com.academia.learning.tutoring.Repositories;

import com.academia.learning.tutoring.models.Course;
import com.academia.learning.tutoring.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepo  extends JpaRepository<Course, Long> {
    List <Course> findByNameAndTeacher(String name, Teacher teacher);
}
