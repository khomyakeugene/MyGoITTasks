package com.company.files;

import com.company.files.SimpleFile;
import com.company.utils.Const;

import java.util.HashMap;

/**
 * Created by Yevgen on 20.12.2015.
 */
public class Directory extends SimpleFile {
    private HashMap<String, SimpleFile> Files; // именуем с маленькой буквы

    public HashMap<String, SimpleFile> getFiles() {
        return Files;
    }
    public Directory(String fileName) {
        super(fileName, Const.DIRECTORY_FILE_TYPE);

        Files = new HashMap(); //здесь также надо параметризировать мапу, либо хотя бы указать <> (пустые угловые скобки)
    }

    public void addFile(SimpleFile aFile) {//ну вот чего-то сейчас так не встречаю, чтобы именовали aSomething, можно просто file
        Files.put(aFile.getFileName(),aFile);
    }

    public SimpleFile getFileByName(String Filename) { //параметры также именуются - кэмл кейс - fileName
        return Files.get(Filename);
    }
}
