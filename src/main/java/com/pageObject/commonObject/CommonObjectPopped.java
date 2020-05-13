package com.pageObject.commonObject;

import com.utils.json.JsonObject;
import lombok.Data;

@Data
public class CommonObjectPopped extends JsonObject {

    public CommonObjectPopped() {
        super.setPrefix(this.prefix);
    }

    private CommonObject commonObject = new CommonObject();

    private final String prefix = "//div[@tabindex]";

    private final String cross = "//i[1=1 and contains(@class,'close-circle') or contains(@class,'anticon-close')]";

    private final String arrow = "//i[1=1 and contains(@class,'arrow')]";

    private final String search = "/following-sibling::*//i[1=1 and contains(@class,'')]";

    private final String d9P = commonObject.getD9().replaceFirst("-","-first popped-");
    private final String x9P = prefix + commonObject.getX9();
    //div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]

    private final String d10P = commonObject.getD10().replaceFirst("-","-first popped-");
    private final String x10P = prefix + commonObject.getX10();
    //div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key]

    private final String d10PSelected = commonObject.getD10Selected().replaceFirst("-","-first popped-");
    private final String x10PSelected = prefix + commonObject.getX10Selected();
    //div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected')]

    private final String d10PNotSelected = commonObject.getD10NotSelected().replaceFirst("-","-first popped-");
    private final String x10PNotSelected = prefix + commonObject.getX10NotSelected();
    //div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected'))]
    private final String d11P = commonObject.getD11().replaceFirst("-","-first popped-");
    private final String x11P = prefix + commonObject.getX11();
    //div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[not(@key='selection-column')]

    private final String d31P = commonObject.getD31().replaceFirst("-","-first popped-");
    private final String x31P = prefix + commonObject.getX31();
    //div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']

    private final String d12P = commonObject.getD12().replaceFirst("-","-first popped-");
    private final String x12P = prefix + commonObject.getX12();
    //div[@tabindex]//li[1=1 and contains(@title,'上一页')]

    private final String d13P = commonObject.getD13().replaceFirst("-","-first popped-");
    private final String x13P = prefix + commonObject.getX13();
    //div[@tabindex]//li[1=1 and contains(@title,'下一页')]

    private final String d14P = commonObject.getD14().replaceFirst("-","-first popped-");
    private final String x14P = prefix + commonObject.getX14();
    //div[@tabindex]//li[1=1 and contains(@title,'下一页')]/preceding-sibling::li[1]/a

    private final String d15P = commonObject.getD15().replaceFirst("-","-first popped-");
    private final String x15P = prefix + commonObject.getX15();
    //div[@tabindex]//div[1=1 and contains(text(),"跳至")]/input

    private final String d16P = commonObject.getD16().replaceFirst("-","-first popped-");
    private final String x16P = prefix + commonObject.getX16();
    //div[@tabindex]//div[1=1 and contains(text(),"跳至")]

    private final String d18P = commonObject.getD18().replaceFirst("-","-first popped-");
    private final String x18P = prefix + commonObject.getX18();
    //div[@tabindex]//div[1=1 and contains(@title,'条/页')]

    private final String d18PL5 = commonObject.getD18L5().replaceFirst("-","-first popped-");
    private final String x18PL5 = prefix + commonObject.getX18L5();
    //div[@tabindex]//li[1=1 and text()='5 条/页' ]

    private final String d18PL10 = commonObject.getD18L10().replaceFirst("-","-first popped-");
    private final String x18PL10 = prefix + commonObject.getX18L10();
    //div[@tabindex]//li[1=1 and text()='10 条/页' ]

    private final String d18PL20 = commonObject.getD18L20().replaceFirst("-","-first popped-");
    private final String x18PL20 = prefix + commonObject.getX18L20();
    //div[@tabindex]//li[1=1 and text()='20 条/页' ]

    private final String d18PL30 = commonObject.getD18L30().replaceFirst("-","-first popped-");
    private final String x18PL30 = prefix + commonObject.getX18L30();
    //div[@tabindex]//li[1=1 and text()='30 条/页' ]

    private final String d28P = commonObject.getD28().replaceFirst("-","-first popped-");
    private final String x28P = prefix + commonObject.getX28();
    //div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']//input


    private final String d34P = commonObject.getD34().replaceFirst("-","-first popped-");
    private final String x34P = prefix + commonObject.getX34();
    //div[@tabindex]//label[1=1 and contains(text(),"业务条线")]/../following-sibling::*[1]//input

