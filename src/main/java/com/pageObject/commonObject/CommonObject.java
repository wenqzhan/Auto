package com.pageObject.commonObject;

import com.utils.json.JsonObject;
import lombok.Data;

@Data
public class CommonObject extends JsonObject {

    private final String search = "/following-sibling::*//i[1=1 and contains(@class,'')]";

    private final String cross = "//i[1=1 and contains(@class,'close-circle') or contains(@class,'anticon-close')]";

    private final String arrow = "//i[1=1 and contains(@class,'arrow')]";

    private final String radio = "/preceding-sibling::span";


    private final String d1 = "通用-OA账号框-input";
    private final String x1 = get$XInput("OA账号");
    //label[1=1 and contains(text(),"OA账号")]/../following-sibling::*[1]//input

    private final String d2 = "通用-客户名称框-input";
    private final String x2 = get$XInput("客户名称");
    //label[1=1 and contains(text(),"客户名称")]/../following-sibling::*[1]//input

    private final String d19 = "通用-客户柜台代码框-input";
    private final String x19 = get$XInput("客户柜台代码");
    //label[1=1 and contains(text(),"客户柜台代码")]/../following-sibling::*[1]//input

    private final String d20 = "通用-账户名称框-input";
    private final String x20 = get$XInput("账户名称");
    //label[1=1 and contains(text(),"账户名称")]/../following-sibling::*[1]//input

    private final String d21 = "通用-资金账号框-input";
    private final String x21 = get$XInput("资金账号");
    //label[1=1 and contains(text(),"资金账号")]/../following-sibling::*[1]//input

    private final String d22 = "通用-账户类型框-div";/////
    private final String x22 = get$XDiv("账户类型");/////
    //label[1=1 and contains(text(),"账户类型")]/../following-sibling::div[1]

    private final String d23 = "通用-归属机构框-input";
    private final String x23 = get$XInput("归属机构");
    //label[1=1 and contains(text(),"归属机构")]/../following-sibling::*[1]//input

    private final String d24 = "通用-开发类型框-div";/////
    private final String x24 = get$XDiv("开发类型");/////
    //label[1=1 and contains(text(),"开发类型")]/../following-sibling::div[1]

    private final String d25 = "通用-经纪业务关系类型框-div";////
    private final String x25 = get$XDiv("经纪业务关系类型");////
    //label[1=1 and contains(text(),"经纪业务关系类型")]/../following-sibling::div[1]

    private final String d26 = "通用-登记人框-input";
    private final String x26 = get$XInput("登记人");
    //label[1=1 and contains(text(),"登记人")]/../following-sibling::*[1]//input

    private final String d27 = "通用-客户经理框-input";
    private final String x27 = get$XInput("客户经理");
    //label[1=1 and contains(text(),"客户经理")]/../following-sibling::*[1]//input

    private final String d34 = "通用-业务条线框-input";
    private final String x34 = get$XInput("业务条线");
    //label[1=1 and contains(text(),"业务条线")]/../following-sibling::*[1]//input


    private final String d37 = "通用-联系人姓名框-input";
    private final String x37 = get$XInput("联系人姓名");
    //label[1=1 and contains(text(),"联系人姓名")]/../following-sibling::*[1]//input

    private final String d38 = "通用-手机框-input";
    private final String x38 = get$XInput("手机");
    //label[1=1 and contains(text(),"手机")]/../following-sibling::*[1]//input

    private final String d39 = "通用-部门框-input";
    private final String x39 = get$XInput("部门");
    //label[1=1 and contains(text(),"部门")]/../following-sibling::*[1]//input


    private final String d40 = "通用-FAX框-input";
    private final String x40 = get$XInput("FAX");
    //label[1=1 and contains(text(),"FAX")]/../following-sibling::*[1]//input

    private final String d41 = "通用-邮箱框-input";
    private final String x41 = get$XInput("邮箱");
    //label[1=1 and contains(text(),"邮箱")]/../following-sibling::*[1]//input

    private final String d42 = "通用-客户简称框-input";
    private final String x42 = get$XInput("客户简称");
    //label[1=1 and contains(text(),"客户简称")]/../following-sibling::*[1]//input

    private final String d43 = "通用-职务框-input";
    private final String x43 = get$XInput("职务");
    //label[1=1 and contains(text(),"职务")]/../following-sibling::*[1]//input


    private final String d44 = "通用-座机框-input";
    private final String x44 = get$XInput("座机");
    //label[1=1 and contains(text(),"座机")]/../following-sibling::*[1]//input

    private final String d45 = "通用-创建人框-input";
    private final String x45 = get$XInput("创建人");
    //label[1=1 and contains(text(),"创建人")]/../following-sibling::*[1]//input

    private final String d46 = "通用-办公地址框-input";
    private final String x46 = get$XInput("办公地址");
    //label[1=1 and contains(text(),"办公地址")]/../following-sibling::*[1]//input


    private final String d47 = "通用-国君服务联系人框-input";
    private final String x47 = get$XInput("国君服务联系人");
    //label[1=1 and contains(text(),"国君服务联系人")]/../following-sibling::*[1]//input

    private final String d49 = "通用-材料名称框-input";
    private final String x49 = get$XInput("材料名称");
    //label[1=1 and contains(text(),"材料名称")]/../following-sibling::*[1]//input

    private final String d50 = "通用-材料类型框-div";/////
    private final String x50 = get$XDiv("材料类型");/////
    //label[1=1 and contains(text(),"材料类型")]/../following-sibling::div[1]

    private final String d51 = "通用-所属商机框-input";
    private final String x51 = get$XInput("所属商机");
    //label[1=1 and contains(text(),"所属商机")]/../following-sibling::*[1]//input

    private final String d53 = "通用-联系人框-input";
    private final String x53 = get$XInput("联系人");
    //label[1=1 and contains(text(),"联系人")]/../following-sibling::*[1]//input

    private final String d54 = "通用-签署日期框-input";
    private final String x54 = get$XInput("签署日期");
    //label[1=1 and contains(text(),"签署日期")]/../following-sibling::*[1]//input

    private final String d55 = "通用-合同金额(万元)框-input";
    private final String x55 = get$XInput("合同金额(万元)");
    //label[1=1 and contains(text(),"合同金额(万元)")]/../following-sibling::*[1]//input


