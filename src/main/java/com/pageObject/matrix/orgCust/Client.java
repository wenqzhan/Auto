package com.pageObject.matrix.orgCust;

import com.alibaba.fastjson.JSONObject;
import com.pageObject.commonObject.CommonObject;
import com.pageObject.commonObject.CommonObjectPopped;
import com.utils.json.JsonObject;

public class Client extends JsonObject {//客户联系人

    public static String client =
            "http://10.187.144.60:8081/orgcust/client";

    public final static String d35 = "客户联系人-新增按钮-span";
    private final static String x35 = CommonObject.getXpath(CommonObject.d35);
    //span[1=1 and contains(text(),"新增")]

    public final static String d6 = "客户联系人-导出按钮-span";
    private final static String x6 = CommonObject.getXpath(CommonObject.d6);
    //span[1=1 and contains(text(),"导出")]

    public final static String d36 = "客户联系人-开通道合按钮-span";
    private final static String x36 = CommonObject.getXpath(CommonObject.d36);
    //span[1=1 and contains(text(),"开通道合")]


    public final static String d37 = "客户联系人-联系人姓名框-input";
    private final static String x37 = CommonObject.getXpath(CommonObject.d37);
    //label[1=1 and contains(text(),"联系人姓名")]/../following-sibling::*[1]//input

    public final static String d38 = "客户联系人-手机框-input";
    private final static String x38 = CommonObject.getXpath(CommonObject.d38);
    //label[1=1 and contains(text(),"手机")]/../following-sibling::*[1]//input

    public final static String d41 = "客户联系人-邮箱框-input";
    private final static String x41 = CommonObject.getXpath(CommonObject.d41);
    //label[1=1 and contains(text(),"邮箱")]/../following-sibling::*[1]//input

