package com.veniamin.demo.service;

import com.veniamin.demo.dto.request.DepartmentCreateReqDTO;
import com.veniamin.demo.dto.response.DepartmentRespDTO;
import com.veniamin.demo.dto.response.ProfessionRespDTO;
import com.veniamin.demo.entity.Department;

import java.util.List;

public interface DepartmentService {
    DepartmentRespDTO createDepartment(DepartmentCreateReqDTO departmentCreateReqDTO);
    DepartmentRespDTO getResponseDTO(Department department);
    List<DepartmentRespDTO> getAllDepartments();
}
