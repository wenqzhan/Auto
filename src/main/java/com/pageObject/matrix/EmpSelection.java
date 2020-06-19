package com.pageObject.matrix;

import com.alibaba.fastjson.JSONObject;
import com.utils.json.Attr;
import com.utils.json.JsonObject;
import lombok.Data;

import java.util.Map;

@Data
public class EmpSelection extends JsonObject {
    private CommonObject commonObject = new CommonObject();
    private Map<String, String> attr = Attr.getAttr();

    public EmpSelection() {
//        commonObject.getObjAttr();
        setDesPrefix("");
        setPrefix("");
        setConVal("");
    }

    public EmpSelection(String label) {
//        commonObject.getObjAttr();
        setDesPrefix(label);
        setPrefix(label);
        setConVal(label);
//        changePrefix(name);

    }

    public void setPrefix(String name) {
        super.setPrefix("//div[1=1 and contains(text(),\"" + name + "\")]/../..");
    }


//    private void changePrefix(String name) {
//        xES32 = xES32.replaceFirst("客户经理", name);
//        xES33 = xES33.replaceFirst("客户经理", name);
//        xES33_1 = xES33_1.replaceFirst("客户经理", name);
//        xES10 = xES10.replaceFirst("客户经理", name);
//        xES30 = xES30.replaceFirst("客户经理", name);
//        xES29 = xES29.replaceFirst("客户经理", name);
//    }


//    private String prefix = "//div[1=1 and contains(text(),\"客户经理\")]/../..";

    private String append1 = "/following-sibling::span[1]/button";


    private String dQueryInput = commonObject.getXQueryInput().replaceFirst("-", "-员工查询popped-左侧部门查询框-");
    //"通用-员工查询popped-左侧部门查询框-input";
    private String xQueryInput = commonObject.getXQueryInput();
    //div[1=1 and contains(text(),"客户经理1")]/../..//input[1=1 and contains(@placeholder,'输入查询')]


    private String dUserQueryInput = commonObject.getDUserQueryInput().replaceFirst("-", "-员工查询popped-右侧人员查询框");
    private String xUserQueryInput = commonObject.getXUserQueryInput();
    //div[1=1 and contains(text(),"客户经理1")]/../..//input[1=1 and contains(@placeholder,'输入用户名')]

    private String dUserQueryInputSearchSpan = "通用-员工查询popped-右侧用户名查询-input_旁边的查询按钮-span";
    private String xUserQueryInputSearchSpan = xUserQueryInput + append1;
    //div[1=1 and contains(text(),"客户经理1")]/../..//input[1=1 and contains(@placeholder,'输入用户名')]/following-sibling::span[1]


    private String dTableTrs = "通用-员工查询popped-表格表体rows-tr";
    private String xTableTrs = commonObject.getXTableTrs();
    //div[1=1 and contains(text(),"客户经理1")]/../..//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key]


    private String dCloseButtonSpan = "通用-员工查询popped-关闭按钮-span";
    private String xCloseButtonSpan = commonObject.getXCloseButtonSpan();
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"关 闭")]

    private String dConfirmButtonSpan = "通用-员工查询popped-确定按钮-span";
    private String xConfirmButtonSpan = commonObject.getXConfirmButtonSpan();
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"确 定")]


    /**
     * 获取员工查询-表格表体rows的xpath,支持最后一个
     *
     * @param num 第N行,如果最后一行传入-1
     */
    public String get$XTableTrsSibling(int num) {
        //div[1=1 and contains(text(),"客户经理1")]/../..//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][1]
        String key = "xTableTrs" + "@" + this.getClass().getName() + getConVal();
        String xpath = attr.get(key);
        if (num > 0) {
            xpath = xpath + "[" + num + "]";
        } else if (num == -1) {
            xpath = xpath + "[" + "last()" + "]";
        } else {
            xpath = xpath;
        }

        return xpath;
    }

    /**
     * 获取员工查询-表格表体rows的描述,支持最后一个
     *
     * @param num 第N行,如果最后一行传入-1
     */
    public String get$DTableTrsSibling(int num) {
        //通用-员工查询-表格表体rows-第1-tr

        String a;
        String des;
        if (num > 0) {
            a = "-第" + num;
        } else if (num == -1) {
            a = "-最后行";
        } else {
            a = "error";
        }

        des = dTableTrs.replace("-tr", a + "-tr");
        return des;
    }

    /**
     * 用员工姓名定位候选项,返回元素的xpath
     *
     * @param userName 员工姓名
     */
    private String get$XTableTrsSiblingByUserName(String userName) {
        //div[1=1 and contains(text(),"客户经理1")]/../..//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key]/td[text()='王明明']
        String key = "xTableTrs" + "@" + this.getClass().getName() + getConVal();
        System.out.println("#!@#!@");
        System.out.println(key);
        System.out.println("#!@#!@");
        String xpath = attr.get(key);

        xpath = xpath + "/td[text()='" + userName + "']/..";
//        xpath = xES10 + "/td[text()='" + userName + "']/..";

        return xpath;
    }

    /**
     * 用员工姓名定位候选项,返回元素的描述
     *
     * @param userName 员工姓名
     */
    private String get$DTableTrsSiblingByUserName(String userName) {
        //通用-员工查询-表格表体rows王明明-tr

        String des;

        des = dTableTrs.replace("-tr", userName + "-tr");
        return des;
    }

    public JSONObject get$JsonTableTrsSiblingByUserName(String userName) {
        JsonObject.setJsonObject(get$DTableTrsSiblingByUserName(userName),
                get$XTableTrsSiblingByUserName(userName));
        return JsonObject.getJsonObject();
    }

//    public JSONObject getJson(String description) {
//        String str = "";
//        switch (description) {
//            case dES32:
//                JsonObject.setJsonObject(dES32, xES32);
//                break;
//            case dES33:
//                JsonObject.setJsonObject(dES33, xES33);
//                break;
//            case dES33_1:
//                JsonObject.setJsonObject(dES33_1, xES33_1);
//                break;
//            case dES10:
//                JsonObject.setJsonObject(dES10, xES10);
//                break;
//            case dES30:
//                JsonObject.setJsonObject(dES30, xES30);
//                break;
//            case dES29:
//                JsonObject.setJsonObject(dES29, xES29);
//                break;
//
//        }
//
//        return JsonObject.getJsonObject();
//
//    }


}
