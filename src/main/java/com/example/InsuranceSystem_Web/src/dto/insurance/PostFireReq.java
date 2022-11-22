package com.example.InsuranceSystem_Web.src.dto.insurance;

import com.example.InsuranceSystem_Web.src.entity.Insurance.FireInsurance;
import com.example.InsuranceSystem_Web.src.entity.Insurance.Insurance;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostFireReq {

    // Insuracne
    @NotBlank(message = "보험이름이 공백입니다. 정확히 입력해주세요.")
    @NotEmpty(message = "보험이름을 입력해주세요.")
    private String name;
    @NotBlank
    @NotEmpty(message = "explanation을 입력해주세요.")
    private String explanation;
    @NotNull(message = "premium을 입력해주세요.")
    private int premium;

    // FireInsurance
    @NotNull
    private int surroundingDamageBasicMoney;
    @NotNull
    private int humanDamageBasicMoney;
    @NotNull
    private int buildingDamageBasicMoney;

    public Insurance of(Insurance.Type type){
        return Insurance.of(name, explanation,premium,type);
    }

    public FireInsurance toEntity(Insurance insurance){
        return FireInsurance.builder()
                .surroundingDamageBasicMoney(surroundingDamageBasicMoney)
                .humanDamageBasicMoney(humanDamageBasicMoney)
                .buildingDamageBasicMoney(buildingDamageBasicMoney)
                .insurance(insurance)
                .build();
    }

}
