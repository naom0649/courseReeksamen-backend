package com.example.coursereeksamen.student;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class StudentService implements ICRUDStudent {

    private IStudentRepository iStudentRepository;

    public StudentService(IStudentRepository iStudentRepository) {
        this.iStudentRepository = iStudentRepository;
    }

    @Override
    public Set<Student> findAll() {
        return null;
    }

    @Override
    public Student save(Student object) {
        return iStudentRepository.save(object) ;
    }

    @Override
    public void delete(Optional<Student> object) {

    }

    @Override
    public void deleteById(Long Id) {

    }

    @Override
    public Optional<Student> findById(Long Id) {
        return Optional.empty();
    }
}
