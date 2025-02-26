package com.ecommerce.rates.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class CreateRateRqDto {

    private final Long brandId;

    private final Long productId;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private final LocalDate startDate;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private final LocalDate endDate;

    private BigDecimal price;

    private String currencyCode;
}
