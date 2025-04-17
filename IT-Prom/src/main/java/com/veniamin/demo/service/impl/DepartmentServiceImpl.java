package com.veniamin.demo.service.impl;

import com.veniamin.demo.configuration.mapstruct.DepartmentCreateReqDTOToDepartment;
import com.veniamin.demo.configuration.mapstruct.DepartmentToDepartmentRespDTO;
import com.veniamin.demo.dto.request.DepartmentCreateReqDTO;
import com.veniamin.demo.dto.response.DepartmentRespDTO;
import com.veniamin.demo.dto.response.ProfessionRespDTO;
import com.veniamin.demo.entity.Department;
import com.veniamin.demo.exception.BadRequestException;
import com.veniamin.demo.exception.errors.BadRequestError;
import com.veniamin.demo.repository.DepartmentRepository;
import com.veniamin.demo.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final DepartmentCreateReqDTOToDepartment departmentCreateReqDTOToDepartmentMapper;
    private final DepartmentToDepartmentRespDTO departmentToDepartmentRespDTOMapper;

    @Override
    public DepartmentRespDTO createDepartment(DepartmentCreateReqDTO departmentCreateReqDTO) {
        Optional<Department> optionalDepartment = departmentRepository.findByName(departmentCreateReqDTO.getName());
        if (optionalDepartment.isPresent()) {
            throw new BadRequestException(BadRequestError.EMPLOYEE_ALREADY_EXISTS);
        }
        Department department = departmentCreateReqDTOToDepartmentMapper.sourceToDestination(departmentCreateReqDTO);

        departmentRepository.save(department);
        return getResponseDTO(department);
    }

    @Override
    public List<DepartmentRespDTO> getAllDepartments() {
        List<DepartmentRespDTO> list = departmentRepository.findAll().stream()
                .map(department -> {return getResponseDTO(department);})
                .collect(Collectors.toList());
        return list;
    }

    @Override
    public DepartmentRespDTO getResponseDTO(Department department) {
        DepartmentRespDTO departmentRespDTO = departmentToDepartmentRespDTOMapper.sourceToDestination(department);
        return departmentRespDTO;
    }
}
