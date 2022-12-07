package com.example.InsuranceSystem_Web.src.service.compensation;

import com.example.InsuranceSystem_Web.src.entity.insurance.FireInsurance;
import com.example.InsuranceSystem_Web.src.vo.compensation.GetCompensationVo;
import com.example.InsuranceSystem_Web.src.vo.compensation.PostCompensationAmountVo;

import java.util.List;

public interface CompensationService {

    List<GetCompensationVo> compensation(Long customerId);
    PostCompensationAmountVo compensationAmount(FireInsurance fireInsurance);
}