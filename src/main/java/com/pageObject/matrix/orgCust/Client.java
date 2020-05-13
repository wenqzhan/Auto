package com.pageObject.matrix.orgCust;

import com.alibaba.fastjson.JSONObject;
import com.pageObject.commonObject.*;
import com.utils.json.JsonObject;
import lombok.Data;

@Data
public class Client extends JsonObject {//客户联系人
    private CommonObjectPopped commonObjectPopped = new CommonObjectPopped();
    private CommonObject commonObject = new CommonObject();
//    private String X = "xpath";
//    private String D = "description";

    public Client(){
        //commonObjectPopped.getObjAttr();
        //commonObject.getObjAttr();
        CommonObject commonObject = new CommonObject();
        CommonObjectPopped commonObjectPopped = new CommonObjectPopped();
        BizLineSelection bizLineSelection = new BizLineSelection();
        CustSelection custSelection = new CustSelection();
        EmpSelection empSelection = new EmpSelection("国君服务联系人");

        commonObject.getObjAttr();
        commonObjectPopped.getObjAttr();
        bizLineSelection.getObjAttr();
        custSelection.getObjAttr();
        empSelection.getObjAttr();

    }


    private  String client =
            "http://10.187.144.60:8081/orgcust/client";

    private final  String d35 = "客户联系人-新增按钮-span";
    private final  String x35 = commonObject.getX35();
    //span[1=1 and contains(text(),"新增")]

    private final  String d6 = "客户联系人-导出按钮-span";
    private final  String x6 = commonObject.getX36();
    //span[1=1 and contains(text(),"导出")]

    private final  String d36 = "客户联系人-开通道合按钮-span";
    private final  String x36 = commonObject.getX36();
    //span[1=1 and contains(text(),"开通道合")]


    private final  String d37 = "客户联系人-联系人姓名框-input";
    private final  String x37 = commonObject.getX37();
    //label[1=1 and contains(text(),"联系人姓名")]/../following-sibling::*[1]//input

    private final  String d38 = "客户联系人-手机框-input";
    private final  String x38 = commonObject.getX38();
    //label[1=1 and contains(text(),"手机")]/../following-sibling::*[1]//input

    private final  String d41 = "客户联系人-邮箱框-input";
    private final  String x41 = commonObject.getX41();
    //label[1=1 and contains(text(),"邮箱")]/../following-sibling::*[1]//input

