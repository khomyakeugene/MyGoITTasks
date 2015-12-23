package com.company.flowers;

import com.company.flowers.Flower;
import com.company.flowers.FlowerSet;

/**
 * Created by Yevgen on 21.12.2015.
 */
public class Bouquet extends FlowerSet {
    public Bouquet(Flower firstFlowerInBouquet) {
        super();

        // Add at least one flower
        addFlower(firstFlowerInBouquet);
    }
}
