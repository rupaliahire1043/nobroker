package com.nobroker.controller;

import com.nobroker.payload.OwnerPlanDto;
import com.nobroker.service.OwnerPlanServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ownerPlan")

public class OwnerPlanController {
    @Autowired
    private OwnerPlanServices ownerPlanServices;

    @PostMapping
    public ResponseEntity<OwnerPlanDto>createOwnerPlan(@RequestBody OwnerPlanDto ownerPlanDto){
        OwnerPlanDto dto = ownerPlanServices.createOwnerPlans(ownerPlanDto);
        return  new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @GetMapping
    public List<OwnerPlanDto> getAllOwnerPlans(){
        return ownerPlanServices.getAllOwnerPlans();

    }

}
