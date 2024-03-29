package com.example.InsuranceSystem_Web.src.exception.staff;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum StaffExceptionStatus {
    NOT_FOUND_STAFF(3000, HttpStatus.BAD_REQUEST, "등록된 정보가 없습니다. 다시 시도해주시거나 회원 가입 후 진행해주세요."),
    WRONG_JOIN_STAFF(3001, HttpStatus.BAD_REQUEST, "가입에 실패하였습니다. 다시 시도해주세요."),
    WRONG_TYPE_INPUT(3002, HttpStatus.BAD_REQUEST, "아이디는 숫자만 입력해 주세요.");

    private final int code;
    private final org.springframework.http.HttpStatus httpStatus;
    private final String message;
}
