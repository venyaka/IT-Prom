package com.veniamin.demo.dto.request;

import com.veniamin.demo.entity.Department;
import com.veniamin.demo.entity.Profession;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class EmployeeCreateReqDTO {

    @NotBlank
    @Pattern(regexp = "[A-Za-zА-Яа-я]*", message = "ФИО должно состоять из букв")
    private String fullName;

    @NotEmpty
    private Department department;

    @NotEmpty
    private Profession profession;

    @Size(max = 254, message = "Текст о себе не должен превышать 254 символов")
    private String text;
}
