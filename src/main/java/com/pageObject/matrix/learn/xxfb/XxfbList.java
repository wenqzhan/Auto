package com.pageObject.matrix.learn.xxfb;

import com.alibaba.fastjson.JSONObject;
import com.pageObject.commonObject.CommonObject;
import com.utils.json.JsonObject;
import lombok.Data;


@Data
public class XxfbList extends JsonObject {//信息发布
    private CommonObject commonObject = new CommonObject();

    private String xxfbList =
            "http://10.187.144.60:8081/learn/xxfb/xxfbList";


    private final String d3 = "信息发布-查询按钮-span";
    private final String x3 = commonObject.getX3();
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"查询")]

    private final String d4 = "信息发布-重置按钮-span";
    private final String x4 = commonObject.getX4();
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]

    private final String d5 = "信息发布-查询条件展开收起按钮-a";
    private final String x5 = commonObject.getX5();
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]/../../a


    private final String d35 = "信息发布-新增按钮-span";
    private final String x35 = commonObject.getX35();
    //span[1=1 and contains(text(),"新增")]

    private final String d6 = "信息发布-导出按钮-span";
    private final String x6 = commonObject.getX6();
    //span[1=1 and contains(text(),"导出")]

    private final String d7 = "信息发布-报表导出确认按钮-span";
    private final String x7 = commonObject.getX7();
    //span[1=1 and contains(text(),"确认")]


    private final String d57 = "信息发布-标题框-input";
    private final String x57 = commonObject.getX57();
    //label[1=1 and contains(text(),"标题")]/../following-sibling::*[1]//input


    private final String d58 = "信息发布-分类框-div";////
    private final String x58 = commonObject.getX58();
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]


    private final String d58Span01 = "通用-分类框-应用案例-span";////
    private final String x58Span01 = commonObject.getX58Span01();
    //span[1=1 and @title='应用案例']

    private final String d58Span02 = "通用-分类框-制度公告-span";////
    private final String x58Span02 = commonObject.getX58Span02();
    //span[1=1 and @title='制度公告']

    private final String d58Span03 = "通用-分类框-系统介绍-span";////
    private final String x58Span03 = commonObject.getX58Span03();
    //span[1=1 and @title='系统介绍']

    private final String d58Span04 = "通用-分类框-业务学习-span";////
    private final String x58Span04 = commonObject.getX58Span04();
    //span[1=1 and @title='业务学习']

    private final String d58Span05 = "通用-分类框-常见问答-span";////
    private final String x58Span05 = commonObject.getX58Span05();
    //span[1=1 and @title='常见问答']

    private final String d58Span06 = "通用-分类框-今日必读-span";////
    private final String x58Span06 = commonObject.getX58Span06();
    //span[1=1 and @title='今日必读']

    private final String d58Span07 = "通用-分类框-服务产品-span";////
    private final String x58Span07 = commonObject.getX58Span07();
    //span[1=1 and @title='服务产品']

    private final String d58Span08 = "通用-分类框-数据服务-span";////
    private final String x58Span08 = commonObject.getX58Span08();
    //span[1=1 and @title='数据服务']

    private final String d58Span09 = "通用-分类框-行业分析-span";////
    private final String x58Span09 = commonObject.getX58Span09();
    //span[1=1 and @title='行业分析']

    private final String d58Span10 = "通用-分类框-营销平台-span";////
    private final String x58Span10 = commonObject.getX58Span10();
    //span[1=1 and @title='营销平台']

    private final String d58Span11 = "通用-分类框-企业机构-span";////
    private final String x58Span11 = commonObject.getX58Span11();
    //span[1=1 and @title='企业机构']

    private final String d58Span12 = "通用-分类框-市场动态-span";////
    private final String x58Span12 = commonObject.getX58Span12();
    //span[1=1 and @title='市场动态']

    private final String d58Span13 = "通用-分类框-研究分析-span";////
    private final String x58Span13 = commonObject.getX58Span13();
    //span[1=1 and @title='研究分析']


    //////////////////////////////////
    private final String d9 = "信息发布-表格-table";
    private final String x9 = commonObject.getX9();
    //table[1=1 and contains(@class,'ant-table-fixed')]

    private final String d10 = "信息发布-表格表体rows-tr";
    private final String x10 = commonObject.getX10();
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not (contains(@style,'height'))] //不包含编辑那列,比如客户联系人,具体取决于样式

    private final String d10Action = "信息发布-表格表体rows-tr-action(详情,更多...)";
    private final String x10Action = commonObject.getX10Action();
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]

    private final String d10ActionDetails = "信息发布-表格表体rows-tr-action(详情,更多...)-详情-a";
    private final String x10ActionDetails = x10Action + "//a[text()='详情']";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]//a[text()='详情']

    private final String d10ActionMore = "信息发布-表格表体rows-tr-action(详情,更多...)-详情-a";
    private final String x10ActionMore = x10ActionDetails + "/following-sibling::a[1]";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]//a[text()='详情']/following-sibling::a[1]


    private final String d10ActionMoreEdits = "信息发布-表格表体rows-selected-tr";
    private final String x10ActionMoreEdits = "//a[text()='编辑']";
    //a[text()='删除'] 这个需要进一步处理,定位最后一个


    private final String d10ActionMoreDeletes = "信息发布-表格表体rows-selected-tr";
    private final String x10ActionMoreDeletes = "//a[text()='删除']";
    //a[text()='删除'] 这个需要进一步处理,定位最后一个

    private final String d10Selected = "信息发布-表格表体rows-selected-tr";
    private final String x10Selected = commonObject.getX10Selected();
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected')]

    private final String d10NotSelected = "信息发布-表格表体rows-not selected-tr";
    private final String x10NotSelected = commonObject.getX10NotSelected();
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected'))]

    private final String d11 = "信息发布-表格表头row下的th col-th";
    private final String x11 = commonObject.getX11();
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[not(@key='selection-column')]

    private final String d31 = "信息发布-表格表头-多选框-th";
    private final String x31 = commonObject.getX31();
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']


    private final String d12 = "信息发布-表格下方翻页按钮-上一页-li";
    private final String x12 = commonObject.getX12();
    //li[1=1 and contains(@title,'上一页')]

    private final String d13 = "信息发布-表格下方翻页按钮-下一页-li";
    private final String x13 = commonObject.getX13();
    //li[1=1 and contains(@title,'下一页')]

    private final String d14 = "信息发布-表格下方翻页按钮-下一页前的按钮,可以看出共多少页-a";
    private final String x14 = commonObject.getX14();
    //li[1=1 and contains(@title,'下一页')]/preceding-sibling::li[1]/a

    private final String d15 = "信息发布-表格下方跳页输入框-input";
    private final String x15 = commonObject.getX15();
    //div[1=1 and contains(text(),"跳至")]/input

    private final String d16 = "信息发布-表格下方跳页输入框左边的跳至两个字-div";
    private final String x16 = commonObject.getX16();
    //div[1=1 and contains(text(),"跳至")]

    private final String d17 = "信息发布-数据加载(转菊花)-span";
    private final String x17 = commonObject.getX17();
    //span[1=1 and contains(@class,'ant-spin-dot')]

    private final String d18 = "信息发布-条/页-div";
    private final String x18 = commonObject.getX18();
    //div[1=1 and contains(@title,'条/页')]

    private final String d18L5 = "信息发布-条/页-5 条/页-li";
    private final String x18L5 = commonObject.getX18L5();
    //li[1=1 and text()='5 条/页' ]

    private final String d18L10 = "信息发布-条/页-10 条/页-li";
    private final String x18L10 = commonObject.getX18L10();
    //li[1=1 and text()='10 条/页' ]

    private final String d18L20 = "信息发布-条/页-20 条/页-li";
    private final String x18L20 = commonObject.getX18L20();
    //li[1=1 and text()='20 条/页' ]

    private final String d18L30 = "信息发布-条/页-30 条/页-li";
    private final String x18L30 = commonObject.getX18L30();
    //li[1=1 and text()='30 条/页' ]

    public final String d28 = "信息发布-表头多选框-input";
    private final String x28 = commonObject.getX28();
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']//input

    /////////////////////////////////

    private String get$D58Span(int num) {
        //信息发布-分类框-下拉候选项-第num行

        return commonObject.get$D58Span(num).replaceFirst("通用", "信息发布");
    }

    private String get$X58Span(int num) {
        //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[num+2]

        return commonObject.get$X58Span(num);
    }

    public JSONObject get$58SpanJson(int num) {
        JsonObject.setJsonObject(get$D58Span(num), get$X58Span(num));
        return JsonObject.getJsonObject();
    }


    private String get$X10Sibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(@style)][30]
        String xpath = commonObject.get$X10Sibling(num);
        return xpath;
    }

    private String get$D10Sibling(int num) {
        //信息发布-表格表体-第1行
        String description = commonObject.get$D10Sibling(num);
        description = description.replaceFirst("通用", "信息发布");
        return description;
    }

    public JSONObject get$10SiblingJson(int num) {
        JsonObject.setJsonObject(get$D10Sibling(num), get$X10Sibling(num));
        return JsonObject.getJsonObject();
    }


    private String get$X10ActionDetails(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]//a[text()='详情'][1]
        String xpath = x10ActionDetails;
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

    ///////////////////////////////
    private String get$D10ActionDetails(int num) {
        //通用-表格表体-第1行
        String desc = "信息发布-操作更多-第";
        return commonObject.get$D(num, desc);
    }


    public JSONObject get$10SiblingDetailsJson(int num) {

        return JsonObject.getJsonObject();
    }


    public JSONObject getJson(String desc){

        return JsonObject.getJsonObject();
    }






}



