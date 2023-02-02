package com.example.coursereeksamen.course;

import com.example.coursereeksamen.ICRUD;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class CourseService implements ICRUDCourse {

    private ICourseRepository iCourseRepository;

    public CourseService(ICourseRepository iCourseRepository) {
        this.iCourseRepository = iCourseRepository;
    }

    @Override
    public Set<Course> findAll() {
        return null;
    }

    @Override
    public Course save(Course object) {
        return iCourseRepository.save(object);
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
