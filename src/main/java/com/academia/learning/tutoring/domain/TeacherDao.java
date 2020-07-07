package com.academia.learning.tutoring.domain;

import java.util.Collection;
import java.util.Optional;

public interface TeacherDao <Teacher>{
    Optional<Teacher> get(Long id);
    Collection<Teacher> getAll();
    int save (Teacher teacher);
    void update(Teacher teacher);
    void delete (Teacher teacher);
}
