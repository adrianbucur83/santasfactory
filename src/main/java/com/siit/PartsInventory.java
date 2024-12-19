package com.siit;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Getter
public class PartsInventory {
    private final List<ToyPart> toyPartsInventory = new ArrayList<>();

    public PartsInventory(PartsInventoryFromElves partsInventoryFromElves) {
        sortParts(partsInventoryFromElves);
    }

    public void sortParts(PartsInventoryFromElves partsInventoryFromElves) {
        Map<String, ToyPart[]> partsCountedByElves = partsInventoryFromElves.getToyPartsMap();
        for (Map.Entry<String, ToyPart[]> entry : partsCountedByElves.entrySet()) {
            ToyPart[] parts = entry.getValue();
            for (ToyPart part : parts) {
                String category = entry.getKey();
                ToyCategory toyCategory = ToyCategory.valueOf(category.toUpperCase());
                toyPartsInventory.add(new ToyPart(part.getName(), part.getQuantity(), toyCategory));
            }
        }
    }

    public ToyPart findByNameAndCategory(String name, ToyCategory toyCategory) {
        for (ToyPart toyPart : toyPartsInventory) {
            if (toyPart.getName().equals(name) && toyPart.getCategory() == toyCategory) {
                return toyPart;
            }
        }
        return null;
    }

}
