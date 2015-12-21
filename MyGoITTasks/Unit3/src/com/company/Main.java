package com.company;

import java.text.MessageFormat;

public class Main {
   static String thisProgramName = Utils.getProgramName();

    public static void main(String[] args) {
        System.out.println(MessageFormat.format(Const.THIS_ROGRAM_NAME_MESSAGE, thisProgramName));

        demonstrateData();
    }

    public static void demonstrateData() {
        // Demonstrate "file infrastructure"
        (new TestFileData()).demonstrateData(thisProgramName);

        // Demonstrate folwers
        (new TestFlowerData()).demonstrateData();

        (new TestMusicShop()).demonstrateMusicShop();
    }
}


