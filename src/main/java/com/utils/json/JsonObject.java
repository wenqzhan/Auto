package com.utils.json;

import com.alibaba.fastjson.JSONObject;
import com.driver.Driver;
import com.utils.log.LoggerController;
import lombok.Data;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

@Data
public class JsonObject {
    private final static LoggerController log = LoggerController.getLogger(JsonObject.class);
    public static Map<String, JSONObject> jsonObjects = new HashMap<>();
    //    public static JSONObject jsonObject = new JSONObject();
    public static JSONObject jsonObjectTemp = new JSONObject();
    private String conVal;
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



    public void getObjAttr() {
        if (conVal==null){
            conVal="";
        }

        Object obj;
        obj = null;
        Class c = this.getClass();
        Constructor con = null;
        String clazzName = c.getSimpleName();
        try {

            con = c.getConstructor();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        try {

            obj = con.newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        // 获取对象obj的所有属性域
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            // 对于每个属性，获取属性名
            if (field.getType().equals(String.class)) {
                String varName = field.getName()+"@"+clazzName+conVal;

                try {
                    boolean access = field.isAccessible();
                    if (!access) field.setAccessible(true);

                    //从obj中获取field变量
                    Object o = field.get(obj);
                    System.out.println("变量： " + varName + " = " + o);
                    if (prefix != "") {
                        if (varName.startsWith("x")) {
                            Object value = getPrefix() + o;
                            field.set(obj, value);
                            o = field.get(obj);
                            System.out.println("变量更改为： " + varName + " = " + o);
                        }
                    }
                    String str = o.toString();
                    Attr.setAttr(varName, str);

                    if (!access) field.setAccessible(false);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
//            attrs.put(this.getClass().getName(),attr);
            }
        }
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
