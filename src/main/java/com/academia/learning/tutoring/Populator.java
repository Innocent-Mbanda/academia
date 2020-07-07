package com.academia.learning.tutoring;

import com.academia.learning.tutoring.Repositories.TeacherRepo;
import com.academia.learning.tutoring.models.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Populator {
    @EventListener
    public void seed(ContextRefreshedEvent event) {
        seedTeacherTable();

    }

     @Autowired
    TeacherRepo teacherRepo;
    private void seedTeacherTable() {
        Teacher teacher = new Teacher(1l,"BOB","MBA");
        teacherRepo.save(teacher);

    }




}
