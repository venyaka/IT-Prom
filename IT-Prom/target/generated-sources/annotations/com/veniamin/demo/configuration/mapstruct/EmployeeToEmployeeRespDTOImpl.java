package com.veniamin.demo.configuration.mapstruct;

import com.veniamin.demo.dto.response.EmployeeRespDTO;
import com.veniamin.demo.entity.Employee;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-07T13:24:02+0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class EmployeeToEmployeeRespDTOImpl implements EmployeeToEmployeeRespDTO {

    @Override
    public EmployeeRespDTO sourceToDestination(Employee source) {
        if ( source == null ) {
            return null;
        }

        EmployeeRespDTO employeeRespDTO = new EmployeeRespDTO();

        employeeRespDTO.setId( source.getId() );
        employeeRespDTO.setFullName( source.getFullName() );
        employeeRespDTO.setDepartment( source.getDepartment() );
        employeeRespDTO.setProfession( source.getProfession() );
        employeeRespDTO.setText( source.getText() );

        return employeeRespDTO;
    }
}
