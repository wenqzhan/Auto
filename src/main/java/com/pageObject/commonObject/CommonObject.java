package com.pageObject.commonObject;

import com.utils.json.JsonObject;
import lombok.Data;

@Data
public class CommonObject extends JsonObject {

    private final String d1 = "通用-OA账号框-input";
    private final String x1 = get$XQueryInput("OA账号");
    //label[1=1 and contains(text(),"OA账号")]/../following-sibling::*[1]//input

    private final String d2 = "通用-客户名称框-input";
    private final String x2 = get$XQueryInput("客户名称");
    //label[1=1 and contains(text(),"客户名称")]/../following-sibling::*[1]//input

    private final String d19 = "通用-客户柜台代码框-input";
    private final String x19 = get$XQueryInput("客户柜台代码");
    //label[1=1 and contains(text(),"客户柜台代码")]/../following-sibling::*[1]//input

    private final String d20 = "通用-账户名称框-input";
    private final String x20 = get$XQueryInput("账户名称");
    //label[1=1 and contains(text(),"账户名称")]/../following-sibling::*[1]//input

    private final String d21 = "通用-资金账号框-input";
    private final String x21 = get$XQueryInput("资金账号");
    //label[1=1 and contains(text(),"资金账号")]/../following-sibling::*[1]//input

    private final String d22 = "通用-账户类型框-div";/////
    private final String x22 = get$XQuerySelectDiv("账户类型");/////
    //label[1=1 and contains(text(),"账户类型")]/../following-sibling::div[1]

    private final String d23 = "通用-归属机构框-input";
    private final String x23 = get$XQueryInput("归属机构");
    //label[1=1 and contains(text(),"归属机构")]/../following-sibling::*[1]//input

    private final String d24 = "通用-开发类型框-div";/////
    private final String x24 = get$XQuerySelectDiv("开发类型");/////
    //label[1=1 and contains(text(),"开发类型")]/../following-sibling::div[1]

    private final String d25 = "通用-经纪业务关系类型框-div";////
    private final String x25 = get$XQuerySelectDiv("经纪业务关系类型");////
    //label[1=1 and contains(text(),"经纪业务关系类型")]/../following-sibling::div[1]

    private final String d26 = "通用-登记人框-input";
    private final String x26 = get$XQueryInput("登记人");
    //label[1=1 and contains(text(),"登记人")]/../following-sibling::*[1]//input

    private final String d27 = "通用-客户经理框-input";
    private final String x27 = get$XQueryInput("客户经理");
    //label[1=1 and contains(text(),"客户经理")]/../following-sibling::*[1]//input

    private final String d34 = "通用-业务条线框-input";
    private final String x34 = get$XQueryInput("业务条线");
    //label[1=1 and contains(text(),"业务条线")]/../following-sibling::*[1]//input


    private final String d37 = "通用-联系人姓名框-input";
    private final String x37 = get$XQueryInput("联系人姓名");
    //label[1=1 and contains(text(),"联系人姓名")]/../following-sibling::*[1]//input

    private final String d38 = "通用-手机框-input";
    private final String x38 = get$XQueryInput("手机");
    //label[1=1 and contains(text(),"手机")]/../following-sibling::*[1]//input

    private final String d39 = "通用-部门框-input";
    private final String x39 = get$XQueryInput("部门");
    //label[1=1 and contains(text(),"部门")]/../following-sibling::*[1]//input


    private final String d40 = "通用-FAX框-input";
    private final String x40 = get$XQueryInput("FAX");
    //label[1=1 and contains(text(),"FAX")]/../following-sibling::*[1]//input

    private final String d41 = "通用-邮箱框-input";
    private final String x41 = get$XQueryInput("邮箱");
    //label[1=1 and contains(text(),"邮箱")]/../following-sibling::*[1]//input

    private final String d42 = "通用-客户简称框-input";
    private final String x42 = get$XQueryInput("客户简称");
    //label[1=1 and contains(text(),"客户简称")]/../following-sibling::*[1]//input

    private final String d43 = "通用-职务框-input";
    private final String x43 = get$XQueryInput("职务");
    //label[1=1 and contains(text(),"职务")]/../following-sibling::*[1]//input


