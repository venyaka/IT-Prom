package com.veniamin.demo.dto.request;

import com.veniamin.demo.entity.Department;
import com.veniamin.demo.entity.Profession;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ProfessionCreateReqDTO {

    @NotBlank
    @Pattern(regexp = "[A-Za-zА-Яа-я]*", message = "Название должно состоять из букв")
    private String name;

    @Size(max = 254, message = "Примечание не должно превышать 254 символов")
    private String text;
}
