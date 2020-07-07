package com.academia.learning.tutoring.Repositories;

import com.academia.learning.tutoring.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher, Long> {

}
