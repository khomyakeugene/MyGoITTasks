package com.company.files;

import com.company.files.SimpleFile;
import com.company.utils.Const;

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
