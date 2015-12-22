package com.company.tests;

import com.company.*;
import com.company.files.*;
import com.company.utils.Const;
import com.company.utils.Utils;

import java.text.MessageFormat;
import java.util.HashMap;

/**
 * Created by Yevgen on 21.12.2015.
 */
public class TestFileData {
    public static final String TEST_TEXT = "Test Text";
    public static final String TEST_DIRECTORY = "Test Directory";

    private SimpleFile simpleFile = null;// ќбъекты так же как и стринги по умолчанию инициализируютс€ null (если пол€ класса)
    private TextFile textFile = null;
    private AudioFile audioFile = null;
    private ImageFile imageFile = null;
    private Directory directory = null;
    private String testFilename;

    public String getTestFilename() {
        return testFilename;
    }

    public void setTestFilename(String testFilename) {
        this.testFilename = testFilename;
    }

    private void initFileData() {
        simpleFile = new SimpleFile(getTestFilename()); //в общем-то, если ты обращаешьс€ к полю класса внутри тоже же класса,
        //то нет смысла использовать геттер. Ёто больше дл€ обращений из вне.
        textFile = new TextFile(getTestFilename() + Const.TEXT_FILE_EXT, TEST_TEXT);
        audioFile = new AudioFile(getTestFilename() + Const.AUDIO_FILE_EXT);
        imageFile = new ImageFile(getTestFilename() + Const.IMAGE_FILE_EXT);
    }

    private void initDirectoryData() {
        directory = new Directory(TEST_DIRECTORY);

        directory.addFile(textFile);
        directory.addFile(imageFile);
        directory.addFile(audioFile);
    }

    private void showDirectoryData() {
        HashMap<String, SimpleFile> fileList = directory.getFiles();
        int commonCount = fileList.size();
        Object[] directoryData = fileList.values().toArray();

        for (int i=0; i < commonCount; i++)
            Utils.writeMessage(MessageFormat.format(Const.FILE_DATA_MESSAGE, i, ((SimpleFile)directoryData[i]).getFileName(), ((SimpleFile)directoryData[i]).getFileType()));
//ужас-ужас длинна€ строка!)) Ќадо избегать таких паровозов. ¬ыносим во временные переменные.
        //«ачем-то делаешь type cast на SimpleFile.  ” теб€ же те методы возвращают стринги.  ак их можно кастить на класс SimpleFile?
        }

    public void demonstrateDirectoryData() {
        initDirectoryData();
        showDirectoryData();
    }

    private void showFileData() {
        Utils.writeMessage(Utils.getClassNameMessage(simpleFile));
// ---------------

        Utils.writeMessage(Utils.getClassNameMessage(textFile));
        Utils.writeMessage(MessageFormat.format(Const.TEXT_DATA_MESSAGE, textFile.getText()));
// ---------------

        String audioDataStringPresentation;
        try {
            audioDataStringPresentation = audioFile.getAudioData().toString();
        } //catch пишетс€ в этой строке сразу после фигурной скобки + пробел
        catch (Throwable e) {//а с какого метода мы ловим эксепшн? не пон€ла
            audioDataStringPresentation = null;
        }
        Utils.writeMessage(Utils.getClassNameMessage(audioFile));
        Utils.writeMessage(MessageFormat.format(Const.AUDIO_DATA_MESSAGE, audioDataStringPresentation));
// ---------------

        String imageDataStringPresentation;
        try {
            imageDataStringPresentation = imageFile.getImage().toString();
        }
        catch (Throwable e) {
            imageDataStringPresentation = null;
        }
        Utils.writeMessage(Utils.getClassNameMessage(imageFile));
        Utils.writeMessage(MessageFormat.format(Const.IMAGE_DATA_MESSAGE, imageDataStringPresentation));
        // ---------------

    }

    public void demonstrateFileData() {
        initFileData();
        showFileData();
    }
// ----------------------------------------

    public void demonstrateData(String testFilename) {
        setTestFilename(testFilename);
        
        demonstrateFileData(); //если ты из одного метода вызываешь другие методы, которые наход€тс€ в этом же классе,
        //и этот (вызываемый) метод используетс€ только в этом классе, то его делаем private и помещаем под тем методом, который
        //его вызвал (или максимально близко под ним)
        demonstrateDirectoryData();
    }
}
