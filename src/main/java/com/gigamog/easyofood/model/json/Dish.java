package com.gigamog.easyofood.model.json;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class Dish {
    private String pictureUrl;
    private String dishName;
    private String dishDescription;
    private BigDecimal dishPrice;

}
