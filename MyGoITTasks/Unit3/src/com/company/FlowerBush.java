package com.company;

/**
 * Created by Yevgen on 21.12.2015.
 */

public class FlowerBush extends FlowerSet {
    private String flowerType = null;
    private String colour = null;
    private String scent = Flower.WITHOUT_SCENT_MESSAGE;

    public String getFlowerType() {
        return flowerType;
    }

    public void setFlowerType(String flowerType) {
        this.flowerType = flowerType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    public FlowerBush(String flowerType, String colour, String scent) {
        super();

        setFlowerType(flowerType);
        setColour(colour);
        setScent(scent);

        // At least, one flower should be presented
        addFlower ();
    }

    public FlowerBush(String flowerType, String colour) {
        this(flowerType, colour, Flower.WITHOUT_SCENT_MESSAGE);
    }

    public FlowerBush(String flowerType, String colour, String scent, int flowerCount) {
        this(flowerType, colour, scent);

        addFlowers(flowerCount);
    }


    public void addFlower (){
        super.addFlower(new Flower(getFlowerType(), getColour(), getScent()));
    }

    public void addFlowers(int flowerCount) {
        for (int i = 1; i < flowerCount; i++) {
            addFlower();
        }
    }
}
