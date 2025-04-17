package com.veniamin.demo.dto.response;

import com.veniamin.demo.entity.Department;
import com.veniamin.demo.entity.Profession;
import lombok.Data;

@Data
public class ProfessionRespDTO {

    private Long id;

    private String name;

    private String text;
}