    private final  String d3 = "客户联系人-查询按钮-span";
    private final  String x3 = commonObject.getX3();
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"查询")]

    private final  String d4 = "客户联系人-重置按钮-span";
    private final  String x4 = commonObject.getX4();
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]

    ///////////////////////
    private final  String d9 = "客户联系人-表格-table";
    private final  String x9 = commonObject.getX9();
    //table[1=1 and contains(@class,'ant-table-fixed')]

    private final  String d10 = "客户联系人-表格表体rows-tr";
    private final  String x10 = commonObject.getX10();
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not (contains(@style,'height'))]

    private final  String d10Selected = "客户联系人-表格表体rows-selected-tr";
    private final  String x10Selected = commonObject.getX10Selected();
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected')]

    private final  String d10NotSelected = "客户联系人-表格表体rows-not selected-tr";
    private final  String x10NotSelected = commonObject.getX10NotSelected();
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected'))]

    private final  String d11 = "客户联系人-表格表头row下的th col-th";
    private final  String x11 = commonObject.getX11();
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[not(@key='selection-column') and not(@key='action')]

    private final  String d31 = "客户联系人-表格表头-多选框-th";
    private final  String x31 = commonObject.getX31();
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']

    private final  String d12 = "客户联系人-表格下方翻页按钮-上一页-li";
    private final  String x12 = commonObject.getX12();
    //li[1=1 and contains(@title,'上一页')]

    private final  String d13 = "客户联系人-表格下方翻页按钮-下一页-li";
    private final  String x13 = commonObject.getX13();
    //li[1=1 and contains(@title,'下一页')]

    private final  String d14 = "客户联系人-表格下方翻页按钮-下一页前的按钮,可以看出共多少页-a";
    private final  String x14 = commonObject.getX14();
    //li[1=1 and contains(@title,'下一页')]/preceding-sibling::li[1]/a

    private final  String d15 = "客户联系人-表格下方跳页输入框-input";
    private final  String x15 = commonObject.getX15();
    //div[1=1 and contains(text(),"跳至")]/input

    private final  String d16 = "客户联系人-表格下方跳页输入框左边的跳至两个字-div";
    private final  String x16 = commonObject.getX16();
    //div[1=1 and contains(text(),"跳至")]

    private final  String d17 = "客户联系人-数据加载(转菊花)-span";
    private final  String x17 = commonObject.getX17();
    //span[1=1 and contains(@class,'ant-spin-dot')]

    private final  String d18 = "客户联系人-条/页-div";
    private final  String x18 = commonObject.getX18();
    //div[1=1 and contains(@title,'条/页')]

    private final  String d18L5 = "客户联系人-条/页-5 条/页-li";
    private final  String x18L5 = commonObject.getX18L5();
    //li[1=1 and text()='5 条/页' ]

    private final  String d18L10 = "客户联系人-条/页-10 条/页-li";
    private final  String x18L10 = commonObject.getX18L10();
    //li[1=1 and text()='10 条/页' ]

    private final  String d18L20 = "客户联系人-条/页-20 条/页-li";
    private final  String x18L20 = commonObject.getX18L20();
    //li[1=1 and text()='20 条/页' ]

    private final  String d18L30 = "客户联系人-条/页-30 条/页-li";
    private final  String x18L30 = commonObject.getX18L30();
    //li[1=1 and text()='30 条/页' ]

    private final  String d28 = "客户联系人-表头多选框-input";
    private final  String x28 = commonObject.getX28();
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']//input

    private final  String d48 = "客户联系人-添加/修改-成功系统提示信息";
    private final  String x48 = commonObject.getX48();
    //div[@class='ant-message-notice-content']
    //////////////
    private final  String d34P = commonObjectPopped.getD34P().replaceFirst("通用","客户联系人");
    private final  String x34P = commonObjectPopped.getX34P();
    //div[@tabindex]//label[1=1 and contains(text(),"业务条线")]/../following-sibling::*[1]//input

    private final  String d34PCross = commonObjectPopped.getD34PCross().replaceFirst("通用","客户联系人");;
    private final  String x34PCross = commonObjectPopped.getX34PCross();
    //div[@tabindex]//label[1=1 and contains(text(),"业务条线")]/../following-sibling::*[1]//input/..//i[1=1 and contains(@class,'close-circle')]

    private final  String d1P = commonObjectPopped.getD1P().replaceFirst("通用","客户联系人");;
    private final  String x1P = commonObjectPopped.getX1P();
    //label[1=1 and contains(text(),"OA账号")]/../following-sibling::*[1]//input

    private final  String d2P = commonObjectPopped.getD2P().replaceFirst("通用","客户联系人");;
    private final  String x2P = commonObjectPopped.getX2P();
    //label[1=1 and contains(text(),"客户名称")]/../following-sibling::*[1]//input


    private final  String d37P = commonObjectPopped.getD37P().replaceFirst("通用","客户联系人");;
    private final  String x37P = commonObjectPopped.getX37P();
    //label[1=1 and contains(text(),"联系人姓名")]/../following-sibling::*[1]//input

    private final  String d38P = commonObjectPopped.getD38P().replaceFirst("通用","客户联系人");;
    private final  String x38P = commonObjectPopped.getX38P();
    //label[1=1 and contains(text(),"手机")]/../following-sibling::*[1]//input

    private final  String d39P = commonObjectPopped.getD39P().replaceFirst("通用","客户联系人");;
    private final  String x39P = commonObjectPopped.getX39P();
    //label[1=1 and contains(text(),"部门")]/../following-sibling::*[1]//input


    private final  String d40P = commonObjectPopped.getD40P().replaceFirst("通用","客户联系人");;
    private final  String x40P = commonObjectPopped.getX40P();
    //label[1=1 and contains(text(),"FAX")]/../following-sibling::*[1]//input

    private final  String d41P = commonObjectPopped.getD41P().replaceFirst("通用","客户联系人");;
    private final  String x41P = commonObjectPopped.getX41P();
    //label[1=1 and contains(text(),"邮箱")]/../following-sibling::*[1]//input

    private final  String d42P = commonObjectPopped.getD42P().replaceFirst("通用","客户联系人");;
    private final  String x42P =commonObjectPopped.getX42P();
    //label[1=1 and contains(text(),"客户简称")]/../following-sibling::*[1]//input

    private final  String d43P = commonObjectPopped.getD43P().replaceFirst("通用","客户联系人");;
    private final  String x43P = commonObjectPopped.getX43P();
    //label[1=1 and contains(text(),"职务")]/../following-sibling::*[1]//input


    private final  String d44P =commonObjectPopped.getD44P().replaceFirst("通用","客户联系人");;
    private final  String x44P = commonObjectPopped.getX44P();
    //label[1=1 and contains(text(),"座机")]/../following-sibling::*[1]//input

    private final  String d45P = commonObjectPopped.getD45P().replaceFirst("通用","客户联系人");;
    private final  String x45P = commonObjectPopped.getX45P();
    //label[1=1 and contains(text(),"创建人")]/../following-sibling::*[1]//input

    private final  String d46P = commonObjectPopped.getD46P().replaceFirst("通用","客户联系人");;
    private final  String x46P = commonObjectPopped.getX46P();
    //label[1=1 and contains(text(),"办公地址")]/../following-sibling::*[1]//input
