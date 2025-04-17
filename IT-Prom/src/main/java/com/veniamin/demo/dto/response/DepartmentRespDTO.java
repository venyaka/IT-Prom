package com.veniamin.demo.dto.response;

import lombok.Data;

@Data
public class DepartmentRespDTO {

    private Long id;

    private String name;

    private String text;

    private Long parentId;
}
