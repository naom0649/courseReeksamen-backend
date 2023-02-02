package com.example.coursereeksamen.course;

import com.example.coursereeksamen.ICRUD;

import java.util.Optional;
import java.util.Set;

public class CourseService implements ICRUDCourse {

    @Override
    public Set<Course> findAll() {
        return null;
    }

    @Override
    public Course save(Course object) {
        return null;
    }

    @Override
    public void delete(Optional<Course> object) {

    }

    @Override
    public void deleteById(Long Id) {

    }

    @Override
    public Optional<Course> findById(Long Id) {
        return Optional.empty();
    }
}