    private final String d44 = "通用-座机框-input";
    private final String x44 = get$XQueryInput("座机");
    //label[1=1 and contains(text(),"座机")]/../following-sibling::*[1]//input

    private final String d45 = "通用-创建人框-input";
    private final String x45 = get$XQueryInput("创建人");
    //label[1=1 and contains(text(),"创建人")]/../following-sibling::*[1]//input

    private final String d46 = "通用-办公地址框-input";
    private final String x46 = get$XQueryInput("办公地址");
    //label[1=1 and contains(text(),"办公地址")]/../following-sibling::*[1]//input


    private final String d47 = "通用-国君服务联系人框-input";
    private final String x47 = get$XQueryInput("国君服务联系人");
    //label[1=1 and contains(text(),"国君服务联系人")]/../following-sibling::*[1]//input

    private final String d49 = "通用-材料名称框-input";
    private final String x49 = get$XQueryInput("材料名称");
    //label[1=1 and contains(text(),"材料名称")]/../following-sibling::*[1]//input

    private final String d50 = "通用-材料类型框-div";/////
    private final String x50 = get$XQuerySelectDiv("材料类型");/////
    //label[1=1 and contains(text(),"材料类型")]/../following-sibling::div[1]

    private final String d51 = "通用-所属商机框-input";
    private final String x51 = get$XQueryInput("所属商机");
    //label[1=1 and contains(text(),"所属商机")]/../following-sibling::*[1]//input

    private final String d53 = "通用-联系人框-input";
    private final String x53 = get$XQueryInput("联系人");
    //label[1=1 and contains(text(),"联系人")]/../following-sibling::*[1]//input

    private final String d54 = "通用-签署日期框-input";
    private final String x54 = get$XQueryInput("签署日期");
    //label[1=1 and contains(text(),"签署日期")]/../following-sibling::*[1]//input

    private final String d55 = "通用-合同金额(万元)框-input";
    private final String x55 = get$XQueryInput("合同金额(万元)");
    //label[1=1 and contains(text(),"合同金额(万元)")]/../following-sibling::*[1]//input


    private final String d56 = "通用-关联商机框-input";
    private final String x56 = get$XQueryInput("关联商机");
    //label[1=1 and contains(text(),"合同金额(万元)")]/../following-sibling::*[1]//input

    private final String d57 = "通用-标题框-input";
    private final String x57 = get$XQueryInput("标题");
    //label[1=1 and contains(text(),"标题")]/../following-sibling::*[1]//input


