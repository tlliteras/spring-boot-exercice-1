package com.ecommerce.rates.controller;

import com.ecommerce.rates.model.CreateRateRqDto;
import com.ecommerce.rates.service.RateService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rates")
public class RateController {

    @Autowired
    RateService rateService;

    @PostMapping
    @Operation(summary = "Create Rate")
    public long create(CreateRateRqDto createRateRqDto){

        return rateService.create(createRateRqDto);
    }

}
