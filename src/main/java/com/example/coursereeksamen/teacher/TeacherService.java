package com.example.coursereeksamen.teacher;

import java.util.Optional;
import java.util.Set;

public class TeacherService implements ICRUDTeacher{
    @Override
    public Set<Teacher> findAll() {
        return null;
    }

    @Override
    public Teacher save(Teacher object) {
        return null;
    }

    @Override
    public void delete(Optional<Teacher> object) {

    }

    @Override
    public void deleteById(Long Id) {

    }

    @Override
    public Optional<Teacher> findById(Long Id) {
        return Optional.empty();
    }
}
