package com.veniamin.demo.service;

import com.veniamin.demo.dto.request.EmployeeCreateReqDTO;
import com.veniamin.demo.dto.request.ProfessionCreateReqDTO;
import com.veniamin.demo.dto.request.ProfessionReqDTO;
import com.veniamin.demo.dto.response.EmployeeRespDTO;
import com.veniamin.demo.dto.response.ProfessionRespDTO;
import com.veniamin.demo.entity.Employee;
import com.veniamin.demo.entity.Profession;

import java.util.List;

public interface ProfessionService {
    ProfessionRespDTO createProfession(ProfessionCreateReqDTO professionCreateReqDTO);
    List<ProfessionRespDTO> getAllProfessions();

    ProfessionRespDTO updateProfession(ProfessionReqDTO professionReqDTO);

    ProfessionRespDTO getResponseDTO(Profession profession);
}
