package com.academia.learning.tutoring.domain;

import com.academia.learning.tutoring.Repositories.TeacherRepo;
import com.academia.learning.tutoring.models.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
@Service//mast have this tag to use this service class.
@Transactional
public class TeacherDaoImpl implements TeacherDao {
    @Autowired
    TeacherRepo teacherRepo;
    @Override
    public Optional get(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepo.findAll();
    }

    @Override
    public int save(Object o) {
        return 0;
    }

    @Override
    public void update(Object o) {

    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public Optional get(String name) {
        return teacherRepo.findByName(name);
    }


}
