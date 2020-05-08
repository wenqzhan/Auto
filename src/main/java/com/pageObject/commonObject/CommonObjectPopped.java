package com.pageObject.commonObject;

public class CommonObjectPopped {

    private final static String p = "//div[@tabindex]";

    private final static String cross = "//i[1=1 and contains(@class,'close-circle') or contains(@class,'anticon-close')]";

    private final static String arrow = "//i[1=1 and contains(@class,'arrow')]";

    private final static String search = "/following-sibling::*//i[1=1 and contains(@class,'')]";

    public final static String d9P = "通用-first popped-表格-table";
    private final static String x9P = p + CommonObject.getXpath(CommonObject.d9);
    //div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]

    public final static String d10P = "通用-first popped-表格表体rows-tr";
    private final static String x10P = p + CommonObject.getXpath(CommonObject.d10);
    //div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key]

    public final static String d10PSelected = "通用-first popped-表格表体rows-selected-tr";
    private final static String x10PSelected = p + CommonObject.getXpath(CommonObject.d10Selected);
    //div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected')]

    public final static String d10PNotSelected = "通用-first popped-表格表体rows-not selected-tr";
    private final static String x10PNotSelected = p + CommonObject.getXpath(CommonObject.d10NotSelected);
    //div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected'))]
    public final static String d11P = "通用-first popped-表格表头row下的th col-th";
    private final static String x11P = p + CommonObject.getXpath(CommonObject.d11);
    //div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[not(@key='selection-column')]

    public final static String d31P = "通用-first popped-表格表头-多选框-th";
    private final static String x31P = p + CommonObject.getXpath(CommonObject.d31);
    //div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']

    public final static String d12P = "通用-first popped-表格下方翻页按钮-上一页-li";
    private final static String x12P = p + CommonObject.getXpath(CommonObject.d12);
    //div[@tabindex]//li[1=1 and contains(@title,'上一页')]

    public final static String d13P = "通用-first popped-表格下方翻页按钮-下一页-li";
    private final static String x13P = p + CommonObject.getXpath(CommonObject.d13);
    //div[@tabindex]//li[1=1 and contains(@title,'下一页')]

    public final static String d14P = "通用-first popped-表格下方翻页按钮-下一页前的按钮,可以看出共多少页-a";
    private final static String x14P = p + CommonObject.getXpath(CommonObject.d14);
    //div[@tabindex]//li[1=1 and contains(@title,'下一页')]/preceding-sibling::li[1]/a

    public final static String d15P = "通用-first popped-表格下方跳页输入框-input";
    private final static String x15P = p + CommonObject.getXpath(CommonObject.d15);
    //div[@tabindex]//div[1=1 and contains(text(),"跳至")]/input

    public final static String d16P = "通用-first popped-表格下方跳页输入框左边的跳至两个字-div";
    private final static String x16P = p + CommonObject.getXpath(CommonObject.d16);
    //div[@tabindex]//div[1=1 and contains(text(),"跳至")]

    public final static String d18P = "通用-first popped-条/页-div";
    private final static String x18P = p + CommonObject.getXpath(CommonObject.d18);
    //div[@tabindex]//div[1=1 and contains(@title,'条/页')]

    public final static String d18Pl5 = "通用-first popped-条/页-5 条/页-li";
    private final static String x18Pl5 = p + CommonObject.getXpath(CommonObject.d18l5);
    //div[@tabindex]//li[1=1 and text()='5 条/页' ]

    public final static String d18Pl10 = "通用-first popped-条/页-10 条/页-li";
    private final static String x18Pl10 = p + CommonObject.getXpath(CommonObject.d18l10);
    //div[@tabindex]//li[1=1 and text()='10 条/页' ]

    public final static String d18Pl20 = "通用-first popped-条/页-20 条/页-li";
    private final static String x18Pl20 = p + CommonObject.getXpath(CommonObject.d18l20);
    //div[@tabindex]//li[1=1 and text()='20 条/页' ]

    public final static String d18Pl30 = "通用-first popped-条/页-30 条/页-li";
    private final static String x18Pl30 = p + CommonObject.getXpath(CommonObject.d18l30);
    //div[@tabindex]//li[1=1 and text()='30 条/页' ]

    public final static String d28P = "通用-first popped-表头多选框-input";
    private final static String x28P = p + CommonObject.getXpath(CommonObject.d28);
    //div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']//input


    public final static String d34P = "通用-业务条线查询框-input";
    private final static String x34P = p + CommonObject.getXpath(CommonObject.d34);
    //div[@tabindex]//label[1=1 and contains(text(),"业务条线")]/../following-sibling::*[1]//input

