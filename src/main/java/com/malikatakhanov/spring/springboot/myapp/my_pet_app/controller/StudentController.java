package com.malikatakhanov.spring.springboot.myapp.my_pet_app.controller;


import com.malikatakhanov.spring.springboot.myapp.my_pet_app.Service.StudentService;
import com.malikatakhanov.spring.springboot.myapp.my_pet_app.dto.AddStudentRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;


    @PostMapping
    public void addStudent(@RequestBody AddStudentRequestDto addStudentRequestDto){
        studentService.addStudent(addStudentRequestDto);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
    }
}