    public final static String d3 = "客户联系人-查询按钮-span";
    private final static String x3 = CommonObject.getXpath(CommonObject.d3);
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"查询")]

    public final static String d4 = "客户联系人-重置按钮-span";
    private final static String x4 = CommonObject.getXpath(CommonObject.d4);
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]

    ///////////////////////
    public final static String d9 = "客户联系人-表格-table";
    private final static String x9 = CommonObject.getXpath(CommonObject.d9);
    //table[1=1 and contains(@class,'ant-table-fixed')]

    public final static String d10 = "客户联系人-表格表体rows-tr";
    private final static String x10 = CommonObject.getXpath(CommonObject.d10);
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not (contains(@style,'height'))]

    public final static String d10Selected = "客户联系人-表格表体rows-selected-tr";
    private final static String x10Selected = CommonObject.getXpath(CommonObject.d10Selected);
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected')]

    public final static String d10NotSelected = "客户联系人-表格表体rows-not selected-tr";
    private final static String x10NotSelected = CommonObject.getXpath(CommonObject.d10NotSelected);
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected'))]

    public final static String d11 = "客户联系人-表格表头row下的th col-th";
    private final static String x11 = CommonObject.getXpath(CommonObject.d11);
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[not(@key='selection-column') and not(@key='action')]

    public final static String d31 = "客户联系人-表格表头-多选框-th";
    private final static String x31 = CommonObject.getXpath(CommonObject.d31);
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']

    public final static String d12 = "客户联系人-表格下方翻页按钮-上一页-li";
    private final static String x12 = CommonObject.getXpath(CommonObject.d12);
    //li[1=1 and contains(@title,'上一页')]

    public final static String d13 = "客户联系人-表格下方翻页按钮-下一页-li";
    private final static String x13 = CommonObject.getXpath(CommonObject.d13);
    //li[1=1 and contains(@title,'下一页')]

    public final static String d14 = "客户联系人-表格下方翻页按钮-下一页前的按钮,可以看出共多少页-a";
    private final static String x14 = CommonObject.getXpath(CommonObject.d14);
    //li[1=1 and contains(@title,'下一页')]/preceding-sibling::li[1]/a

    public final static String d15 = "客户联系人-表格下方跳页输入框-input";
    private final static String x15 = CommonObject.getXpath(CommonObject.d15);
    //div[1=1 and contains(text(),"跳至")]/input

    public final static String d16 = "客户联系人-表格下方跳页输入框左边的跳至两个字-div";
    private final static String x16 = CommonObject.getXpath(CommonObject.d16);
    //div[1=1 and contains(text(),"跳至")]

    public final static String d17 = "客户联系人-数据加载(转菊花)-span";
    private final static String x17 = CommonObject.getXpath(CommonObject.d17);
    //span[1=1 and contains(@class,'ant-spin-dot')]

    public final static String d18 = "客户联系人-条/页-div";
    private final static String x18 = CommonObject.getXpath(CommonObject.d18);
    //div[1=1 and contains(@title,'条/页')]

    public final static String d18l5 = "客户联系人-条/页-5 条/页-li";
    private final static String x18l5 = CommonObject.getXpath(CommonObject.d18l5);
    //li[1=1 and text()='5 条/页' ]

    public final static String d18l10 = "客户联系人-条/页-10 条/页-li";
    private final static String x18l10 = CommonObject.getXpath(CommonObject.d18l10);
    //li[1=1 and text()='10 条/页' ]

    public final static String d18l20 = "客户联系人-条/页-20 条/页-li";
    private final static String x18l20 = CommonObject.getXpath(CommonObject.d18l20);
    //li[1=1 and text()='20 条/页' ]

    public final static String d18l30 = "客户联系人-条/页-30 条/页-li";
    private final static String x18l30 = CommonObject.getXpath(CommonObject.d18l30);
    //li[1=1 and text()='30 条/页' ]

    public final static String d28 = "客户联系人-表头多选框-input";
    private final static String x28 = CommonObject.getXpath(CommonObject.d28);
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']//input

    public final static String d48 = "客户联系人-添加/修改-成功系统提示信息";
    private final static String x48 = CommonObject.getXpath(CommonObject.d48);
    //div[@class='ant-message-notice-content']
    ///////////////
    public final static String d34P = "客户联系人-业务条线查询框-input";
    private final static String x34P = CommonObjectPopped.getXpath(CommonObjectPopped.d34P);
    //div[@tabindex]//label[1=1 and contains(text(),"业务条线")]/../following-sibling::*[1]//input

    public final static String d34P_cross = "客户联系人-业务条线查询框-input-旁边的×";
    private final static String x34P_cross = CommonObjectPopped.getXpath(CommonObjectPopped.d34P_croxx);
    //div[@tabindex]//label[1=1 and contains(text(),"业务条线")]/../following-sibling::*[1]//input/..//i[1=1 and contains(@class,'close-circle')]

    public final static String d1P = "客户联系人-first popped-OA账号框-input";
    private final static String x1P = CommonObjectPopped.getXpath(CommonObjectPopped.d1P);
    //label[1=1 and contains(text(),"OA账号")]/../following-sibling::*[1]//input

    public final static String d2P = "客户联系人-first popped-客户名称框-input";
    private final static String x2P = CommonObjectPopped.getXpath(CommonObjectPopped.d2P);
    //label[1=1 and contains(text(),"客户名称")]/../following-sibling::*[1]//input


    public final static String d37P = "客户联系人-first popped-联系人姓名框-input";
    private final static String x37P = CommonObjectPopped.getXpath(CommonObjectPopped.d37P);
    //label[1=1 and contains(text(),"联系人姓名")]/../following-sibling::*[1]//input

    public final static String d38P = "客户联系人-first popped-手机框-input";
    private final static String x38P = CommonObjectPopped.getXpath(CommonObjectPopped.d38P);
    //label[1=1 and contains(text(),"手机")]/../following-sibling::*[1]//input

    public final static String d39P = "客户联系人-first popped-部门框-input";
    private final static String x39P = CommonObjectPopped.getXpath(CommonObjectPopped.d39P);
    //label[1=1 and contains(text(),"部门")]/../following-sibling::*[1]//input


    public final static String d40P = "客户联系人-first popped-FAX框-input";
    private final static String x40P = CommonObjectPopped.getXpath(CommonObjectPopped.d40P);
    //label[1=1 and contains(text(),"FAX")]/../following-sibling::*[1]//input

    public final static String d41P = "客户联系人-first popped-邮箱框-input";
    private final static String x41P = CommonObjectPopped.getXpath(CommonObjectPopped.d41P);
    //label[1=1 and contains(text(),"邮箱")]/../following-sibling::*[1]//input

    public final static String d42P = "客户联系人-first popped-客户简称框-input";
    private final static String x42P = CommonObjectPopped.getXpath(CommonObjectPopped.d42P);
    //label[1=1 and contains(text(),"客户简称")]/../following-sibling::*[1]//input

    public final static String d43P = "客户联系人-first popped-职务框-input";
    private final static String x43P = CommonObjectPopped.getXpath(CommonObjectPopped.d43P);
    //label[1=1 and contains(text(),"职务")]/../following-sibling::*[1]//input


    public final static String d44P = "客户联系人-first popped-座机框-input";
    private final static String x44P = CommonObjectPopped.getXpath(CommonObjectPopped.d44P);
    //label[1=1 and contains(text(),"座机")]/../following-sibling::*[1]//input

    public final static String d45P = "客户联系人-first popped-创建人框-input";
    private final static String x45P = CommonObjectPopped.getXpath(CommonObjectPopped.d45P);
    //label[1=1 and contains(text(),"创建人")]/../following-sibling::*[1]//input

    public final static String d46P = "客户联系人-first popped-办公地址框-input";
    private final static String x46P = CommonObjectPopped.getXpath(CommonObjectPopped.d46P);
    //label[1=1 and contains(text(),"办公地址")]/../following-sibling::*[1]//input
