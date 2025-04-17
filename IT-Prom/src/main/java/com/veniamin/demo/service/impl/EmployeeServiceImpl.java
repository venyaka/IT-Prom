package com.veniamin.demo.service.impl;

import com.veniamin.demo.configuration.mapstruct.EmployeeCreateReqDTOToEmployee;
import com.veniamin.demo.configuration.mapstruct.EmployeeToEmployeeRespDTO;
import com.veniamin.demo.dto.request.EmployeeCreateReqDTO;
import com.veniamin.demo.dto.response.EmployeeRespDTO;
import com.veniamin.demo.entity.Employee;
import com.veniamin.demo.exception.BadRequestException;
import com.veniamin.demo.exception.errors.BadRequestError;
import com.veniamin.demo.repository.EmployeeRepository;
import com.veniamin.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeCreateReqDTOToEmployee employeeCreateReqDTOToEmployeeMapper;
    private final EmployeeToEmployeeRespDTO employeeToEmployeeRespDTOMapper;


    @Override
    public EmployeeRespDTO createEmployee(EmployeeCreateReqDTO employeeCreateReqDTO) {
        Optional<Employee> optionalEmployee = employeeRepository.findByFullName(employeeCreateReqDTO.getFullName());
        if (optionalEmployee.isPresent()) {
            throw new BadRequestException(BadRequestError.EMPLOYEE_ALREADY_EXISTS);
        }
        Employee employee = employeeCreateReqDTOToEmployeeMapper.sourceToDestination(employeeCreateReqDTO);

        employeeRepository.save(employee);
        return getResponseDTO(employee);
    }

    @Override
    public EmployeeRespDTO getResponseDTO(Employee user) {
        EmployeeRespDTO employeeRespDTO = employeeToEmployeeRespDTOMapper.sourceToDestination(user);
        return employeeRespDTO;
    }
}
