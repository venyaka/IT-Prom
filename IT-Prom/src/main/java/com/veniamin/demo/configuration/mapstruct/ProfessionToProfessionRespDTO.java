package com.veniamin.demo.configuration.mapstruct;

import com.veniamin.demo.dto.response.ProfessionRespDTO;
import com.veniamin.demo.entity.Profession;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ProfessionToProfessionRespDTO {

    ProfessionRespDTO sourceToDestination(Profession profession);
}
