package com.company.files;

import com.company.files.SimpleFile;
import com.company.utils.Const;
import javafx.scene.image.Image;
// public class Image extends java.lang.Object
// The Image class represents graphical images and is used for loading images from a specified URL.

/**
 * Created by Yevgen on 20.12.2015.
 */
public class ImageFile extends SimpleFile {
    private Image image;

    public ImageFile(String fileName) {
        super(fileName, Const.IMAGE_FILE_TYPE);
    }
    //по java convention соблюдаем последовательность объявления: поля класса, конструкторы, методы.

    public ImageFile(String fileName, Image image) {
        this(fileName);

        setImage(image);
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

}
