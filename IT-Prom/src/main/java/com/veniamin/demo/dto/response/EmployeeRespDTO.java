package com.veniamin.demo.dto.response;

import com.veniamin.demo.entity.Department;
import com.veniamin.demo.entity.Profession;
import lombok.Data;

@Data
public class EmployeeRespDTO {

    private Long id;

    private String fullName;

    private Department department;

    private Profession profession;

    private String text;
}
