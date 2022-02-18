package com.sdk.common;

public class Utils {

    public static String[] splitString(String string, String regex, int limit) {
        return string.split(regex, limit);
    }
}