    private final String d56 = "通用-关联商机框-input";
    private final String x56 = get$XInput("关联商机");
    //label[1=1 and contains(text(),"合同金额(万元)")]/../following-sibling::*[1]//input

    private final String d57 = "通用-标题框-input";
    private final String x57 = get$XInput("标题");
    //label[1=1 and contains(text(),"标题")]/../following-sibling::*[1]//input


    private final String d58 = "通用-分类框-div";////
    private final String x58 = get$XDiv("分类");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]

    private final String d58Rendered = "通用-分类框-div-rendered-span";
    private final String x58Rendered = x58 + "//div[contains(@class,\"rendered\")]//span";


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
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not (contains(@style,'height'))]
    // 不包含编辑那列,比如客户联系人,具体取决于样式

    private final String d10Action = "通用-表格表体rows-tr-action(编辑,查看...)";
    private final String x10Action = "//table[1=1 and contains(@class,'ant-table-fixed')  and @style]//tr[@data-row-key]";
    //table[1=1 and contains(@class,'ant-table-fixed') and @style]//tr[@data-row-key]

    private final String d10ActionDetails = "通用-表格表体rows-tr-action(详情,更多...)-详情-a";
    private final String x10ActionDetails = x10Action + "//a[text()='详情']";
    //table[1=1 and contains(@class,'ant-table-fixed')  and @style]//tr[@data-row-key]//a[text()='详情']

    private final String d10ActionEdits = "通用-表格表体rows-tr-action(详情,更多...)-编辑-a";
    private final String x10ActionEdits = x10Action + "//a[text()='编辑']";
    //table[1=1 and contains(@class,'ant-table-fixed')  and @style]//tr[@data-row-key]//a[text()='编辑']

    private final String d10ActionMore = "通用-表格表体rows-tr-action(详情,更多...)-更多-a";
    //"信息发布-表格表体rows-tr-action(详情,更多...)-更多-a";
    private final String x10ActionMore = x10ActionDetails + "/following-sibling::a[1]";
    //table[1=1 and contains(@class,'ant-table-fixed')  and @style]//tr[@data-row-key]//a[text()='详情']/following-sibling::a[1]

    private final String d10ActionMoreEdits = "通用-表格表体rows-selected-tr";
    ;
    // "信息发布-表格表体rows-selected-tr";
    private final String x10ActionMoreEdits = "//a[text()='编辑']";
    //a[text()='编辑']这个需要进一步处理,定位最后一个


    private final String d10ActionMoreDeletes = "通用-表格表体rows-selected-tr";
    // "信息发布-表格表体rows-selected-tr";
    private final String x10ActionMoreDeletes = "//a[text()='删除']";
    //a[text()='删除'] 这个需要进一步处理,定位最后一个

    private final String d10Selected = "通用-表格表体rows-selected-tr";
    private final String x10Selected = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected') and not(@style)]";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected') and not(@style)]

    private final String d10NotSelected = "通用-表格表体rows-not selected-tr";
    private final String x10NotSelected = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected')) and not(@style)]";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected')) and not(@style)]

    private final String d11 = "通用-表格表头(可能有多表头)-tr";
    private final String x11 = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]

    private final String d11Tmp = "临时";
    private final String x11Tmp = "//div[contains(@class,'-active')]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[not(@key='selection-column') and not(@key='action')]/..";

    private final String d11Tr1 = "通用-表格表头row下的tr[1]/th col-th";
    private final String x11Tr1 = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)][1]//th[not(@key='selection-column') and not(@key='action')]";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)][1]//th[not(@key='selection-column') and not(@key='action')]

    private final String d11Tr2 = "通用-表格表头row下的tr[2]/th col-th";
    private final String x11Tr2 = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)][2]//th[not(@key='selection-column') and not(@key='action')]";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)][1]//th[not(@key='selection-column') and not(@key='action')]


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
    private final String x29 = get$XSpan("确 定");
    //span[1=1 and contains(text(),"确 定")]

    private final String d30 = "通用-关闭按钮-span";
    private final String x30 = get$XSpan("关 闭");
    //span[1=1 and contains(text(),"关 闭")]

    private final String d59 = "通用-取消-span";
    private final String x59 = get$XSpan("取 消");
    //span[1=1 and contains(text(),"关 闭")]

    private final String d32 = "通用-输入查询框-input";
    private final String x32 = "//input[1=1 and contains(@placeholder,'输入查询')]";
    //input[1=1 and contains(@placeholder,'输入查询')]

    private final String d33 = "通用-用户名查询框-input";
    private final String x33 = "//input[1=1 and contains(@placeholder,'输入用户名')]";
    //input[1=1 and contains(@placeholder,'输入用户名')]


    private final String d60 = "通用-保存按钮-span";
    private final String x60 = get$XSpan("保存");
    //span[1=1 and contains(text(),"保存")]

    private final String d61 = "通用-预览按钮-span";
    private final String x61 = get$XSpan("预览");
    //span[1=1 and contains(text(),"预览")]

    private final String d62 = "通用-返回按钮-span";
    private final String x62 = get$XSpan("返回");
    //span[1=1 and contains(text(),"返回")]

    ////////////////////////
    private final String d81Final = "通用-XXXX-添加/修改-成功系统提示信息(有绿钩子的)";
    private final String x81Final = "//div[contains(@class,\"ant-message-success\")]";

    private final String d48Final = "通用-XXXX-添加/修改-成功系统提示信息";
    private final String x48Final = "//div[@class='ant-message-notice-success']";

    private final String d79Final = "通用-XXXX-添加/修改-警告系统提示信息";
    private final String x79Final = "//div[@class='ant-message-notice-warning']";

    private final String d80Final = "通用-XXXX-添加/修改-XX系统提示信息";
    private final String x80Final = "//div[@class='ant-message-notice-content']/div";
    ////////////////////////////

    private final String d63 = "通用-附件权限-查看radio-span";
    //通用-附件权限-查看radio-span
    private final String x63 = get$XRadio("附件权限", "查看");
    //label[1=1 and contains(@title,"附件权限")]/../following-sibling::*[1]//span[text()='查看']

    private final String d63RadioSpan = d63 + "-小圈圈";
    //通用-附件权限-查看radio-span-小圈圈
    private final String x63RadioSpan = getRadio(x63);
    //label[1=1 and contains(@title,"附件权限")]/../following-sibling::*[1]//span[text()='查看']/preceding-sibling::span


    private final String d64 = "通用-附件权限-查看&下载radio-span";
    //通用-附件权限-查看&下载radio-span
    private final String x64 = get$XRadio("附件权限", "查看&下载");
    //label[1=1 and contains(@title,"附件权限")]/../following-sibling::*[1]//span[text()='查看&下载']


    private final String d64RadioSpan = d64 + "-小圈圈";
    //通用-附件权限-看&下载radio-span-小圈圈
    private final String x64RadioSpan = getRadio(x64);
    //label[1=1 and contains(@title,"附件权限")]/../following-sibling::*[1]//span[text()='看&下载']/preceding-sibling::span


    private final String d65 = "通用-水印-有水印radio-span";
    //通用-水印-有水印radio-span
    private final String x65 = get$XRadio("水印", "有水印");
    //label[1=1 and contains(@title,"水印")]/../following-sibling::*[1]//span[text()='有水印']

    private final String d65RadioSpan = d65 + "-小圈圈";
    //通用-附件权限-有水印radio-span-小圈圈
    private final String x65RadioSpan = getRadio(x65);
    //label[1=1 and contains(@title,"水印")]/../following-sibling::*[1]//span[text()='有水印']/preceding-sibling::span

    private final String d66 = "通用-水印-无水印radio-span";
    //通用-水印-无水印radio-span
    private final String x66 = get$XRadio("水印", "无水印");
    //label[1=1 and contains(@title,"水印")]/../following-sibling::*[1]//span[text()='无水印']

    private final String d66RadioSpan = d66 + "-小圈圈";
    //通用-附件权限-无水印radio-span-小圈圈
    private final String x66RadioSpan = getRadio(x66);
    //label[1=1 and contains(@title,"水印")]/../following-sibling::*[1]//span[text()='无水印']/preceding-sibling::span


    private final String d67 = "通用-标题输入框-input";
    //通用-标题输入框-input
    private final String x67 = get$XInput("标题");
    //label[1=1 and text()='标题']/../following-sibling::*[1]//input

    private final String d68 = "通用-正文摘要框-input";
    //通用-正文摘要框-input
    private final String x68 = get$XInput("正文摘要");
    //label[1=1 and text()='正文摘要']/../following-sibling::*[1]//input

    private final String d69 = "通用-标题图片框-input";
    //通用-标题图片框-input
    private final String x69 = get$XInput("标题图片");
    //label[1=1 and text()='标题图片']/../following-sibling::*[1]//input

    private final String d69UploadFileStatus = d69 + "-上传status-div";
    //通用-标题图片框-input-上传status-div
    private final String x69UploadFileStatus = x69 + "/../../following-sibling::div";
    //label[1=1 and text()='标题图片']/../following-sibling::*[1]//input/../../following-sibling::div

    private final String d69UploadFileCross = "//通用-标题图片框-input-上传-删除-i";
    private final String x69UploadFileCross = x69UploadFileStatus + getCross();
    //label[1=1 and text()='标题图片']/../following-sibling::*[1]//input/../../following-sibling::div//i[1=1 and contains(@class,'close-circle') or contains(@class,'anticon-close')]


    private final String d69UploadFile = d69UploadFileStatus + "-文件-a";
    //通用-标题图片框-input-上传status-div-文件-span
    private final String x69UploadFile = x69UploadFileStatus + "//a[@title]";
    //label[1=1 and text()='标题图片']/../following-sibling::*[1]//input/../../following-sibling::div//span[@title]

    private final String d70 = "通用-摘要框-textarea";
    //通用-摘要框-textarea
    private final String x70 = get$XTextarea("摘要");
    //label[1=1 and text()='摘要']/../following-sibling::*[1]//textarea

    private final String d71 = "通用-发布人框-input";
    //通用-发布人框-input
    private final String x71 = get$XInput("发布人");
    //label[1=1 and text()='发布人']/../following-sibling::*[1]//input

    //下面是58,信息发布编辑页面


    private final String d72 = "通用-显示设置-下线隐藏radio-span";
    //通用-显示设置-下线隐藏radio-span
    private final String x72 = get$XRadio("显示设置", "下线隐藏");
    //label[1=1 and contains(@title,"显示设置")]/../following-sibling::*[1]//span[text()='下线隐藏']

    private final String d72RadioSpan = d72 + "-小圈圈";
    //通用-附件权限-下线隐藏radio-span-小圈圈
    private final String x72RadioSpan = getRadio(x72);
    //label[1=1 and contains(@title,"显示设置")]/../following-sibling::*[1]//span[text()='下线隐藏']/preceding-sibling::span


    private final String d73 = "通用-显示设置-公开展示radio-span";
    //通用-显示设置-公开展示radio-span
    private final String x73 = get$XRadio("显示设置", "公开展示");
    //label[1=1 and contains(@title,"显示设置")]/../following-sibling::*[1]//span[text()='公开展示']

    private final String d73RadioSpan = d73 + "-小圈圈";
    //通用-附件权限-下线隐藏radio-span-小圈圈
    private final String x73RadioSpan = getRadio(x73);
    //label[1=1 and contains(@title,"显示设置")]/../following-sibling::*[1]//span[text()='公开展示']/preceding-sibling::span

    private final String d74 = "通用-置顶顺序框-input";
    //通用-置顶顺序框-input
    private final String x74 = get$XInput("置顶顺序");
    //label[1=1 and text()='置顶顺序']/../following-sibling::*[1]//input

    private final String d75 = "通用-推送今日必读-是radio-span";
    //通用-推送今日必读-是radio-span
    private final String x75 = get$XRadio("推送今日必读", "是");
    //label[1=1 and contains(@title,"推送今日必读")]/../following-sibling::*[1]//span[text()='是']

    private final String d75RadioSpan = d75 + "-小圈圈";
    //通用-附件权限-下是radio-span-小圈圈
    private final String x75RadioSpan = getRadio(x75);
    //label[1=1 and contains(@title,"推送今日必读")]/../following-sibling::*[1]//span[text()='是']/preceding-sibling::span

    private final String d76 = "通用-推送今日必读-否radio-span";
    //通用-推送今日必读-否radio-span
    private final String x76 = get$XRadio("推送今日必读", "否");
    //label[1=1 and contains(@title,"推送今日必读")]/../following-sibling::*[1]//span[text()='否']

    private final String d76RadioSpan = d76 + "-小圈圈";
    //通用-附件权限-下线隐藏radio-span-小圈圈
    private final String x76RadioSpan = getRadio(x76);
    //label[1=1 and contains(@title,"推送今日必读")]/../following-sibling::*[1]//span[text()='否']/preceding-sibling::span

    private final String d77 = "通用-外部链接框-input";
    //通用-外部链接框-input
    private final String x77 = get$XInput("外部链接");
    //label[1=1 and text()='外部链接']/../following-sibling::*[1]//input

    private final String d78 = "通用-内容框-iframe";
    //通用-内容框-input
    private final String x78 = get$XIframe("内容");
    //label[1=1 and text()='内容']/../following-sibling::*[1]//iframe

    private final String d78IframeBody = "通用-内容框-iframe里面的-body";

    private final String x78IframeBody = "//body";

