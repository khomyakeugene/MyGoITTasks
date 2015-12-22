package com.company;

import com.company.tests.TestFileData;
import com.company.tests.TestFlowerData;
import com.company.tests.TestMusicShop;
import com.company.utils.Const;
import com.company.utils.Utils;

import java.text.MessageFormat;

public class Main {
   static String thisProgramName = Utils.getProgramName();

    public static void main(String[] args) {
        System.out.println(MessageFormat.format(Const.THIS_ROGRAM_NAME_MESSAGE, thisProgramName));

        demonstrateData();
    }

    public static void demonstrateData() {
        // Demonstrate "file infrastructure"
        new TestFileData().demonstrateData(thisProgramName); // здесь я убрала лишние скобки, сравни с нижними строками.

        // Demonstrate flowers
        (new TestFlowerData()).demonstrateData();

        // Demonstrate music shop
        (new TestMusicShop()).demonstrateData();
    }
}