//
//    public final static String d27P = "客户联系人-first popped-客户经理框-input";
//    private final static String x27P = CommonObjectPopped.getXpath(CommonObjectPopped.d27P);
//    //label[1=1 and contains(text(),"客户经理")]/../following-sibling::*[1]//input
//
    public final static String d47P = "客户联系人-first popped-国君服务联系人框-input";
    private final static String x47P = CommonObjectPopped.getXpath(CommonObjectPopped.d47P);
    //label[1=1 and contains(text(),"国君服务联系人")]/../following-sibling::*[1]//input


    public final static String d29P = "客户联系人-first popped-确定按钮-span";
    private final static String x29P = CommonObjectPopped.getXpath(CommonObjectPopped.d29P);
    //div[@tabindex]//span[1=1 and contains(text(),"确 定")]

    public final static String d30P = "客户联系人-first popped-关闭按钮-span";
    private final static String x30P = CommonObjectPopped.getXpath(CommonObjectPopped.d30P);
    //div[@tabindex]//span[1=1 and contains(text(),"关 闭")]


    private static String get$XPQueryInput(String label) {
        //div[@tabindex]//label[1=1 and contains(text(),"客户柜台代码")]/../following-sibling::*[1]//input
        return CommonObjectPopped.get$XPQueryInput(label);
    }


    private static String get$DPQueryInput(String label) {
        return CommonObjectPopped.get$DPQueryInput(label).
                replaceFirst("通用", "客户联系人");
    }

    private static String get$X10Sibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(@style)][30]
        String xpath = CommonObject.get$X10Sibling(num);
        return xpath;
    }

    private static String get$D10Sibling(int num) {
        //客户联系人-表格表体-第1行
        String description = CommonObject.get$D10Sibling(num);
        description = description.replaceFirst("通用", "客户联系人");
        return description;
    }


    private static String get$X10_actionSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style][30]
        String xpath = CommonObject.get$X10_actionSibling(num);
        return xpath;
    }

    private static String get$D10_actionSibling(int num) {
        //客户联系人-表格表体-第1行
        String description = CommonObject.get$D10_actionSibling(num);
        description = description.replaceFirst("通用", "客户联系人");
        return description;
    }

    public static JSONObject get$DPQueryInputJson(String label) {
        JsonObject.setJsonObject(get$DPQueryInput(label), get$XPQueryInput(label));
        return jsonObject;
    }


    public static JSONObject get$D10SiblingJson(int num) {
        JsonObject.setJsonObject(get$D10Sibling(num), get$X10Sibling(num));
        return jsonObject;
    }


    public static JSONObject get$D10_actionSiblingJson(int num) {
        JsonObject.setJsonObject(get$D10_actionSibling(num), get$X10_actionSibling(num));
        return jsonObject;
    }


    public static JSONObject getJson(String description) {
        switch (description) {
            case d35:
                JsonObject.setJsonObject(d35, x35);
                break;
            case d6:
                JsonObject.setJsonObject(d6, x6);
                break;
            case d36:
                JsonObject.setJsonObject(d36, x36);
                break;
            case d37:
                JsonObject.setJsonObject(d37, x37);
                break;
            case d38:
                JsonObject.setJsonObject(d38, x38);
                break;
            case d41:
                JsonObject.setJsonObject(d41, x41);
                break;
            case d3:
                JsonObject.setJsonObject(d3, x3);
                break;
            case d4:
                JsonObject.setJsonObject(d4, x4);
                break;
            case d34P:
                JsonObject.setJsonObject(d34P, x34P);
                break;
            case d1P:
                JsonObject.setJsonObject(d1P, x1P);
                break;
            case d2P:
                JsonObject.setJsonObject(d2P, x2P);
                break;
            case d37P:
                JsonObject.setJsonObject(d37P, x37P);
                break;
            case d38P:
                JsonObject.setJsonObject(d38P, x38P);
                break;
            case d39P:
                JsonObject.setJsonObject(d39P, x39P);
                break;
            case d40P:
                JsonObject.setJsonObject(d40P, x40P);
                break;
            case d41P:
                JsonObject.setJsonObject(d41P, x41P);
                break;
            case d42P:
                JsonObject.setJsonObject(d42P, x42P);
                break;
            case d43P:
                JsonObject.setJsonObject(d43P, x43P);
                break;
            case d44P:
                JsonObject.setJsonObject(d44P, x44P);
                break;
            case d45P:
                JsonObject.setJsonObject(d45P, x45P);
                break;
            case d46P:
                JsonObject.setJsonObject(d46P, x46P);
                break;
//            case d27P:
//                JsonObject.setJsonObject(d27P,x27P);
//                break;
            case d29P:
                JsonObject.setJsonObject(d29P, x29P);
                break;
            case d30P:
                JsonObject.setJsonObject(d30P, x30P);
                break;
            case d47P:
                JsonObject.setJsonObject(d47P, x47P);
                break;
            case d9:
                JsonObject.setJsonObject(d9, x9);
                break;
            case d10:
                JsonObject.setJsonObject(d10, x10);
                break;
            case d10Selected:
                JsonObject.setJsonObject(d10Selected, x10Selected);
                break;
            case d10NotSelected:
                JsonObject.setJsonObject(d10NotSelected, x10NotSelected);
                break;
            case d11:
                JsonObject.setJsonObject(d11, x11);
                break;
            case d31:
                JsonObject.setJsonObject(d31, x31);
                break;
            case d12:
                JsonObject.setJsonObject(d12, x12);
                break;
            case d13:
                JsonObject.setJsonObject(d13, x13);
                break;
            case d14:
                JsonObject.setJsonObject(d14, x14);
                break;
            case d15:
                JsonObject.setJsonObject(d15, x15);
                break;
            case d16:
                JsonObject.setJsonObject(d16, x16);
                break;
            case d17:
                JsonObject.setJsonObject(d17, x17);
                break;
            case d18:
                JsonObject.setJsonObject(d18, x18);
                break;
            case d18l5:
                JsonObject.setJsonObject(d18l5, x18l5);
                break;
            case d18l10:
                JsonObject.setJsonObject(d18l10, x18l10);
                break;
            case d18l20:
                JsonObject.setJsonObject(d18l20, x18l20);
                break;
            case d18l30:
                JsonObject.setJsonObject(d18l30, x18l30);
                break;
            case d28:
                JsonObject.setJsonObject(d28, x28);
                break;
            case d48:
                JsonObject.setJsonObject(d48, x48);
                break;
            case d34P_cross:
                JsonObject.setJsonObject(d34P_cross, x34P_cross);
                break;

        }

        return jsonObject;

    }

}
