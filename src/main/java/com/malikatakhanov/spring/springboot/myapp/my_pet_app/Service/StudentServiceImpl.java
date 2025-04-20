package com.malikatakhanov.spring.springboot.myapp.my_pet_app.Service;

import com.malikatakhanov.spring.springboot.myapp.my_pet_app.dto.AddStudentRequestDto;
import com.malikatakhanov.spring.springboot.myapp.my_pet_app.entity.Group;
import com.malikatakhanov.spring.springboot.myapp.my_pet_app.entity.Student;
import com.malikatakhanov.spring.springboot.myapp.my_pet_app.repository.GroupRepository;
import com.malikatakhanov.spring.springboot.myapp.my_pet_app.repository.StudentRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final GroupRepository groupRepository;

    @Override
    public void addStudent(AddStudentRequestDto dto) {
        Group group = groupRepository.findById(dto.getGroupId())
                .orElseThrow(() -> new EntityNotFoundException("Group not found with id: " + dto.getGroupId()));

        Student student = new Student(dto.getName(), dto.getSurname(), group);
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Integer id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Student not found with id: " + id));
        studentRepository.delete(student);
    }
}