    private final String d34PCross = d34P+"-大×";
    private final String x34PCross = x34P + "/.." + cross;
    //div[@tabindex]//label[1=1 and contains(text(),"业务条线")]/../following-sibling::*[1]//input/..//i[1=1 and contains(@class,'close-circle')]

    private final String d1P = commonObject.getD1().replaceFirst("-","-first popped-");
    private final String x1P = prefix + commonObject.getX1();
    //div[@tabindex]//label[1=1 and contains(text(),"OA账号")]/../following-sibling::*[1]//input

    private final String d2P = commonObject.getD2().replaceFirst("-","-first popped-");
    private final String x2P = prefix + commonObject.getX2();
    //div[@tabindex]//label[1=1 and contains(text(),"客户名称")]/../following-sibling::*[1]//input


    private final String d37P = commonObject.getD37().replaceFirst("-","-first popped-");
    private final String x37P = prefix + commonObject.getX37();
    //div[@tabindex]//label[1=1 and contains(text(),"联系人姓名")]/../following-sibling::*[1]//input

    private final String d38P = commonObject.getD38().replaceFirst("-","-first popped-");
    private final String x38P = prefix + commonObject.getX38();
    //div[@tabindex]//label[1=1 and contains(text(),"手机")]/../following-sibling::*[1]//input

    private final String d39P = commonObject.getD39().replaceFirst("-","-first popped-");
    private final String x39P = prefix + commonObject.getX39();
    //div[@tabindex]//label[1=1 and contains(text(),"部门")]/../following-sibling::*[1]//input


    private final String d40P = commonObject.getD40().replaceFirst("-","-first popped-");
    private final String x40P = prefix + commonObject.getX40();
    //div[@tabindex]//label[1=1 and contains(text(),"FAX")]/../following-sibling::*[1]//input

    private final String d41P = commonObject.getD41().replaceFirst("-","-first popped-");
    private final String x41P = prefix + commonObject.getX41();
    //div[@tabindex]//label[1=1 and contains(text(),"邮箱")]/../following-sibling::*[1]//input

    private final String d42P = commonObject.getD42().replaceFirst("-","-first popped-");
    private final String x42P = prefix + commonObject.getX42();
    //div[@tabindex]//label[1=1 and contains(text(),"客户简称")]/../following-sibling::*[1]//input

    private final String d43P = commonObject.getD43().replaceFirst("-","-first popped-");
    private final String x43P = prefix + commonObject.getX43();
    //div[@tabindex]//label[1=1 and contains(text(),"职务")]/../following-sibling::*[1]//input


    private final String d44P = commonObject.getD44().replaceFirst("-","-first popped-");
    private final String x44P = prefix + commonObject.getX44();
    //div[@tabindex]//label[1=1 and contains(text(),"座机")]/../following-sibling::*[1]//input

    private final String d45P = commonObject.getD45().replaceFirst("-","-first popped-");
    private final String x45P = prefix + commonObject.getX45();
    //div[@tabindex]//label[1=1 and contains(text(),"创建人")]/../following-sibling::*[1]//input

    private final String d46P = commonObject.getD46().replaceFirst("-","-first popped-");
    private final String x46P = prefix + commonObject.getX46();
    //div[@tabindex]//label[1=1 and contains(text(),"办公地址")]/../following-sibling::*[1]//input


    private final String d47P = commonObject.getD47().replaceFirst("-","-first popped-");
    private final String x47P = prefix + commonObject.getX47();
    //div[@tabindex]//label[1=1 and contains(text(),"国君服务联系人")]/../following-sibling::*[1]//input

    private final String d49P = commonObject.getD49().replaceFirst("-","-first popped-");
    private final String x49P = prefix + commonObject.getX49();
    //div[@tabindex]//label[1=1 and contains(text(),"材料名称")]/../following-sibling::*[1]//input

    private final String d50P = commonObject.getD50().replaceFirst("-","-first popped-");
    private final String x50P = prefix + commonObject.getX50();
    //div[@tabindex]//label[1=1 and contains(text(),"材料类型")]/../following-sibling::div[1]


    private final String d50PL1 = "通用-first popped-材料类型框-专项战略合作协议-span";
    private final String x50PL1 = get$XPLiSpan("专项战略合作协议");
    //div[@tabindex]//li/span[1=1 and @title='专项战略合作协议' ]

