package com.pageObject.matrix;

import com.alibaba.fastjson.JSONObject;
import com.utils.json.JsonObject;
import lombok.Data;

@Data
public class XXXSelection extends JsonObject {
    private CommonObject commonObject = new CommonObject();

    public XXXSelection() {

    }

    public XXXSelection(String label) {
        if (!label.contains("-")) {
            setPrefix(label);
            super.setConVal(label);
            super.setDesPrefix(label);
        }else {
            String outerLabel = label.split("-")[0];
            String innerLabel = label.split("-")[1];
            setPrefix(innerLabel);
            setOuterLabel(outerLabel);
            super.setConVal(innerLabel);
            super.setDesPrefix(innerLabel);
        }

    }



    public void setPrefix(String label) {
        String str = "//div[not(@style='display: none;')]/../*/*/*/*/div[1=1 and contains(text(),\"" + label + "\")]/../..";
        super.setPrefix(str);
    }

    private final String append1 = "//li/span[3]";
    private final String append2 = "//input[1=1 and contains(@placeholder,'输入查询')]";

    private final String dXXXSpan = "通用-XXX-所有的-span".replaceFirst("XXX", getDesPrefix()).replaceFirst("通用", getOuterLabel());
    private final String xXXXSpan = getPrefix() + append1;
    //div[not(@style='display: none;')]/../*/*/*/*/div[1=1 and contains(text(),"业务条线")]/../..//li/span[3]

    private final String dXXXSearchInput = "通用-XXX-请输入查询信息-input".replaceFirst("XXX", getDesPrefix()).replaceFirst("通用", getOuterLabel());
    private final String xXXXSearchInput = getPrefix() + append2;
    //div[not(@style='display: none;')]/../*/*/*/*/div[1=1 and contains(text(),"类型选择")]/../..//input[1=1 and contains(@placeholder,'输入查询')]

    private final String dXXXConfirmSpan = "通用-XXX-确认-span".replaceFirst("XXX", getDesPrefix()).replaceFirst("通用", getOuterLabel());
    private final String xXXXConfirmSpan = getPrefix() + commonObject.getXConfirmButtonSpan();

    private final String dXXXCloseSpan = "通用-XXX-关闭-span".replaceFirst("XXX", getDesPrefix()).replaceFirst("通用", getOuterLabel());
    private final String xXXXCloseSpan = getPrefix() + commonObject.getXCloseButtonSpan();

    private String get$DXXXResultSpan(String result) {
        String description = ("通用-XXX-" + result).replaceFirst("XXX", getDesPrefix()).replaceFirst("通用", getOuterLabel());
        return description;
    }

    private String get$XXXXResultSpan(String result) {
        //div[1=1 and contains(text(),"类型选择")]/../..//span[1=1 and contains(text(),"事业单位")]
        String xpath = getPrefix();
        xpath = xpath + "//span[1=1 and contains(text(),\"" + result + "\")]";
        return xpath;
    }

    public JSONObject get$XXXResultSpan(String result) {
        JsonObject.setJsonObject(get$DXXXResultSpan(result),
                get$XXXXResultSpan(result));
        return JsonObject.getJsonObject();
    }


}
