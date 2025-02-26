package com.ecommerce.rates.service;

import com.ecommerce.rates.model.CurrencyDto;
import org.springframework.stereotype.Service;

@Service
public interface CurrencyService {

    CurrencyDto getCurrency(String currencyCode);
}
