package com.malikatakhanov.spring.springboot.myapp.my_pet_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddStudentRequestDto {
    private String name;
    private String surname;
    private Integer groupId;

}
