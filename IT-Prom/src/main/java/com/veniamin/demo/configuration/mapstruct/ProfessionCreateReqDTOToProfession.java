package com.veniamin.demo.configuration.mapstruct;

import com.veniamin.demo.dto.request.ProfessionCreateReqDTO;
import com.veniamin.demo.entity.Profession;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ProfessionCreateReqDTOToProfession {

    Profession sourceToDestination(ProfessionCreateReqDTO source);
}
