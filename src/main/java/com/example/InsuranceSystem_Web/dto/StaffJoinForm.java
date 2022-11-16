package com.example.InsuranceSystem_Web.dto;

import com.example.InsuranceSystem_Web.domain.Staff.Department;
import com.example.InsuranceSystem_Web.domain.Staff.Position;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@NoArgsConstructor
public class StaffJoinForm {

    @NotBlank(message = "사원 번호를 입력해주세요.")
    private String id;

    @NotBlank(message = "비밀 번호를 입력해주세요.")
    private String pw;

    @NotBlank(message = "이름를 입력해주세요.")
    private String name;

    @NotBlank(message = "주민 번호를 입력해주세요.")
    private String SSN;

    @NotBlank(message = "이메일을 입력해주세요.")
    private String eMail;

    @NotBlank(message = "전화 번호를 입력해주세요.")
    private String phoneNum;

    private Department department;

    private Position position;

    private boolean gender;



}
