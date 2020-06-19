package com.pageObject.matrix;

import com.alibaba.fastjson.JSONObject;
//import com.pageObject.matrix.commonObject.CommonObjectPopped;
import com.utils.json.JsonObject;
import lombok.Data;

@Data
public class TableContent extends JsonObject {
    CommonObject commonObject = new CommonObject();
//    CommonObjectPopped commonObjectPopped = new CommonObjectPopped();
    String popped = commonObject.getPoppedPrefix(); //div[@tabindex]
    String tabbed = "//div[contains(@class,'-active')]";


    public TableContent() {
        setDesPrefix("");
        super.setPrefix("");
        setConVal("");
    }

    public TableContent(String type) {
        setDesPrefix(type);
        setPrefix(type);
        setConVal(type);
    }

    public void setPrefix(String type) {
        String prefix = "";
        if (type.toLowerCase().contains("popped")) {
            prefix = prefix + popped;
        }
        if (type.toLowerCase().contains("tabbed")) {
            prefix = prefix + tabbed;
        }
        super.setPrefix(prefix);
        //label[1=1 and text()='客户柜台代码']/../following-sibling::*[1]//input/../..

    }

    private String dTableTable;
    //通用-表格-table
    private String xTableTable;
    //table[1=1 and contains(@class,'ant-table-fixed')]

