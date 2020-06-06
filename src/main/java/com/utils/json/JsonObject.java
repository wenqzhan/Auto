package com.utils.json;

import com.alibaba.fastjson.JSONObject;
import com.driver.Driver;
import com.pageObject.commonObject.CommonObject;
import com.pageObject.commonObject.CommonObjectPopped;
import com.utils.log.LoggerController;
import lombok.Data;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Data
public class JsonObject {
    private final static LoggerController log = LoggerController.getLogger(JsonObject.class);
    public static Map<String, JSONObject> jsonObjects = new HashMap<>();
    //    public static JSONObject jsonObject = new JSONObject();
    public static JSONObject jsonObjectTemp = new JSONObject();
    private String conVal; // 用于区别有构造函数说创建的类

    public void setConVal(String conVal) {
        this.conVal = conVal;
    }

    public String getConVal() {
        return conVal;
    }

//    public String getLabel() {
//        return label;
//    }
//
//    public void setLabel(String label) {
//        this.label = label;
//    }
//
//    private String label;


//    private CommonObject commonObject;
    //    public static String parentXpath;
//    public static String childTagName;
//    public static String childTagText;
//    public static String[] containsAttributeValue;
//    public static String[] notContainsAttributeValue;
//    public Map<String, String> attr = new HashMap<>();

