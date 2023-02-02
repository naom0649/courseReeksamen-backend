package com.example.coursereeksamen.student;

import java.util.Optional;
import java.util.Set;

public class StudentService implements ICRUDStudent {
    @Override
    public Set<Student> findAll() {
        return null;
    }

    @Override
    public Student save(Student object) {
        return null;
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
