package com.veniamin.demo.controller;

import com.veniamin.demo.dto.request.EmployeeCreateReqDTO;
import com.veniamin.demo.dto.request.ProfessionCreateReqDTO;
import com.veniamin.demo.dto.request.ProfessionReqDTO;
import com.veniamin.demo.dto.response.EmployeeRespDTO;
import com.veniamin.demo.dto.response.ProfessionRespDTO;
import com.veniamin.demo.service.ProfessionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProfessionController {

    private final ProfessionService professionService;

    @PostMapping("/profession")
    public ProfessionRespDTO createProfession(@RequestBody @Valid ProfessionCreateReqDTO createProfessionDTO) {
        return professionService.createProfession(createProfessionDTO);
    }

    @GetMapping("/profession")
    public List<ProfessionRespDTO> getProfessions() {
        return professionService.getAllProfessions();
    }

    @PatchMapping("/profession")
    public ProfessionRespDTO updateProfession(@RequestBody @Valid ProfessionReqDTO ProfessionReqDTO) {
        return professionService.updateProfession(ProfessionReqDTO);
    }
}