    private String prefix = "";

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }

    private String desPrefix = ""; //用于修改 描述

    public void setDesPrefix(String desPrefix) {
        this.desPrefix = desPrefix;
    }

    public String getDesPrefix() {
        return desPrefix;
    }


    public static JSONObject getJsonObject() {
        JSONObject j = null;
        String clazzName;


        if (jsonObjects.containsKey("jsonObjectTemp")) {
            j = jsonObjects.get("jsonObjectTemp");
            log.info("**************************");
            log.info("not in uiTest.");
            log.info("**************************");
        } else {
            int i = 1;
            while (true) {
                try {
                    clazzName = Thread.currentThread().getStackTrace()[i].getClassName();

                    i++;
                    if (clazzName.contains("uiTest")) {
//                    log.info("**************************");
//                    log.info("class name is:" + clazzName);
//                    log.info("**************************");
                        if (jsonObjects.containsKey(clazzName)) {
                            j = jsonObjects.get(clazzName);
                            break;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    j = jsonObjectTemp;
                    log.info("**************************");
                    log.info("sth wrong, return default");
                    log.info("**************************");
                    break;
                }

            }
        }

        return j;
    }


    public static String getClazzName() {
        String clazzName;
        int i = 1;
        while (true) {
            try {
                clazzName = Thread.currentThread().getStackTrace()[i].getClassName();
                i++;
                if (clazzName.contains("uiTest")) {
                    break;
                }
            } catch (Exception e) {
                clazzName = "jsonObjectTemp";
//                System.out.println(clazzName);
                break;
            }


        }
        return clazzName;
    }


    public static void setJsonObject(String description, String xpathValue) {
        //jsonObject.put("description",description);
        //jsonObject.put("xpath",xpathValue);
        setJsonObject(description, "xpath", xpathValue);


    }


    public static void setJsonObject(String description, String strAfterBy, String value) {
        JSONObject jsonObject = new JSONObject();
        String clazzName = getClazzName();
//        jsonObject.clear();
        jsonObject.put("description", description);
        jsonObject.put(strAfterBy, value);
        jsonObjects.put(clazzName, jsonObject);

//        for (Map.Entry<String, JSONObject> entry : jsonObjects.entrySet()) {
//            System.out.println("!!!!!!!!");
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//            System.out.println("!!!!!!!!");
//        }

    }


    public Object getObjAttr() {
        return getObjAttr(null);
    }

    private String printMap(Map<String,String> map){
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();
            sb.append(entry.getKey());
            sb.append('=').append('"');
            sb.append(entry.getValue());
            sb.append('"');
            if (iter.hasNext()) {
                sb.append(',').append(' ');
            }
        }
        return sb.toString();

    }


    public Object getObjAttr(String string) {

//        int i = 1;
//        while (true) {
//            try {
//                System.out.println("DTSDFSDF");
//                String clazzName = Thread.currentThread().getStackTrace()[i].getClassName();
//                System.out.println(clazzName);
//                System.out.println("DTSDFSDF");
//                i++;
//            } catch (Exception e) {
//                    break;
//            }
//
//        }
        Map<String, String> attr = Attr.getAttr();
        Map<String, String> attrCommon = Attr.getAttrCommon();
        Object obj;
        obj = null;
        if (attrCommon.size() == 0) {
            Object obj1;
            Object obj2;
            CommonObject commonObject = new CommonObject();
            CommonObjectPopped commonObjectPopped = new CommonObjectPopped();
            String clazzName1 = commonObject.getClass().getName();
//            System.out.println("sdfsdfsdfs111d" + clazzName1);
            String clazzName2 = commonObjectPopped.getClass().getName();
            try {
                Class clazz1 = Class.forName(clazzName1);
//                System.out.println("sdfdfsdfsdf");
//                System.out.println("clazzName1 is:" + clazzName1);
//                System.out.println("sdfdfsdfsdf");
                Class clazz2 = Class.forName(clazzName2);
                Constructor con1 = null;
                Constructor con2 = null;
                con1 = clazz1.getConstructor();
                con2 = clazz2.getConstructor();
                obj1 = con1.newInstance();
                obj2 = con2.newInstance();
                Field[] fields1;
                Field[] fields2;
                fields1 = obj1.getClass().getDeclaredFields();
                fields2 = obj2.getClass().getDeclaredFields();
                for (Field field : fields1) {
                    if (field.getType().equals(String.class)) {
                        String varName = field.getName() + "@" + clazzName1;

                        boolean access = field.isAccessible();
                        if (!access) field.setAccessible(true);
                        Object o = field.get(obj1);
                        System.out.println("初始化[C]变量： " + varName + " = " + o);
                        String str = o.toString();
                        Attr.setAttrCommon(varName, str);
                        if (!access) field.setAccessible(false);
                    }
                }
                attrCommon = Attr.getAttrCommon();

                for (Field field : fields2) {
                    if (field.getType().equals(String.class)) {
                        String varName = field.getName() + "@" + clazzName2;

                        boolean access = field.isAccessible();
                        if (!access) field.setAccessible(true);
                        Object o = field.get(obj2);
                        if (o == null) {
                            Object o1 = null;
                            if (!varName.startsWith("d")) {
                                o1 = attrCommon.get(field.getName().substring(0, field.getName().length() - 1) + "@" + CommonObject.class.getName());
                            } else {
                                o1 = attrCommon.get(field.getName().substring(0, field.getName().length() - 1) + "@" + CommonObject.class.getName()).replaceFirst("通用", "通用-first popped");
                            }
                            o = o1;
                        }

                        System.out.println("初始化[CP]变量： " + varName + " = " + o);
                        String str = o.toString();
                        Attr.setAttrCommon(varName, str);
                        if (!access) field.setAccessible(false);
                    }
                }


            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
                e.printStackTrace();
            }

            attrCommon = Attr.getAttrCommon();
//            System.out.println("DFSDFSDFASDFADFFFFFFF");
//            System.out.println(attrCommon.size());
//            System.out.println(printMap(attrCommon));
//
//            System.out.println("DFSDFSDFASDFADFFFFFFF");
        }
        if (conVal == null) {
            conVal = "";
        }


        Class clazz = this.getClass();
        Class superClazz = this.getClass().getSuperclass();
        Constructor con = null;
//        Constructor con1 = null;
        String clazzName = clazz.getName();
        String superClazzName = superClazz.getName();
//        String clazzName1 = CommonObject.getClazzName();

        try {
            if (string == null) {
                con = clazz.getConstructor();
            } else {
                con = clazz.getConstructor(String.class);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        try {
            if (string == null) {
                obj = con.newInstance();
            } else {
                obj = con.newInstance(string);
            }
        } catch (InstantiationException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        Field[] fields;
        // 获取对象obj的所有属性域
        if (superClazzName.contains("JsonObject")) {
            fields = obj.getClass().getDeclaredFields();
        } else {
            fields = obj.getClass().getSuperclass().getDeclaredFields();
        }


        for (Field field : fields) {
            // 对于每个属性，获取属性名
            if (field.getType().equals(String.class)) {
                String varName = field.getName() + "@" + clazzName + getConVal();

                try {
                    boolean access = field.isAccessible();
                    if (!access) field.setAccessible(true);

                    //从obj中获取field变量
                    Object o = field.get(obj);
                    if (o != null) {
                        if (varName.startsWith("d")) {
                            if (!getDesPrefix().equals("")) {
                                String str = (String) o;
                                str = str.replaceFirst("通用", getDesPrefix());
                                o = str;
                            }
                        }
                        System.out.println("变量： " + varName + " = " + o);
                    } else if (o == null) {

                        if (clazzName.contains("CommonObjectPopped")) {
                            Object o1 = null;
//                            Object o2 = null;
                            if (!varName.startsWith("d")) {
                                o1 = attrCommon.get(field.getName().substring(0, field.getName().length() - 1) + "@" + CommonObject.class.getName());
                            } else {
                                o1 = attrCommon.get(field.getName().substring(0, field.getName().length() - 1) + "@" + CommonObject.class.getName()).replaceFirst("通用", "通用-first popped");
                            }
                            o = o1;
                            System.out.println("变量： " + varName + " = " + o);
                        } else if (!clazzName.contains("CommonObjectPopped")) {
//                        System.out.println("@@@@@@@@");
//                        System.out.println(CommonObject.class.getName());
//                        System.out.println(field.getName()+"@");
//                        System.out.println("@@@@@@@@");
                            Object o1 = null;
                            Object o2 = null;
                            if (!varName.startsWith("d")) {
                                o1 = attrCommon.get(field.getName() + "@" + CommonObject.class.getName());
                                o2 = attrCommon.get(field.getName() + "@" + CommonObjectPopped.class.getName());
                            } else {
                                try {
                                    if (!getDesPrefix().equals("")) {
                                        o1 = attrCommon.get(field.getName() + "@" + CommonObject.class.getName()).replaceFirst("通用", getDesPrefix());
                                    } else {
                                        o1 = attrCommon.get(field.getName() + "@" + CommonObject.class.getName());
                                    }
                                } catch (NullPointerException e) {
                                    if (!getDesPrefix().equals("")) {
                                        o2 = attrCommon.get(field.getName() + "@" + CommonObjectPopped.class.getName()).replaceFirst("通用", getDesPrefix());
                                    } else {
                                        o2 = attrCommon.get(field.getName() + "@" + CommonObjectPopped.class.getName());
                                    }
                                }
                            }


                            o = o1 != null ? o1 : o2;

                            System.out.println("变量： " + varName + " = " + o);
                        }
                    }
                    if (prefix != "") {
                        if (varName.startsWith("x") && !varName.contains("Final")) {
                            Object value = getPrefix() + o;
                            field.set(obj, value);
                            o = field.get(obj);
                            System.out.println("变量更改为： " + varName + " = " + o);
                        }
                    }
                    field.set(obj, o);
                    String str = o.toString();
//                    System.out.println("*************999999999");
                    Attr.setAttr(varName, str);

//                    System.out.println("!!!!!!!!!");
//                    Object caaa = field.get(obj);
//                    System.out.println(field.getName()+":"+caaa);
//                    System.out.println("@@@@@@@@@");


                    if (!access) field.setAccessible(false);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
//            attrs.put(this.getClass().getName(),attr);
            }
        }

//        System.out.println("UUUUUUUUUUUUUUUUU");
//        System.out.println("UUUUUUUUUUUUUUUUU");
//        Field[] fields2 = obj.getClass().getDeclaredFields();
//        for (Field field : fields2) {
//            boolean access = field.isAccessible();
//            if (!access) field.setAccessible(true);
//            System.out.println("!!!!!11111!!!!");
//            Object caaa = null;
//            try {
//                caaa = field.get(obj);
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//            System.out.println(field.getName()+":"+caaa);
//            System.out.println("@@@@@@111111@@@");
//        }


        return obj;
    }

    public String getVal(String key) {
        Map<String, String> attr = Attr.getAttr();

        String str1 = attr.get(key + "@" + CommonObject.class.getName());
        String str2 = attr.get(key + "@" + CommonObjectPopped.class.getName());

        String str = str1 != null ? str1 : str2;

        return str;
    }


    public JSONObject getJsonObject(String description) {
        Map<String, String> attr = Attr.getAttr();
//        Map<String, String> attr = new HashMap<>();
//        attr = attrs.get(this.getClass().getName());
//        System.out.println("+++)_)_)_()");
//        System.out.println(this.getClass().getName());
//        System.out.println("+++)_)_)_()");
//        System.out.println(description);
//        System.out.println("-------------9999----------");
        String key = "";

//        System.out.println(attr.size());
        for (Map.Entry<String, String> entry : attr.entrySet()) {
//            System.out.println("-----------------------");
            if (entry.getValue().equals(description)) {
//                System.out.println(entry.getValue());
//                System.out.println("-----------7777------------");
                key = entry.getKey();
                break;
            }
        }
//        System.out.println("-----------888------------");
        String key1 = key.replaceFirst("d", "x");
        String key2 = key.replaceFirst("d", "i");

        String xpath = attr.get(key1);
//        System.out.println("-----------999------------");
        System.out.println(xpath);
        String id = attr.get(key2);
//        System.out.println("-----------aaa-----------");
//        System.out.println(id);
        if (xpath != null) {
            setJsonObject(description, xpath);
        } else {
            setJsonObject(description, "id", id);
        }

        return getJsonObject();
    }


}
