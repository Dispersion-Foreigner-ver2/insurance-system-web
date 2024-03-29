package com.example.InsuranceSystem_Web.src.dto.res.contract;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostContractManageRes {

    @ApiModelProperty(notes = "보험ID", example = "0")
    private Long insuranceId;
    @ApiModelProperty(notes = "보험이름")
    private String InsuranceName;
    @ApiModelProperty(notes = "보험타입")
    private String insuranceType;
    @ApiModelProperty(notes = "보험에 가입한 고객 수", example = "0")
    private int insuranceResignCount;

}
