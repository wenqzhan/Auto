package com.pageObject.commonObject;

import com.alibaba.fastjson.JSONObject;
import com.utils.json.JsonObject;
import lombok.Data;

@Data
public class BizLineSelection extends JsonObject {
    private CommonObject commonObject = new CommonObject();

    public BizLineSelection() {
        super.setPrefix(this.prefix);
    }


    private final String prefix = "//div[1=1 and contains(text(),\"业务条线\")]/../..";

    private final String append1 = "//li/span[3]";

    private final String dBLS34Span = "通用-业务条线-所有的-span";
    private final String xBLS34Span = append1;
    //div[1=1 and contains(text(),"业务条线")]/../..//li/span[3]

    private final String dBLS34SpanSpan1 = "通用-业务条线-国际业务-span";
    private final String xBLS34SpanSpan1 = commonObject.get$XSpan("国际业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"国际业务")]


    private final String dBLS34SpanSpan2 = "通用-业务条线-投行业务-span";
    private final String xBLS34SpanSpan2 = commonObject.get$XSpan("投行业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"投行业务")]

    private final String dBLS34SpanSpan3 = "通用-业务条线-企业金融服务-span";
    private final String xBLS34SpanSpan3 = commonObject.get$XSpan("企业金融服务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"企业金融服务")]

    private final String dBLS34SpanSpan4 = "通用-业务条线-托管业务-span";
    private final String xBLS34SpanSpan4 = commonObject.get$XSpan("托管业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"托管业务")]

    private final String dBLS34SpanSpan5 = "通用-业务条线-席位租赁业务-span";
    private final String xBLS34SpanSpan5 = commonObject.get$XSpan("席位租赁业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"席位租赁业务")]

    private final String dBLS34SpanSpan6 = "通用-业务条线-资管业务-span";
    private final String xBLS34SpanSpan6 = commonObject.get$XSpan("资管业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"资管业务")]

    private final String dBLS34SpanSpan7 = "通用-业务条线-经纪业务-span";
    private final String xBLS34SpanSpan7 = commonObject.get$XSpan("经纪业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"经纪业务")]

    private final String dBLS34SpanSpan8 = "通用-业务条线-信用业务-span";
    private final String xBLS34SpanSpan8 = commonObject.get$XSpan("信用业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"信用业务")]

    private final String dBLS34SpanSpan9 = "通用-业务条线-金融产品代销服务-span";
    private final String xBLS34SpanSpan9 = commonObject.get$XSpan("金融产品代销服务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"金融产品代销服务")]

    private final String dBLS34SpanSpan10 = "通用-业务条线-期货业务-span";
    private final String xBLS34SpanSpan10 = commonObject.get$XSpan("期货业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"期货业务")]

    private final String dBLS34SpanSpan11 = "通用-业务条线-国泰君安香港-span";
    private final String xBLS34SpanSpan11 = commonObject.get$XSpan("国泰君安香港");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"国泰君安香港")]

    private final String dBLS34SpanSpan12 = "通用-业务条线-交投业务-span";
    private final String xBLS34SpanSpan12 = commonObject.get$XSpan("交投业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"交投业务")]

    private final String dBLS34SpanSpan13 = "通用-业务条线-资源类-span";
    private final String xBLS34SpanSpan13 = commonObject.get$XSpan("资源类");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"资源类")]

    private final String dBLS34SpanSpan14 = "通用-业务条线-道合研究服务试用-span";
    private final String xBLS34SpanSpan14 = commonObject.get$XSpan("道合研究服务试用");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"道合研究服务试用")]


    private final String dBLS30 = commonObject.getD30().replaceFirst("-","-业务条线-");
    private final String xBLS30 = commonObject.getX30();
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"关 闭")]

    private final String dBLS29 = commonObject.getD29().replaceFirst("-","-业务条线-");
    private final String xBLS29 = commonObject.getX29();
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"确 定")]


    /**
     * 获取业务条线-第N行,支持最后一个
     *
     * @param num 第N行,如果最后一行传入-1
     */
    private String get$XBLS34SpanSibling(int num) {
        //div[1=1 and contains(text(),"业务条线")]/../..//li[1]/span[3]/..
        String xpath;
        if (num > 0) {
            xpath = getPrefix() + append1.replaceFirst("li", "li[" + num + "]");
        } else if (num == -1) {
            xpath = getPrefix() + append1.replaceFirst("li", "li[" + "last()" + "]");
        } else {
            xpath = getPrefix() + append1;
        }

        xpath = xpath + "/..";

        return xpath;
    }

    /**
     * 获取业务条线-第N行的描述,支持最后一个
     *
     * @param num 第N行,如果最后一行传入-1
     */
    private String get$DBLS34SpanSibling(int num) {
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
    private String get$XBLS34SpanSibling(String name) {
        //div[1=1 and contains(text(),"业务条线")]/../..//li[3]//span[1=1 and contains(text(),"道合研究服务试用")]

        String xpath = getPrefix() + append1.replaceFirst("/span\\[3]", "");

        xpath = xpath + commonObject.get$XSpan(name) + "/..";

        return xpath;
    }

    /**
     * 获取业务条线-第N行的描述,支持最后一个
     *
     * @param name 某一行候选项的名字
     */
    private String get$DBLS34SpanSibling(String name) {
        //获取业务条线-道合研究服务试用那行
        String des;

        des = "获取业务条线-" + name + "那行";

        return des;
    }

    public JSONObject getJsonBLS34SpanSibling(String name) {
        JsonObject.setJsonObject(get$DBLS34SpanSibling(name),
                get$XBLS34SpanSibling(name));
        return JsonObject.getJsonObject();
    }

    public JSONObject getJsonBLS34SpanSibling(int num) {
        JsonObject.setJsonObject(get$DBLS34SpanSibling(num),
                get$XBLS34SpanSibling(num));
        return JsonObject.getJsonObject();
    }


//    public  JSONObject getJson(String description) {
//        switch (description) {
//            case dBLS34SpanSpan1:
//                JsonObject.setJsonObject(dBLS34SpanSpan1, xBLS34_1_1);
//                break;
//            case dBLS34_1_2:
//                JsonObject.setJsonObject(dBLS34_1_2, xBLS34_1_2);
//                break;
//            case dBLS34_1_3:
//                JsonObject.setJsonObject(dBLS34_1_3, xBLS34_1_3);
//                break;
//            case dBLS34_1_4:
//                JsonObject.setJsonObject(dBLS34_1_4, xBLS34_1_4);
//                break;
//            case dBLS34_1_5:
//                JsonObject.setJsonObject(dBLS34_1_5, xBLS34_1_5);
//                break;
//            case dBLS34_1_6:
//                JsonObject.setJsonObject(dBLS34_1_6, xBLS34_1_6);
//                break;
//            case dBLS34_1_7:
//                JsonObject.setJsonObject(dBLS34_1_7, xBLS34_1_7);
//                break;
//            case dBLS34_1_8:
//                JsonObject.setJsonObject(dBLS34_1_8, xBLS34_1_8);
//                break;
//            case dBLS34_1_9:
//                JsonObject.setJsonObject(dBLS34_1_9, xBLS34_1_9);
//                break;
//            case dBLS34_1_10:
//                JsonObject.setJsonObject(dBLS34_1_10, xBLS34_1_10);
//                break;
//            case dBLS34_1_11:
//                JsonObject.setJsonObject(dBLS34_1_11, xBLS34_1_11);
//                break;
//            case dBLS34_1_12:
//                JsonObject.setJsonObject(dBLS34_1_12, xBLS34_1_12);
//                break;
//            case dBLS34_1_13:
//                JsonObject.setJsonObject(dBLS34_1_13, xBLS34_1_13);
//                break;
//            case dBLS34_1_14:
//                JsonObject.setJsonObject(dBLS34_1_14, xBLS34_1_14);
//                break;
//            case dBLS34Span:
//                JsonObject.setJsonObject(dBLS34Span, xBLS34Span);
//                break;
//            case dBLS30:
//                JsonObject.setJsonObject(dBLS30, xBLS30);
//                break;
//            case dBLS29:
//                JsonObject.setJsonObject(dBLS29, xBLS29);
//                break;
//        }
//
//        return JsonObject.getJsonObject();
//
//    }


}
