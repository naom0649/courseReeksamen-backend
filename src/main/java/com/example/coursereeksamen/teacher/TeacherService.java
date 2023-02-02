package com.example.coursereeksamen.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Service
public class TeacherService implements ICRUDTeacher{

   private ITeacherRepository iTeacherRepository;



    public TeacherService(ITeacherRepository iTeacherRepository) {
        this.iTeacherRepository = iTeacherRepository;
    }

    @Override
    public Set<Teacher> findAll() {
       Set<Teacher> teachers = new HashSet<>();
       iTeacherRepository.findAll().forEach(teachers::add);
        return teachers;
    }

    @Override
    public Teacher save(Teacher object) {
        return iTeacherRepository.save(object);
    }

    @Override
    public void delete(Optional<Teacher> object) {
       iTeacherRepository.delete(object.get());//bruger .get for at pakke mit teacher objekt ind.

    }

    @Override
    public void deleteById(Long id) {
       iTeacherRepository.deleteById(id);

    }

    @Override
    public Teacher findByName(String name){
        return iTeacherRepository.findByName(name);
    }

    @Override
    public Optional<Teacher> findById(Long id) {
        return iTeacherRepository.findById(id);
    }
}
