package com.example.coursereeksamen.teacher;


import com.example.coursereeksamen.course.Course;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter

@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacherID")
    private Long id;

@Column(name = "teacherName")
    private String name;

@Column(name = "teacherEmilAddress")
    private String emailAddress;

@OneToMany(mappedBy = "teacher")
List<Course> listOfCourses;

    public Teacher(Long id, String name, String emailAddress) {
        this.id = id;
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public Teacher() {

    }
}