//
//    private final  String d27P = "客户联系人-first popped-客户经理框-input";
//    private final  String x27P = commonObjectPopped.getXpath(commonObjectPopped.d27P);
//    //label[1=1 and contains(text(),"客户经理")]/../following-sibling::*[1]//input
//
    private final  String d47P = commonObjectPopped.getD47P().replaceFirst("通用","客户联系人");;
    private final  String x47P = commonObjectPopped.getX47P();
    //label[1=1 and contains(text(),"国君服务联系人")]/../following-sibling::*[1]//input


    private final  String d29P = commonObjectPopped.getD29P().replaceFirst("通用","客户联系人");;
    private final  String x29P = commonObjectPopped.getX29P();
    //div[@tabindex]//span[1=1 and contains(text(),"确 定")]

    private final  String d30P = commonObjectPopped.getD30P().replaceFirst("通用","客户联系人");;
    private final  String x30P = commonObjectPopped.getX30P();
    //div[@tabindex]//span[1=1 and contains(text(),"关 闭")]


    private  String get$XPQueryInput(String label) {
        //div[@tabindex]//label[1=1 and contains(text(),"客户柜台代码")]/../following-sibling::*[1]//input
        return commonObjectPopped.get$XPQueryInput(label);
    }


    private  String get$DPQueryInput(String label) {
        return commonObjectPopped.get$DPQueryInput(label).
                replaceFirst("通用", "客户联系人");
    }

    private  String get$X10Sibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(@style)][30]
        String xpath = commonObject.get$X10Sibling(num);
        return xpath;
    }

    private  String get$D10Sibling(int num) {
        //客户联系人-表格表体-第1行
        String description = commonObject.get$D10Sibling(num);
        description = description.replaceFirst("通用", "客户联系人");
        return description;
    }


    private  String get$X10_actionSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style][30]
        String xpath = commonObject.get$X10ActionSibling(num);
        return xpath;
    }

    private  String get$D10_actionSibling(int num) {
        //客户联系人-表格表体-第1行
        String description = commonObject.get$D10ActionSibling(num);
        description = description.replaceFirst("通用", "客户联系人");
        return description;
    }

    public  JSONObject get$DPQueryInputJson(String label) {
        JsonObject.setJsonObject(get$DPQueryInput(label), get$XPQueryInput(label));
        return JsonObject.getJsonObject();
    }


    public  JSONObject get$D10SiblingJson(int num) {
        JsonObject.setJsonObject(get$D10Sibling(num), get$X10Sibling(num));
        return JsonObject.getJsonObject();
    }


    public  JSONObject get$D10_actionSiblingJson(int num) {
        JsonObject.setJsonObject(get$D10_actionSibling(num), get$X10_actionSibling(num));
        return JsonObject.getJsonObject();
    }