/////////////////////////////////////////////////
    //2 客户名称

    private final String d82 = "通用-是否核心客户-是radio-span";
    //通用-是否核心客户-是radio-span
    private final String x82 = get$XRadio("是否核心客户", "是");
    //label[1=1 and contains(@title,"是否核心客户")]/../following-sibling::*[1]//span[text()='是']

    private final String d82RadioSpan = d82 + "-小圈圈";
    //通用-附件权限-下线隐藏radio-span-小圈圈
    private final String x82RadioSpan = getRadio(x82);
    //label[1=1 and contains(@title,"是否核心客户")]/../following-sibling::*[1]//span[text()='是']/preceding-sibling::span

    private final String d83 = "通用-是否核心客户-否radio-span";
    //通用-是否核心客户-否radio-span
    private final String x83 = get$XRadio("是否核心客户", "否");
    //label[1=1 and contains(@title,"推送今日必读")]/../following-sibling::*[1]//span[text()='否']

    private final String d83RadioSpan = d83 + "-小圈圈";
    //通用-附件权限-下线隐藏radio-span-小圈圈
    private final String x83RadioSpan = getRadio(x83);
    //label[1=1 and contains(@title,"是否核心客户")]/../following-sibling::*[1]//span[text()='否']/preceding-sibling::span

    private final String d84 = "通用-研究服务等级-div";/////
    private final String x84 = get$XDiv("研究服务等级");/////
    //label[1=1 and contains(text(),"研究服务等级")]/../following-sibling::div[1]

    private final String d85 = "通用-研究服务签约状态-div";/////
    private final String x85 = get$XDiv("研究服务签约状态");/////
    //label[1=1 and contains(text(),"研究服务签约状态")]/../following-sibling::div[1]

    private final String d86 = "通用-研究服务到期日-input";
    private final String x86 = get$XInput("研究服务到期日");
    //label[1=1 and contains(text(),"研究服务到期日")]/../following-sibling::*[1]//input

    //27 客户经理

    private final String d87 = "通用-所属团队-input";
    private final String x87 = get$XInput("所属团队");
    //label[1=1 and contains(text(),"所属团队")]/../following-sibling::*[1]//input

    private final String d87Search = "通用-所属团队-input-serach-i";
    private final String x87Search = getSearch(x87);
    //label[1=1 and contains(text(),"所属团队")]/../following-sibling::*[1]//input/following-sibling::*//i[1=1 and contains(@class,'')]

    private final String d88 = "通用-所属团队-input";
    private final String x88 = get$XInput("统一社会信用代码");
    //label[1=1 and contains(text(),"统一社会信用代码")]/../following-sibling::*[1]//input

    private final String d89 = "通用-客户级别-div";/////
    private final String x89 = get$XDiv("客户级别");/////
    //label[1=1 and contains(text(),"客户级别")]/../following-sibling::div[1]

    private final String d90 = "通用-客户类型-input";
    private final String x90 = get$XInput("客户类型");
    //label[1=1 and contains(text(),"客户类型")]/../following-sibling::*[1]//input

    private final String d90Search = "通用-客户类型-input-serach-i";
    private final String x90Search = getSearch(x90);
    //label[1=1 and contains(text(),"客户类型")]/../following-sibling::*[1]//input/following-sibling::*//i[1=1 and contains(@class,'')]

    private final String d91 = "通用-派点类型-收入派点-radio-span";
    //通用-派点类型-收入派点-radio-span
    private final String x91 = get$XRadio("派点类型", "收入派点");
    //label[1=1 and contains(@title,"派点类型")]/../following-sibling::*[1]//span[text()='收入派点']

    private final String d91RadioSpan = d91 + "-小圈圈";
    //通用-派点类型-收入派点-radio-span-小圈圈
    private final String x91RadioSpan = getRadio(x91);
    //label[1=1 and contains(@title,"派点类型")]/../following-sibling::*[1]//span[text()='收入派点']/preceding-sibling::span

    private final String d92 = "通用-派点类型-战略派点-radio-span";
    //通用-派点类型-战略派点-radio-span
    private final String x92 = get$XRadio("派点类型", "战略派点");
    //label[1=1 and contains(@title,"派点类型")]/../following-sibling::*[1]//span[text()='战略派点']

    private final String d92RadioSpan = d92 + "-小圈圈";
    //通用-派点类型-战略派点-radio-span-小圈圈
    private final String x92RadioSpan = getRadio(x92);
    //label[1=1 and contains(@title,"派点类型")]/../following-sibling::*[1]//span[text()='战略派点']/preceding-sibling::span

    private final String d93 = "通用-派点权重-input";
    private final String x93 = get$XInput("派点权重");
    //label[1=1 and contains(text(),"派点权重")]/../following-sibling::*[1]//input

    private final String d94 = "通用-研究服务客户类型-研究服务客户-radio-span";
    //通用-研究服务客户类型-研究服务客户-radio-span
    private final String x94 = get$XRadio("研究服务客户类型", "研究服务客户");
    //label[1=1 and contains(@title,"研究服务客户类型")]/../following-sibling::*[1]//span[text()='研究服务客户']

    private final String d94RadioSpan = d94 + "-小圈圈";
    //通用-研究服务客户类型-研究服务客户-radio-span-小圈圈
    private final String x94RadioSpan = getRadio(x94);
    //label[1=1 and contains(@title,"研究服务客户类型")]/../following-sibling::*[1]//span[text()='研究服务客户']/preceding-sibling::span

    private final String d95 = "通用-研究服务客户类型-非研究服务客户-radio-span";
    //通用-研究服务客户类型-非研究服务客户-radio-span
    private final String x95 = get$XRadio("研究服务客户类型", "非研究服务客户");
    //label[1=1 and contains(@title,"研究服务客户类型")]/../following-sibling::*[1]//span[text()='非研究服务客户']

    private final String d95RadioSpan = d95 + "-小圈圈";
    //通用-研究服务客户类型-非研究服务客户-radio-span-小圈圈
    private final String x95RadioSpan = getRadio(x95);
    //label[1=1 and contains(@title,"研究服务客户类型")]/../following-sibling::*[1]//span[text()='非研究服务客户']/preceding-sibling::span

    private final String d96 = "通用-研究服务客户类型-暂停服务-radio-span";
    //通用-研究服务客户类型-暂停服务-radio-span
    private final String x96 = get$XRadio("研究服务客户类型", "暂停服务");
    //label[1=1 and contains(@title,"研究服务客户类型")]/../following-sibling::*[1]//span[text()='暂停服务']

    private final String d96RadioSpan = d96 + "-小圈圈";
    //通用-研究服务客户类型-暂停服务-radio-span-小圈圈
    private final String x96RadioSpan = getRadio(x96);
    //label[1=1 and contains(@title,"研究服务客户类型")]/../following-sibling::*[1]//span[text()='暂停服务']/preceding-sibling::span

    private final String d97 = "通用-签约初审准入-是-radio-span";
    //通用-签约初审准入-是-radio-span
    private final String x97 = get$XRadio("签约初审准入", "是");
    //label[1=1 and contains(@title,"签约初审准入")]/../following-sibling::*[1]//span[text()='是']

    private final String d97RadioSpan = d97 + "-小圈圈";
    //通用-签约初审准入-是-radio-span-小圈圈
    private final String x97RadioSpan = getRadio(x97);
    //label[1=1 and contains(@title,"签约初审准入")]/../following-sibling::*[1]//span[text()='是']/preceding-sibling::span

    private final String d98 = "通用-签约初审准入-否-radio-span";
    //通用-签约初审准入-否-radio-span
    private final String x98 = get$XRadio("签约初审准入", "否");
    //label[1=1 and contains(@title,"签约初审准入")]/../following-sibling::*[1]//span[text()='否']

    private final String d98RadioSpan = d98 + "-小圈圈";
    //通用-签约初审准入-否-radio-span-小圈圈
    private final String x98RadioSpan = getRadio(x98);
    //label[1=1 and contains(@title,"签约初审准入")]/../following-sibling::*[1]//span[text()='否']/preceding-sibling::span

    private final String d99 = "通用-签约时间-input";
    private final String x99 = get$XInput("签约时间");
    //label[1=1 and contains(text(),"签约时间")]/../following-sibling::*[1]//input

    private final String d100 = "通用-客户渠道-公募-radio-span";
    //通用-客户渠道-公募-radio-span
    private final String x100 = get$XRadio("客户渠道", "公募");
    //label[1=1 and contains(@title,"客户渠道")]/../following-sibling::*[1]//span[text()='公募']

    private final String d100RadioSpan = d100 + "-小圈圈";
    //通用-客户渠道-公募-radio-span-小圈圈
    private final String x100RadioSpan = getRadio(x100);
    //label[1=1 and contains(@title,"客户渠道")]/../following-sibling::*[1]//span[text()='公募']/preceding-sibling::span

    private final String d101 = "通用-客户渠道-非公募-radio-span";
    //通用-客户渠道-非公募-radio-span
    private final String x101 = get$XRadio("客户渠道", "非公募");
    //label[1=1 and contains(@title,"客户渠道")]/../following-sibling::*[1]//span[text()='非公募']

    private final String d101RadioSpan = d101 + "-小圈圈";
    //通用-客户渠道-非公募-radio-span-小圈圈
    private final String x101RadioSpan = getRadio(x101);
    //label[1=1 and contains(@title,"客户渠道")]/../following-sibling::*[1]//span[text()='非公募']/preceding-sibling::span

    private final String d102 = "通用-客户渠道-其他-radio-span";
    //通用-客户渠道-其他-radio-span
    private final String x102 = get$XRadio("客户渠道", "其他");
    //label[1=1 and contains(@title,"客户渠道")]/../following-sibling::*[1]//span[text()='其他']

    private final String d102RadioSpan = d102 + "-小圈圈";
    //通用-客户渠道-其他-radio-span-小圈圈
    private final String x102RadioSpan = getRadio(x102);
    //label[1=1 and contains(@title,"客户渠道")]/../following-sibling::*[1]//span[text()='其他']/preceding-sibling::span

    private final String d103 = "通用-是否核心用户-是-radio-span";
    //通用-是否核心用户-是-radio-span
    private final String x103 = get$XRadio("是否核心用户", "是");
    //label[1=1 and contains(@title,"是否核心用户")]/../following-sibling::*[1]//span[text()='是']

    private final String d103RadioSpan = d103 + "-小圈圈";
    //通用-是否核心用户-是-radio-span-小圈圈
    private final String x103RadioSpan = getRadio(x103);
    //label[1=1 and contains(@title,"是否核心用户")]/../following-sibling::*[1]//span[text()='是']/preceding-sibling::span

    private final String d104 = "通用-是否核心用户-否-radio-span";
    //通用-是否核心用户-否-radio-span
    private final String x104 = get$XRadio("是否核心用户", "否");
    //label[1=1 and contains(@title,"是否核心用户")]/../following-sibling::*[1]//span[text()='否']

    private final String d104RadioSpan = d104 + "-小圈圈";
    //通用-是否核心用户-否-radio-span-小圈圈
    private final String x104RadioSpan = getRadio(x104);
    //label[1=1 and contains(@title,"是否核心用户")]/../following-sibling::*[1]//span[text()='否']/preceding-sibling::span

    private final String d105 = "通用-是否潜在客户-是-radio-span";
    //通用-是否潜在客户-是-radio-span
    private final String x105 = get$XRadio("是否潜在客户", "是");
    //label[1=1 and contains(@title,"是否潜在客户")]/../following-sibling::*[1]//span[text()='是']

    private final String d105RadioSpan = d105 + "-小圈圈";
    //通用-是否潜在客户-是-radio-span-小圈圈
    private final String x105RadioSpan = getRadio(x105);
    //label[1=1 and contains(@title,"是否潜在客户")]/../following-sibling::*[1]//span[text()='是']/preceding-sibling::span

    private final String d106 = "通用-是否潜在客户-否-radio-span";
    //通用-是否潜在客户-否-radio-span
    private final String x106 = get$XRadio("是否潜在客户", "否");
    //label[1=1 and contains(@title,"是否潜在客户")]/../following-sibling::*[1]//span[text()='否']

    private final String d106RadioSpan = d106 + "-小圈圈";
    //通用-是否潜在客户-否-radio-span-小圈圈
    private final String x106RadioSpan = getRadio(x106);
    //label[1=1 and contains(@title,"是否潜在客户")]/../following-sibling::*[1]//span[text()='否']/preceding-sibling::span

    private final String d107 = "通用-活动权限-研究服务客户经理-radio-span";
    //通用-活动权限-研究服务客户经理-radio-span
    private final String x107 = get$XCheckBox("活动权限", "研究服务客户经理");
    //label[1=1 and contains(@title,"活动权限")]/../following-sibling::*[1]//span[text()='研究服务客户经理']

    private final String d107CheckBoxSpan = d107 + "-小圈圈";
    //通用-活动权限-研究服务客户经理-radio-span-小圈圈
    private final String x107CheckBoxSpan = getCheckBox(x107);
    //label[1=1 and contains(@title,"活动权限")]/../following-sibling::*[1]//span[text()='研究服务客户经理']/preceding-sibling::span

    private final String d108 = "通用-活动权限-联合调研-radio-span";
    //通用-活动权限-联合调研-radio-span
    private final String x108 = get$XCheckBox("活动权限", "联合调研");
    //label[1=1 and contains(@title,"活动权限")]/../following-sibling::*[1]//span[text()='联合调研']

    private final String d108CheckBoxSpan = d108 + "-小圈圈";
    //通用-活动权限-联合调研-radio-span-小圈圈
    private final String x108CheckBoxSpan = getCheckBox(x108);
    //label[1=1 and contains(@title,"活动权限")]/../following-sibling::*[1]//span[text()='联合调研']/preceding-sibling::span

    private final String d109 = "通用-活动权限-大型会议-radio-span";
    //通用-活动权限-大型会议-radio-span
    private final String x109 = get$XCheckBox("活动权限", "大型会议");
    //label[1=1 and contains(@title,"活动权限")]/../following-sibling::*[1]//span[text()='大型会议']

    private final String d109CheckBoxSpan = d109 + "-小圈圈";
    //通用-活动权限-大型会议-radio-span-小圈圈
    private final String x109CheckBoxSpan = getCheckBox(x109);
    //label[1=1 and contains(@title,"活动权限")]/../following-sibling::*[1]//span[text()='大型会议']/preceding-sibling::span

    private final String d110 = "通用-活动权限-小范围交流-radio-span";
    //通用-活动权限-小范围交流-radio-span
    private final String x110 = get$XCheckBox("活动权限", "小范围交流");
    //label[1=1 and contains(@title,"活动权限")]/../following-sibling::*[1]//span[text()='小范围交流']

    private final String d110CheckBoxSpan = d110 + "-小圈圈";
    //通用-活动权限-小范围交流-radio-span-小圈圈
    private final String x110CheckBoxSpan = getCheckBox(x110);
    //label[1=1 and contains(@title,"活动权限")]/../following-sibling::*[1]//span[text()='小范围交流']/preceding-sibling::span

    private final String d111 = "通用-活动权限-电话会议-radio-span";
    //通用-活动权限-电话会议-radio-span
    private final String x111 = get$XCheckBox("活动权限", "电话会议");
    //label[1=1 and contains(@title,"活动权限")]/../following-sibling::*[1]//span[text()='电话会议']

    private final String d111CheckBoxSpan = d111 + "-小圈圈";
    //通用-活动权限-电话会议-radio-span-小圈圈
    private final String x111CheckBoxSpan = getCheckBox(x111);
    //label[1=1 and contains(@title,"活动权限")]/../following-sibling::*[1]//span[text()='电话会议']/preceding-sibling::span

    private final String d112 = "通用-道合推送-div";/////
    private final String x112 = get$XDiv("道合推送");/////
    //label[1=1 and contains(text(),"道合推送")]/../following-sibling::div[1]

    private final String d113 = "通用-办公邮编-input";
    private final String x113 = get$XInput("办公邮编");
    //label[1=1 and contains(text(),"办公邮编")]/../following-sibling::*[1]//input

    private final String d114 = "通用-公司总机-input";
    private final String x114 = get$XInput("公司总机");
    //label[1=1 and contains(text(),"公司总机")]/../following-sibling::*[1]//input

    private final String d115 = "通用-公司传真-input";
    private final String x115 = get$XInput("公司传真");
    //label[1=1 and contains(text(),"公司传真")]/../following-sibling::*[1]//input

    private final String d116 = "通用-办公省市-div";/////
    private final String x116 = get$XDiv("办公省市");/////
    //label[1=1 and contains(text(),"办公省市")]/../following-sibling::div[1]

    private final String d117 = "通用-主办客户经理-input";
    private final String x117 = get$XInput("主办客户经理");
    //label[1=1 and contains(text(),"主办客户经理")]/../following-sibling::*[1]//input


    private final String d118 = "通用-协办客户经理-input";
    private final String x118 = get$XInput("协办客户经理");
    //label[1=1 and contains(text(),"协办客户经理")]/../following-sibling::*[1]//input

    private final String d119 = "通用-所属团队-input";
    private final String x119 = get$XInput("所属团队");
    //label[1=1 and contains(text(),"所属团队")]/../following-sibling::*[1]//input

    private final String d120 = "通用-研究服务联系人-tab-div";
    private final String x120 = get$XTabDiv("研究服务联系人");
    //div[1=1 and text()='研究服务联系人']

    private final String d121 = "通用-研究服务调研统计-tab-div";
    private final String x121 = get$XTabDiv("研究服务调研统计");
    //div[1=1 and text()='研究服务调研统计']

    private final String d122 = "通用-研究服务客户办公地址-tab-div";
    private final String x122 = get$XTabDiv("研究服务客户办公地址");
    //div[1=1 and text()='研究服务客户办公地址']

    private final String d123 = "通用-研究服务公司邮箱-tab-div";
    private final String x123 = get$XTabDiv("研究服务公司邮箱");
    //div[1=1 and text()='研究服务公司邮箱']

    private final String d124 = "通用-研究服务客户合同-tab-div";
    private final String x124 = get$XTabDiv("研究服务客户合同");
    //div[1=1 and text()='研究服务客户合同']

    private final String d125 = "通用-研究服务服务频次-tab-div";
    private final String x125 = get$XTabDiv("研究服务服务频次");
    //div[1=1 and text()='研究服务服务频次']

    private final String d126 = "通用-研究服务关联客户-tab-div";
    private final String x126 = get$XTabDiv("研究服务关联客户");
    //div[1=1 and text()='研究服务关联客户']

    private final String d127 = "通用-创建按钮-span";
    private final String x127 = get$XSpan("创建");
    //span[1=1 and text()='创建']

    private final String d128 = "通用-删除按钮-span";
    private final String x128 = get$XSpan("删除");
    //span[1=1 and text()='删除']

    private final String d129 = "通用-同步道合按钮-span";
    private final String x129 = get$XSpan("同步道合");
    //span[1=1 and text()='同步道合']

    private final String d130 = "通用-证券名称-input";
    private final String x130 = get$XInput("证券名称");
    //label[1=1 and contains(text(),"证券名称")]/../following-sibling::*[1]//input

    private final String d131 = "通用-证券代码-input";
    private final String x131 = get$XInput("证券代码");
    //label[1=1 and contains(text(),"证券代码")]/../following-sibling::*[1]//input

    private final String d132 = "通用-板块-input";
    private final String x132 = get$XInput("板块");
    //label[1=1 and contains(text(),"板块")]/../following-sibling::*[1]//input

    private final String d133 = "通用-所属行业-input";
    private final String x133 = get$XInput("所属行业");
    //label[1=1 and contains(text(),"所属行业")]/../following-sibling::*[1]//input

    private final String d134 = "通用-调研人员姓名-input";
    private final String x134 = get$XInput("调研人员姓名");
    //label[1=1 and contains(text(),"调研人员姓名")]/../following-sibling::*[1]//input

    private final String d135From = "通用-调研时间-开始日期-input";
    private final String x135From = get$XInput("调研时间")+"[1]";
    //label[1=1 and contains(text(),"调研时间")]/../following-sibling::*[1]//input[1]

    private final String d135To = "通用-调研时间-结束日期-input";
    private final String x135To = get$XInput("调研时间")+"[2]";
    //label[1=1 and contains(text(),"调研时间")]/../following-sibling::*[1]//input[2]

    private final String d136 = "通用-批量操作-删除-i";
    private final String x136 = "//i[@aria-label='图标: delete']";

    private final String d137 = "通用-办公地址-input";
    private final String x137 = get$XInput("办公地址");
    //label[1=1 and contains(text(),"办公地址")]/../following-sibling::*[1]//input

    private final String d138 = "通用-邮箱后缀-input";
    private final String x138 = get$XInput("邮箱后缀");
    //label[1=1 and contains(text(),"邮箱后缀")]/../following-sibling::*[1]//input

    private final String d139 = "通用-上传人-input";
    private final String x139 = get$XInput("上传人");
    //label[1=1 and contains(text(),"上传人")]/../following-sibling::*[1]//input

    private final String d140 = "通用-合同费用金额-input";
    private final String x140 = get$XInput("合同费用金额");
    //label[1=1 and contains(text(),"合同费用金额")]/../following-sibling::*[1]//input

    private final String d141 = "通用-用印协议时间期限-input";
    private final String x141 = get$XInput("用印协议时间期限");
    //label[1=1 and contains(text(),"用印协议时间期限")]/../following-sibling::*[1]//input

    private final String d142 = "通用-合同类型-签约-radio-span";
    //通用-合同类型-签约-radio-span
    private final String x142 = get$XRadio("合同类型", "签约");
    //label[1=1 and contains(@title,"合同类型")]/../following-sibling::*[1]//span[text()='签约']

    private final String d142RadioSpan = d142 + "-小圈圈";
    //通用-合同类型-签约-radio-span-小圈圈
    private final String x142RadioSpan = getRadio(x142);
    //label[1=1 and contains(@title,"合同类型")]/../following-sibling::*[1]//span[text()='签约']/preceding-sibling::span

    private final String d143 = "通用-合同类型-顺延-radio-span";
    //通用-合同类型-顺延-radio-span
    private final String x143 = get$XRadio("合同类型", "顺延");
    //label[1=1 and contains(@title,"合同类型")]/../following-sibling::*[1]//span[text()='顺延']

    private final String d143RadioSpan = d143 + "-小圈圈";
    //通用-合同类型-顺延-radio-span-小圈圈
    private final String x143RadioSpan = getRadio(x143);
    //label[1=1 and contains(@title,"合同类型")]/../following-sibling::*[1]//span[text()='顺延']/preceding-sibling::span

    private final String d144 = "通用-备注说明-textarea";
    //通用-摘要框-textarea
    private final String x144 = get$XTextarea("备注说明");
    //label[1=1 and text()='备注说明']/../following-sibling::*[1]//textarea

    private final String d145From = "通用-生效时间-开始日期-input";
    private final String x145From = get$XInput("生效时间")+"[1]";
    //label[1=1 and contains(text(),"生效时间")]/../following-sibling::*[1]//input[1]

    private final String d145To = "通用-生效时间-结束日期-input";
    private final String x145To = get$XInput("生效时间")+"[2]";
    //label[1=1 and contains(text(),"生效时间")]/../following-sibling::*[1]//input[2]

    private final String d146 = "通用-会议活动机构参会次数上限-input";
    private final String x146 = get$XInput("会议活动机构参会次数上限");
    //label[1=1 and contains(text(),"会议活动机构参会次数上限")]/../following-sibling::*[1]//input

    private final String d147 = "通用-会议活动已参会次数-input";
    private final String x147 = get$XInput("会议活动已参会次数");
    //label[1=1 and contains(text(),"会议活动已参会次数")]/../following-sibling::*[1]//input

    private final String d148 = "通用-会议活动每次参会人数上限-input";
    private final String x148 = get$XInput("会议活动每次参会人数上限");
    //label[1=1 and contains(text(),"会议活动每次参会人数上限")]/../following-sibling::*[1]//input

    private final String d149 = "通用-上市公司机构参会次数上限-input";
    private final String x149 = get$XInput("上市公司机构参会次数上限");
    //label[1=1 and contains(text(),"上市公司机构参会次数上限")]/../following-sibling::*[1]//input

    private final String d150 = "通用-上市公司已参会次数-input";
    private final String x150 = get$XInput("上市公司已参会次数");
    //label[1=1 and contains(text(),"上市公司已参会次数")]/../following-sibling::*[1]//input

    private final String d151 = "通用-上市公司每次参会人数上限-input";
    private final String x151 = get$XInput("上市公司每次参会人数上限");
    //label[1=1 and contains(text(),"上市公司每次参会人数上限")]/../following-sibling::*[1]//input

    private final String d152 = "通用-上市公司可选公司数上限-input";
    private final String x152 = get$XInput("上市公司可选公司数上限");
    //label[1=1 and contains(text(),"上市公司可选公司数上限")]/../following-sibling::*[1]//input

    private final String d153 = "通用-联合调研机构参会次数上限-input";
    private final String x153 = get$XInput("联合调研机构参会次数上限");
    //label[1=1 and contains(text(),"联合调研机构参会次数上限")]/../following-sibling::*[1]//input

    private final String d154 = "通用-联合调研已参会次数-input";
    private final String x154 = get$XInput("联合调研已参会次数");
    //label[1=1 and contains(text(),"联合调研已参会次数")]/../following-sibling::*[1]//input

    private final String d155 = "通用-联合调研每次参会人数上限-input";
    private final String x155 = get$XInput("联合调研每次参会人数上限");
    //label[1=1 and contains(text(),"联合调研每次参会人数上限")]/../following-sibling::*[1]//input

    private final String d156 = "通用-路演服务机构参会次数上限-input";
    private final String x156 = get$XInput("路演服务机构参会次数上限");
    //label[1=1 and contains(text(),"路演服务机构参会次数上限")]/../following-sibling::*[1]//input

    private final String d157 = "通用-路演服务已参会次数-input";
    private final String x157 = get$XInput("路演服务已参会次数");
    //label[1=1 and contains(text(),"路演服务已参会次数")]/../following-sibling::*[1]//input


    public String get$XTabDiv(String label){
        //div[1=1 and text()='研究服务联系人']
        String xpath = "//div[1=1 and text()='";
        xpath = xpath + label + "']";
        return  xpath;
    }

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
        //table[1=1 and contains(@class,'ant-table-fixed')  and @style]//tr[@data-row-key][30]
        String xpath = "//table[1=1 and contains(@class,'ant-table-fixed')  and @style]//tr[@data-row-key]";
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


    public String get$XInput(String label) {
        //label[1=1 and text()='客户柜台代码']/../following-sibling::*[1]//input
        String xpath = "//label[1=1 and text()='";
        xpath = xpath + label;
        xpath = xpath + "']/../following-sibling::*[1]//input";
        return xpath;
    }


    public String get$XTextarea(String label) {
        //label[1=1 and text()='客户柜台代码']/../following-sibling::*[1]//input
        String xpath = "//label[1=1 and text()='";
        xpath = xpath + label;
        xpath = xpath + "']/../following-sibling::*[1]//textarea";
        return xpath;
    }


    public String get$XIframe(String label) {
        //label[1=1 and text()='内容']/../following-sibling::*[1]//iframe
        String xpath = "//label[1=1 and text()='";
        xpath = xpath + label;
        xpath = xpath + "']/../following-sibling::*[1]//iframe";
        return xpath;

    }


    public String get$DInput(String label) {
        //通用-OA账号-查询框
        String description = "通用-";
        description = description + label;
        description = description + "-查询框";

        return description;
    }


    public String get$XDiv(String label) {
        //label[1=1 and contains(text(),"开发类型")]/../following-sibling::div[1]
        String xpath = "//label[1=1 and contains(text(),\"";
        xpath = xpath + label;
        xpath = xpath + "\")]/../following-sibling::div[1]";
        return xpath;
    }

    public String get$XCheckBox(String lable1, String label2) {
        return get$XRadio(lable1, label2);
    }


    public String get$XRadio(String label1, String label2) {
        String xpath = "//label[1=1 and contains(@title,\"";
        xpath = xpath + label1 + "\")]/../following-sibling::*[1]//span[text()='";
        xpath = xpath + label2 + "']";
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
        //span[1=1 and text()='重置']
        String xpath = "//span[1=1 and text()='";
        xpath = xpath + text;
        xpath = xpath + "']";
        return xpath;
    }


    public String get$XSpanByTitle(String text) {
        //span[1=1 and @title='今日必读']
        String xpath = x58 + "//li/span[1=1 and @title='";
        xpath = xpath + text;
        xpath = xpath + "']";
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


    public String getArrow(String xpath) {
        return xpath + getArrow();
    }

    public String getCross(String xpath) {
        return xpath + getCross();
    }

    public String getSearch(String xpath) {
        return xpath + getSearch();
    }

    public String getRadio(String xpath) {
        return xpath + getRadio();
    }

    public String getCheckBox(String xpath) {
        return getRadio(xpath);
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
