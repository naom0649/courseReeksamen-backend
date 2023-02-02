package com.example.coursereeksamen.course;


import com.example.coursereeksamen.student.Student;
import com.example.coursereeksamen.teacher.Teacher;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

@Table(name="course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="courseID")
    private Long id;

    @Column(name="courseName")
    private String name;

    @Column(name="courseStartDate")
    private String startDate;

    @Column(name = "courseEndDate")
    private String endDate;

    @Column(name="courseEctsPoints")
    private int ectsPoins;

    @Column(name = "courseMaxStudent")
    private int maxStudent;

    @ManyToOne
    Teacher teacher;

    @ManyToOne
    Student student;
}
