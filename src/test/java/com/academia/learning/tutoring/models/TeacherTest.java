package com.academia.learning.tutoring.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
    Teacher underTest;

    @BeforeEach
    void setUp() {
        underTest = new Teacher((long) 1, "Test","I am a teacher");
    }
    @Test
    public void testCreateaCourse(){
        assertTrue(underTest.getCourses().size() == 0);
        Course course = new Course(1L,"test",underTest,new Date());
        underTest.AddCourse(course);
        assertTrue(underTest.getCourses().size() == 1);

    }
}