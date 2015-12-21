package com.company;

/**
 * Created by Yevgen on 21.12.2015.
 */
public class RoseBush extends FlowerBush {
    private Boolean isThorn = false;

    public Boolean getThorn() {
        return isThorn;
    }

    public void setThorn(Boolean thorn) {
        isThorn = thorn;
    }

    public RoseBush(String colour, String scent, Boolean isThorn, int roseCount) {
        super(Const.ROSE_FLOWER_TYPE, colour, scent);
        // Delete one flower because of "new property" "isThorn"
        removeFlower(getFlowerByIndex(0));

        // Remember whether there thorns are presented
        setThorn(isThorn);

        addFlowers(roseCount);
    }

    public RoseBush(String colour, String scent) {
        this(colour, scent, false, 1);
    }

    public RoseBush(String colour) {
        this(colour, Const.TYPICAL_ROSE_SCENT);
    }


    public RoseBush(String colour, int roseCount) {
        this (colour, Const.TYPICAL_ROSE_SCENT, false, roseCount);
    }

    @Override
    public void addFlower () {
        super.addFlower(new Rose(getColour(), getScent(), getThorn()));
    }
}