    public final static String d34P_croxx = "通用-业务条线查询框-input-旁边的×";
    private final static String x34P_croxx = x34P + "/.." +cross;
    //div[@tabindex]//label[1=1 and contains(text(),"业务条线")]/../following-sibling::*[1]//input/..//i[1=1 and contains(@class,'close-circle')]

    public final static String d1P = "通用-first popped-OA账号框-input";
    private final static String x1P = p + CommonObject.getXpath(CommonObject.d1);
    //div[@tabindex]//label[1=1 and contains(text(),"OA账号")]/../following-sibling::*[1]//input

    public final static String d2P = "通用-first popped-客户名称框-input";
    private final static String x2P = p + CommonObject.getXpath(CommonObject.d2);
    //div[@tabindex]//label[1=1 and contains(text(),"客户名称")]/../following-sibling::*[1]//input


    public final static String d37P = "通用-first popped-联系人姓名框-input";
    private final static String x37P = p + CommonObject.getXpath(CommonObject.d37);
    //div[@tabindex]//label[1=1 and contains(text(),"联系人姓名")]/../following-sibling::*[1]//input

    public final static String d38P = "通用-first popped-手机框-input";
    private final static String x38P = p + CommonObject.getXpath(CommonObject.d38);
    //div[@tabindex]//label[1=1 and contains(text(),"手机")]/../following-sibling::*[1]//input

    public final static String d39P = "通用-first popped-部门框-input";
    private final static String x39P = p + CommonObject.getXpath(CommonObject.d39);
    //div[@tabindex]//label[1=1 and contains(text(),"部门")]/../following-sibling::*[1]//input


    public final static String d40P = "通用-first popped-FAX框-input";
    private final static String x40P = p + CommonObject.getXpath(CommonObject.d40);
    //div[@tabindex]//label[1=1 and contains(text(),"FAX")]/../following-sibling::*[1]//input

    public final static String d41P = "通用-first popped-邮箱框-input";
    private final static String x41P = p + CommonObject.getXpath(CommonObject.d41);
    //div[@tabindex]//label[1=1 and contains(text(),"邮箱")]/../following-sibling::*[1]//input

    public final static String d42P = "通用-first popped-客户简称框-input";
    private final static String x42P = p + CommonObject.getXpath(CommonObject.d42);
    //div[@tabindex]//label[1=1 and contains(text(),"客户简称")]/../following-sibling::*[1]//input

    public final static String d43P = "通用-first popped-职务框-input";
    private final static String x43P = p + CommonObject.getXpath(CommonObject.d43);
    //div[@tabindex]//label[1=1 and contains(text(),"职务")]/../following-sibling::*[1]//input


    public final static String d44P = "通用-first popped-座机框-input";
    private final static String x44P = p + CommonObject.getXpath(CommonObject.d44);
    //div[@tabindex]//label[1=1 and contains(text(),"座机")]/../following-sibling::*[1]//input

    public final static String d45P = "通用-first popped-创建人框-input";
    private final static String x45P = p + CommonObject.getXpath(CommonObject.d45);
    //div[@tabindex]//label[1=1 and contains(text(),"创建人")]/../following-sibling::*[1]//input

    public final static String d46P = "通用-first popped-办公地址框-input";
    private final static String x46P = p + CommonObject.getXpath(CommonObject.d46);
    //div[@tabindex]//label[1=1 and contains(text(),"办公地址")]/../following-sibling::*[1]//input


    public final static String d47P = "通用-first popped-国君服务联系人框-input";
    private final static String x47P = p + CommonObject.getXpath(CommonObject.d47);
    //div[@tabindex]//label[1=1 and contains(text(),"国君服务联系人")]/../following-sibling::*[1]//input

    public final static String d49P = "通用-first popped-材料名称框-input";
    private final static String x49P = p + CommonObject.getXpath(CommonObject.d49);
    //div[@tabindex]//label[1=1 and contains(text(),"材料名称")]/../following-sibling::*[1]//input

    public final static String d50P = "通用-first popped-材料类型框-div";/////
    private final static String x50P = p + CommonObject.getXpath(CommonObject.d50);
    //div[@tabindex]//label[1=1 and contains(text(),"材料类型")]/../following-sibling::div[1]


    public final static String d50Pl1 = "通用-first popped-材料类型框-专项战略合作协议-span";
    private final static String x50Pl1 = get$XPLiSpan("专项战略合作协议");
    //div[@tabindex]//li/span[1=1 and @title='专项战略合作协议' ]

