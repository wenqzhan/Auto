package com.pageObject.matrix;

import com.alibaba.fastjson.JSONObject;
import com.utils.json.Attr;
import com.utils.json.JsonObject;
import lombok.Data;

import java.util.Map;

@Data
public class DeptSelection extends JsonObject {
    private CommonObject commonObject = new CommonObject();
    private Map<String, String> attr = Attr.getAttr();

    public DeptSelection() {
        setPrefix(this.prefix);
    }

    private final String prefix = "//div[1=1 and contains(@class,'ant-modal-content')]";

    private final String append1 = "/../../../following-sibling::*";

    private final String append2 = "/following-sibling::div/div";


    private final String dDSQueryInput = commonObject.getDQueryInput().replaceFirst("-","-部门选择-");
    private final String xDSQueryInput = commonObject.getXQueryInput();
    //div[1=1 and contains(@class,'ant-modal-content')]//input[1=1 and contains(@placeholder,'输入查询')]

    private final String dDSConfirmButtonSpan = commonObject.getDConfirmButtonSpan().replaceFirst("-","-部门选择-");
    private final String xDSConfirmButtonSpan = xDSQueryInput + this.append1 + commonObject.getXConfirmButtonSpan();
    //div[1=1 and contains(@class,'ant-modal-content')]//input[1=1 and contains(@placeholder,'输入查询')]/../../following-sibling::*//span[1=1 and contains(text(),"确 定")]

    private final String dDSCloseButtonSpan = commonObject.getDCloseButtonSpan().replaceFirst("-","-部门选择-");
    private final String xDSCloseButtonSpan = xDSQueryInput + this.append1 + commonObject.getXCloseButtonSpan();
    //div[1=1 and contains(@class,'ant-modal-content')]//input[1=1 and contains(@placeholder,'输入查询')]/../../following-sibling::*//span[1=1 and contains(text(),"关 闭")]


    private final String dDSQueryInputDiv = "通用-部门选择-查询框-input_候选项-div";
    private final String xDSQueryInputDiv = xDSQueryInput + append2;
    //div[1=1 and contains(@class,'ant-modal-content')]//input[1=1 and contains(@placeholder,'输入查询')]/following-sibling::div/div
    //候选项一般有多个

    /**
     * 获取候选项里第N个元素的xpath,支持最后一个
     *
     * @param num 第N行,如果最后一行传入-1
     */
    private String get$XDSQueryInputDiv(int num) {
        //div[1=1 and contains(@class,'ant-modal-content')]//input[1=1 and contains(@placeholder,'输入查询')]/following-sibling::div/div[1]
        String key = "xDSQueryInputDiv";
        String xpath = attr.get(key);
        if (num > 0) {
            xpath = xpath + "[" + num + "]";
        } else if (num == -1) {
            xpath = xpath + "[" + "last()" + "]";
        } else if (num == 0) {
            xpath = xpath;
        } else {
            xpath = "error, input wrong num";
        }

        return xpath;
    }

    /**
     * 获取候选项里第N个元素的描述,支持最后一个
     *
     * @param num 第N行,如果最后一行传入-1
     */
    private String get$DDSQueryInputDiv(int num) {
        //通用-部门选择-查询框-input_候选项-第1-div
        String a;
        String key = "dDSQueryInputDiv";
        String des = attr.get(key);
        if (num > 0) {
            a = "-第" + num;
        } else if (num == -1) {
            a = "-最后项";
        } else if (num == 0) {
            a = "-第所有";
        } else {
            a = "error, wrong num input";
        }

        des = des.replace("-div", a + "-div");
        return des;
    }

    /**
     * 用部门名定位候选项,返回元素的xpath
     *
     * @param dept 部门名称
     */
    private String get$XDSQueryInputDiv(String dept) {
        //div[1=1 and contains(@class,'ant-modal-content')]//input[1=1 and contains(@placeholder,'输入查询')]/following-sibling::div/div[@title='国泰君安证券']
        String key = "xDSQueryInputDiv";
        String xpath = attr.get(key);

        xpath = xpath + "[@title='" + dept + "']";

        return xpath;
    }

    /**
     * 用部门名定位候选项,返回元素的描述
     *
     * @param dept 部门名称
     */
    private String get$DDSQueryInputDiv(String dept) {
        //通用-部门选择-查询框-input_候选项国泰君安证券-div
        String key = "dDSQueryInputDiv";
        String des = attr.get(key);

        des = des.replace("-div", dept + "-div");
        return des;
    }


    public JSONObject get$DDSQueryInputDivJson(String dept) {
        JsonObject.setJsonObject(get$DDSQueryInputDiv(dept),
                get$XDSQueryInputDiv(dept));
        return JsonObject.getJsonObject();
    }

    public JSONObject get$DDSQueryInputDivJson(int num) {
        JsonObject.setJsonObject(get$DDSQueryInputDiv(num),
                get$XDSQueryInputDiv(num));
        return JsonObject.getJsonObject();
    }


//    public JSONObject getJson(String description) {
//        switch (description) {
//            case dDS32:
//                JsonObject.setJsonObject(dDS32, xDS32);
//                break;
//            case dDS29:
//                JsonObject.setJsonObject(dDS29, xDS29);
//                break;
//            case dDS30:
//                JsonObject.setJsonObject(dDS30, xDS30);
//                break;
//            case dDS32Div:
//                JsonObject.setJsonObject(dDS32Div, xDS32Div);
//                break;
//
//        }
//
//        return JsonObject.getJsonObject();
//
//    }


}
