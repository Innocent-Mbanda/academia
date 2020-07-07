package com.academia.learning.tutoring.Repositories;

import com.academia.learning.tutoring.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo  extends JpaRepository<Course, Long> {
}