    public final static String d50Pl2 = "通用-first popped-材料类型框-全面战略合作协议-span";
    private final static String x50Pl2 = get$XPLiSpan("全面战略合作协议");
    //div[@tabindex]//li/span[1=1 and @title='专项战略合作协议' ]

    public final static String d50Pl3 = "通用-first popped-材料类型框-业务协议-span";
    private final static String x50Pl3 = get$XPLiSpan("业务协议");
    //div[@tabindex]//li/span[1=1 and @title='业务协议' ]

    public final static String d51P = "通用-first popped-所属商机框-input";
    private final static String x51P = p + CommonObject.getXpath(CommonObject.d51);
    //div[@tabindex]//label[1=1 and contains(text(),"所属商机")]/../following-sibling::*[1]//input

    public final static String d53P = "通用-first popped-联系人框-input";
    private final static String x53P = p + CommonObject.getXpath(CommonObject.d53);
    //div[@tabindex]//label[1=1 and contains(text(),"联系人")]/../following-sibling::*[1]//input

    public final static String d54P = "通用-first popped-签署日期框-input";
    private final static String x54P = p + CommonObject.getXpath(CommonObject.d54);
    //div[@tabindex]//label[1=1 and contains(text(),"签署日期")]/../following-sibling::*[1]//input

    public final static String d55P = "通用-first popped-合同金额(万元)框-input";
    private final static String x55P = p + CommonObject.getXpath(CommonObject.d55);
    //div[@tabindex]//label[1=1 and contains(text(),"合同金额(万元)")]/../following-sibling::*[1]//input


    public final static String d56P = "通用-first popped-关联商机框-input";
    private final static String x56P = p + CommonObject.getXpath(CommonObject.d56);
    //div[@tabindex]//label[1=1 and contains(text(),"关联商机")]/../following-sibling::*[1]//input




    public final static String d27P = "通用-first popped-客户经理框-input";
    private final static String x27P = p + CommonObject.getXpath(CommonObject.d27);
    //div[@tabindex]//label[1=1 and contains(text(),"客户经理")]/../following-sibling::*[1]//input

    public final static String d29P = "通用-first popped-确定按钮-span";
    private final static String x29P = p + CommonObject.getXpath(CommonObject.d29);
    //div[@tabindex]//span[1=1 and contains(text(),"确 定")]

    public final static String d30P = "通用-first popped-关闭按钮-span";
    private final static String x30P = p + CommonObject.getXpath(CommonObject.d30);
    //div[@tabindex]//span[1=1 and contains(text(),"关 闭")]

    public final static String dUploadP = "通用-first popped-上传文件-p";
    private final static String xUploadP = p + "//p[text()='点击或将文件拖拽到这里上传']";
    //div[@tabindex]//p[text()='点击或将文件拖拽到这里上传']

    public static String getStringP() {
        return p;
    }

    public static String get$XPQuerySelect(String label) {
        return get$XPQuerySelect(label, "div");
        //div[@tabindex]//label[1=1 and contains(text(),"客户柜台代码")]/../following-sibling::div[1]
    }

    public static String get$XPQuerySelect(String label, String tag) {

        //div[@tabindex]//label[1=1 and contains(text(),"开发类型")]/../following-sibling::div[1]
        String xpath = "";
        if (tag.equals("div")) {
            xpath = getStringP() + CommonObject.get$XQuerySelectDiv(label);
        } else {
            xpath = getStringP() + CommonObject.get$XQuerySelectDiv(label) + "//" + tag;
            //div[@tabindex]//label[1=1 and contains(text(),"客户柜台代码")]/../following-sibling::div[1]//input
        }

        return xpath;
    }

    public static String get$DPQuerySelect(String label) {
        return get$DPQuerySelect(label, "div");
        //通用-first popped-选择:客户柜台代码-div
    }

    public static String get$DPQuerySelect(String label, String tag) {
        //通用-first popped-选择:客户柜台代码-input
        String description = "通用-first popped-选择:";
        description = description + label;
        description = description + "-" + tag;

        return description;
    }


    public static String get$X10PSibling(String num) {
        //div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][1]
        String xpath = "//div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][";
        xpath = xpath + num;
        xpath = xpath + "]";

        return xpath;
    }

    public static String get$D10PSibling(String num) {
        //通用-first popped-表格表体-第1行
        String description = "通用-first popped-表格表体-第";
        description = description + num;
        description = description + "行";

        return description;
    }


