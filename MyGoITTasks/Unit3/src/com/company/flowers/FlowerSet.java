package com.company.flowers;

import com.company.utils.Utils;

import java.util.Vector;

/**
 * Created by Yevgen on 21.12.2015.
 */
public class FlowerSet {
    private Vector<Flower> flowers = null;//класс Vector deprecated - используем другие коллекции.Читаем джава доку.

    public FlowerSet() {
        super();

        // Init "bouquet space"
        flowers = new Vector<Flower>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void removeFlower(Flower flower) {
        flowers.remove(flower);
    }

    public Flower getFlowerByIndex (int index) {
        return flowers.elementAt(index);
    }

    public Integer getFlowerCount() {
        return flowers.size();
    }

    public void showFlowerSet() {
        Utils.writeMessage(getClass().getName());

        for (int i=0; i < getFlowerCount(); i++) {//соблюдаем пробелы i = 0, либо используем хот ки для выравнивания Ctrl+Alt+L
            Utils.writeMessage(getFlowerByIndex(i).toString());
        }
    }
}
