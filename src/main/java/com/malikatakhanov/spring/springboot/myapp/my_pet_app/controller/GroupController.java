package com.malikatakhanov.spring.springboot.myapp.my_pet_app.controller;

import com.malikatakhanov.spring.springboot.myapp.my_pet_app.Service.GroupService;
import com.malikatakhanov.spring.springboot.myapp.my_pet_app.dto.AddGroupRequestDto;
import com.malikatakhanov.spring.springboot.myapp.my_pet_app.dto.AllGroupsResponseDto;
import com.malikatakhanov.spring.springboot.myapp.my_pet_app.entity.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/groups")
@RequiredArgsConstructor
@Slf4j
public class GroupController {

    private final GroupService groupService;


    @GetMapping
    public List<AllGroupsResponseDto> getAlLGroups(){
        return groupService.getAllGroups();
    }

    @PostMapping
    public void addGroup(@RequestBody AddGroupRequestDto addGroupRequestDto){
        groupService.addGroup(addGroupRequestDto);
    }

    @GetMapping(path = "/{id}")
    public List<Student> getGroup(@PathVariable Integer id){
        return groupService.getGroup(id);
    }

    @GetMapping(path = "/exception")
    public void getException(){
        throw  new RuntimeException();
    }
}
