package com.ecommerce.rates.service.impl;

import com.ecommerce.rates.model.CurrencyDto;
import com.ecommerce.rates.service.CurrencyService;
import org.springframework.stereotype.Service;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    // Mocked service
    public CurrencyDto getCurrency(String currencyCode) {

        switch (currencyCode) {
            case "USD":
                return CurrencyDto.builder()
                        .code("USD")
                        .decimals(2)
                        .symbol("$")
                        .build();
            default:
                return CurrencyDto.builder()
                        .code("EUR")
                        .decimals(2)
                        .symbol("€")
                        .build();
        }
    }
}
