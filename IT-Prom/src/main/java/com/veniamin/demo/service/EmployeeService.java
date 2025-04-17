package com.veniamin.demo.service;

import com.veniamin.demo.dto.request.EmployeeCreateReqDTO;
import com.veniamin.demo.dto.response.EmployeeRespDTO;
import com.veniamin.demo.entity.Employee;

public interface EmployeeService {
    EmployeeRespDTO createEmployee(EmployeeCreateReqDTO employeeCreateReqDTO);
    EmployeeRespDTO getResponseDTO(Employee employee);
}
