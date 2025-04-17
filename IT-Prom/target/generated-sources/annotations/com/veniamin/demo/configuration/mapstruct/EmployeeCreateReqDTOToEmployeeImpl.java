package com.veniamin.demo.configuration.mapstruct;

import com.veniamin.demo.dto.request.EmployeeCreateReqDTO;
import com.veniamin.demo.entity.Employee;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-07T13:24:02+0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class EmployeeCreateReqDTOToEmployeeImpl implements EmployeeCreateReqDTOToEmployee {

    @Override
    public Employee sourceToDestination(EmployeeCreateReqDTO source) {
        if ( source == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setFullName( source.getFullName() );
        employee.setDepartment( source.getDepartment() );
        employee.setProfession( source.getProfession() );
        employee.setText( source.getText() );

        return employee;
    }
}
