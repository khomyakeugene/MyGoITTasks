package com.company.utils;

import com.company.utils.Const;

import java.text.MessageFormat;

/**
 * Created by Yevgen on 20.12.2015.
 */


public final class Utils {
    public static String getClassNameMessage(Object aObject) {
        return MessageFormat.format(Const.CLASS_NAME_MESSAGE, aObject.getClass().getName());
    }

    public static String getProgramName() {
        return "stub";
        // System.getProperty(Const.PROPERTY_NAME_PROGRAM);
    }

    public static void writeMessage(String aMessage) {
        System.out.println(aMessage);
    }

}
