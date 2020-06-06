package com.utils.json;

import com.driver.Driver;
import com.utils.log.LoggerController;

import java.util.HashMap;
import java.util.Map;

public class Attr {
    public Attr(Class<?> T) {
//        System.out.println("!@#!@#!@#!@#aaaaa");
        attrs.put(T.getName(), new HashMap<>());
    }

    private final static LoggerController log = LoggerController.getLogger(Attr.class);

    public static Map<String, String> getAttr() {
        Map<String, String> attr = getAttrMap();
        return attr;
    }

    public static void setAttr(String var, String varVal) {
        Map<String, String> attr = getAttrMap();
        attr.put(var, varVal);
    }


    //    private static Map<String, String> attr = new HashMap<>();
    private static Map<String, String> attrTmp = new HashMap<>();
    private static Map<String, String> attrCommon = new HashMap<>();

    private static Map<String, Map<String, String>> attrs = new HashMap<>();

    public static void setAttrCommon(String var, String varVal){
        attrCommon.put(var, varVal);
    }

    public static Map<String, String> getAttrCommon(){
        return attrCommon;
    }

    public static void setAttrs(String clazzName, Map<String, String> attr) {
        attrs.put(clazzName, attr);
    }

    public static Map<String, Map<String, String>> getAttrs() {
        return attrs;
    }

    public static Map<String, String> getAttrTmp() {
        return attrTmp;
    }

    public static Map<String, String> getAttrMap() {
        Map<String, String> attr = null;
        String clazzName;
        int i = 1;
        while (true) {
            try {
                clazzName = Thread.currentThread().getStackTrace()[i].getClassName();
//                System.out.println("!@#!@#!@#");
//                System.out.println(Thread.currentThread().getStackTrace()[i]);
//                System.out.println("!@#!@#!@#");
                i++;
                if (clazzName.contains("uiTest")) {
                    if (attrs.containsKey(clazzName)) {
                        attr = attrs.get(clazzName);
                    } else {
                        attr = attrTmp;
                        log.info("++++++++++++++++++++++++++++=========");
                        log.info("class name is:" + clazzName + ", not in uiTest. or not exist");
                        log.info("++++++++++++++++++++++++++++=========");
                    }
                    break;
                }
            } catch (Exception e) {
                attr = attrTmp;
                log.info("++++++++++++++++++++++++++++=========");
                log.info("sth may be wrong, return default attrTmp");
                log.info("++++++++++++++++++++++++++++=========");
                break;
            }

        }

        return attr;

    }

    public void getAttrsSize() {
        System.out.println("ATTsSIZE");
        System.out.println(attrs.size());
        System.out.println("ATTsSIZE");
    }

    public void deleteFromAttrs(Class<?> T) {
        attrs.remove(T.getName());
    }


}
