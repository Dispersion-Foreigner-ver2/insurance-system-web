package com.example.InsuranceSystem_Web.src.dto.req.insurance;

import com.example.InsuranceSystem_Web.src.entity.insurance.SeaInsurance;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor
public class PostSeaInsuranceReq {

    @NotBlank(message = "보험이름이 공백입니다. 정확히 입력해주세요.")
    private String name;
    @NotBlank(message = "보험 설명을 입력해주세요.")
    private String explanation;
    @NotNull(message = "보험료를 입력해주세요.")
    private int premium;

    // SealInsurance
    @NotNull(message = "제반 손해 보상금을 입력해주세요.")
    private int generalDamageBasicMoney;
    @NotNull(message = "수익 손해 보상금을 입력해주세요.")
    private int revenueDamageBasicMoney;


    public SeaInsurance toEntity(){
        return SeaInsurance.builder()
                .name(name)
                .explanation(explanation)
                .premium(premium)
                .createdDate(LocalDateTime.now())
                .generalDamageBasicMoney(generalDamageBasicMoney)
                .revenueDamageBasicMoney(revenueDamageBasicMoney)
                .build();
    }
}
