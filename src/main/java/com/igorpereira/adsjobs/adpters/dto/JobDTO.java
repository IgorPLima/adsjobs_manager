package com.igorpereira.adsjobs.adpters.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobDTO {

    private Long id;

    @NotBlank
    @Size(max = 200)
    private String job_title;

    @NotNull
    private String number_vacancies;

    @NotBlank
    @Size(max = 200)
    private String job_description;

    @Valid
    @NotNull
    private CompanyDTO company;

}
