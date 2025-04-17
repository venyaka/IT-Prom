package com.veniamin.demo.controller;

import com.veniamin.demo.dto.request.DepartmentCreateReqDTO;
import com.veniamin.demo.dto.request.ProfessionCreateReqDTO;
import com.veniamin.demo.dto.response.DepartmentRespDTO;
import com.veniamin.demo.dto.response.ProfessionRespDTO;
import com.veniamin.demo.service.DepartmentService;
import com.veniamin.demo.service.ProfessionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping("/department")
    public DepartmentRespDTO createDepartment(@RequestBody @Valid DepartmentCreateReqDTO createDepartmentDTO) {
        return departmentService.createDepartment(createDepartmentDTO);
    }

    @GetMapping("/department")
    public List<DepartmentRespDTO> createEmployee() {
        return departmentService.getAllDepartments();
    }
}
