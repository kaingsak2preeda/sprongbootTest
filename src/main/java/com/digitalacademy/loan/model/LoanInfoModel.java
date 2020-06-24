package com.digitalacademy.loan.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class LoanInfoModel {
    private Long id;
    private String username;
    private String first_name;
    private String last_name;
    private Integer age;
    private String telephone;
    private String graduated_form;
    private String  grade;
    private String major;
    private String job;
}
