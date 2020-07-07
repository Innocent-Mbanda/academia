package com.academia.learning.tutoring.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Teacher {
    @Id
    @GeneratedValue
    long teacherId;
    String name;
    String qualification;
    @OneToMany (mappedBy = "teacher", cascade = CascadeType.ALL)
    Collection<Course> courses;

    public Teacher( Long teacherId, String name, String qualification){
        this.teacherId = teacherId;
        this.name = name;
        this.qualification = qualification;
        this.courses = new ArrayList<Course>();
    }

    public Teacher(){

    }
    public void AddCourse(Course course){
        this.courses.add(course);
    }


    public Long getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }

    public String getQualification() {
        return qualification;
    }

    public Collection<Course> getCourses() {
        return courses;
    }
}
