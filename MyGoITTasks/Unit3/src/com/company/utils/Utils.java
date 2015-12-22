package com.company.utils;

import com.company.utils.Const; //неиспользуемые импорты за борт. Кстати, можно идею настроить, чтобы она сама убирала неиспользуемые импорты

import java.text.MessageFormat;

/**
 * Created by Yevgen on 20.12.2015.
 */
//вот эти комменты, что создаются по умолчанию - тоже можно настроить, чтобы они не создавались - пока они не несут нагрузки, только мешают))


public final class Utils {
    public static String getClassNameMessage(Object aObject) {
        return MessageFormat.format(Const.CLASS_NAME_MESSAGE, aObject.getClass().getName());
    }

    public static String getProgramName() {
        return "stub";
        // System.getProperty(Const.PROPERTY_NAME_PROGRAM); //Закоментированный код - за борт - это мусор. Читаем Clean Code
    }

    public static void writeMessage(String aMessage) {
        System.out.println(aMessage);
    }

}
