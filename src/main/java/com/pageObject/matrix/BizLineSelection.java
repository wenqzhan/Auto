package com.pageObject.matrix;

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

    private final String dBusinessLineInputSpan = "通用-业务条线-所有的-span";
    private final String xBusinessLineInputSpan = getPrefix()+append1;
    //div[1=1 and contains(text(),"业务条线")]/../..//li/span[3]

    private final String dBusinessLineInputSpanInternationalBusinessSpan = "通用-业务条线-国际业务-span";
    private final String xBusinessLineInputSpanInternationalBusinessSpan = commonObject.get$XSpan("国际业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"国际业务")]


    private final String dBusinessLineInputSpanInvestmentBankBusinessSpan = "通用-业务条线-投行业务-span";
    private final String xBusinessLineInputSpanInvestmentBankBusinessSpan = commonObject.get$XSpan("投行业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"投行业务")]

    private final String dBusinessLineInputSpanBusinessFinancialServiceSpan = "通用-业务条线-企业金融服务-span";
    private final String xBusinessLineInputSpanBusinessFinancialServiceSpan = commonObject.get$XSpan("企业金融服务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"企业金融服务")]

    private final String dBusinessLineInputSpanCustodyBusinessSpan = "通用-业务条线-托管业务-span";
    private final String xBusinessLineInputSpanCustodyBusinessSpan = commonObject.get$XSpan("托管业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"托管业务")]

    private final String dBusinessLineInputSpanSeatLeasingBusinessSpan = "通用-业务条线-席位租赁业务-span";
    private final String xBusinessLineInputSpanSeatLeasingBusinessSpan = commonObject.get$XSpan("席位租赁业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"席位租赁业务")]

    private final String dBusinessLineInputSpanAssetManagementBusinessSpan = "通用-业务条线-资管业务-span";
    private final String xBusinessLineInputSpanAssetManagementBusinessSpan = commonObject.get$XSpan("资管业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"资管业务")]

    private final String dBusinessLineInputSpanBrokerageSpan = "通用-业务条线-经纪业务-span";
    private final String xBusinessLineInputSpanBrokerageSpan = commonObject.get$XSpan("经纪业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"经纪业务")]

    private final String dBusinessLineInputSpanCreditBusinessSpan = "通用-业务条线-信用业务-span";
    private final String xBusinessLineInputSpanCreditBusinessSpan = commonObject.get$XSpan("信用业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"信用业务")]

    private final String dBusinessLineInputSpanCommissionSaleOfFinancialProductsSpan = "通用-业务条线-金融产品代销服务-span";
    private final String xBusinessLineInputSpanCommissionSaleOfFinancialProductsSpan = commonObject.get$XSpan("金融产品代销服务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"金融产品代销服务")]

    private final String dBusinessLineInputSpanFuturesBusinessSpan = "通用-业务条线-期货业务-span";
    private final String xBusinessLineInputFuturesBusinessSpanSpan = commonObject.get$XSpan("期货业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"期货业务")]

    private final String dBusinessLineInputSpanGTJAHKSpan = "通用-业务条线-国泰君安香港-span";
    private final String xBusinessLineInputSpanGTJAHKSpan = commonObject.get$XSpan("国泰君安香港");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"国泰君安香港")]

    private final String dBusinessLineInputSpanExchangeTradedBusinessSpan = "通用-业务条线-交投业务-span";
    private final String xBusinessLineInputExchangeTradedBusinessSpanSpan = commonObject.get$XSpan("交投业务");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"交投业务")]

    private final String dBusinessLineInputSpanResourceSpan = "通用-业务条线-资源类-span";
    private final String xBusinessLineInputSpanResourceSpan = commonObject.get$XSpan("资源类");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"资源类")]

    private final String dBusinessLineInputSpanVintexTrailSpan = "通用-业务条线-道合研究服务试用-span";
    private final String xBusinessLineInputSpanVintexTrailSpan = commonObject.get$XSpan("道合研究服务试用");
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"道合研究服务试用")]


    private final String dCloseButtonSpan = commonObject.getDCloseButtonSpan().replaceFirst("-","-业务条线-");
    private final String xCloseButtonSpan = commonObject.getXCloseButtonSpan();
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"关 闭")]

    private final String dConfirmButtonSpan = commonObject.getDConfirmButtonSpan().replaceFirst("-","-业务条线-");
    private final String xConfirmButtonSpan = commonObject.getXConfirmButtonSpan();
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"确 定")]


    /**
     * 获取业务条线-第N行,支持最后一个
     *
     * @param num 第N行,如果最后一行传入-1
     */
    private String get$XBusinessLineInputSpanSibling(int num) {
        //div[1=1 and contains(text(),"业务条线")]/../..//li[1]/span[3]/..
        String xpath;
        if (num > 0) {
            xpath = super.getPrefix() + append1.replaceFirst("li", "li[" + num + "]");
        } else if (num == -1) {
            xpath = super.getPrefix() + append1.replaceFirst("li", "li[" + "last()" + "]");
        } else {
            xpath = super.getPrefix() + append1;
        }

        xpath = xpath + "/..";

        return xpath;
    }

    /**
     * 获取业务条线-第N行的描述,支持最后一个
     *
     * @param num 第N行,如果最后一行传入-1
     */
    private String get$DBusinessLineInputSpanSibling(int num) {
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
    private String get$XBusinessLineInputSpanSibling(String name) {
        //div[1=1 and contains(text(),"业务条线")]/../..//li[3]//span[1=1 and contains(text(),"道合研究服务试用")]

        String xpath = super.getPrefix() + append1.replaceFirst("/span\\[3]", "");

        xpath = xpath + commonObject.get$XSpan(name) + "/..";

        return xpath;
    }

    /**
     * 获取业务条线-第N行的描述,支持最后一个
     *
     * @param name 某一行候选项的名字
     */
    private String get$DBusinessLineInputSpanSibling(String name) {
        //获取业务条线-道合研究服务试用那行
        String des;

        des = "获取业务条线-" + name + "那行";

        return des;
    }

    public JSONObject getBusinessLineInputSpanSiblingJson(String name) {
        JsonObject.setJsonObject(get$DBusinessLineInputSpanSibling(name),
                get$XBusinessLineInputSpanSibling(name));
        return JsonObject.getJsonObject();
    }

    public JSONObject getBusinessLineInputSpanSiblingJson(int num) {
        JsonObject.setJsonObject(get$DBusinessLineInputSpanSibling(num),
                get$XBusinessLineInputSpanSibling(num));
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
