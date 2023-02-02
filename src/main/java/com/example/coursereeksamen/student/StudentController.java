package com.example.coursereeksamen.student;

import com.example.coursereeksamen.teacher.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class StudentController {

    private StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/addStudent")
    public ResponseEntity<String> createStudent(@RequestBody Student student){
        studentService.save(student);

        return new ResponseEntity(student, HttpStatus.OK);
    }

}
