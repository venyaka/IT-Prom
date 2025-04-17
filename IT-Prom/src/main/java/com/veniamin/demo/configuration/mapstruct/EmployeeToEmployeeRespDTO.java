package com.veniamin.demo.configuration.mapstruct;

import com.veniamin.demo.dto.response.EmployeeRespDTO;
import com.veniamin.demo.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface EmployeeToEmployeeRespDTO {

    EmployeeRespDTO sourceToDestination(Employee source);
}