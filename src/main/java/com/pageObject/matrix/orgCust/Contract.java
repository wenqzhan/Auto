package com.pageObject.matrix.orgCust;

import com.alibaba.fastjson.JSONObject;
import com.driver.$;
import com.pageObject.commonObject.CommonObject;
import com.pageObject.commonObject.CommonObjectPopped;
import com.utils.json.JsonObject;

public class Contract extends JsonObject {//证明材料

    public static String contract =
            "http://10.187.144.60:8081/orgcust/contract";

    public final static String d52 = "证明材料-上传证明材料-span";
    private final static String x52 = CommonObject.getXpath(CommonObject.d52);
    //span[1=1 and contains(text(),"上传证明材料")]


    public final static String d3 = "证明材料-查询按钮-span";
    private final static String x3 = CommonObject.getXpath(CommonObject.d3);
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"查询")]

    public final static String d4 = "证明材料-重置按钮-span";
    private final static String x4 = CommonObject.getXpath(CommonObject.d4);
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]

    public final static String d5 = "证明材料-查询条件展开收起按钮-a";
    private final static String x5 = CommonObject.getXpath(CommonObject.d5);
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]/../../a


    public final static String d49 = "证明材料-材料名称框-input";
    private final static String x49 = CommonObject.getXpath(CommonObject.d49);
    //label[1=1 and contains(text(),"材料名称")]/../following-sibling::*[1]//input

    public final static String d2 = "证明材料-客户名称框-input";
    private final static String x2 = CommonObject.getXpath(CommonObject.d2);
    //label[1=1 and contains(text(),"客户名称")]/../following-sibling::*[1]//input

    public final static String d50 = "证明材料-材料类型框-div";/////
    private final static String x50 = CommonObject.getXpath(CommonObject.d50);
    //label[1=1 and contains(text(),"材料类型")]/../following-sibling::div[1]


    public final static String d51 = "证明材料-所属商机框-input";
    private final static String x51 = CommonObject.getXpath(CommonObject.d51);
    //label[1=1 and contains(text(),"所属商机")]/../following-sibling::*[1]//input

    //////////////////////////////////
    public final static String d9 = "证明材料-表格-table";
    private final static String x9 = CommonObject.getXpath(CommonObject.d9);
    //table[1=1 and contains(@class,'ant-table-fixed')]

    public final static String d10 = "证明材料-表格表体rows-tr";
    private final static String x10 = CommonObject.getXpath(CommonObject.d10);
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not (contains(@style,'height'))] //不包含编辑那列,比如客户联系人,具体取决于样式

    public final static String d10_action = "证明材料-表格表体rows-tr-action(编辑,查看...)";
    private final static String x10_action = CommonObject.getXpath(CommonObject.d10_action);
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]

    public final static String d10_action_edit = "证明材料-表格表体rows-tr-action(编辑,查看...)-编辑-a";
    private final static String x10_action_edit = x10_action + "//a[text()='编辑']";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]//a[text()='编辑']


    public final static String d10_action_delete = "证明材料-表格表体rows-tr-action(编辑,查看...)-删除-a";
    private final static String x10_action_delete = x10_action + "//a[text()='删除']";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]//a[text()='删除']

    public final static String d10Selected = "证明材料-表格表体rows-selected-tr";
    private final static String x10Selected = CommonObject.getXpath(CommonObject.d10Selected);
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected')]

    public final static String d10NotSelected = "证明材料-表格表体rows-not selected-tr";
    private final static String x10NotSelected = CommonObject.getXpath(CommonObject.d10NotSelected);
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected'))]

    public final static String d11 = "证明材料-表格表头row下的th col-th";
    private final static String x11 = CommonObject.getXpath(CommonObject.d11);
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[not(@key='selection-column')]

    public final static String d31 = "证明材料-表格表头-多选框-th";
    private final static String x31 = CommonObject.getXpath(CommonObject.d31);
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']


    public final static String d12 = "证明材料-表格下方翻页按钮-上一页-li";
    private final static String x12 = CommonObject.getXpath(CommonObject.d12);
    //li[1=1 and contains(@title,'上一页')]

    public final static String d13 = "证明材料-表格下方翻页按钮-下一页-li";
    private final static String x13 = CommonObject.getXpath(CommonObject.d13);
    //li[1=1 and contains(@title,'下一页')]

    public final static String d14 = "证明材料-表格下方翻页按钮-下一页前的按钮,可以看出共多少页-a";
    private final static String x14 = CommonObject.getXpath(CommonObject.d14);
    //li[1=1 and contains(@title,'下一页')]/preceding-sibling::li[1]/a

    public final static String d15 = "证明材料-表格下方跳页输入框-input";
    private final static String x15 = CommonObject.getXpath(CommonObject.d15);
    //div[1=1 and contains(text(),"跳至")]/input

    public final static String d16 = "证明材料-表格下方跳页输入框左边的跳至两个字-div";
    private final static String x16 = CommonObject.getXpath(CommonObject.d16);
    //div[1=1 and contains(text(),"跳至")]

    public final static String d17 = "证明材料-数据加载(转菊花)-span";
    private final static String x17 = CommonObject.getXpath(CommonObject.d17);
    //span[1=1 and contains(@class,'ant-spin-dot')]

    public final static String d18 = "证明材料-条/页-div";
    private final static String x18 = CommonObject.getXpath(CommonObject.d18);
    //div[1=1 and contains(@title,'条/页')]

    public final static String d18l5 = "证明材料-条/页-5 条/页-li";
    private final static String x18l5 = CommonObject.getXpath(CommonObject.d18l5);
    //li[1=1 and text()='5 条/页' ]

    public final static String d18l10 = "证明材料-条/页-10 条/页-li";
    private final static String x18l10 = CommonObject.getXpath(CommonObject.d18l10);
    //li[1=1 and text()='10 条/页' ]

    public final static String d18l20 = "证明材料-条/页-20 条/页-li";
    private final static String x18l20 = CommonObject.getXpath(CommonObject.d18l20);
    //li[1=1 and text()='20 条/页' ]

    public final static String d18l30 = "证明材料-条/页-30 条/页-li";
    private final static String x18l30 = CommonObject.getXpath(CommonObject.d18l30);
    //li[1=1 and text()='30 条/页' ]

    public final static String d28 = "证明材料-表头多选框-input";
    private final static String x28 = CommonObject.getXpath(CommonObject.d28);
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']//input

    /////////////////////////////////

    public final static String d49P = "证明材料-first popped-材料名称框-input";
    private final static String x49P = CommonObjectPopped.getXpath(CommonObjectPopped.d49P);
    //div[@tabindex]//label[1=1 and contains(text(),"材料名称")]/../following-sibling::*[1]//input

    public final static String d2P = "证明材料-first popped-客户名称框-input";
    private final static String x2P = CommonObjectPopped.getXpath(CommonObjectPopped.d2P);
    //div[@tabindex]//label[1=1 and contains(text(),"客户名称")]/../following-sibling::*[1]//input

    public final static String d53P = "证明材料-first popped-联系人框-input";
    private final static String x53P = CommonObjectPopped.getXpath(CommonObjectPopped.d53P);
    //div[@tabindex]//label[1=1 and contains(text(),"联系人")]/../following-sibling::*[1]//input

    public final static String d56P = "证明材料-first popped-关联商机框-input";
    private final static String x56P = CommonObjectPopped.getXpath(CommonObjectPopped.d56P);
    //div[@tabindex]//label[1=1 and contains(text(),"关联商机")]/../following-sibling::*[1]//input

    public final static String d56P_div1 = "证明材料-first popped-关联商机框-div-用来获取下拉框的id";
    private final static String x56P_div1 = x56P.replaceFirst("input", "div[@aria-controls]");
    //div[@tabindex]//label[1=1 and contains(text(),"关联商机")]/../following-sibling::*[1]//div[@aria-controls]

    public final static String d56P_div1_cross = "证明材料-first popped-关联商机框-div-用来获取下拉框的id-大×-li";
    private final static String x56P_div1_cross =CommonObjectPopped.getCross(x56P_div1) ;
    //div[@tabindex]//label[1=1 and contains(text(),"关联商机")]/../following-sibling::*[1]//div[@aria-controls]//i[1=1 and contains(@class,'close-circle')]


    public final static String d56P_div3 = "证明材料-first popped-关联商机框-div-用来获取已选中商机的文本";
    private final static String x56P_div3 = x56P_div1+"//div[@title]";
    //div[@tabindex]//label[1=1 and contains(text(),"关联商机")]/../following-sibling::*[1]//div[@aria-controls]//div[@title]


    public final static String d56P_div2 = "证明材料-first popped-关联商机框-下的框div";
    private static String i56P_div2 = "";

    public static void setI56P_div2(){
        i56P_div2 = getBizOpportunityID();
    }

    public final static String d50P = "证明材料-first popped-材料类型框-div";/////
    private final static String x50P = CommonObjectPopped.getXpath(CommonObjectPopped.d50P);
    //div[@tabindex]//label[1=1 and contains(text(),"材料类型")]/../following-sibling::div[1]

    public final static String d50P_span = "证明材料-first popped-材料类型框-div-span";/////
    private final static String x50P_span = x50P + "//div[contains(@class,\"selected\")]/span";
    //div[@tabindex]//label[1=1 and contains(text(),"材料类型")]/../following-sibling::div[1]]//div[contains(@class,"selected")]/span


    public final static String d50Pl1 = "证明材料-first popped-材料类型框-专项战略合作协议-span";
    private final static String x50Pl1 = CommonObjectPopped.getXpath(CommonObjectPopped.d50Pl1);
    //div[@tabindex]//li/span[1=1 and @title='专项战略合作协议' ]

    public final static String d50Pl2 = "证明材料-first popped-材料类型框-全面战略合作协议-span";
    private final static String x50Pl2 = CommonObjectPopped.getXpath(CommonObjectPopped.d50Pl2);
    //div[@tabindex]//li/span[1=1 and @title='专项战略合作协议' ]

    public final static String d50Pl3 = "证明材料-first popped-材料类型框-业务协议-span";
    private final static String x50Pl3 = CommonObjectPopped.getXpath(CommonObjectPopped.d50Pl3);
    //div[@tabindex]//li/span[1=1 and @title='业务协议' ]

    public final static String d54P = "证明材料-first popped-签署日期框-input";
    private final static String x54P = CommonObjectPopped.getXpath(CommonObjectPopped.d54P);
    //div[@tabindex]//label[1=1 and contains(text(),"签署日期")]/../following-sibling::*[1]//input

    public final static String d55P = "证明材料-first popped-合同金额(万元)框-input";
    private final static String x55P = CommonObjectPopped.getXpath(CommonObjectPopped.d55P);
    //div[@tabindex]//label[1=1 and contains(text(),"合同金额(万元)")]/../following-sibling::*[1]//input

    public final static String dUploadP = "证明材料-first popped-上传文件-p";
    private final static String xUploadP = CommonObjectPopped.getXpath(CommonObjectPopped.dUploadP);
    //div[@tabindex]//p[text()='点击或将文件拖拽到这里上传']


    public final static String d29P = "证明材料-first popped-确定按钮-span";
    private final static String x29P = CommonObjectPopped.getXpath(CommonObjectPopped.d29P);
    //div[@tabindex]//span[1=1 and contains(text(),"确 定")]

    public final static String d30P = "证明材料-first popped-关闭按钮-span";
    private final static String x30P = CommonObjectPopped.getXpath(CommonObjectPopped.d30P);
    //div[@tabindex]//span[1=1 and contains(text(),"关 闭")]


    public final static String dUploadP_uploading = "证明材料-first popped-上传文件-上传中-span";
    private final static String xUploadP_uploading = "//div[contains(@class,\"item-uploading\")]";


    public final static String dUploadP_uploadDone = "证明材料-first popped-上传文件-上传成功-span";
    private final static String xUploadP_uploadDone = "//div[contains(@class,\"item-done\")]";


    public final static String dUploadP_uploadDone_corss = "证明材料-first popped-上传文件-上传成功-删除-i";
    private final static String xUploadP_uploadDone_corss =CommonObjectPopped.getCross(xUploadP_uploadDone);

    public final static String dUploadP_uploadDone_file = "证明材料-first popped-上传文件-上传成功的文件-span";
    private final static String xUploadP_uploadDone_file = "//div[contains(@class,\"item-done\")]";


    public final static String dUploadP_uploadError = "证明材料-first popped-上传文件-上传失败-span";
    private final static String xUploadP_uploadError = "//div[contains(@class,\"item-error\")]";


    public final static String d48 = "证明材料-添加/修改-成功系统提示信息";
    private final static String x48 = CommonObject.getXpath(CommonObject.d48);
    //div[@class='ant-message-notice-content']


    private static String getBizOpportunityID() {
        String id;

        $.findElement(getJson(d56P_div1));
        $.getAttribute("aria-controls");
        id = $.getAttributeValue();

        return id;
    }


    private static String get$X56_div2_li(int num) {
        String xpath;
        String id = i56P_div2;
        String n;
        if (num > 0) {
            n = "" + num;
        } else if (num == 0) {
            return "//div[@id='" + id + "']//li";
        } else if (num == -1) {
            n = "last()";
        } else {
            return "error, the num must be [-1,+∞)";
        }

        xpath = "//div[@id='" + id + "']";
        xpath = xpath + "//li[" + n + "]";


        return xpath;

    }


    private static String get$d56_div2_li(int num) {
        String description = "证明材料-关联商机-候选第";
        if (num > 0) {
            description = description + num;
        } else if (num == 0) {
            return "证明材料-关联商机-所有候选项";
        } else if (num == -1) {
            description = description + "最后一";
        } else {
            return "error, the num must be [-1,+∞)";
        }
        description = description + "行";

        return description;

    }


    private static String get$XPQueryInput(String label) {
        //div[@tabindex]//label[1=1 and contains(text(),"客户柜台代码")]/../following-sibling::*[1]//input
        return CommonObjectPopped.get$XPQueryInput(label);
    }


    private static String get$DPQueryInput(String label) {
        return CommonObjectPopped.get$DPQueryInput(label).
                replaceFirst("通用", "证明材料");
    }

    private static String get$X10Sibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(@style)][30]
        String xpath = CommonObject.get$X10Sibling(num);
        return xpath;
    }

    private static String get$D10Sibling(int num) {
        //证明材料-表格表体-第1行
        String description = CommonObject.get$D10Sibling(num);
        description = description.replaceFirst("通用", "证明材料");
        return description;
    }


    private static String get$X10_actionSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style][30]
        String xpath = CommonObject.get$X10_actionSibling(num);
        return xpath;
    }

    private static String get$D10_actionSibling(int num) {
        //证明材料-表格表体-第1行
        String description = CommonObject.get$D10_actionSibling(num);
        description = description.replaceFirst("通用", "证明材料");
        return description;
    }

    private static String get$X10_action_editSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style][30]//a[text()='编辑']
        String xpath = get$X10_actionSibling(num) + "[text()='编辑']";
        return xpath;
    }

    private static String get$D10_action_editSibling(int num) {
        //证明材料-表格表体-第1行
        String description = CommonObject.get$D10_actionSibling(num);
        description = get$D10_actionSibling(num) + "编辑";
        return description;
    }


    private static String get$X10_action_deleteSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style][30]//a[text()='删除']
        String xpath = get$D10_actionSibling(num) + "//a[text()='删除']";
        return xpath;
    }

    private static String get$D10_action_deleteSibling(int num) {
        //证明材料-表格表体-第1行
        String description = CommonObject.get$D10_actionSibling(num);
        description = get$D10_actionSibling(num) + "删除";
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


    public static JSONObject get$D10_action_editSiblingJson(int num) {
        JsonObject.setJsonObject(get$D10_action_editSibling(num), get$X10_action_editSibling(num));
        return jsonObject;
    }

    public static JSONObject get$D10_action_deleteSiblingJson(int num) {
        JsonObject.setJsonObject(get$D10_action_deleteSibling(num), get$X10_action_deleteSibling(num));
        return jsonObject;
    }

    public static JSONObject get$d56_div2_liJson(int num) {
        JsonObject.setJsonObject(get$d56_div2_li(num), get$X56_div2_li(num));
        return jsonObject;
    }


    public static JSONObject getJson(String description) {
        switch (description) {
            case d52:
                JsonObject.setJsonObject(d52, x52);
                break;
            case d3:
                JsonObject.setJsonObject(d3, x3);
                break;
            case d4:
                JsonObject.setJsonObject(d4, x4);
                break;
            case d5:
                JsonObject.setJsonObject(d5, x5);
                break;
            case d49:
                JsonObject.setJsonObject(d49, x49);
                break;
            case d2:
                JsonObject.setJsonObject(d2, x2);
                break;
            case d50:
                JsonObject.setJsonObject(d50, x50);
                break;
            case d51:
                JsonObject.setJsonObject(d51, x51);
                break;
            case d9:
                JsonObject.setJsonObject(d9, x9);
                break;
            case d10:
                JsonObject.setJsonObject(d10, x10);
                break;
            case d10_action:
                JsonObject.setJsonObject(d10_action, x10_action);
                break;
            case d10_action_edit:
                JsonObject.setJsonObject(d10_action_edit, x10_action_edit);
                break;
            case d10_action_delete:
                JsonObject.setJsonObject(d10_action_delete, x10_action_delete);
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
            case d49P:
                JsonObject.setJsonObject(d49P, x49P);
                break;
            case d2P:
                JsonObject.setJsonObject(d2P, x2P);
                break;
            case d53P:
                JsonObject.setJsonObject(d53P, x53P);
                break;
            case d56P:
                JsonObject.setJsonObject(d56P, x56P);
                break;
            case d50P:
                JsonObject.setJsonObject(d50P, x50P);
                break;
            case d50Pl1:
                JsonObject.setJsonObject(d50Pl1, x50Pl1);
                break;
            case d50Pl2:
                JsonObject.setJsonObject(d50Pl2, x50Pl2);
                break;
            case d50Pl3:
                JsonObject.setJsonObject(d50Pl3, x50Pl3);
                break;
            case d54P:
                JsonObject.setJsonObject(d54P, x54P);
                break;
            case d55P:
                JsonObject.setJsonObject(d55P, x55P);
                break;
            case dUploadP:
                JsonObject.setJsonObject(dUploadP, xUploadP);
                break;
            case d29P:
                JsonObject.setJsonObject(d29P, x29P);
                break;
            case d30P:
                JsonObject.setJsonObject(d30P, x30P);
                break;
            case d50P_span:
                JsonObject.setJsonObject(d50P_span, x50P_span);
                break;
            case dUploadP_uploading:
                JsonObject.setJsonObject(dUploadP_uploading, xUploadP_uploading);
                break;
            case dUploadP_uploadDone:
                JsonObject.setJsonObject(dUploadP_uploadDone, xUploadP_uploadDone);
                break;
            case dUploadP_uploadDone_corss:
                JsonObject.setJsonObject(dUploadP_uploadDone_corss, xUploadP_uploadDone_corss);
                break;
            case dUploadP_uploadError:
                JsonObject.setJsonObject(dUploadP_uploadError, xUploadP_uploadError);
                break;
            case d56P_div1:
                JsonObject.setJsonObject(d56P_div1, x56P_div1);
                break;
            case d56P_div2:
                JsonObject.setJsonObject(d56P_div2, "id", i56P_div2);
                break;
            case dUploadP_uploadDone_file:
                JsonObject.setJsonObject(dUploadP_uploadDone_file, xUploadP_uploadDone_file);
                break;
            case d48:
                JsonObject.setJsonObject(d48, x48);
                break;
            case d56P_div3:
                JsonObject.setJsonObject(d56P_div3, x56P_div3);
                break;
            case d56P_div1_cross:
                JsonObject.setJsonObject(d56P_div1_cross, x56P_div1_cross);
                break;
        }

        return jsonObject;

    }


}




















