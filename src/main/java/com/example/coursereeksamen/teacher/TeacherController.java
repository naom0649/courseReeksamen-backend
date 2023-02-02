package com.example.coursereeksamen.teacher;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@CrossOrigin
public class TeacherController {

    private TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    //Tilføje lærer
    @PostMapping("/addTeacher")
    public ResponseEntity<String> createTeacher(@RequestBody Teacher teacher){
        teacherService.save(teacher);

        return new ResponseEntity(teacher, HttpStatus.OK);
    }

    //Find alle lærer
    @GetMapping("/findAllTeachers")

    public ResponseEntity<Set<Teacher>> findAllTeachers(){
        Set<Teacher>teachers = teacherService.findAll();
        return new ResponseEntity<>(teachers, HttpStatus.OK);
    }

    //Find lærer ved id
    @GetMapping("/findById/{id}")
    public ResponseEntity<Teacher> findById(@PathVariable("id") Long teacherId){
        if( teacherService.findById(teacherId).isPresent()){
            Teacher chosenTeacher = teacherService.findById(teacherId).get();
            System.out.println("test");
            return new ResponseEntity<>(chosenTeacher,HttpStatus.OK);
        } else {

            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

    }

    // Find lærer ved navn
    @GetMapping("/findTeacherByName/{name}")

    public ResponseEntity<Teacher> findTeacherByName(@PathVariable String name){
        Teacher teacher = teacherService.findByName(name);
        return new ResponseEntity<>(teacher, HttpStatus.OK);
    }


    // opdater en lærer
    @PutMapping("/updateTeacher")
        public ResponseEntity<String> updateTeacher(@RequestBody Teacher newTeacher, @RequestParam Long teacherId){
         if(teacherService.findById(teacherId).isPresent()){
             Teacher oldTeacher = teacherService.findById(teacherId).get();
             oldTeacher.setName(newTeacher.getName());
             oldTeacher.setEmailAddress(newTeacher.getEmailAddress());
             teacherService.save(oldTeacher);
             return new ResponseEntity<>(oldTeacher + "opdateret", HttpStatus.OK);

         } else {
             return new ResponseEntity<>(newTeacher + "kunne ikke ændres", HttpStatus.OK);
         }
    }

    @DeleteMapping("/deleteTeacher/{id}")
    public ResponseEntity<String> deleteTeacher(@PathVariable Long id){
        teacherService.deleteById(id);
        return new ResponseEntity<>("Lærer er slettet" , HttpStatus.OK);
    }

}
