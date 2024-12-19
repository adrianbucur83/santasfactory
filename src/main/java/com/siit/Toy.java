package com.siit;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
        * Each toy must have:
        * A name.
        * A category (e.g., vehicles, figurines, educational toys).
        * A description.
        * A production cost.
     * Some toys may require additional, unique properties.
*/

@Getter
@Setter
@ToString
public class Toy {
    private String name;
    private ToyCategory category;
    private String description;
    private double cost;
    private List<ToyPart> toyPartList = new ArrayList<>();

    public Toy(String name, ToyCategory toyCategory) {
        this.name = name;
        this.category = toyCategory;
    }

    public Toy() {
    }
}
