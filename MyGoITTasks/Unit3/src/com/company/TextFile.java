package com.company;

/**
 * Created by Yevgen on 20.12.2015.
 */
public class TextFile extends SimpleFile {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TextFile(String fileName) {
        super(fileName, Const.TEXT_FILE_TYPE);
     }

    public TextFile(String fileName, String text) {
        this(fileName);

        this.text = text;
    }
}
