package com.veniamin.demo.configuration.mapstruct;

import com.veniamin.demo.dto.request.ProfessionCreateReqDTO;
import com.veniamin.demo.entity.Profession;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-07T13:24:02+0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class ProfessionReqDTOToProfessionImpl implements ProfessionReqDTOToProfession {

    @Override
    public Profession sourceToDestination(ProfessionCreateReqDTO source) {
        if ( source == null ) {
            return null;
        }

        Profession profession = new Profession();

        profession.setName( source.getName() );
        profession.setText( source.getText() );

        return profession;
    }
}