    private final String d50PL2 = "通用-first popped-材料类型框-全面战略合作协议-span";
    private final String x50PL2 = get$XPLiSpan("全面战略合作协议");
    //div[@tabindex]//li/span[1=1 and @title='专项战略合作协议' ]

    private final String d50PL3 = "通用-first popped-材料类型框-业务协议-span";
    private final String x50PL3 = get$XPLiSpan("业务协议");
    //div[@tabindex]//li/span[1=1 and @title='业务协议' ]

    private final String d51P = commonObject.getD51().replaceFirst("-","-first popped-");
    private final String x51P = prefix + commonObject.getX51();
    //div[@tabindex]//label[1=1 and contains(text(),"所属商机")]/../following-sibling::*[1]//input

    private final String d53P = commonObject.getD53().replaceFirst("-","-first popped-");
    private final String x53P = prefix + commonObject.getX53();
    //div[@tabindex]//label[1=1 and contains(text(),"联系人")]/../following-sibling::*[1]//input

    private final String d54P = commonObject.getD54().replaceFirst("-","-first popped-");
    private final String x54P = prefix + commonObject.getX54();
    //div[@tabindex]//label[1=1 and contains(text(),"签署日期")]/../following-sibling::*[1]//input

    private final String d55P = commonObject.getD55().replaceFirst("-","-first popped-");
    private final String x55P = prefix + commonObject.getX55();
    //div[@tabindex]//label[1=1 and contains(text(),"合同金额(万元)")]/../following-sibling::*[1]//input


    private final String d56P = commonObject.getD56().replaceFirst("-","-first popped-");
    private final String x56P = prefix + commonObject.getX56();
    //div[@tabindex]//label[1=1 and contains(text(),"关联商机")]/../following-sibling::*[1]//input


    private final String d27P = commonObject.getD27().replaceFirst("-","-first popped-");
    private final String x27P = prefix + commonObject.getX27();
    //div[@tabindex]//label[1=1 and contains(text(),"客户经理")]/../following-sibling::*[1]//input

    private final String d29P = commonObject.getD29().replaceFirst("-","-first popped-");
    private final String x29P = prefix + commonObject.getX29();
    //div[@tabindex]//span[1=1 and contains(text(),"确 定")]

    private final String d30P = commonObject.getD30().replaceFirst("-","-first popped-");
    private final String x30P = prefix + commonObject.getX30();
    //div[@tabindex]//span[1=1 and contains(text(),"关 闭")]

    private final String dUploadP = "通用-first popped-上传文件-p";
    private final String xUploadP = prefix + "//p[text()='点击或将文件拖拽到这里上传']";
    //div[@tabindex]//p[text()='点击或将文件拖拽到这里上传']

    public String getStringP() {
        return prefix;
    }

    public String get$XPQuerySelect(String label) {
        return get$XPQuerySelect(label, "div");
        //div[@tabindex]//label[1=1 and contains(text(),"客户柜台代码")]/../following-sibling::div[1]
    }

    public String get$XPQuerySelect(String label, String tag) {

        //div[@tabindex]//label[1=1 and contains(text(),"开发类型")]/../following-sibling::div[1]
        String xpath = "";
        if (tag.equals("div")) {
            xpath = getStringP() + commonObject.get$XQuerySelectDiv(label);
        } else {
            xpath = getStringP() + commonObject.get$XQuerySelectDiv(label) + "//" + tag;
            //div[@tabindex]//label[1=1 and contains(text(),"客户柜台代码")]/../following-sibling::div[1]//input
        }

        return xpath;
    }

    public String get$DPQuerySelect(String label) {
        return get$DPQuerySelect(label, "div");
        //通用-first popped-选择:客户柜台代码-div
    }

    public String get$DPQuerySelect(String label, String tag) {
        //通用-first popped-选择:客户柜台代码-input
        String description = "通用-first popped-选择:";
        description = description + label;
        description = description + "-" + tag;

        return description;
    }


    public String get$X10PSibling(String num) {
        //div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][1]
        String xpath = "//div[@tabindex]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][";
        xpath = xpath + num;
        xpath = xpath + "]";

        return xpath;
    }

    public String get$D10PSibling(String num) {
        //通用-first popped-表格表体-第1行
        String description = "通用-first popped-表格表体-第";
        description = description + num;
        description = description + "行";

        return description;
    }


