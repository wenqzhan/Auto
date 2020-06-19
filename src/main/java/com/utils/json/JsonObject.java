package com.utils.json;

import com.alibaba.fastjson.JSONObject;
import com.pageObject.matrix.CommonObject;
//import com.pageObject.matrix.commonObject.CommonObjectPopped;
import com.utils.log.LoggerController;
import lombok.Data;
import org.apache.commons.lang3.ArrayUtils;

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
    private String outerLabel = "";

    public void setConVal(String conVal) {
        this.conVal = conVal;
    }

    public String getConVal() {
        return conVal;
    }

    public void setOuterLabel(String outerLabel) {
        this.outerLabel = outerLabel;
    }

    public String getOuterLabel() {
        return outerLabel;
    }

    private String poppedPrefix = "//div[@tabindex]";

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

    private String printMap(Map<String, String> map) {
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
//        Map<String, String> attr = Attr.getAttr();
        Map<String, String> attrCommon = Attr.getAttrCommon();
        Object obj;
        obj = null;
        if (attrCommon.size() == 0) {
            Object commmon;
            CommonObject commonObject = new CommonObject();
            String clazzName1 = commonObject.getClass().getName();
            try {
                Class<?> clazz1 = Class.forName(clazzName1);
                Constructor<?> con1 = null;
                con1 = clazz1.getConstructor();
                commmon = con1.newInstance();
                Field[] fields1;
                fields1 = commmon.getClass().getDeclaredFields();
                for (Field field : fields1) {
                    if (field.getType().equals(String.class)) {
                        String varName = field.getName() + "@" + clazzName1;

                        boolean access = field.isAccessible();
                        if (!access) field.setAccessible(true);
                        Object o = field.get(commmon);
                        System.out.println("初始化[C]变量： " + varName + " = " + o);
                        String str = o.toString();
                        Attr.setAttrCommon(varName, str);
                        if (!access) field.setAccessible(false);
                    }
                }
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
                e.printStackTrace();
            }

            attrCommon = Attr.getAttrCommon();
        }
        if (conVal == null) {
            conVal = "";
        }
        Class<?> clazz = this.getClass();
        Class<?> superClazz = this.getClass().getSuperclass();
        Constructor<?> con = null;
        String clazzName = clazz.getName();
        String superClazzName = superClazz.getName();
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
                assert con != null;
                obj = con.newInstance();
            } else {
                assert con != null;
                obj = con.newInstance(string);
            }
        } catch (InstantiationException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        Field[] fields;
        Field[] fieldsChild;
        Field[] fieldsSuper;
        // 获取对象obj的所有属性域
        if (superClazzName.contains("JsonObject")) {
            assert obj != null;
            fields = obj.getClass().getDeclaredFields();
        } else {
            assert obj != null;
            fieldsSuper = obj.getClass().getSuperclass().getDeclaredFields();
            fieldsChild = obj.getClass().getDeclaredFields();
            fields = ArrayUtils.addAll(fieldsSuper, fieldsChild);
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
                    } else {

                        Object o1 = null;
                        if (!varName.startsWith("d")) {
                            o1 = attrCommon.get(field.getName() + "@" + CommonObject.class.getName());
                        } else {
                            try {
                                if (!getDesPrefix().equals("")) {
                                    o1 = attrCommon.get(field.getName() + "@" + CommonObject.class.getName()).replaceFirst("通用", getDesPrefix());
                                } else {
                                    o1 = attrCommon.get(field.getName() + "@" + CommonObject.class.getName());
                                }
                            } catch (Exception e) {
                                System.out.println("错误在这里哈哈哈哈哈");
                                e.printStackTrace();
                            }
                        }
                        o = o1;
                        System.out.println("变量： " + varName + " = " + o);
                    }
                    if (!prefix.equals("")) {
                        if (varName.startsWith("x") && !varName.contains("Final")) {
                            Object value = getPrefix() + o;
                            field.set(obj, value);
                            o = field.get(obj);
                            System.out.println("变量更改为： " + varName + " = " + o);
                        }
                    }
                    field.set(obj, o);
                    assert o != null;
                    String str = o.toString();
                    Attr.setAttr(varName, str);
                    if (!access) field.setAccessible(false);
                } catch (Exception ex) {
                    System.out.println("错误在这里啦啦啦啦啦啦");
                    ex.printStackTrace();
                }
            }
        }
        return obj;
    }

    public String getVal(String key) {
        Map<String, String> attr = Attr.getAttr();

        //        String str2 = attr.get(key + "@" + CommonObjectPopped.class.getName());

        return attr.get(key + "@" + CommonObject.class.getName());
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
