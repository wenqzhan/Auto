package com.utils.json;

import java.util.HashMap;
import java.util.Map;

public class Attr {
    public static Map<String, String> getAttr() {
        return attr;
    }

    public static void setAttr(String var, String varVal) {
        attr.put(var, varVal);
    }

    private static Map<String, String> attr = new HashMap<>();


}
