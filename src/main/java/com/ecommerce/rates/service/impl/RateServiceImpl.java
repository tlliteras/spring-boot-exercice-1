package com.ecommerce.rates.service.impl;

import com.ecommerce.rates.data.entity.Rate;
import com.ecommerce.rates.data.repository.RateRepository;
import com.ecommerce.rates.model.CreateRateRqDto;
import com.ecommerce.rates.service.RateService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RateServiceImpl implements RateService {

    @Autowired
    RateRepository rateRepository;

    ModelMapper modelMapper;

    @Override
    public long create(CreateRateRqDto createRateRqDto) {

        Rate rate = modelMapper.map(createRateRqDto, Rate.class);

        return rateRepository.saveAndFlush(rate).getId();
    }

}
