package com.example.InsuranceSystem_Web.src.dto.req.staff;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class PostStaffJoinReq {

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

    private int department;

    private int position;

    private boolean gender;



}
