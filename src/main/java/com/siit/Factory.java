package com.siit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Factory {

    public void fillOrder(PartsInventory partInventory, Order order){
        List<Toy> builtToys = new ArrayList<>();
        Map<Toy, Integer> toysAndQuantities = order.getToysAndQuantities();
        for (Map.Entry<Toy, Integer> entry: toysAndQuantities.entrySet()) {
            for (int i = 1; i <= entry.getValue(); i++) {
                builtToys.add(makeOneToy(entry.getKey().getCategory(), partInventory));
            }
            System.out.println("Order complete: " + order);
        }
        System.out.println("Toys built " + builtToys);

        // missing price calculations && missing correlation to max order price
    }

    public Toy makeOneToy(ToyCategory toyCategory, PartsInventory partsInventory) {
        List<ToyPart> components = getComponents(toyCategory);
        Toy finishedToy = new Toy();
        for(ToyPart toyPart: components) {
            ToyPart foundPart = partsInventory.findByNameAndCategory(toyPart.getName(), toyCategory);
            foundPart.setQuantity(foundPart.getQuantity() - 1);
            finishedToy.getToyPartList().add(new ToyPart(foundPart.getName(), 1));
        }
        // missing cost of production
        return finishedToy;
    }

    private List<ToyPart> getComponents(ToyCategory toyCategory) {
        Map<String, ToyPart[]> partsInventoryFromElves = new PartsInventoryFromElves().getToyPartsMap();
      //car
        ToyPart[] toyParts = partsInventoryFromElves.get(toyCategory.name());
        return Arrays.asList(toyParts);
    }

}
