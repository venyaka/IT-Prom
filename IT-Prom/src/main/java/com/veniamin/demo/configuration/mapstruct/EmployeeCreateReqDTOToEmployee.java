package com.veniamin.demo.configuration.mapstruct;

import com.veniamin.demo.dto.request.EmployeeCreateReqDTO;
import com.veniamin.demo.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface EmployeeCreateReqDTOToEmployee {

    Employee sourceToDestination(EmployeeCreateReqDTO source);
}
