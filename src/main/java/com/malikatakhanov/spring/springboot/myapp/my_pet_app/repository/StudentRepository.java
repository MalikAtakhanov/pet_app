package com.malikatakhanov.spring.springboot.myapp.my_pet_app.repository;

import com.malikatakhanov.spring.springboot.myapp.my_pet_app.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
