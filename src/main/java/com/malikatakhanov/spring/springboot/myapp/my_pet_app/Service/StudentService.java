package com.malikatakhanov.spring.springboot.myapp.my_pet_app.Service;

import com.malikatakhanov.spring.springboot.myapp.my_pet_app.dto.AddStudentRequestDto;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    void addStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudent(Integer id);
}
