package com.veniamin.demo.configuration.mapstruct;

import com.veniamin.demo.dto.request.DepartmentCreateReqDTO;
import com.veniamin.demo.entity.Department;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-07T13:24:02+0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class DepartmentCreateReqDTOToDepartmentImpl implements DepartmentCreateReqDTOToDepartment {

    @Override
    public Department sourceToDestination(DepartmentCreateReqDTO source) {
        if ( source == null ) {
            return null;
        }

        Department department = new Department();

        department.setName( source.getName() );
        department.setText( source.getText() );
        department.setParentId( source.getParentId() );

        return department;
    }
}
