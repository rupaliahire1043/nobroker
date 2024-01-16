package com.nobroker.service;

import com.nobroker.payload.OwnerPlanDto;

import java.util.List;

public interface OwnerPlanServices {

    public OwnerPlanDto createOwnerPlans(OwnerPlanDto ownerPlanDto);

    List<OwnerPlanDto> getAllOwnerPlans();
}

