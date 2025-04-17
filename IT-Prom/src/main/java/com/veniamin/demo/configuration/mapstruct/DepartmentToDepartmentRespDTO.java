package com.veniamin.demo.configuration.mapstruct;

import com.veniamin.demo.dto.response.DepartmentRespDTO;
import com.veniamin.demo.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface DepartmentToDepartmentRespDTO {

    DepartmentRespDTO sourceToDestination(Department source);
}
