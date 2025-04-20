package com.malikatakhanov.spring.springboot.myapp.my_pet_app.repository;

import com.malikatakhanov.spring.springboot.myapp.my_pet_app.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<Group, Integer> {

    List<Group> findAll();
}
