package com.pageObject.matrix.learn.xxfb;

import com.alibaba.fastjson.JSONObject;
import com.pageObject.matrix.CommonObject;
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


    private String dQueryButtonSpan;
    //"信息发布-查询按钮-span";
    private String xQueryButtonSpan;
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"查询")]


    private String dResetConditionsButtonSpan;
    ////信息发布-重置按钮-span";
    private String xResetConditionsButtonSpan;
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]

//    private  String d5 ;// "信息发布-查询条件展开收起按钮-a";
//    private  String x5 = commonObject.getX5();
//    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]/../../a


    private String dNewButtonSpan;
    // "信息发布-新增按钮-span";
    private String xNewButtonSpan;
    //span[1=1 and contains(text(),"新增")]

    private String dExportButtonSpan;
    // "信息发布-导出按钮-span";
    private String xExportButtonSpan;
    //span[1=1 and contains(text(),"导出")]

//    private  String d7 ;// "信息发布-报表导出确认按钮-span";
//    private  String x7 = commonObject.getX7();
//    //span[1=1 and contains(text(),"确认")]


    private String dTitleInput;
    // "信息发布-标题框-input";
    private String xTitleInput;
    //label[1=1 and contains(text(),"标题")]/../following-sibling::*[1]//input


    private String dClassificationDiv;
    // "信息发布-分类框-div";////
    private String xClassificationDiv;
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]


    private String dClassificationDivApplicationCasesSpan;
    // "信息发布-分类框-应用案例-span";////
    private String xClassificationDivApplicationCasesSpan;
    //span[1=1 and @title='应用案例']

    private String dClassificationDivInstitutionsAnnouncementSpan;
    // "信息发布-分类框-制度公告-span";////
    private String xClassificationDivInstitutionsAnnouncementSpan;
    //span[1=1 and @title='制度公告']

    private String dClassificationDivSystemIntroductionSpan;
    // "信息发布-分类框-系统介绍-span";////
    private String xClassificationDivSystemIntroductionSpan;
    //span[1=1 and @title='系统介绍']

    private String dClassificationDivVocationalStudySpan;
    // "信息发布-分类框-业务学习-span";////
    private String xClassificationDivVocationalStudySpan;
    //span[1=1 and @title='业务学习']

    private String dClassificationDivFAQSpan;
    // "信息发布-分类框-常见问答-span";////
    private String xClassificationDivFAQSpan;
    //span[1=1 and @title='常见问答']

    private String dClassificationDivMustReadTodaySpan;
    // "信息发布-分类框-今日必读-span";////
    private String xClassificationDivMustReadTodaySpan;
    //span[1=1 and @title='今日必读']

    private String dClassificationDivServiceProductsSpan;
    // "信息发布-分类框-服务产品-span";////
    private String xClassificationDivServiceProductsSpan;
    //span[1=1 and @title='服务产品']

    private String dClassificationDivDataServiceSpan;
    // "信息发布-分类框-数据服务-span";////
    private String xClassificationDivDataServiceSpan;
    //span[1=1 and @title='数据服务']

    private String dClassificationDivIndustryAnalysisSpan;
    // "信息发布-分类框-行业分析-span";////
    private String xClassificationDivIndustryAnalysisSpan;
    //span[1=1 and @title='行业分析']

    private String dClassificationDivMarketingPlatformSpan;
    // "信息发布-分类框-营销平台-span";////
    private String xClassificationDivMarketingPlatformSpan;
    //span[1=1 and @title='营销平台']

    private String dClassificationDivBizOrgSpan;
    // "信息发布-分类框-企业机构-span";////
    private String xClassificationDivBizOrgSpan;
    //span[1=1 and @title='企业机构']

    private String dClassificationDivMarketDynamicsSpan;
    // "信息发布-分类框-市场动态-span";////
    private String xClassificationDivMarketDynamicsSpan;
    //span[1=1 and @title='市场动态']

    private String dClassificationDivResearchAnalysisSpan;
    // "信息发布-分类框-研究分析-span";////
    private String xClassificationDivResearchAnalysisSpan;
    //span[1=1 and @title='研究分析']


    //////////////////////////////////
    private String dTableTable;
    // "信息发布-表格-table";
    private String xTableTable;
    //table[1=1 and contains(@class,'ant-table-fixed')]

    private String dTableTrs;
    // "信息发布-表格表体rows-tr";
    private String xTableTrs;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not (contains(@style,'height'))] //不包含编辑那列,比如客户联系人,具体取决于样式

    private String dTableActionTrs = "信息发布-表格表体rows-tr-action(详情,更多...)";
    // "信息发布-表格表体rows-tr-action(详情,更多...)";
    private String xTableActionTrs;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]

    private String dTableTrsActionDetails = "信息发布-表格表体rows-tr-action(详情,更多...)-详情-a";
    //"信息发布-表格表体rows-tr-action(详情,更多...)-详情-a";
    private String xTableTrsActionDetails;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]//a[text()='详情']

    private String dTableTrsActionMore = "信息发布-表格表体rows-tr-action(详情,更多...)-更多-a";
    //"信息发布-表格表体rows-tr-action(详情,更多...)-更多-a";
    private String xTableTrsActionMore;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]//a[text()='详情']/following-sibling::a[1]


    private String dTableTrsActionMoreEdits;
    // "信息发布-表格表体rows-selected-tr";
    private String xTableTrsActionMoreEdits;
    //a[text()='编辑']这个需要进一步处理,定位最后一个


    private String dTableTrsActionMoreDeletes;
    // "信息发布-表格表体rows-selected-tr";
    private String xTableTrsActionMoreDeletes;
    //a[text()='删除'] 这个需要进一步处理,定位最后一个


    private String dCancelButtonSpan;
    // "信息发布-删除-取消-span";
    private String xCancelButtonSpan;
    //span[1=1 and contains(text(),"关 闭")]

    private String dConfirmButtonSpan;
    // "信息发布-删除-确定按钮-span";
    private String xConfirmButtonSpan;
    //span[1=1 and contains(text(),"确 定")]

    private String dTableTrsSelectedTrs;
    // "信息发布-表格表体rows-selected-tr";
    private String xTableTrsSelectedTrs;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected') and not(@Style) ]

    private String dTableTrsNotSelectedTrs;
    // "信息发布-表格表体rows-not selected-tr";
    private String xTableTrsNotSelectedTrs;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected')) and not(@Style)]

    private String dTableHeaderTr1Ths;
    // "信息发布-表格表头row下的th col-th";
    private String xTableHeaderTr1Ths;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)][1]//th[not(@key='selection-column') and not(@key='action')]

    private String dTableHeaderMultiCheckboxTh;
    // "信息发布-表格表头-多选框-th";
    private String xTableHeaderMultiCheckboxTh;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']


    private String dTableLastPageButtonLi;
    // "信息发布-表格下方翻页按钮-上一页-li";
    private String xTableLastPageButtonLi;
    //li[1=1 and contains(@title,'上一页')]

    private String dTableNextPageButtonLi;
    // "信息发布-表格下方翻页按钮-下一页-li";
    private String xTableNextPageButtonLi;
    //li[1=1 and contains(@title,'下一页')]

    private String dMaxPageButtonA;
    // "信息发布-表格下方翻页按钮-下一页前的按钮,可以看出共多少页-a";
    private String xMaxPageButtonA;
    //li[1=1 and contains(@title,'下一页')]/preceding-sibling::li[1]/a

    private String dTableJumpToInput;
    // "信息发布-表格下方跳页输入框-input";
    private String xTableJumpToInput;
    //div[1=1 and contains(text(),"跳至")]/input

    private String dTableJumpDiv;
    // "信息发布-表格下方跳页输入框左边的跳至两个字-div";
    private String xTableJumpDiv;
    //div[1=1 and contains(text(),"跳至")]

    private String dTableLoadingSignSpan;
    // "信息发布-数据加载(转菊花)-span";
    private String xTableLoadingSignSpan;
    //span[1=1 and contains(@class,'ant-spin-dot')]

    private String dTableLinesPerPageDiv;
    // "信息发布-条/页-div";
    private String xTableLinesPerPageDiv;
    //div[1=1 and contains(@title,'条/页')]

    private String dTableFiveLinesPerPageLi;
    // "信息发布-条/页-5 条/页-li";
    private String xTableFiveLinesPerPageLi;
    //li[1=1 and text()='5 条/页' ]

    private String dTableTenLinesPerPageLi;
    // "信息发布-条/页-10 条/页-li";
    private String xTableTenLinesPerPageLi;
    //li[1=1 and text()='10 条/页' ]

    private String dTableTwentyLinesPerPageLi;
    // "信息发布-条/页-20 条/页-li";
    private String xTableTwentyLinesPerPageLi;
    //li[1=1 and text()='20 条/页' ]

    private String dTableThirtyLinesPerPageLi;
    // "信息发布-条/页-30 条/页-li";
    private String xTableThirtyLinesPerPageLi;
    //li[1=1 and text()='30 条/页' ]

    public String dTableHeaderMultiCheckboxInput;
    // "信息发布-表头多选框-input";
    private String xTableHeaderMultiCheckboxInput;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']//input

    /////////////////////////////////


    private String get$DClassificationDivSpan(int num) {
        //信息发布-分类框-下拉候选项-第num行

        return commonObject.get$DClassificationDivSpan(num).replaceFirst("通用", "信息发布");
    }

    private String get$XClassificationDivSpan(int num) {
        //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[num+2]

        return commonObject.get$XClassificationDivSpan(num);
    }

    public JSONObject get$ClassificationDivSpanJson(int num) {
        JsonObject.setJsonObject(get$DClassificationDivSpan(num), get$XClassificationDivSpan(num));
        return JsonObject.getJsonObject();
    }


    private String get$XTableTrsSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(@style)][30]
        String xpath = commonObject.get$XTableTrsSibling(num);
        return xpath;
    }

    private String get$DTableTrsSibling(int num) {
        //信息发布-表格表体-第1行
        String description = commonObject.get$DTableTrsSibling(num);
        description = description.replaceFirst("通用", "信息发布");
        return description;
    }

    public JSONObject get$TableTrsSiblingJson(int num) {
        JsonObject.setJsonObject(get$DTableTrsSibling(num), get$XTableTrsSibling(num));
        return JsonObject.getJsonObject();
    }


    private String get$XTableTrsActionDetails(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style][1]//a[text()='详情']
        String xpath = xTableTrsActionDetails;
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
    private String get$DTableTrsActionDetails(int num) {
        //通用-表格表体-第1行
        String desc = "信息发布-操作更多-第";
        return commonObject.get$D(num, desc);
    }


    public JSONObject get$TableTrsActionDetailsJson(int num) {
        JsonObject.setJsonObject(get$DTableTrsActionDetails(num), get$XTableTrsActionDetails(num));
        return JsonObject.getJsonObject();
    }


}



