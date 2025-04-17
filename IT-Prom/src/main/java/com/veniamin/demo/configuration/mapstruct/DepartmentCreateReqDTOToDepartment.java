package com.veniamin.demo.configuration.mapstruct;

import com.veniamin.demo.dto.request.DepartmentCreateReqDTO;
import com.veniamin.demo.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface DepartmentCreateReqDTOToDepartment {

    Department sourceToDestination(DepartmentCreateReqDTO source);
}
