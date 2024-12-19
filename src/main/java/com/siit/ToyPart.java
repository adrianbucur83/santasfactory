package com.siit;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ToyPart {
    private String name;
    private int quantity;
    private ToyCategory category;

    public ToyPart(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public ToyPart(String name, int quantity, ToyCategory category) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }

}
