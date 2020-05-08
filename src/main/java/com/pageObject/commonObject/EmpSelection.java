package com.pageObject.commonObject;

import com.alibaba.fastjson.JSONObject;
import com.utils.json.JsonObject;

public class EmpSelection extends JsonObject {
    public EmpSelection() {

    }

    public EmpSelection(String name) {
        setPrefix(name);
        changePrefix(name);
    }

    private void setPrefix(String name) {
        this.prefix = "//div[1=1 and contains(text(),\"" + name + "\")]/../..";
    }


    private void changePrefix(String name) {
        xES32 = xES32.replaceFirst("客户经理", name);
        xES33 = xES33.replaceFirst("客户经理", name);
        xES33_1 = xES33_1.replaceFirst("客户经理", name);
        xES10 = xES10.replaceFirst("客户经理", name);
        xES30 = xES30.replaceFirst("客户经理", name);
        xES29 = xES29.replaceFirst("客户经理", name);
    }


    private String prefix = "//div[1=1 and contains(text(),\"客户经理\")]/../..";

    private final String append1 = "/following-sibling::span[1]";


    public final String dES32 = "通用-员工查询popped-左侧部门查询框-input";
    private String xES32 = prefix + CommonObject.getXpath(CommonObject.d32);
    //div[1=1 and contains(text(),"客户经理1")]/../..//input[1=1 and contains(@placeholder,'输入查询')]


    public final String dES33 = "通用-员工查询popped-右侧用户名查询-input";
    private String xES33 = prefix + CommonObject.getXpath(CommonObject.d33);
    //div[1=1 and contains(text(),"客户经理1")]/../..//input[1=1 and contains(@placeholder,'输入用户名')]

    public final String dES33_1 = "通用-员工查询popped-右侧用户名查询-input_旁边的查询按钮-span";
    private String xES33_1 = prefix + CommonObject.getXpath(CommonObject.d33) + append1;
    //div[1=1 and contains(text(),"客户经理1")]/../..//input[1=1 and contains(@placeholder,'输入用户名')]/following-sibling::span[1]


    public final String dES10 = "通用-员工查询popped-表格表体rows-tr";
    private String xES10 = prefix + CommonObject.getXpath(CommonObject.d10);
    //div[1=1 and contains(text(),"客户经理1")]/../..//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key]


    public final String dES30 = "通用-员工查询popped-关闭按钮-span";
    private String xES30 = prefix + CommonObject.getXpath(CommonObject.d30);
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"关 闭")]

    public final String dES29 = "通用-员工查询popped-确定按钮-span";
    private String xES29 = prefix + CommonObject.getXpath(CommonObject.d29);
    //div[1=1 and contains(text(),"业务条线")]/../..//span[1=1 and contains(text(),"确 定")]


    /**
     * 获取员工查询-表格表体rows的xpath,支持最后一个
     *
     * @param num 第N行,如果最后一行传入-1
     */
    public String get$XES10Sibling(int num) {
        //div[1=1 and contains(text(),"客户经理1")]/../..//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][1]

        String xpath;
        if (num > 0) {
            xpath = xES10 + "[" + num + "]";
        } else if (num == -1) {
            xpath = xES10 + "[" + "last()" + "]";
        } else {
            xpath = xES10;
        }

        return xpath;
    }

    /**
     * 获取员工查询-表格表体rows的描述,支持最后一个
     *
     * @param num 第N行,如果最后一行传入-1
     */
    public String get$DES10Sibling(int num) {
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

        des = dES10.replace("-tr", a + "-tr");
        return des;
    }

    /**
     * 用员工姓名定位候选项,返回元素的xpath
     *
     * @param userName 员工姓名
     */
    private String get$XES10SiblingByUserName(String userName) {
        //div[1=1 and contains(text(),"客户经理1")]/../..//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key]/td[text()='王明明']

        String xpath;

        xpath = xES10 + "/td[text()='" + userName + "']/..";

        return xpath;
    }

    /**
     * 用员工姓名定位候选项,返回元素的描述
     *
     * @param userName 员工姓名
     */
    private String get$DES10SiblingByUserName(String userName) {
        //通用-员工查询-表格表体rows王明明-tr

        String des;

        des = dES10.replace("-tr", userName + "-tr");
        return des;
    }

    public JSONObject get$JsonES10SiblingByUserName(String userName) {
        JsonObject.setJsonObject(get$DES10SiblingByUserName(userName),
                get$XES10SiblingByUserName(userName));
        return jsonObject;
    }

    public JSONObject getJson(String description) {
        String str = "";
        switch (description) {
            case dES32:
                JsonObject.setJsonObject(dES32, xES32);
                break;
            case dES33:
                JsonObject.setJsonObject(dES33, xES33);
                break;
            case dES33_1:
                JsonObject.setJsonObject(dES33_1, xES33_1);
                break;
            case dES10:
                JsonObject.setJsonObject(dES10, xES10);
                break;
            case dES30:
                JsonObject.setJsonObject(dES30, xES30);
                break;
            case dES29:
                JsonObject.setJsonObject(dES29, xES29);
                break;

        }

        return jsonObject;

    }


}
