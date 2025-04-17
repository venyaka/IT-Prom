package com.veniamin.demo.configuration.mapstruct;

import com.veniamin.demo.dto.response.DepartmentRespDTO;
import com.veniamin.demo.entity.Department;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-07T13:24:02+0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class DepartmentToDepartmentRespDTOImpl implements DepartmentToDepartmentRespDTO {

    @Override
    public DepartmentRespDTO sourceToDestination(Department source) {
        if ( source == null ) {
            return null;
        }

        DepartmentRespDTO departmentRespDTO = new DepartmentRespDTO();

        departmentRespDTO.setId( source.getId() );
        departmentRespDTO.setName( source.getName() );
        departmentRespDTO.setText( source.getText() );
        departmentRespDTO.setParentId( source.getParentId() );

        return departmentRespDTO;
    }
}