    public String get$X10PSibling(int num) {
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

    private String get$D10PSibling(int num) {
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


    public String get$XPLi(String label) {
        //div[@tabindex]//li[1=1 and contains(text(),"个人")]
        String xpath = "";
        xpath = getStringP() + commonObject.get$XLi(label);
        return xpath;
    }

    public String get$XPLiSpan(String label) {
        //div[@tabindex]//li/span[1=1 and @title='专项战略合作协议' ]
        String xpath = "";
        xpath = getStringP() + commonObject.get$XLiSpan(label);
        return xpath;
    }


    public String get$DPLi(String label) {
        //通用-first popped个人-li
        String description = "通用-first popped";
        description = description + label;
        description = description + "-li";

        return description;
    }


    public String get$XPQueryInput(String label) {
        //div[@tabindex]//label[1=1 and contains(text(),"客户柜台代码")]/../following-sibling::*[1]//input
        String xpath = prefix;
        xpath = xpath + commonObject.get$XQueryInput(label);
        return xpath;
    }


    public String get$DPQueryInput(String label) {
        //通用-first popped-OA账号-查询框
        String description = commonObject.get$DQueryInput(label);
        description = description.replaceFirst("通用-", "通用-first popped");
        return description;
    }


    public String getArrow(String xpath) {
        return xpath + arrow;
    }

    public String getCross(String xpath) {
        return xpath + cross;
    }

    public String getSearch(String xpath) {
        return xpath + search;
    }


//    public  String getXpath(String description) {
//        String str = "";
//        switch (description) {
//            case d9P:
//                str = x9P;
//                break;
//            case d10P:
//                str = x10P;
//                break;
//            case d11P:
//                str = x11P;
//                break;
//            case d12P:
//                str = x12P;
//                break;
//            case d13P:
//                str = x13P;
//                break;
//            case d14P:
//                str = x14P;
//                break;
//            case d15P:
//                str = x15P;
//                break;
//            case d16P:
//                str = x16P;
//                break;
//            case d18P:
//                str = x18P;
//                break;
//            case d28P:
//                str = x28P;
//                break;
//            case d18Pl5:
//                str = x18Pl5;
//                break;
//            case d18Pl10:
//                str = x18Pl10;
//                break;
//            case d18Pl20:
//                str = x18Pl20;
//                break;
//            case d18Pl30:
//                str = x18Pl30;
//                break;
//            case d10PSelected:
//                str = x10PSelected;
//                break;
//            case d10PNotSelected:
//                str = x10PNotSelected;
//                break;
//            case d31P:
//                str = x31P;
//                break;
//            case d34P:
//                str = x34P;
//                break;
//            case d1P:
//                str = x1P;
//                break;
//            case d2P:
//                str = x2P;
//                break;
//            case d37P:
//                str = x37P;
//                break;
//            case d38P:
//                str = x38P;
//                break;
//            case d39P:
//                str = x39P;
//                break;
//            case d40P:
//                str = x40P;
//                break;
//            case d41P:
//                str = x41P;
//                break;
//            case d42P:
//                str = x42P;
//                break;
//            case d43P:
//                str = x43P;
//                break;
//            case d44P:
//                str = x44P;
//                break;
//            case d45P:
//                str = x45P;
//                break;
//            case d46P:
//                str = x46P;
//                break;
//            case d27P:
//                str = x27P;
//                break;
//            case d29P:
//                str = x29P;
//                break;
//            case d30P:
//                str = x30P;
//                break;
//            case d47P:
//                str = x47P;
//                break;
//            case d34PCross:
//                str = x34PCross;
//                break;
//            case d49P:
//                str = x49P;
//                break;
//            case d50P:
//                str = x50P;
//                break;
//            case d51P:
//                str = x51P;
//                break;
//            case d53P:
//                str = x53P;
//                break;
//            case d54P:
//                str = x54P;
//                break;
//            case d55P:
//                str = x55P;
//                break;
//            case dUploadP:
//                str = xUploadP;
//                break;
//            case d56P:
//                str = x56P;
//                break;
//            case d50Pl1:
//                str = x50Pl1;
//                break;
//            case d50Pl2:
//                str = x50Pl2;
//                break;
//            case d50Pl3:
//                str = x50Pl3;
//                break;
//        }
//        return str;
//
//    }


}
