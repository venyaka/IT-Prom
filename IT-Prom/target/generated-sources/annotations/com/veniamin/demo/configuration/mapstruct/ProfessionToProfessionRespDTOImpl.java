package com.veniamin.demo.configuration.mapstruct;

import com.veniamin.demo.dto.response.ProfessionRespDTO;
import com.veniamin.demo.entity.Profession;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-07T13:24:02+0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class ProfessionToProfessionRespDTOImpl implements ProfessionToProfessionRespDTO {

    @Override
    public ProfessionRespDTO sourceToDestination(Profession profession) {
        if ( profession == null ) {
            return null;
        }

        ProfessionRespDTO professionRespDTO = new ProfessionRespDTO();

        professionRespDTO.setId( profession.getId() );
        professionRespDTO.setName( profession.getName() );
        professionRespDTO.setText( profession.getText() );

        return professionRespDTO;
    }
}
