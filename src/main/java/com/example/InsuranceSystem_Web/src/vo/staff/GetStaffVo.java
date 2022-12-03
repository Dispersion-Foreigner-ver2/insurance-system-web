package com.example.InsuranceSystem_Web.src.vo.staff;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
@AllArgsConstructor
public class GetStaffVo {
    private long id; // 사원 번호
    private String Department; // 부서 이름
    private String name;
    private LocalDate joinDate;
}
