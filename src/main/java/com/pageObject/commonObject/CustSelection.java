package com.pageObject.commonObject;

import com.alibaba.fastjson.JSONObject;
import com.utils.json.JsonObject;

public class CustSelection extends JsonObject {
    private String prefix = "//div[1=1 and contains(text(),\"操作\")]/../..";

    public CustSelection() {
    }

    public CustSelection(String name) {
        setPrefix(name);
        changePrefix(name);
        //this.prefix = " ";
    }


    public String getPrefix() {
        return prefix;
    }

    private void setPrefix(String name) {
        this.prefix = "//div[1=1 and contains(text(),\"" + name + "\")]/../..";
    }


    public final String dCS2 = "通用-客户查询popped-客户名称-input";
    public String xCS2 = prefix + CommonObject.get$XQueryInput("客户名称");
    //div[1=1 and contains(text(),"操作")]/../..//label[1=1 and contains(text(),"客户名称")]/../following-sibling::*[1]//input


    public final String dCS1 = "通用-客户查询popped-OA账户-input";
    public String xCS1 = prefix + CommonObject.get$XQueryInput("OA账户");
    //div[1=1 and contains(text(),"操作")]/../..//label[1=1 and contains(text(),"OA账户")]/../following-sibling::*[1]//input

    public final String dCS27 = "通用-客户查询popped-客户经理-input";
    public String xCS27 = prefix + CommonObject.get$XQueryInput("客户经理");
    //div[1=1 and contains(text(),"操作")]/../..//label[1=1 and contains(text(),"客户经理")]/../following-sibling::*[1]//input

    public final String dCS3 = "通用-客户查询popped-查询-span";
    public String xCS3 = prefix + CommonObject.get$XSpan("查询");
    //div[1=1 and contains(text(),"操作")]/../..//span[1=1 and contains(text(),"查询")]


    public final String dCS4 = "通用-客户查询popped-重置-span";
    public String xCS4 = prefix + CommonObject.get$XSpan("重置");
    //div[1=1 and contains(text(),"操作")]/../..//span[1=1 and contains(text(),"重置")]


    public final String dCS10 = "通用-客户查询popped-表格表体rows-tr";
    private String xCS10 = prefix + CommonObject.getXpath(CommonObject.d10);
    //div[1=1 and contains(text(),"操作")]/../..//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key]

    public final String dCS10Selected = "通用-客户查询popped-表格表体rows-selected-tr";
    private String xCS10Selected = prefix + CommonObject.getXpath(CommonObject.d10Selected);
    //div[1=1 and contains(text(),"操作")]/../..//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected')]

    public final String dCS10NotSelected = "通用-客户查询popped-表格表体rows-not selected-tr";
    private String xCS10NotSelected = prefix + CommonObject.getXpath(CommonObject.d10NotSelected);
    //div[1=1 and contains(text(),"操作")]/../..//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected'))]


    public final String dCS30 = "通用-客户查询popped-关闭按钮-span";
    private String xCS30 = prefix + CommonObject.getXpath(CommonObject.d30);
    //div[1=1 and contains(text(),"操作")]/../..//span[1=1 and contains(text(),"关 闭")]

    public final String dCS29 = "通用-客户查询popped-确定按钮-span";
    private String xCS29 = prefix + CommonObject.getXpath(CommonObject.d29);
    //div[1=1 and contains(text(),"操作")]/../..//span[1=1 and contains(text(),"确 定")]


    /**
     * 获取候选项里第N个元素的xpath,支持最后一个
     *
     * @param num 第N行,如果最后一行传入-1
     */
    public String get$XCS10Sibling(int num) {
        //div[1=1 and contains(text(),"操作")]/../..//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(@style)][1]
        String xpath = CommonObject.get$X10Sibling(num);
        xpath = prefix + xpath;

        return xpath;
    }


    /**
     * 获取候选项里第N个元素的描述,支持最后一个
     *
     * @param num 第N行,如果最后一行传入-1
     */
    public String get$DCS10Sibling(int num) {
        //通用-客户查询popped-表格表体-第1行
        String description = CommonObject.get$D10Sibling(num);
        description = description.replaceFirst("-表格表体", "-客户查询popped-表格表体");
        return description;
    }


    /**
     * 获取候选项里客户名称为传入值的元素的xpath
     *
     * @param custName 客户名称
     */
    public String get$XCS10SiblingByCustName(String custName) {
        //div[1=1 and contains(text(),"操作")]/../..//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key]//td[text()='中国邮政储蓄银行股份有限公司双辽市王奔镇营业所']        //div[1=1 and contains(text(),"操作")]/../..//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][1]
        String xpath = xCS10;
        xpath = xpath + "//td[text()='";
        xpath = xpath + custName;
        xpath = xpath + "']/..";

        return xpath;
    }


    /**
     * 获取候选项里客户名称为传入值的元素的描述
     *
     * @param custName 客户名称
     */
    public String get$DCS10SiblingByCustName(String custName) {
        //通用-客户查询popped-表格表体-中国邮政储蓄银行股份有限公司双辽市王奔镇营业所
        String description = dCS10;
        description = dCS10 + "-" + custName;
        return description;
    }

    public JSONObject getJsonCS10SiblingByCustName(String custName) {

        JsonObject.setJsonObject(get$DCS10SiblingByCustName(custName),
                get$XCS10SiblingByCustName(custName));
        return jsonObject;
    }


    public JSONObject getJson(String description) {
        String str = "";
        switch (description) {
            case dCS2:
                JsonObject.setJsonObject(dCS2, xCS2);
                break;
            case dCS1:
                JsonObject.setJsonObject(dCS1, xCS1);
                break;
            case dCS27:
                JsonObject.setJsonObject(dCS27, xCS27);
                break;
            case dCS3:
                JsonObject.setJsonObject(dCS3, xCS3);
                break;
            case dCS4:
                JsonObject.setJsonObject(dCS4, xCS4);
                break;
            case dCS10:
                JsonObject.setJsonObject(dCS10, xCS10);
                break;
            case dCS10Selected:
                JsonObject.setJsonObject(dCS10Selected, xCS10Selected);
                break;
            case dCS10NotSelected:
                JsonObject.setJsonObject(dCS10NotSelected, xCS10NotSelected);
                break;
            case dCS29:
                JsonObject.setJsonObject(dCS29, xCS29);
                break;
            case dCS30:
                JsonObject.setJsonObject(dCS30, xCS30);
                break;
        }

        return jsonObject;

    }

    private void changePrefix(String name) {
        xCS2 = xCS2.replaceFirst("操作", name);
        xCS1 = xCS1.replaceFirst("操作", name);
        xCS27 = xCS27.replaceFirst("操作", name);
        xCS4 = xCS4.replaceFirst("操作", name);
        xCS3 = xCS3.replaceFirst("操作", name);
        xCS10 = xCS10.replaceFirst("操作", name);
        xCS10Selected = xCS10Selected.replaceFirst("操作", name);
        xCS10NotSelected = xCS10NotSelected.replaceFirst("操作", name);
        xCS29 = xCS29.replaceFirst("操作", name);
        xCS30 = xCS30.replaceFirst("操作", name);
    }


}
