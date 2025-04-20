package com.malikatakhanov.spring.springboot.myapp.my_pet_app.Service;

import com.malikatakhanov.spring.springboot.myapp.my_pet_app.dto.AddGroupRequestDto;
import com.malikatakhanov.spring.springboot.myapp.my_pet_app.dto.AllGroupsResponseDto;
import com.malikatakhanov.spring.springboot.myapp.my_pet_app.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GroupService {
    List<AllGroupsResponseDto> getAllGroups();

    void addGroup(AddGroupRequestDto addGroupRequestDto);

    List<Student> getGroup(Integer id);
}