    private final String d58 = "通用-分类框-div";////
    private final String x58 = get$XQuerySelectDiv("分类");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]


    private final String d58Span01 = "通用-分类框-应用案例-span";////
    private final String x58Span01 = get$XSpanByTitle("应用案例");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='应用案例']

    private final String d58Span02 = "通用-分类框-制度公告-span";////
    private final String x58Span02 = get$XSpanByTitle("制度公告");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='制度公告']

    private final String d58Span03 = "通用-分类框-系统介绍-span";////
    private final String x58Span03 = get$XSpanByTitle("系统介绍");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='系统介绍']

    private final String d58Span04 = "通用-分类框-业务学习-span";////
    private final String x58Span04 = get$XSpanByTitle("业务学习");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='业务学习']

    private final String d58Span05 = "通用-分类框-常见问答-span";////
    private final String x58Span05 = get$XSpanByTitle("常见问答");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='常见问答']

    private final String d58Span06 = "通用-分类框-今日必读-span";////
    private final String x58Span06 = get$XSpanByTitle("今日必读");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='今日必读']

    private final String d58Span07 = "通用-分类框-服务产品-span";////
    private final String x58Span07 = get$XSpanByTitle("服务产品");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='服务产品']

    private final String d58Span08 = "通用-分类框-数据服务-span";////
    private final String x58Span08 = get$XSpanByTitle("数据服务");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='数据服务']

    private final String d58Span09 = "通用-分类框-行业分析-span";////
    private final String x58Span09 = get$XSpanByTitle("行业分析");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='行业分析']

    private final String d58Span10 = "通用-分类框-营销平台-span";////
    private final String x58Span10 = get$XSpanByTitle("营销平台");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='营销平台']

    private final String d58Span11 = "通用-分类框-企业机构-span";////
    private final String x58Span11 = get$XSpanByTitle("企业机构");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='企业机构']

    private final String d58Span12 = "通用-分类框-市场动态-span";////
    private final String x58Span12 = get$XSpanByTitle("市场动态");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='市场动态']

    private final String d58Span13 = "通用-分类框-研究分析-span";////
    private final String x58Span13 = get$XSpanByTitle("研究分析");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='研究分析']


    ///-----------------------////

    private final String d3 = "通用-查询按钮-span";
    private final String x3 = "//button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),\"查询\")]";
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"查询")]

    private final String d4 = "通用-重置按钮-span";
    private final String x4 = "//button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),\"重置\")]";
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]

    private final String d5 = "通用-查询条件展开收起按钮-a";
    private final String x5 = "//button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),\"重置\")]/../../a";
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]/../../a

    private final String d6 = "通用-导出按钮-span";
    private final String x6 = "//span[1=1 and contains(text(),\"导出\")]";
    //span[1=1 and contains(text(),"导出")]

    private final String d35 = "通用-新增按钮-span";
    private final String x35 = "//span[1=1 and contains(text(),\"新增\")]";
    //span[1=1 and contains(text(),"新增")]

    private final String d36 = "通用-开通道合按钮-span";
    private final String x36 = "//span[1=1 and contains(text(),\"开通道合\")]";
    //span[1=1 and contains(text(),"开通道合")]

    private final String d52 = "通用-上传证明材料-span";
    private final String x52 = "//span[1=1 and contains(text(),\"上传证明材料\")]";
    //span[1=1 and contains(text(),"上传证明材料")]

    private final String d7 = "通用-报表导出确认按钮-span";
    private final String x7 = "//span[1=1 and contains(text(),\"确认\")]";
    //span[1=1 and contains(text(),"确认")]

    private final String d8 = "通用-报表导出文件名输入框-input";
    private final String x8 = "//div[1=1 and contains(text(),\"文件名\")]/..//input";
    //div[1=1 and contains(text(),"文件名")]/..//input
