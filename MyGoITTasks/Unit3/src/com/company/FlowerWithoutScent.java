package com.company;

/**
 * Created by Yevgen on 21.12.2015.
 */
public abstract class FlowerWithoutScent extends Flower {
    protected FlowerWithoutScent(String flowerType, String colour) {
        super(flowerType, colour, Flower.WITHOUT_SCENT_MESSAGE);
    }
}
