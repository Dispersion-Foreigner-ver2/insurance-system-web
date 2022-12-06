package com.example.InsuranceSystem_Web.src.vo.contract;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostContractTerminateVo {
    private String message;
    private Long contractId;
}