package com.pageObject.commonObject;

import com.alibaba.fastjson.JSONObject;
import com.utils.json.JsonObject;

public class BizLineSelection extends JsonObject {

    private static final String prefix = "//div[1=1 and contains(text(),\"业务条线\")]/../..";

    private static final String append1 = "//li/span[3]";

    public final static String dBLS34_1 = "通用-业务条线-所有的-span";
    private final static String xBLS34_1 = prefix + append1;
    //div[1=1 and contains(text(),"业务条线")]/../..//li/span[3]

    public final static String dBLS34_1_1 = "通用-业务条线-国际业务-span";
    private final static String xBLS34_1_1 = prefix + CommonObject.get$XSpan("国际业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"国际业务")]


    public final static String dBLS34_1_2 = "通用-业务条线-投行业务-span";
    private final static String xBLS34_1_2 = prefix + CommonObject.get$XSpan("投行业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"投行业务")]

    public final static String dBLS34_1_3 = "通用-业务条线-企业金融服务-span";
    private final static String xBLS34_1_3 = prefix + CommonObject.get$XSpan("企业金融服务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"企业金融服务")]

    public final static String dBLS34_1_4 = "通用-业务条线-托管业务-span";
    private final static String xBLS34_1_4 = prefix + CommonObject.get$XSpan("托管业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"托管业务")]

    public final static String dBLS34_1_5 = "通用-业务条线-席位租赁业务-span";
    private final static String xBLS34_1_5 = prefix + CommonObject.get$XSpan("席位租赁业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"席位租赁业务")]

    public final static String dBLS34_1_6 = "通用-业务条线-资管业务-span";
    private final static String xBLS34_1_6 = prefix + CommonObject.get$XSpan("资管业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"资管业务")]

    public final static String dBLS34_1_7 = "通用-业务条线-经纪业务-span";
    private final static String xBLS34_1_7 = prefix + CommonObject.get$XSpan("经纪业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"经纪业务")]

    public final static String dBLS34_1_8 = "通用-业务条线-信用业务-span";
    private final static String xBLS34_1_8 = prefix + CommonObject.get$XSpan("信用业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"信用业务")]

    public final static String dBLS34_1_9 = "通用-业务条线-金融产品代销服务-span";
    private final static String xBLS34_1_9 = prefix + CommonObject.get$XSpan("金融产品代销服务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"金融产品代销服务")]

    public final static String dBLS34_1_10 = "通用-业务条线-期货业务-span";
    private final static String xBLS34_1_10 = prefix + CommonObject.get$XSpan("期货业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"期货业务")]

    public final static String dBLS34_1_11 = "通用-业务条线-国泰君安香港-span";
    private final static String xBLS34_1_11 = prefix + CommonObject.get$XSpan("国泰君安香港");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"国泰君安香港")]

    public final static String dBLS34_1_12 = "通用-业务条线-交投业务-span";
    private final static String xBLS34_1_12 = prefix + CommonObject.get$XSpan("交投业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"交投业务")]

    public final static String dBLS34_1_13 = "通用-业务条线-资源类-span";
    private final static String xBLS34_1_13 = prefix + CommonObject.get$XSpan("资源类");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"资源类")]

    public final static String dBLS34_1_14 = "通用-业务条线-道合研究服务试用-span";
    private final static String xBLS34_1_14 = prefix + CommonObject.get$XSpan("道合研究服务试用");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"道合研究服务试用")]


    public final static String dBLS30 = "通用-业务条线-关闭按钮-span";
    private final static String xBLS30 = prefix + CommonObject.getXpath(CommonObject.d30);
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"关 闭")]

    public final static String dBLS29 = "通用-业务条线-确定按钮-span";
    private final static String xBLS29 = prefix + CommonObject.getXpath(CommonObject.d29);
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"确 定")]


    /**
     * 获取业务条线-第N行,支持最后一个
     *
     * @param num 第N行,如果最后一行传入-1
     */
    private static String get$XBLS34_1Sibling(int num) {
        //div[1=1 and contains(text(),"业务条线")]/../..//li[1]/span[3]/..
        String xpath;
        if (num > 0) {
            xpath = prefix + append1.replaceFirst("li", "li[" + num + "]");
        } else if (num == -1) {
            xpath = prefix + append1.replaceFirst("li", "li[" + "last()" + "]");
        } else {
            xpath = prefix + append1;
        }

        xpath = xpath + "/..";

        return xpath;
    }

    /**
     * 获取业务条线-第N行的描述,支持最后一个
     *
     * @param num 第N行,如果最后一行传入-1
     */
    private static String get$DBLS34_1Sibling(int num) {
        //获取业务条线-第1行

        String des;
        if (num > 0) {
            des = "获取业务条线-第" + num + "行";
        } else if (num == -1) {
            des = "获取业务条线-第" + "最后" + "行";
        } else {
            des = "error";
        }

        return des;
    }


    /**
     * 获取业务条线-名为name的那一行,支持最后一个
     *
     * @param name 某一行候选项的名字
     */
    private static String get$XBLS34_1Sibling(String name) {
        //div[1=1 and contains(text(),"业务条线")]/../..//li[3]//span[1=1 and contains(text(),"道合研究服务试用")]

        String xpath = prefix + append1.replaceFirst("/span\\[3]", "");

        xpath = xpath + CommonObject.get$XSpan(name) + "/..";

        return xpath;
    }

    /**
     * 获取业务条线-第N行的描述,支持最后一个
     *
     * @param name 某一行候选项的名字
     */
    private static String get$DBLS34_1Sibling(String name) {
        //获取业务条线-道合研究服务试用那行
        String des;

        des = "获取业务条线-" + name + "那行";

        return des;
    }

    public static JSONObject getJsonBLS34_1Sibling(String name) {
        JsonObject.setJsonObject(get$DBLS34_1Sibling(name),
                get$XBLS34_1Sibling(name));
        return jsonObject;
    }

    public static JSONObject getJsonBLS34_1Sibling(int num) {
        JsonObject.setJsonObject(get$DBLS34_1Sibling(num),
                get$XBLS34_1Sibling(num));
        return jsonObject;
    }


    public static JSONObject getJson(String description) {
        switch (description) {
            case dBLS34_1_1:
                JsonObject.setJsonObject(dBLS34_1_1, xBLS34_1_1);
                break;
            case dBLS34_1_2:
                JsonObject.setJsonObject(dBLS34_1_2, xBLS34_1_2);
                break;
            case dBLS34_1_3:
                JsonObject.setJsonObject(dBLS34_1_3, xBLS34_1_3);
                break;
            case dBLS34_1_4:
                JsonObject.setJsonObject(dBLS34_1_4, xBLS34_1_4);
                break;
            case dBLS34_1_5:
                JsonObject.setJsonObject(dBLS34_1_5, xBLS34_1_5);
                break;
            case dBLS34_1_6:
                JsonObject.setJsonObject(dBLS34_1_6, xBLS34_1_6);
                break;
            case dBLS34_1_7:
                JsonObject.setJsonObject(dBLS34_1_7, xBLS34_1_7);
                break;
            case dBLS34_1_8:
                JsonObject.setJsonObject(dBLS34_1_8, xBLS34_1_8);
                break;
            case dBLS34_1_9:
                JsonObject.setJsonObject(dBLS34_1_9, xBLS34_1_9);
                break;
            case dBLS34_1_10:
                JsonObject.setJsonObject(dBLS34_1_10, xBLS34_1_10);
                break;
            case dBLS34_1_11:
                JsonObject.setJsonObject(dBLS34_1_11, xBLS34_1_11);
                break;
            case dBLS34_1_12:
                JsonObject.setJsonObject(dBLS34_1_12, xBLS34_1_12);
                break;
            case dBLS34_1_13:
                JsonObject.setJsonObject(dBLS34_1_13, xBLS34_1_13);
                break;
            case dBLS34_1_14:
                JsonObject.setJsonObject(dBLS34_1_14, xBLS34_1_14);
                break;
            case dBLS34_1:
                JsonObject.setJsonObject(dBLS34_1, xBLS34_1);
                break;
            case dBLS30:
                JsonObject.setJsonObject(dBLS30, xBLS30);
                break;
            case dBLS29:
                JsonObject.setJsonObject(dBLS29, xBLS29);
                break;
        }

        return jsonObject;

    }


}
