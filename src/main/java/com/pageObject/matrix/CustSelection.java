package com.pageObject.matrix;

import com.alibaba.fastjson.JSONObject;
import com.utils.json.Attr;
import com.utils.json.JsonObject;
import lombok.Data;

import java.util.Map;

@Data
public class CustSelection extends JsonObject {
    //    private String prefix = "//div[1=1 and contains(text(),\"操作\")]/../..";
    private CommonObject commonObject = new CommonObject();
    private Map<String, String> attr = Attr.getAttr();

    public CustSelection() {
        setPrefix("操作");
        setConVal("操作");
        setDesPrefix("操作");
    }

    public CustSelection(String name) {
        setPrefix(name);
        setConVal(name);
        setDesPrefix(name);
//        changePrefix(name);
        //this.prefix = " ";
    }


//    public String getPrefix() {
//        return prefix;
//    }

    public void setPrefix(String name) {
        super.setPrefix("//div[1=1 and contains(text(),\"" + name + "\")]/../..");
    }


    private String dCustNameInput ;
    private String xCustNameInput ;
    //div[1=1 and contains(text(),"操作")]/../..//label[1=1 and contains(text(),"客户名称")]/../following-sibling::*[1]//input


    private String dOAAccountInput;
    private String xOAAccountInput;
    //div[1=1 and contains(text(),"操作")]/../..//label[1=1 and contains(text(),"OA账户")]/../following-sibling::*[1]//input

    private String dCustManagerInput ;
    private String xCustManagerInput ;
    //div[1=1 and contains(text(),"操作")]/../..//label[1=1 and contains(text(),"客户经理")]/../following-sibling::*[1]//input

    private String dSearchButtonSpan ;
    private String xSearchButtonSpan ;
    //div[1=1 and contains(text(),"操作")]/../..//span[1=1 and contains(text(),"查询")]


    private String dResetButtonSpan ;
    private String xResetButtonSpan ;
    //div[1=1 and contains(text(),"操作")]/../..//span[1=1 and contains(text(),"重置")]


    private String dTableTrs ;
    private String xTableTrs ;
    //div[1=1 and contains(text(),"操作")]/../..//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key]

    private String dTableTrsSelectedTrs ;
    private String xTableTrsSelectedTrs ;
    //div[1=1 and contains(text(),"操作")]/../..//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected')]

    private String dTableTrsNotSelectedTrs ;
    private String xTableTrsNotSelectedTrs ;
    //div[1=1 and contains(text(),"操作")]/../..//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected'))]


    private String dCloseButtonSpan ;
    private String xCloseButtonSpan ;
    //div[1=1 and contains(text(),"操作")]/../..//span[1=1 and contains(text(),"关 闭")]

    private String dConfirmButtonSpan ;
    private String xConfirmButtonSpan ;
    //div[1=1 and contains(text(),"操作")]/../..//span[1=1 and contains(text(),"确 定")]


    /**
     * 获取候选项里第N个元素的xpath,支持最后一个
     *
     * @param num 第N行,如果最后一行传入-1
     */
    private String get$XTableTrsSibling(int num) {
        //div[1=1 and contains(text(),"操作")]/../..//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(@style)][1]
        String xpath = commonObject.get$XTableTrsSibling(num);
        xpath = super.getPrefix() + xpath;

        return xpath;
    }


    /**
     * 获取候选项里第N个元素的描述,支持最后一个
     *
     * @param num 第N行,如果最后一行传入-1
     */
    private String get$DTableTrsSibling(int num) {
        //通用-客户查询popped-表格表体-第1行
        String description = commonObject.get$DTableTrsSibling(num);
        description = description.replaceFirst("-表格表体", "-客户查询popped-表格表体");
        return description;
    }


    public JSONObject get$TableTrsSiblingJson(int num) {
        JsonObject.setJsonObject(get$DTableTrsSibling(num),
                get$XTableTrsSibling(num));
        return JsonObject.getJsonObject();
    }


    /**
     * 获取候选项里客户名称为传入值的元素的xpath
     *
     * @param custName 客户名称
     */
    private String get$XTableTrsSiblingByCustName(String custName) {
        //div[1=1 and contains(text(),"操作")]/../..//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key]//td[text()='中国邮政储蓄银行股份有限公司双辽市王奔镇营业所']        //div[1=1 and contains(text(),"操作")]/../..//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][1]
        String key = "xTableTrs" + "@" + this.getClass().getName() + getConVal();
        String xpath = attr.get(key);
        xpath = xpath + "//*[text()='";
        xpath = xpath + custName;
        xpath = xpath + "']/..";

        return xpath;
    }


    /**
     * 获取候选项里客户名称为传入值的元素的描述
     *
     * @param custName 客户名称
     */
    private String get$DTableTrsSiblingByCustName(String custName) {
        //通用-客户查询popped-表格表体-中国邮政储蓄银行股份有限公司双辽市王奔镇营业所
        String key = "dTableTrs" + "@" + this.getClass().getName() + getConVal();
        String description = attr.get(key);
        description = description + "-" + custName;
        return description;
    }

    public JSONObject get$TableTrsSiblingByCustNameJson(String custName) {

        JsonObject.setJsonObject(get$DTableTrsSiblingByCustName(custName),
                get$XTableTrsSiblingByCustName(custName));
        return JsonObject.getJsonObject();
    }


//    public JSONObject getJson(String description) {
//        String str = "";
//        switch (description) {
//            case dCS2:
//                JsonObject.setJsonObject(dCS2, xCS2);
//                break;
//            case dCS1:
//                JsonObject.setJsonObject(dCS1, xCS1);
//                break;
//            case dCS27:
//                JsonObject.setJsonObject(dCS27, xCS27);
//                break;
//            case dCS3:
//                JsonObject.setJsonObject(dCS3, xCS3);
//                break;
//            case dCS4:
//                JsonObject.setJsonObject(dCS4, xCS4);
//                break;
//            case dCS10:
//                JsonObject.setJsonObject(dCS10, xCS10);
//                break;
//            case dCS10Selected:
//                JsonObject.setJsonObject(dCS10Selected, xCS10Selected);
//                break;
//            case dCS10NotSelected:
//                JsonObject.setJsonObject(dCS10NotSelected, xCS10NotSelected);
//                break;
//            case dCS29:
//                JsonObject.setJsonObject(dCS29, xCS29);
//                break;
//            case dCS30:
//                JsonObject.setJsonObject(dCS30, xCS30);
//                break;
//        }
//
//        return JsonObject.getJsonObject();
//
//    }

//    private void changePrefix(String name) {
//        xCS2 = xCS2.replaceFirst("操作", name);
//        xCS1 = xCS1.replaceFirst("操作", name);
//        xCS27 = xCS27.replaceFirst("操作", name);
//        xCS4 = xCS4.replaceFirst("操作", name);
//        xCS3 = xCS3.replaceFirst("操作", name);
//        xCS10 = xCS10.replaceFirst("操作", name);
//        xCS10Selected = xCS10Selected.replaceFirst("操作", name);
//        xCS10NotSelected = xCS10NotSelected.replaceFirst("操作", name);
//        xCS29 = xCS29.replaceFirst("操作", name);
//        xCS30 = xCS30.replaceFirst("操作", name);
//    }


}