//////////////////////////////////
    private final String d9 = "通用-表格-table";
    private final String x9 = "//table[1=1 and contains(@class,'ant-table-fixed')]";
    //table[1=1 and contains(@class,'ant-table-fixed')]

    private final String d10 = "通用-表格表体rows-tr";
    private final String x10 = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not (contains(@style,'height'))]";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not (contains(@style,'height'))] //不包含编辑那列,比如客户联系人,具体取决于样式

    private final String d10Action = "通用-表格表体rows-tr-action(编辑,查看...)";
    private final String x10Action = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]

    private final String d10Selected = "通用-表格表体rows-selected-tr";
    private final String x10Selected = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected')]";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected')]

    private final String d10NotSelected = "通用-表格表体rows-not selected-tr";
    private final String x10NotSelected = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected'))]";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected'))]

    private final String d11 = "通用-表格表头row下的th col-th";
    private final String x11 = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[not(@key='selection-column') and not(@key='action')]";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[not(@key='selection-column')]

    private final String d31 = "通用-表格表头-多选框-th";
    private final String x31 = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']


    private final String d12 = "通用-表格下方翻页按钮-上一页-li";
    private final String x12 = "//li[1=1 and contains(@title,'上一页')]";
    //li[1=1 and contains(@title,'上一页')]

    private final String d13 = "通用-表格下方翻页按钮-下一页-li";
    private final String x13 = "//li[1=1 and contains(@title,'下一页')]";
    //li[1=1 and contains(@title,'下一页')]

    private final String d14 = "通用-表格下方翻页按钮-下一页前的按钮,可以看出共多少页-a";
    private final String x14 = "//li[1=1 and contains(@title,'下一页')]/preceding-sibling::li[1]/a";
    //li[1=1 and contains(@title,'下一页')]/preceding-sibling::li[1]/a

    private final String d15 = "通用-表格下方跳页输入框-input";
    private final String x15 = "//div[1=1 and contains(text(),\"跳至\")]/input";
    //div[1=1 and contains(text(),"跳至")]/input

    private final String d16 = "通用-表格下方跳页输入框左边的跳至两个字-div";
    private final String x16 = "//div[1=1 and contains(text(),\"跳至\")]";
    //div[1=1 and contains(text(),"跳至")]

    private final String d17 = "通用-数据加载(转菊花)-span";
    private final String x17 = "//span[1=1 and contains(@class,'ant-spin-dot')]";
    //span[1=1 and contains(@class,'ant-spin-dot')]

    private final String d18 = "通用-条/页-div";
    private final String x18 = "//div[1=1 and contains(@title,'条/页')]";
    //div[1=1 and contains(@title,'条/页')]

    private final String d18L5 = "通用-条/页-5 条/页-li";
    private final String x18L5 = "//li[1=1 and text()='5 条/页' ]";
    //li[1=1 and text()='5 条/页' ]

    private final String d18L10 = "通用-条/页-10 条/页-li";
    private final String x18L10 = "//li[1=1 and text()='10 条/页' ]";
    //li[1=1 and text()='10 条/页' ]

    private final String d18L20 = "通用-条/页-20 条/页-li";
    private final String x18L20 = "//li[1=1 and text()='20 条/页' ]";
    //li[1=1 and text()='20 条/页' ]

    private final String d18L30 = "通用-条/页-30 条/页-li";
    private final String x18L30 = "//li[1=1 and text()='30 条/页' ]";
    //li[1=1 and text()='30 条/页' ]

    private final String d28 = "通用-表头多选框-input";
    private final String x28 = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']//input";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']//input

    /////////////////////////////////
    private final String d29 = "通用-确定按钮-span";
    private final String x29 = "//span[1=1 and contains(text(),\"确 定\")]";
    //span[1=1 and contains(text(),"确 定")]

    private final String d30 = "通用-关闭按钮-span";
    private final String x30 = "//span[1=1 and contains(text(),\"关 闭\")]";
    //span[1=1 and contains(text(),"关 闭")]

    private final String d32 = "通用-输入查询框-input";
    private final String x32 = "//input[1=1 and contains(@placeholder,'输入查询')]";
    //input[1=1 and contains(@placeholder,'输入查询')]

    private final String d33 = "通用-用户名查询框-input";
    private final String x33 = "//input[1=1 and contains(@placeholder,'输入用户名')]";
    //input[1=1 and contains(@placeholder,'输入用户名')]


    ////////////////////////
    private final String d48 = "通用-XXXX-添加/修改-成功系统提示信息";
    private final String x48 = "//div[@class='ant-message-notice-content']";


    public String get$X10Sibling(String num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][30]
        String xpath = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][";
        xpath = xpath + num;
        xpath = xpath + "]";

        return xpath;
    }

    public String get$D10Sibling(String num) {
        //通用-表格表体-第1行
        String description = "通用-表格表体-第";
        description = description + num;
        description = description + "行";

        return description;
    }


    public String get$X10Sibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(@style)][30]
        String xpath = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(@style)]";
        if (num > 0) {
            xpath = xpath + "[" + num;
        } else if (num == -1) {
            xpath = xpath + "[last()";
        } else if (num == 0) {
            xpath = xpath;
        } else {
            return "error, the num must be positive or equals -1";
        }
        xpath = xpath + "]";

        return xpath;
    }

    public String get$D10Sibling(int num) {
        //通用-表格表体-第1行
        String desc = "通用-表格表体-第";
        return get$D(num, desc);
    }


    public String get$X10ActionSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style][30]
        String xpath = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]";
        if (num > 0) {
            xpath = xpath + "[" + num;
        } else if (num == -1) {
            xpath = xpath + "[last()";
        } else if (num == 0) {
            xpath = xpath;
        } else {
            return "error, the num must be positive or equals -1";
        }
        xpath = xpath + "]//a";

        return xpath;
    }

    public String get$D10ActionSibling(int num) {
        //通用-表格表体-第1行
        String desc = "通用-表格表体-action-第";
        return get$D(num, desc);
    }


    public String get$XQueryInput(String label) {
        //label[1=1 and contains(text(),"客户柜台代码")]/../following-sibling::*[1]//input
        String xpath = "//label[1=1 and contains(text(),\"";
        xpath = xpath + label;
        xpath = xpath + "\")]/../following-sibling::*[1]//input";
        return xpath;
    }


    public String get$DQueryInput(String label) {
        //通用-OA账号-查询框
        String description = "通用-";
        description = description + label;
        description = description + "-查询框";

        return description;
    }


    public String get$XQuerySelectDiv(String label) {
        //label[1=1 and contains(text(),"开发类型")]/../following-sibling::div[1]
        String xpath = "//label[1=1 and contains(text(),\"";
        xpath = xpath + label;
        xpath = xpath + "\")]/../following-sibling::div[1]";
        return xpath;
    }


    public String get$DQuerySelectDiv(String label) {
        //通用-表格表体-第1行
        String description = "通用-";
        description = description + label;
        description = description + "-选择";

        return description;
    }


    public String get$XCheckbox(String num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][1]//input[1=1 and contains(@type,'checkbox') and contains(@class,'ant-checkbox-input')]
        String xpath = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][";
        xpath = xpath + num;
        xpath = xpath + "]//input[1=1 and contains(@type,'checkbox') and contains(@class,'ant-checkbox-input')]";
        return xpath;
    }

    public String get$DCheckbox(String num) {
        //通用-表格表体-第1行-选择框
        String description = "通用-表格表体第";
        description = description + num;
        description = description + "行-选择框(选中有钩子的那个)";

        return description;
    }

    public String get$XLi(String label) {
        //li[1=1 and contains(text(),"个人")]
        String xpath = "//li[1=1 and contains(text(),\"";
        xpath = xpath + label;
        xpath = xpath + "\")]";
        return xpath;
    }


    public String get$XLiSpan(String label) {
        //li/span[1=1 and @title='专项战略合作协议' ]
        String xpath = "//li/span[1=1 and @title='";
        xpath = xpath + label;
        xpath = xpath + "']";
        return xpath;
    }


    public String get$DLi(String label) {
        //通用-OA账号-li
        String description = "通用-";
        description = description + label;
        description = description + "-li";

        return description;
    }


    public String get$XSpan(String text) {
        //span[1=1 and contains(text(),"重置")]
        String xpath = "//span[1=1 and contains(text(),\"";
        xpath = xpath + text;
        xpath = xpath + "\")]";
        return xpath;
    }


    public String get$XSpanByTitle(String text) {
        //span[1=1 and @title='今日必读']
        String xpath = x58 + "//span[1=1 and @title='";
        xpath = xpath + text;
        xpath = xpath + "')]";
        return xpath;
    }


    public String get$DSpan(String text) {
        //通用-表格表体-第1行-选择框
        String description = "通用-text是";
        description = description + text;
        description = description + "-span)";

        return description;
    }

    public String get$D58Span(int num) {
        //通用-分类下拉候选项-第num行
        String desc = "//通用-分类框-下拉候选项";
        return get$D(num, desc);

    }

    public String get$X58Span(int num) {
        //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[num+2]
        String xpath = x58;
        if (num > 0) {
            int n = num + 2;
            xpath = xpath + "//span[" + n + "]";
        } else if (num == 0) {
            xpath = xpath + "//span";
        } else if (num == -1) {
            xpath = xpath + "//span[last()]";
        } else {
            xpath = "error worng num input for xpath";
        }
        return xpath;
    }

    public String get$D(int num, String desc) {
        String description = desc;
        if (num > 0) {
            description = description + num;
        } else if (num == -1) {
            description = description + "最后一";
        } else if (num == 0) {
            description = description + " all";
        } else {
            return "error, the num must be positive or equals -1";
        }
        description = description + "行";

        return description;

    }


