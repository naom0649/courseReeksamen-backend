package com.example.coursereeksamen.student;

import com.example.coursereeksamen.teacher.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository  <Student, Long> {
}
