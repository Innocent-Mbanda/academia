package com.academia.learning.tutoring.domain;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
@Service//mast have this tag to use this service class.
public class TeacherDaoImpl implements TeacherDao {
    @Override
    public Optional get(Long id) {
        return Optional.empty();
    }

    @Override
    public Collection getAll() {
        return null;
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
}
