package com.ecommerce.rates.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CurrencyDto {

    private String code;
    private String symbol;
    private int decimals;
}
