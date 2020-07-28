package com.academia.learning.tutoring.domain;

import com.academia.learning.tutoring.models.Course;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface CourseDao{
    Optional <Course>get(Long id);
    Collection<Course> getAll();
    void save (Course course);
    void update(Course course);
    void delete (Course course);

    public List<Course> search(String courseOrTeacherName);
    public List<Course> search(String courseName, String teacherName);


}


