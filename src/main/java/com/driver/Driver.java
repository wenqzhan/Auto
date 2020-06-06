package com.driver;

import com.alibaba.fastjson.JSONObject;
import com.pageObject.commonObject.CommonObject;
import com.pageObject.commonObject.CommonObjectPopped;
import com.utils.json.Attr;
import com.utils.log.LoggerController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 静态化多个变量以方便继承类直接调用静态方法
 *
 * @author wenqzhan
 * @date 2020/03/17
 */
public class Driver {
    public static Map<String, WebDriver> drivers = new HashMap<>();
    public static Map<String, Actions> actions = new HashMap<>();
    //    public static WebDriver driver;
    public static WebDriver driverTemp;
    private final static LoggerController log = LoggerController.getLogger(Driver.class);
//    public static WebElement element;
//    public static List<WebElement> elements;
    //public static ListMisc<WebElement> elements1;
    //public static ListMisc<WebElement> elements2;


    //    public static JSONObject jsonObject;
//    public static Actions action ;
    public static Actions actionTemp;
//    public static String text; //一般用在获取input,textarea中的文字,或者其他标签内的文字
//    public static boolean hasException = false;


    //用于findElement, 如果flag是false,则找不到元素时记录info而不是error
//    public static int randomPageNum; //随机第....页
//    public static int perPageNum; //每页....行
//    public static int maxPageNum; //最大的页数,一般是最后页
//    public static int randomPerPageNum; //随机的每页....行
//    public static String string; //通用的string,用来存string
    //public static String attributeValue;//通过getAttribute()获得

    public static WebDriver getDriver() {
        WebDriver d = null;
        String clazzName;
//        System.out.println("==============================");
//        System.out.println(drivers.size());
//        for (Map.Entry<String,WebDriver> entry : drivers.entrySet()) {
//
//            System.out.println("Key = " + entry.getKey() );
//
//        }
//
//
//        System.out.println("==============================");
        int i = 1;
        while (true) {
            try {

                clazzName = Thread.currentThread().getStackTrace()[i].getClassName();

                i++;
                if (clazzName.contains("uiTest")) {

//                    Class<?> clazz = Class.forName(clazzName);
//                    System.out.println("d111ssdfsdfsdfsdf");
//                    System.out.println(clazz.getName());
//                    Field f = clazz.getDeclaredField("testCount");
//                    f.setAccessible(true);
//                    System.out.println("dssdfsdfsdfsdf");
//                    System.out.println(f.get(null));
//                    System.out.println("dssdfsdfsdfsdf");
//                    f.setAccessible(false);

//                    log.info("==========================");
//                    log.info("class name is:"+clazzName);
//                    log.info("==========================");
                    if (drivers.containsKey(clazzName)) {
                        d = drivers.get(clazzName);
                    } else {
                        d = driverTemp;
                        log.info("==========================");
                        log.info("class name is:" + clazzName + ", not in uiTest.");
                        log.info("==========================");
                    }
                    break;
                }
            } catch (Exception e) {
                d = driverTemp;
                log.info("==========================");
                log.info("sth may be wrong, return default");
                log.info("==========================");
                break;
            }

        }

        return d;
    }

    public static Actions getAction() {
        Actions a = null;
        String clazzName;
        int i = 1;
        while (true) {

            try {
                clazzName = Thread.currentThread().getStackTrace()[i].getClassName();
                i++;
                if (clazzName.contains("uiTest")) {
                    if (drivers.containsKey(clazzName)) {
                        a = actions.get(clazzName);
                    } else {
                        a = actionTemp;
                    }
                    break;
                }
            } catch (Exception e) {
                a = actionTemp;
                break;
            }

        }

        return a;
    }


    public static void initialiseAttr() {
//        String clazzName;
//        Map<String, Map<String, String>> attrs = Attr.getAttrs();
//        int i = 1;
//        while (true) {
//            try {
//                clazzName = Thread.currentThread().getStackTrace()[i].getClassName();
//                i++;
//                if (clazzName.contains("uiTest")) {
//                    if (!attrs.containsKey(clazzName)) {
//                        Attr.setAttrs(clazzName, new HashMap<>());
//                        break;
//                    }
//                } else {
//                    Attr.setAttrs("default", Attr.getAttrTmp());
//                    log.info("==============0000============");
//                    log.info("class name is:" + clazzName + ", not in uiTest.");
//                    log.info("=============0000=============");
//                    break;
//                }
//
//            } catch (Exception e) {
//                Attr.setAttrs("default", Attr.getAttrTmp());
//                log.info("==============0000============");
//                log.info("th may be wrong, return default");
//                log.info("=============0000=============");
//                break;
//            }
//        }
//
//
//        Map<String, String> attr = Attr.getAttr();
//        if (attr.size() == 0) {

            CommonObject commonObject = new CommonObject();
            commonObject.getObjAttr();

            CommonObjectPopped commonObjectPopped = new CommonObjectPopped();
            commonObjectPopped.getObjAttr();
        }

    public static Class<?> getThisClazz(){
        Class clazz=new Object()    {
        public Class<?> getClazz(){
            Class clazz = this.getClass();
            return clazz.getSuperclass();}
        }.getClass();
        return (Class<?>) clazz.getSuperclass();
    }

    public static Object getConst(String field){
        try {
            return getThisClazz().getField(field).get(null);
        } catch (Exception e) {}
        return null;
    }

    public static Object getPrivateConst(String field){
        try {
            System.out.println(getThisClazz().getName());
            Field f = getThisClazz().getDeclaredField(field);
            f.setAccessible(true);
            return f.get(null);
        } catch (Exception e) {}
        return null;
    }


}
