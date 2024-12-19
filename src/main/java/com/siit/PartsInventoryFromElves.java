package com.siit;

import java.util.HashMap;
import java.util.Map;

public class PartsInventoryFromElves {

    public Map<String, ToyPart[]> getToyPartsMap() {

        Map<String, ToyPart[]> toyPartsMap = new HashMap<>();

        // "CARS", "WHEEL, 100"   Map<String, String>

        toyPartsMap.put("CARS", new ToyPart[]{
                new ToyPart("Wheel", 100),
                new ToyPart("Engine", 60),
                new ToyPart("Steering Wheel", 75),
                new ToyPart("Chassis", 80),
                new ToyPart("Exhaust Pipe", 40),
                new ToyPart("Windshield", 60)
        });


        toyPartsMap.put("DOLLS", new ToyPart[]{
                new ToyPart("Head", 150),
                new ToyPart("Body", 120),
                new ToyPart("Arm", 200),
                new ToyPart("Leg", 200),
        });


        toyPartsMap.put("SUPERHEROES", new ToyPart[]{
                new ToyPart("Cape", 80),
                new ToyPart("Mask", 100),
                new ToyPart("Utility Belt", 70),
                new ToyPart("Boots", 60),
                new ToyPart("Shield", 40),
                new ToyPart("Armor", 30)
        });


        toyPartsMap.put("LEGO", new ToyPart[]{
                new ToyPart("Brick", 300),
                new ToyPart("Plate", 250),
                new ToyPart("Tile", 200),
                new ToyPart("Window Frame", 50),
                new ToyPart("Minifigure Head", 80),
                new ToyPart("Minifigure Body", 80)
        });

        return toyPartsMap;
    }

}