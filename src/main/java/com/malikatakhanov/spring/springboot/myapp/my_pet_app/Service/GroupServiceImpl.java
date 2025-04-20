package com.malikatakhanov.spring.springboot.myapp.my_pet_app.Service;

import com.malikatakhanov.spring.springboot.myapp.my_pet_app.dto.AddGroupRequestDto;
import com.malikatakhanov.spring.springboot.myapp.my_pet_app.dto.AllGroupsResponseDto;
import com.malikatakhanov.spring.springboot.myapp.my_pet_app.entity.Group;
import com.malikatakhanov.spring.springboot.myapp.my_pet_app.entity.Student;
import com.malikatakhanov.spring.springboot.myapp.my_pet_app.repository.GroupRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupServiceImpl implements GroupService {

    private final GroupRepository groupRepository;


    @Override
    public List<AllGroupsResponseDto> getAllGroups() {
        List<Group> groups = groupRepository.findAll();
        List<AllGroupsResponseDto> allGroupsResponseDtos = new ArrayList<>();
        for (int i = 0; i < groups.size(); i++) {
            allGroupsResponseDtos.add(new AllGroupsResponseDto(groups.get(i).getNumber(), groups.get(i).getStudents().size()));
        }
        return allGroupsResponseDtos;
    }

    @Override
    public void addGroup(AddGroupRequestDto addGroupRequestDto) {
        Group group = new Group(addGroupRequestDto.getNumber());
        groupRepository.save(group);
    }

    @Override
    public List<Student> getGroup(Integer id) {
        Group group = groupRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Group not found with id: " + id));
        return group.getStudents();
    }
}
