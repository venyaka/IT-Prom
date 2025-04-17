package com.veniamin.demo.controller;

import com.veniamin.demo.dto.request.EmployeeCreateReqDTO;
import com.veniamin.demo.dto.response.EmployeeRespDTO;
import com.veniamin.demo.service.EmployeeService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/employee")
    public EmployeeRespDTO createEmployee(@RequestBody @Valid EmployeeCreateReqDTO createEmployeeDTO) {
        return employeeService.createEmployee(createEmployeeDTO);
    }

//    @GetMapping("/api/employee")
//    public EmployeeRespDTO createEmployee() {
//        return employeeService.createEmployee(createEmployeeDTO);
//    }
}
