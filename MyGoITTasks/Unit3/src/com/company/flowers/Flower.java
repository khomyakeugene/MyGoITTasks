package com.company.flowers;

import com.company.utils.Const;

import java.text.MessageFormat;

/**
 * Created by Yevgen on 21.12.2015.
 */
public class Flower {
    public final static String WITHOUT_SCENT_MESSAGE = "without scent";
    public final static String FLOWER_DESCRIPTION_MESSAGE = "flower: {0}, colour: {1}, scent: {2}";

    private String flowerType = null;//���� ������ ���� ������ �� ������� ��������� �������� null. ��� ������������� ����������������.
    private String colour = null;
    private String scent = null;

    public String getScent() {
        return scent;
    }

    public String getFlowerType() {
        return flowerType;
    }

    public void setFlowerType(String flowerType) {
        this.flowerType = flowerType;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Flower(String flowerType, String colour, String scent) {//�� java convention ������� ������ ������ �����: ����, ������������, ������
        super();

        setFlowerType(flowerType);
        setColour(colour);
        setScent(scent);
    }

    public Flower(String colour, String scent) {
        this(Const.UNKNOWN_FLOWER_TYPE, colour, scent);
     }//��, ��� ������������ ���� ����� � ���� - �� ������������ - ������� ��� - ������� ��� ���������.

    public Flower(String colour) {
        this(Const.UNKNOWN_FLOWER_TYPE, colour, WITHOUT_SCENT_MESSAGE);
    }

    public Flower() {
        this(null);
    }

    @Override
    public String toString() {
        return MessageFormat.format(FLOWER_DESCRIPTION_MESSAGE, getFlowerType(), getColour(), getScent());
    }
}
