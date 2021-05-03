package com.company;

public abstract class component {
    public static String open(String tag) {

        return ("<" + tag + ">");
    }

    public static String close(String tag) {

        return ("</" + tag + ">");
    }
}
