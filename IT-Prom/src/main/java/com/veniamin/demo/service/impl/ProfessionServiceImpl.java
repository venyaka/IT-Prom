package com.veniamin.demo.service.impl;

import com.veniamin.demo.configuration.mapstruct.ProfessionCreateReqDTOToProfession;
import com.veniamin.demo.configuration.mapstruct.ProfessionToProfessionRespDTO;
import com.veniamin.demo.dto.request.ProfessionCreateReqDTO;
import com.veniamin.demo.dto.request.ProfessionReqDTO;
import com.veniamin.demo.dto.response.ProfessionRespDTO;
import com.veniamin.demo.entity.Profession;
import com.veniamin.demo.exception.BadRequestException;
import com.veniamin.demo.exception.errors.BadRequestError;
import com.veniamin.demo.repository.ProfessionRepository;
import com.veniamin.demo.service.ProfessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.hibernate.internal.util.collections.ArrayHelper.forEach;

@Service
@RequiredArgsConstructor
public class ProfessionServiceImpl implements ProfessionService {

    private final ProfessionRepository professionRepository;
    private final ProfessionCreateReqDTOToProfession professionCreateReqDTOToProfessionMapper;
    private final ProfessionToProfessionRespDTO professionToProfessionRespDTOMapper;

    @Override
    public ProfessionRespDTO createProfession(ProfessionCreateReqDTO professionCreateReqDTO) {
        Optional<Profession> optionalProfession = professionRepository.findByName(professionCreateReqDTO.getName());
        if (optionalProfession.isPresent()) {
            throw new BadRequestException(BadRequestError.EMPLOYEE_ALREADY_EXISTS);
        }
        Profession profession = professionCreateReqDTOToProfessionMapper.sourceToDestination(professionCreateReqDTO);

        professionRepository.save(profession);

        return getResponseDTO(profession);
    }

    @Override
    public List<ProfessionRespDTO> getAllProfessions() {
        List<ProfessionRespDTO> list = professionRepository.findAll().stream()
                .map(profession -> {return getResponseDTO(profession);})
                .collect(Collectors.toList());;
        return list;
    }

    @Override
    public ProfessionRespDTO updateProfession(ProfessionReqDTO professionReqDTO) {
        Optional<Profession> optionalProfession = professionRepository.findById(professionReqDTO.getId());
        if (optionalProfession.isEmpty()) {
            throw new BadRequestException(BadRequestError.EMPLOYEE_IS_NOT_EXISTS);
        }
        Profession profession = optionalProfession.get();
        profession.setName(professionReqDTO.getName());
        profession.setText(professionReqDTO.getText());
        professionRepository.save(profession);

        return getResponseDTO(profession);
    }

    @Override
    public ProfessionRespDTO getResponseDTO(Profession profession) {
        ProfessionRespDTO professionRespDTO = professionToProfessionRespDTOMapper.sourceToDestination(profession);
        return professionRespDTO;
    }
}
