package com.academia.learning.tutoring.domain;

import com.academia.learning.tutoring.Repositories.CourseRepo;
import com.academia.learning.tutoring.Repositories.TeacherRepo;
import com.academia.learning.tutoring.models.Course;
import com.academia.learning.tutoring.models.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class CourseDaoImpl implements CourseDao {
    @Autowired
    CourseRepo courseRepo;
    @Autowired
    TeacherDaoImpl teacherDaoimpl;
    @Override
    public Optional get(Long id) {
        return Optional.empty();
    }

    @Override
    public Collection getAll() {
        return null;
    }

    @Override
    public void save(Course course) {
        Optional <Teacher> teacher = teacherDaoimpl.get(course.getTeacher().getTeacherId());
        if (teacher.isPresent()){
            course.setTeacher(teacher.get());
        }
        courseRepo.save(course);

    }

    @Override
    public void update(Course course) {

    }

    @Override
    public void delete(Course course) {

    }

  }

