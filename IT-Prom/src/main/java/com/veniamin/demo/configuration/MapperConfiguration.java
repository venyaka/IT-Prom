package com.veniamin.demo.configuration;

import com.veniamin.demo.dto.request.DepartmentCreateReqDTO;
import com.veniamin.demo.dto.request.EmployeeCreateReqDTO;
import com.veniamin.demo.dto.request.ProfessionCreateReqDTO;
import com.veniamin.demo.dto.request.ProfessionReqDTO;
import com.veniamin.demo.entity.Department;
import com.veniamin.demo.entity.Employee;
import com.veniamin.demo.entity.Profession;
import lombok.RequiredArgsConstructor;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.modelmapper.convention.MatchingStrategies.STANDARD;

@Configuration
@RequiredArgsConstructor
public class MapperConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration()
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
                .setSkipNullEnabled(true)
                .setFieldMatchingEnabled(true)
                .setDeepCopyEnabled(false)
                .setMatchingStrategy(STANDARD)
                .setAmbiguityIgnored(true)
                .setPropertyCondition(Conditions.isNotNull());

        mapper.createTypeMap(EmployeeCreateReqDTO.class, Employee.class)
                .addMappings(mpr -> mpr.skip(Employee::setId));
        mapper.createTypeMap(ProfessionCreateReqDTO.class, Profession.class)
                .addMappings(mpr -> mpr.skip(Profession::setId));
        mapper.createTypeMap(DepartmentCreateReqDTO.class, Department.class)
                .addMappings(mpr -> mpr.skip(Department::setId));

        return mapper;
    }
}