//    public String getXpath(String description) {
//        String str = "";
//        switch (description) {
//            case d1:
//                str = x1;
//                break;
//            case d2:
//                str = x2;
//                break;
//            case d3:
//                str = x3;
//                break;
//            case d4:
//                str = x4;
//                break;
//            case d5:
//                str = x5;
//                break;
//            case d6:
//                str = x6;
//                break;
//            case d7:
//                str = x7;
//                break;
//            case d8:
//                str = x8;
//                break;
//            case d9:
//                str = x9;
//                break;
//            case d10:
//                str = x10;
//                break;
//            case d11:
//                str = x11;
//                break;
//            case d12:
//                str = x12;
//                break;
//            case d13:
//                str = x13;
//                break;
//            case d14:
//                str = x14;
//                break;
//            case d15:
//                str = x15;
//                break;
//            case d16:
//                str = x16;
//                break;
//            case d17:
//                str = x17;
//                break;
//            case d18:
//                str = x18;
//                break;
//            case d19:
//                str = x19;
//                break;
//            case d20:
//                str = x20;
//                break;
//            case d21:
//                str = x21;
//                break;
//            case d22:
//                str = x22;
//                break;
//            case d23:
//                str = x23;
//                break;
//            case d24:
//                str = x24;
//                break;
//            case d25:
//                str = x25;
//                break;
//            case d26:
//                str = x26;
//                break;
//            case d27:
//                str = x27;
//                break;
//            case d28:
//                str = x28;
//                break;
//            case d29:
//                str = x29;
//                break;
//            case d30:
//                str = x30;
//                break;
//            case d18l5:
//                str = x18l5;
//                break;
//            case d18l10:
//                str = x18l10;
//                break;
//            case d18l20:
//                str = x18l20;
//                break;
//            case d18l30:
//                str = x18l30;
//                break;
//            case d10Selected:
//                str = x10Selected;
//                break;
//            case d10NotSelected:
//                str = x10NotSelected;
//                break;
//            case d31:
//                str = x31;
//                break;
//            case d32:
//                str = x32;
//                break;
//            case d33:
//                str = x33;
//                break;
//            case d34:
//                str = x34;
//                break;
//            case d35:
//                str = x35;
//                break;
//            case d36:
//                str = x36;
//                break;
//            case d37:
//                str = x37;
//                break;
//            case d38:
//                str = x38;
//                break;
//            case d39:
//                str = x39;
//                break;
//            case d40:
//                str = x40;
//                break;
//            case d41:
//                str = x41;
//                break;
//            case d42:
//                str = x42;
//                break;
//            case d43:
//                str = x43;
//                break;
//            case d44:
//                str = x44;
//                break;
//            case d45:
//                str = x45;
//                break;
//            case d46:
//                str = x46;
//                break;
//            case d47:
//                str = x47;
//                break;
//            case d48:
//                str = x48;
//                break;
//            case d10Action:
//                str = x10Action;
//                break;
//            case d49:
//                str = x49;
//                break;
//            case d50:
//                str = x50;
//                break;
//            case d51:
//                str = x51;
//                break;
//            case d52:
//                str = x52;
//                break;
//            case d53:
//                str = x53;
//                break;
//            case d54:
//                str = x54;
//                break;
//            case d55:
//                str = x55;
//                break;
//            case d56:
//                str = x56;
//                break;
//            case d57:
//                str = x57;
//                break;
//            case d58:
//                str = x58;
//                break;
//            case d58Span01:
//                str = x58Span01;
//                break;
//            case d58Span02:
//                str = x58Span02;
//                break;
//            case d58Span03:
//                str = x58Span03;
//                break;
//            case d58Span04:
//                str = x58Span04;
//                break;
//            case d58Span05:
//                str = x58Span05;
//                break;
//            case d58Span06:
//                str = x58Span06;
//                break;
//            case d58Span07:
//                str = x58Span07;
//                break;
//            case d58Span08:
//                str = x58Span08;
//                break;
//            case d58Span09:
//                str = x58Span09;
//                break;
//            case d58Span10:
//                str = x58Span10;
//                break;
//            case d58Span11:
//                str = x58Span11;
//                break;
//            case d58Span12:
//                str = x58Span12;
//                break;
//            case d58Span13:
//                str = x58Span13;
//                break;
//        }
//        return str;
//
//    }


}
