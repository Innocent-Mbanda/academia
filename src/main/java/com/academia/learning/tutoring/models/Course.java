package com.academia.learning.tutoring.models;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Course {
    @Id
    @GeneratedValue
    long id;
    String name;
    @ManyToOne
    @JoinColumn(name = "teacherId")
    Teacher teacher;
    Date time;


    public Course( Long id, String name, Teacher teacher, Date time){
        this.id =id;
        this.name = name;
        this. teacher= teacher;
        this.time = time;
    }

    public Course (){}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Date getTime() {
        return time;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
