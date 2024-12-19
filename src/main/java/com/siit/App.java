package com.siit;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PartsInventory partsInventory = new PartsInventory(new PartsInventoryFromElves());

        Factory factory = new Factory();

        factory.fillOrder(partsInventory,
                new Order("Santa",
                        Map.of(new Toy("raceCar", ToyCategory.CARS), 2),
                        800));


    }
}
