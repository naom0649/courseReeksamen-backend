package com.example.coursereeksamen.student;


import com.example.coursereeksamen.course.Course;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter


@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="studentID")
    private Long id;

    @Column(name = "studentName")
    private String name;

    @Column(name = "studentEmailAddress")
    private String emailAddress;

    @OneToMany(mappedBy = "student")
    List<Course> listOfCourse;

    public Student(Long id, String name, String emailAddress) {
        this.id = id;
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public Student() {

    }
}
