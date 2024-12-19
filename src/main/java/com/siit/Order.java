package com.siit;

import lombok.*;

import java.util.Map;

@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor
@Setter
public class Order {
    private String customerName;
    private Map<Toy, Integer> toysAndQuantities;
    private double maxPrice;
}
