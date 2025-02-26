package com.ecommerce.rates.service;

import com.ecommerce.rates.model.CreateRateRqDto;

public interface RateService {

    long create(CreateRateRqDto createRateRqDto);
}
