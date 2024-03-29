package com.example.InsuranceSystem_Web.src.dto.req.staff;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;


@Getter @Setter
@NoArgsConstructor
public class PostStaffLoginReq {

    @NotBlank(message = "아이디를 입력해주세요.")
    private String staffId;

    @NotBlank(message = "비밀번호를 입력해주세요.")
    private String password;

}
