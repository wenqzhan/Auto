package com.pageObject.matrix.learn.xxfb;

import com.alibaba.fastjson.JSONObject;
import com.pageObject.commonObject.CommonObject;
import com.utils.json.JsonObject;
import lombok.Data;


@Data
public class XxfbList extends JsonObject {//信息发布

    public XxfbList() {
        setDesPrefix("信息发布");
        setPrefix("");
        setConVal("");
    }

    private CommonObject commonObject = new CommonObject();

    private String xxfbList =
            "http://10.187.144.60:8080/learn/xxfb/xxfbList";


    private String d3;
    //"信息发布-查询按钮-span";
    private String x3;
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"查询")]


    private String d4;
    ////信息发布-重置按钮-span";
    private String x4;
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]

//    private  String d5 ;// "信息发布-查询条件展开收起按钮-a";
//    private  String x5 = commonObject.getX5();
//    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]/../../a


    private String d35;
    // "信息发布-新增按钮-span";
    private String x35;
    //span[1=1 and contains(text(),"新增")]

    private String d6;
    // "信息发布-导出按钮-span";
    private String x6;
    //span[1=1 and contains(text(),"导出")]

//    private  String d7 ;// "信息发布-报表导出确认按钮-span";
//    private  String x7 = commonObject.getX7();
//    //span[1=1 and contains(text(),"确认")]


    private String d57;
    // "信息发布-标题框-input";
    private String x57;
    //label[1=1 and contains(text(),"标题")]/../following-sibling::*[1]//input


    private String d58;
    // "信息发布-分类框-div";////
    private String x58;
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]


    private String d58Span01;
    // "信息发布-分类框-应用案例-span";////
    private String x58Span01;
    //span[1=1 and @title='应用案例']

    private String d58Span02;
    // "信息发布-分类框-制度公告-span";////
    private String x58Span02;
    //span[1=1 and @title='制度公告']

    private String d58Span03;
    // "信息发布-分类框-系统介绍-span";////
    private String x58Span03;
    //span[1=1 and @title='系统介绍']

    private String d58Span04;
    // "信息发布-分类框-业务学习-span";////
    private String x58Span04;
    //span[1=1 and @title='业务学习']

    private String d58Span05;
    // "信息发布-分类框-常见问答-span";////
    private String x58Span05;
    //span[1=1 and @title='常见问答']

    private String d58Span06;
    // "信息发布-分类框-今日必读-span";////
    private String x58Span06;
    //span[1=1 and @title='今日必读']

    private String d58Span07;
    // "信息发布-分类框-服务产品-span";////
    private String x58Span07;
    //span[1=1 and @title='服务产品']

    private String d58Span08;
    // "信息发布-分类框-数据服务-span";////
    private String x58Span08;
    //span[1=1 and @title='数据服务']

    private String d58Span09;
    // "信息发布-分类框-行业分析-span";////
    private String x58Span09;
    //span[1=1 and @title='行业分析']

    private String d58Span10;
    // "信息发布-分类框-营销平台-span";////
    private String x58Span10;
    //span[1=1 and @title='营销平台']

    private String d58Span11;
    // "信息发布-分类框-企业机构-span";////
    private String x58Span11;
    //span[1=1 and @title='企业机构']

    private String d58Span12;
    // "信息发布-分类框-市场动态-span";////
    private String x58Span12;
    //span[1=1 and @title='市场动态']

    private String d58Span13;
    // "信息发布-分类框-研究分析-span";////
    private String x58Span13;
    //span[1=1 and @title='研究分析']


    //////////////////////////////////
    private String d9;
    // "信息发布-表格-table";
    private String x9;
    //table[1=1 and contains(@class,'ant-table-fixed')]

    private String d10;
    // "信息发布-表格表体rows-tr";
    private String x10;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not (contains(@style,'height'))] //不包含编辑那列,比如客户联系人,具体取决于样式

    private String d10Action = "信息发布-表格表体rows-tr-action(详情,更多...)";
    // "信息发布-表格表体rows-tr-action(详情,更多...)";
    private String x10Action;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]

    private String d10ActionDetails = "信息发布-表格表体rows-tr-action(详情,更多...)-详情-a";
    //"信息发布-表格表体rows-tr-action(详情,更多...)-详情-a";
    private String x10ActionDetails;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]//a[text()='详情']

    private String d10ActionMore = "信息发布-表格表体rows-tr-action(详情,更多...)-更多-a";
    //"信息发布-表格表体rows-tr-action(详情,更多...)-更多-a";
    private String x10ActionMore;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]//a[text()='详情']/following-sibling::a[1]


    private String d10ActionMoreEdits;
    // "信息发布-表格表体rows-selected-tr";
    private String x10ActionMoreEdits;
    //a[text()='编辑']这个需要进一步处理,定位最后一个


    private String d10ActionMoreDeletes;
    // "信息发布-表格表体rows-selected-tr";
    private String x10ActionMoreDeletes;
    //a[text()='删除'] 这个需要进一步处理,定位最后一个


    private String d59;
    // "信息发布-删除-取消-span";
    private String x59;
    //span[1=1 and contains(text(),"关 闭")]

    private String d29;
    // "信息发布-删除-确定按钮-span";
    private String x29;
    //span[1=1 and contains(text(),"确 定")]

    private String d10Selected;
    // "信息发布-表格表体rows-selected-tr";
    private String x10Selected;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected') and not(@Style) ]

    private String d10NotSelected;
    // "信息发布-表格表体rows-not selected-tr";
    private String x10NotSelected;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected')) and not(@Style)]

    private String d11Tr1;
    // "信息发布-表格表头row下的th col-th";
    private String x11Tr1;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)][1]//th[not(@key='selection-column') and not(@key='action')]

    private String d31;
    // "信息发布-表格表头-多选框-th";
    private String x31;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']


    private String d12;
    // "信息发布-表格下方翻页按钮-上一页-li";
    private String x12;
    //li[1=1 and contains(@title,'上一页')]

    private String d13;
    // "信息发布-表格下方翻页按钮-下一页-li";
    private String x13;
    //li[1=1 and contains(@title,'下一页')]

    private String d14;
    // "信息发布-表格下方翻页按钮-下一页前的按钮,可以看出共多少页-a";
    private String x14;
    //li[1=1 and contains(@title,'下一页')]/preceding-sibling::li[1]/a

    private String d15;
    // "信息发布-表格下方跳页输入框-input";
    private String x15;
    //div[1=1 and contains(text(),"跳至")]/input

    private String d16;
    // "信息发布-表格下方跳页输入框左边的跳至两个字-div";
    private String x16;
    //div[1=1 and contains(text(),"跳至")]

    private String d17;
    // "信息发布-数据加载(转菊花)-span";
    private String x17;
    //span[1=1 and contains(@class,'ant-spin-dot')]

    private String d18;
    // "信息发布-条/页-div";
    private String x18;
    //div[1=1 and contains(@title,'条/页')]

    private String d18L5;
    // "信息发布-条/页-5 条/页-li";
    private String x18L5;
    //li[1=1 and text()='5 条/页' ]

    private String d18L10;
    // "信息发布-条/页-10 条/页-li";
    private String x18L10;
    //li[1=1 and text()='10 条/页' ]

    private String d18L20;
    // "信息发布-条/页-20 条/页-li";
    private String x18L20;
    //li[1=1 and text()='20 条/页' ]

    private String d18L30;
    // "信息发布-条/页-30 条/页-li";
    private String x18L30;
    //li[1=1 and text()='30 条/页' ]

    public String d28;
    // "信息发布-表头多选框-input";
    private String x28;
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
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style][1]//a[text()='详情']
        String xpath = x10ActionDetails;
        if (num > 0) {
            xpath = xpath.replaceFirst("]//a", "][" + num + "]//a");
        } else if (num == -1) {
            xpath = xpath.replaceFirst("]//a", "][" + "last()" + "]//a");
        } else if (num == 0) {
            xpath = xpath;
        } else {
            return "error, the num must be positive or equals -1";
        }

        return xpath;
    }

    ///////////////////////////////
    private String get$D10ActionDetails(int num) {
        //通用-表格表体-第1行
        String desc = "信息发布-操作更多-第";
        return commonObject.get$D(num, desc);
    }


    public JSONObject get$10ActionDetailsJson(int num) {
        JsonObject.setJsonObject(get$D10ActionDetails(num), get$X10ActionDetails(num));
        return JsonObject.getJsonObject();
    }


}



