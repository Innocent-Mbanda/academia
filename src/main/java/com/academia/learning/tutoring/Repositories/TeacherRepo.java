package com.academia.learning.tutoring.Repositories;

import com.academia.learning.tutoring.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeacherRepo extends JpaRepository<Teacher, Long> {
  Optional<Teacher> findByName(String name);
}
