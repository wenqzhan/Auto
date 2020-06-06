package com.pageObject.matrix.orgCust;

import com.alibaba.fastjson.JSONObject;
import com.pageObject.commonObject.CommonObject;
import com.utils.json.JsonObject;

public class CustRelationshipBrokerage extends JsonObject { //客户关系经纪业务
//    private CommonObject commonObject = new CommonObject();
//    public  String custRelationshipBrokerage =
//            "http://10.187.144.60:8080/orgcust/custRelationshipBrokerage";
//
//    public final  String d1 = "客户关系经纪业务-查询按钮";
//    private final  String x1 = commonObject.getXpath(commonObject.d3);
//
//    public final  String d2 = "客户关系经纪业务-重置按钮";
//    private final  String x2 = commonObject.getXpath(commonObject.d4);
//
//    public final  String d3 = "客户关系经纪业务-报表导出按钮";
//    private final  String x3 = commonObject.getXpath(commonObject.d6);
//
//    public final  String d4 = "客户关系经纪业务-报表导出确认按钮";
//    private final  String x4 = commonObject.getXpath(commonObject.d7);
//
//    public final  String d5 = "客户关系经纪业务-报表导出文件名输入框";
//    private final  String x5 = commonObject.getXpath(commonObject.d8);
//
//    public final  String d6 = "客户关系经纪业务-表格";
//    private final  String x6 = commonObject.getXpath(commonObject.d9);
//
//    public final  String d7 = "客户关系经纪业务-表格表体rows";
//    private final  String x7 = commonObject.getXpath(commonObject.d10);
//
//    public final  String d8 = "客户关系经纪业务-表格表头row下的th col";
//    private final  String x8 = commonObject.getXpath(commonObject.d11);
//
//    public final  String d9 = "客户关系经纪业务-表格下方翻页按钮-下一页前的按钮,可以看出共多少页";
//    private final  String x9 = commonObject.getXpath(commonObject.d14);
//
//    public final  String d10 = "客户关系经纪业务-表格下方跳页输入框";
//    private final  String x10 = commonObject.getXpath(commonObject.d15);
//
//    public final  String d11 = "客户关系经纪业务-表格下方跳页输入框左边的跳至两个字";
//    private final  String x11 = commonObject.getXpath(commonObject.d16);
//
//    public final  String d12 = "客户关系经纪业务-查询条件展开收起按钮";
//    private final  String x12 = commonObject.getXpath(commonObject.d5);
//
//    public final  String d13 = "客户关系经纪业务-表格下方翻页按钮-上一页";
//    private final  String x13 = commonObject.getXpath(commonObject.d12);
//
//    public final  String d14 = "客户关系经纪业务-表格下方翻页按钮-下一页";
//    private final  String x14 = commonObject.getXpath(commonObject.d13);
//
//
//    public final  String d17 = "客户关系经纪业务-数据加载(转菊花)";
//    private final  String x17 = commonObject.getXpath(commonObject.d17);
//
//    public final  String d18 = "客户关系经纪业务-条/页";
//    private final  String x18 = commonObject.getXpath(commonObject.d18);
//
//
//    public final  String d19 = "客户关系经纪业务-客户柜台代码查询框";
//    private final  String x19 = commonObject.getXpath(commonObject.d19);
//
//
//    public final  String d20 = "客户关系经纪业务-账户名称查询框";
//    private final  String x20 = commonObject.getXpath(commonObject.d20);
//
//    public final  String d21 = "客户关系经纪业务-资金账号查询框";
//    private final  String x21 = commonObject.getXpath(commonObject.d21);
//
//    public final  String d22 = "客户关系经纪业务-账户类型查询选择框";/////
//    private final  String x22 = commonObject.getXpath(commonObject.d22);
//
//    public final  String d23 = "客户关系经纪业务-归属机构查询框";
//    private final  String x23 = commonObject.getXpath(commonObject.d23);
//
//    public final  String d24 = "客户关系经纪业务-开发类型查询选择框";/////
//    private final  String x24 = commonObject.getXpath(commonObject.d24);
//
//    public final  String d25 = "客户关系经纪业务-经纪业务关系类型查询选择框";////
//    private final  String x25 = commonObject.getXpath(commonObject.d25);
//
//    public final  String d26 = "客户关系经纪业务-登记人查询框";
//    private final  String x26 = commonObject.getXpath(commonObject.d26);
//
//
//    public  JSONObject getJson(String description) {
//        switch (description) {
//            case d1:
//                JsonObject.setJsonObject(d1, x1);
//                break;
//            case d2:
//                JsonObject.setJsonObject(d2, x2);
//                break;
//            case d3:
//                JsonObject.setJsonObject(d3, x3);
//                break;
//            case d4:
//                JsonObject.setJsonObject(d4, x4);
//                break;
//            case d5:
//                JsonObject.setJsonObject(d5, x5);
//                break;
//            case d6:
//                JsonObject.setJsonObject(d6, x6);
//                break;
//            case d7:
//                JsonObject.setJsonObject(d7, x7);
//                break;
//            case d8:
//                JsonObject.setJsonObject(d8, x8);
//                break;
//            case d9:
//                JsonObject.setJsonObject(d9, x9);
//                break;
//            case d10:
//                JsonObject.setJsonObject(d10, x10);
//                break;
//            case d11:
//                JsonObject.setJsonObject(d11, x11);
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
//            case d17:
//                JsonObject.setJsonObject(d17, x17);
//                break;
//            case d18:
//                JsonObject.setJsonObject(d18, x18);
//                break;
//            case d19:
//                JsonObject.setJsonObject(d19, x19);
//                break;
//            case d20:
//                JsonObject.setJsonObject(d20, x20);
//                break;
//            case d21:
//                JsonObject.setJsonObject(d21, x21);
//                break;
//            case d22:
//                JsonObject.setJsonObject(d22, x22);
//                break;
//            case d23:
//                JsonObject.setJsonObject(d23, x23);
//                break;
//            case d24:
//                JsonObject.setJsonObject(d24, x24);
//                break;
//            case d25:
//                JsonObject.setJsonObject(d25, x25);
//                break;
//            case d26:
//                JsonObject.setJsonObject(d26, x26);
//                break;
//
//        }
//
//        return JsonObject.getJsonObject();
//
//    }
//
//
//    private  String get$D1(String num) {
//        return commonObject.get$D10Sibling(num).replace("通用", "客户关系经纪业务");
//    }
//
//    private  String get$X1(String num) {
//        return commonObject.get$X10Sibling(num);
//    }
//
//    public  JSONObject get$Json(String num) {
//        JsonObject.setJsonObject(get$D1(num), get$X1(num));
//        return JsonObject.getJsonObject();
//    }


}
