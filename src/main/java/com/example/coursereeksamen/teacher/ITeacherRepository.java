package com.example.coursereeksamen.teacher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherRepository extends JpaRepository  <Teacher, Long> {

    Teacher findByName(String name);
}