    private String dTableTrs;
    //通用-表格表体rows-tr
    private String xTableTrs;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not (contains(@style,'height'))]
    // 不包含编辑那列,比如客户联系人,具体取决于样式

    private String dTableActionTrs;
    //通用-表格表体rows-tr-action(编辑,查看...)
    private String xTableActionTrs;
    //table[1=1 and contains(@class,'ant-table-fixed')  and @style]//tr[@data-row-key]

    private String dTableTrsActionDetails;
    //通用-表格表体rows-tr-action(详情,更多...)-详情-a
    private String xTableTrsActionDetails;
    //table[1=1 and contains(@class,'ant-table-fixed') and @style]//tr[@data-row-key]//a[text()='详情']

    private String dTableActionEditsAs;
    //通用-表格表体rows-tr-action(详情,更多...)-编辑-a
    private String xTableActionEditsAs;
    //table[1=1 and contains(@class,'ant-table-fixed') and @style]//tr[@data-row-key]//a[text()='编辑']

    private String dTableTrsActionMore;
    //通用-表格表体rows-tr-action(详情,更多...)-更多-a
    private String xTableTrsActionMore;
    //table[1=1 and contains(@class,'ant-table-fixed') and @style]//tr[@data-row-key]//a[text()='详情']/following-sibling::a[1]

    private String dTableTrsActionMoreEdits;
    //通用-表格表体rows-selected-tr
    private String xTableTrsActionMoreEdits;
    //a[text()='编辑'] 这个需要进一步处理,定位最后一个


    private String dTableTrsActionMoreDeletes;
    //通用-表格表体rows-selected-tr
    private String xTableTrsActionMoreDeletes;
    //a[text()='删除'] 这个需要进一步处理,定位最后一个

    private String dTableTrsSelectedTrs;
    //通用-表格表体rows-selected-tr
    private String xTableTrsSelectedTrs;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected') and not(@style)]

    private String dTableTrsNotSelectedTrs;
    //通用-表格表体rows-not selected-tr
    private String xTableTrsNotSelectedTrs;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected')) and not(@style)]

    private String d11;
    //通用-表格表头(可能有多表头)-tr
    private String x11;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]

    private String d11Tmp;
    //临时
    private String x11Tmp;

    private String dTableHeaderTr1Ths;
    //通用-表格表头row下的tr[1]/th col-th
    private String xTableHeaderTr1Ths;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)][1]//th[not(@key='selection-column') and not(@key='action')]

    private String d11Tr2;
    //通用-表格表头row下的tr[2]/th col-th
    private String x11Tr2;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)][1]//th[not(@key='selection-column') and not(@key='action')]


    private String dTableHeaderMultiCheckboxTh;
    //通用-表格表头-多选框-th
    private String xTableHeaderMultiCheckboxTh;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']


    private String dTableLastPageButtonLi;
    //通用-表格下方翻页按钮-上一页-li
    private String xTableLastPageButtonLi;
    //li[1=1 and contains(@title,'上一页')]

    private String dTableNextPageButtonLi;
    //通用-表格下方翻页按钮-下一页-li
    private String xTableNextPageButtonLi;
    //li[1=1 and contains(@title,'下一页')]

    private String dMaxPageButtonA;
    //通用-表格下方翻页按钮-下一页前的按钮,可以看出共多少页-a
    private String xMaxPageButtonA;
    //li[1=1 and contains(@title,'下一页')]/preceding-sibling::li[1]/a

    private String dTableJumpToInput;
    //通用-表格下方跳页输入框-input
    private String xTableJumpToInput;
    //div[1=1 and contains(text(),"跳至")]/input

    private String dTableJumpDiv;
    //通用-表格下方跳页输入框左边的跳至两个字-div
    private String xTableJumpDiv;
    //div[1=1 and contains(text(),"跳至")]

    private String dTableLoadingSignSpan;
    //通用-数据加载(转菊花)-span
    private String xTableLoadingSignSpan;
    //span[1=1 and contains(@class,'ant-spin-dot')]

    private String dTableLinesPerPageDiv;
    //通用-条/页-div
    private String xTableLinesPerPageDiv;
    //div[1=1 and contains(@title,'条/页')]

    private String dTableFiveLinesPerPageLi;
    //通用-条/页-5 条/页-li
    private String xTableFiveLinesPerPageLi;
    //li[1=1 and text()='5 条/页' ]

    private String dTableTenLinesPerPageLi;
    //通用-条/页-10 条/页-li
    private String xTableTenLinesPerPageLi;
    //li[1=1 and text()='10 条/页' ]

    private String dTableTwentyLinesPerPageLi;
    //通用-条/页-20 条/页-li
    private String xTableTwentyLinesPerPageLi;
    //li[1=1 and text()='20 条/页' ]

    private String dTableThirtyLinesPerPageLi;
    //通用-条/页-30 条/页-li
    private String xTableThirtyLinesPerPageLi;
    //li[1=1 and text()='30 条/页' ]

    private String dTableHeaderMultiCheckboxInput;
    //通用-表头多选框-input
    private String xTableHeaderMultiCheckboxInput;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']//input

    private String dTotalCounts;
    //共 521 条
    private String xTotalCounts;
    //li[@class='ant-pagination-total-text']";


    private String get$XTableTrsSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(@style)][30]
        String xpath = getPrefix() + commonObject.get$XTableTrsSibling(num);
        return xpath;
    }

    private String get$DTableTrsSibling(int num) {
        //信息发布-表格表体-第1行
        String description = commonObject.get$DTableTrsSibling(num);
        description = description.replaceFirst("通用", getDesPrefix());
        return description;
    }

    public JSONObject get$TableTrsSiblingJson(int num) {
        JsonObject.setJsonObject(get$DTableTrsSibling(num), get$XTableTrsSibling(num));
        return JsonObject.getJsonObject();
    }


    private String get$XTableTrsActionDetails(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style][1]//a[text()='详情']
        String xpath = getPrefix() + commonObject.getXTableTrsActionDetails();
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
        String desc = "通用-操作更多(或者详情)-第".replaceFirst("通用", getDesPrefix());
        return commonObject.get$D(num, desc);
    }


    public JSONObject get$TableTrsActionDetailsJson(int num) {
        JsonObject.setJsonObject(get$DTableTrsActionDetails(num), get$XTableTrsActionDetails(num));
        return JsonObject.getJsonObject();
    }

    private String get$XTableTrsActionSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')  and @style]//tr[@data-row-key][30]
        return commonObject.get$XTableTrsActionSibling(num);
    }


    private String get$DTableTrsActionSibling(int num) {

        return commonObject.get$DTableTrsActionSibling(num).replaceFirst("通用", getDesPrefix());
    }

    public JSONObject get$TableTrsActionSiblingJson(int num) {
        JsonObject.setJsonObject(get$DTableTrsActionSibling(num), get$XTableTrsActionSibling(num));
        return JsonObject.getJsonObject();
    }

}