    public static String get$X10PSibling(int num) {
        //div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][30]
        String xpath = "//div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][";
        if (num > 0) {
            xpath = xpath + num;
        } else if (num == -1) {
            xpath = xpath + "last()";
        } else {
            return "error, the num must be positive or equals -1";
        }
        xpath = xpath + "]";

        return xpath;
    }

    public static String get$D10PSibling(int num) {
        //通用-first popped-表格表体-第1行
        String description = "通用-first popped-表格表体-第";
        if (num > 0) {
            description = description + num;
        } else if (num == -1) {
            description = description + "最后一";
        } else {
            return "error, the num must be positive or equals -1";
        }
        description = description + "行";

        return description;
    }


    public static String get$XPLi(String label) {
        //div[@tabindex]//li[1=1 and contains(text(),"个人")]
        String xpath = "";
        xpath = getStringP() + CommonObject.get$XLi(label);
        return xpath;
    }

    public static String get$XPLiSpan(String label) {
        //div[@tabindex]//li/span[1=1 and @title='专项战略合作协议' ]
        String xpath = "";
        xpath = getStringP() + CommonObject.get$XLiSpan(label);
        return xpath;
    }


    public static String get$DPLi(String label) {
        //通用-first popped个人-li
        String description = "通用-first popped";
        description = description + label;
        description = description + "-li";

        return description;
    }


    public static String get$XPQueryInput(String label) {
        //div[@tabindex]//label[1=1 and contains(text(),"客户柜台代码")]/../following-sibling::*[1]//input
        String xpath = p;
        xpath = xpath + CommonObject.get$XQueryInput(label);
        return xpath;
    }


    public static String get$DPQueryInput(String label) {
        //通用-first popped-OA账号-查询框
        String description = CommonObject.get$DQueryInput(label);
        description=description.replaceFirst("通用-", "通用-first popped");
        return description;
    }


    public static String getArrow(String xpath) {
        return xpath + arrow;
    }

    public static String getCross(String xpath) {
        return xpath + cross;
    }

    public static String getSearch(String xpath) {
        return xpath + search;
    }


    public static String getXpath(String description) {
        String str = "";
        switch (description) {
            case d9P:
                str = x9P;
                break;
            case d10P:
                str = x10P;
                break;
            case d11P:
                str = x11P;
                break;
            case d12P:
                str = x12P;
                break;
            case d13P:
                str = x13P;
                break;
            case d14P:
                str = x14P;
                break;
            case d15P:
                str = x15P;
                break;
            case d16P:
                str = x16P;
                break;
            case d18P:
                str = x18P;
                break;
            case d28P:
                str = x28P;
                break;
            case d18Pl5:
                str = x18Pl5;
                break;
            case d18Pl10:
                str = x18Pl10;
                break;
            case d18Pl20:
                str = x18Pl20;
                break;
            case d18Pl30:
                str = x18Pl30;
                break;
            case d10PSelected:
                str = x10PSelected;
                break;
            case d10PNotSelected:
                str = x10PNotSelected;
                break;
            case d31P:
                str = x31P;
                break;
            case d34P:
                str = x34P;
                break;
            case d1P:
                str = x1P;
                break;
            case d2P:
                str = x2P;
                break;
            case d37P:
                str = x37P;
                break;
            case d38P:
                str = x38P;
                break;
            case d39P:
                str = x39P;
                break;
            case d40P:
                str = x40P;
                break;
            case d41P:
                str = x41P;
                break;
            case d42P:
                str = x42P;
                break;
            case d43P:
                str = x43P;
                break;
            case d44P:
                str = x44P;
                break;
            case d45P:
                str = x45P;
                break;
            case d46P:
                str = x46P;
                break;
            case d27P:
                str = x27P;
                break;
            case d29P:
                str = x29P;
                break;
            case d30P:
                str = x30P;
                break;
            case d47P:
                str = x47P;
                break;
            case d34P_croxx:
                str = x34P_croxx;
                break;
            case d49P:
                str = x49P;
                break;
            case d50P:
                str = x50P;
                break;
            case d51P:
                str = x51P;
                break;
            case d53P:
                str = x53P;
                break;
            case d54P:
                str = x54P;
                break;
            case d55P:
                str = x55P;
                break;
            case dUploadP:
                str = xUploadP;
                break;
            case d56P:
                str = x56P;
                break;
            case d50Pl1:
                str = x50Pl1;
                break;
            case d50Pl2:
                str = x50Pl2;
                break;
            case d50Pl3:
                str = x50Pl3;
                break;
        }
        return str;

    }


}
