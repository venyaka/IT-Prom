package com.veniamin.demo.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ProfessionReqDTO {
    @NotNull
    private Long id;

    @NotBlank
    @Pattern(regexp = "[A-Za-zА-Яа-я]*", message = "Название должно состоять из букв")
    private String name;

    @NotBlank
    @Size(max = 254, message = "Примечание не должно превышать 254 символов")
    private String text;
}
