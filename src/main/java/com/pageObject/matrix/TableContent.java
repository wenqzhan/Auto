package com.pageObject.matrix;

import com.alibaba.fastjson.JSONObject;
import com.pageObject.commonObject.CommonObject;
import com.pageObject.commonObject.CommonObjectPopped;
import com.utils.json.JsonObject;
import lombok.Data;

@Data
public class TableContent extends JsonObject {
    CommonObject commonObject = new CommonObject();
    CommonObjectPopped commonObjectPopped = new CommonObjectPopped();
    String popped = commonObjectPopped.getPrefix(); //div[@tabindex]
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
        if(type.toLowerCase().contains("popped")){
            prefix = prefix + popped;
        }
        if(type.toLowerCase().contains("tabbed")){
            prefix = prefix + tabbed;
        }
        super.setPrefix(prefix);
        //label[1=1 and text()='客户柜台代码']/../following-sibling::*[1]//input/../..

    }

    private String d9;
    //通用-表格-table
    private String x9;
    //table[1=1 and contains(@class,'ant-table-fixed')]

    private String d10;
    //通用-表格表体rows-tr
    private String x10;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not (contains(@style,'height'))]
    // 不包含编辑那列,比如客户联系人,具体取决于样式

    private String d10Action;
    //通用-表格表体rows-tr-action(编辑,查看...)
    private String x10Action;
    //table[1=1 and contains(@class,'ant-table-fixed')  and @style]//tr[@data-row-key]

    private String d10ActionDetails;
    //通用-表格表体rows-tr-action(详情,更多...)-详情-a
    private String x10ActionDetails;
    //table[1=1 and contains(@class,'ant-table-fixed') and @style]//tr[@data-row-key]//a[text()='详情']

    private String d10ActionEdits;
    //通用-表格表体rows-tr-action(详情,更多...)-编辑-a
    private String x10ActionEdits;
    //table[1=1 and contains(@class,'ant-table-fixed') and @style]//tr[@data-row-key]//a[text()='编辑']

    private String d10ActionMore;
    //通用-表格表体rows-tr-action(详情,更多...)-更多-a
    private String x10ActionMore;
    //table[1=1 and contains(@class,'ant-table-fixed') and @style]//tr[@data-row-key]//a[text()='详情']/following-sibling::a[1]

    private String d10ActionMoreEdits;
    //通用-表格表体rows-selected-tr
    private String x10ActionMoreEdits;
    //a[text()='编辑'] 这个需要进一步处理,定位最后一个


    private String d10ActionMoreDeletes;
    //通用-表格表体rows-selected-tr
    private String x10ActionMoreDeletes;
    //a[text()='删除'] 这个需要进一步处理,定位最后一个

    private String d10Selected;
    //通用-表格表体rows-selected-tr
    private String x10Selected;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected') and not(@style)]

    private String d10NotSelected;
    //通用-表格表体rows-not selected-tr
    private String x10NotSelected;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected')) and not(@style)]

    private String d11;
    //通用-表格表头(可能有多表头)-tr
    private String x11;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]

    private String d11Tmp;
    //临时
    private String x11Tmp;

    private String d11Tr1;
    //通用-表格表头row下的tr[1]/th col-th
    private String x11Tr1;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)][1]//th[not(@key='selection-column') and not(@key='action')]

    private String d11Tr2;
    //通用-表格表头row下的tr[2]/th col-th
    private String x11Tr2;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)][1]//th[not(@key='selection-column') and not(@key='action')]


    private String d31;
    //通用-表格表头-多选框-th
    private String x31;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']


    private String d12;
    //通用-表格下方翻页按钮-上一页-li
    private String x12;
    //li[1=1 and contains(@title,'上一页')]

    private String d13;
    //通用-表格下方翻页按钮-下一页-li
    private String x13;
    //li[1=1 and contains(@title,'下一页')]

    private String d14;
    //通用-表格下方翻页按钮-下一页前的按钮,可以看出共多少页-a
    private String x14;
    //li[1=1 and contains(@title,'下一页')]/preceding-sibling::li[1]/a

    private String d15;
    //通用-表格下方跳页输入框-input
    private String x15;
    //div[1=1 and contains(text(),"跳至")]/input

    private String d16;
    //通用-表格下方跳页输入框左边的跳至两个字-div
    private String x16;
    //div[1=1 and contains(text(),"跳至")]

    private String d17;
    //通用-数据加载(转菊花)-span
    private String x17;
    //span[1=1 and contains(@class,'ant-spin-dot')]

    private String d18;
    //通用-条/页-div
    private String x18;
    //div[1=1 and contains(@title,'条/页')]

    private String d18L5;
    //通用-条/页-5 条/页-li
    private String x18L5;
    //li[1=1 and text()='5 条/页' ]

    private String d18L10;
    //通用-条/页-10 条/页-li
    private String x18L10;
    //li[1=1 and text()='10 条/页' ]

    private String d18L20;
    //通用-条/页-20 条/页-li
    private String x18L20;
    //li[1=1 and text()='20 条/页' ]

    private String d18L30;
    //通用-条/页-30 条/页-li
    private String x18L30;
    //li[1=1 and text()='30 条/页' ]

    private String d28;
    //通用-表头多选框-input
    private String x28;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']//input


    private String get$X10Sibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(@style)][30]
        String xpath = getPrefix()+commonObject.get$X10Sibling(num);
        return xpath;
    }

    private String get$D10Sibling(int num) {
        //信息发布-表格表体-第1行
        String description = commonObject.get$D10Sibling(num);
        description = description.replaceFirst("通用", getDesPrefix());
        return description;
    }

    public JSONObject get$10SiblingJson(int num) {
        JsonObject.setJsonObject(get$D10Sibling(num), get$X10Sibling(num));
        return JsonObject.getJsonObject();
    }


    private String get$X10ActionDetails(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style][1]//a[text()='详情']
        String xpath = getPrefix()+commonObject.getX10ActionDetails();
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
        String desc = "通用-操作更多(或者详情)-第".replaceFirst("通用", getDesPrefix());
        return commonObject.get$D(num, desc);
    }


    public JSONObject get$10ActionDetailsJson(int num) {
        JsonObject.setJsonObject(get$D10ActionDetails(num), get$X10ActionDetails(num));
        return JsonObject.getJsonObject();
    }

    private String get$X10ActionSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')  and @style]//tr[@data-row-key][30]
        return commonObject.get$X10ActionSibling(num);
    }


    private String get$D10ActionSibling(int num){

        return commonObject.get$D10ActionSibling(num).replaceFirst("通用", getDesPrefix());
    }

    public JSONObject get$10ActionSiblingJson(int num) {
        JsonObject.setJsonObject(get$D10ActionSibling(num), get$X10ActionSibling(num));
        return JsonObject.getJsonObject();
    }

}