//    public  JSONObject getJson(String description) {
//        switch (description) {
//            case d35:
//                JsonObject.setJsonObject(d35, x35);
//                break;
//            case d6:
//                JsonObject.setJsonObject(d6, x6);
//                break;
//            case d36:
//                JsonObject.setJsonObject(d36, x36);
//                break;
//            case d37:
//                JsonObject.setJsonObject(d37, x37);
//                break;
//            case d38:
//                JsonObject.setJsonObject(d38, x38);
//                break;
//            case d41:
//                JsonObject.setJsonObject(d41, x41);
//                break;
//            case d3:
//                JsonObject.setJsonObject(d3, x3);
//                break;
//            case d4:
//                JsonObject.setJsonObject(d4, x4);
//                break;
//            case d34P:
//                JsonObject.setJsonObject(d34P, x34P);
//                break;
//            case d1P:
//                JsonObject.setJsonObject(d1P, x1P);
//                break;
//            case d2P:
//                JsonObject.setJsonObject(d2P, x2P);
//                break;
//            case d37P:
//                JsonObject.setJsonObject(d37P, x37P);
//                break;
//            case d38P:
//                JsonObject.setJsonObject(d38P, x38P);
//                break;
//            case d39P:
//                JsonObject.setJsonObject(d39P, x39P);
//                break;
//            case d40P:
//                JsonObject.setJsonObject(d40P, x40P);
//                break;
//            case d41P:
//                JsonObject.setJsonObject(d41P, x41P);
//                break;
//            case d42P:
//                JsonObject.setJsonObject(d42P, x42P);
//                break;
//            case d43P:
//                JsonObject.setJsonObject(d43P, x43P);
//                break;
//            case d44P:
//                JsonObject.setJsonObject(d44P, x44P);
//                break;
//            case d45P:
//                JsonObject.setJsonObject(d45P, x45P);
//                break;
//            case d46P:
//                JsonObject.setJsonObject(d46P, x46P);
//                break;
////            case d27P:
////                JsonObject.setJsonObject(d27P,x27P);
////                break;
//            case d29P:
//                JsonObject.setJsonObject(d29P, x29P);
//                break;
//            case d30P:
//                JsonObject.setJsonObject(d30P, x30P);
//                break;
//            case d47P:
//                JsonObject.setJsonObject(d47P, x47P);
//                break;
//            case d9:
//                JsonObject.setJsonObject(d9, x9);
//                break;
//            case d10:
//                JsonObject.setJsonObject(d10, x10);
//                break;
//            case d10Selected:
//                JsonObject.setJsonObject(d10Selected, x10Selected);
//                break;
//            case d10NotSelected:
//                JsonObject.setJsonObject(d10NotSelected, x10NotSelected);
//                break;
//            case d11:
//                JsonObject.setJsonObject(d11, x11);
//                break;
//            case d31:
//                JsonObject.setJsonObject(d31, x31);
//                break;
//            case d12:
//                JsonObject.setJsonObject(d12, x12);
//                break;
//            case d13:
//                JsonObject.setJsonObject(d13, x13);
//                break;
//            case d14:
//                JsonObject.setJsonObject(d14, x14);
//                break;
//            case d15:
//                JsonObject.setJsonObject(d15, x15);
//                break;
//            case d16:
//                JsonObject.setJsonObject(d16, x16);
//                break;
//            case d17:
//                JsonObject.setJsonObject(d17, x17);
//                break;
//            case d18:
//                JsonObject.setJsonObject(d18, x18);
//                break;
//            case d18l5:
//                JsonObject.setJsonObject(d18l5, x18l5);
//                break;
//            case d18l10:
//                JsonObject.setJsonObject(d18l10, x18l10);
//                break;
//            case d18l20:
//                JsonObject.setJsonObject(d18l20, x18l20);
//                break;
//            case d18l30:
//                JsonObject.setJsonObject(d18l30, x18l30);
//                break;
//            case d28:
//                JsonObject.setJsonObject(d28, x28);
//                break;
//            case d48:
//                JsonObject.setJsonObject(d48, x48);
//                break;
//            case d34P_cross:
//                JsonObject.setJsonObject(d34P_cross, x34P_cross);
//                break;
//
//        }
//
//        return JsonObject.getJsonObject();
//
//    }

}
