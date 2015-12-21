package com.company;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Yevgen on 20.12.2015.
 */
public class Directory extends SimpleFile {
    private HashMap<String, SimpleFile> Files;

    public HashMap<String, SimpleFile> getFiles() {
        return Files;
    }
    public Directory(String fileName) {
        super(fileName, Const.DIRECTORY_FILE_TYPE);

        Files = new HashMap();
    }

    public void addFile(SimpleFile aFile) {
        Files.put(aFile.getFileName(),aFile);
    }

    public SimpleFile getFileByName(String Filename) {
        return Files.get(Filename);
    }
}
