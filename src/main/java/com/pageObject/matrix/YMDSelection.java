package com.pageObject.matrix;

import com.alibaba.fastjson.JSONObject;
import com.pageObject.commonObject.CommonObject;
import com.utils.date.DateMisc;
import com.utils.json.JsonObject;
import lombok.Data;

@Data
public class YMDSelection extends JsonObject {
    private CommonObject commonObject = new CommonObject();
//    private String prefix = "";

    private String lastYear = "上一年 (Control键加左方向键)";
    private String lastMonth = "上个月 (翻页上键)";
    private String selectYear = "选择年份";
    private String selectMonth = "选择月份";
    private String nextMonth = "下个月 (翻页下键)";
    private String nextYear = "下一年 (Control键加右方向键)";
    private String today = DateMisc.getYMD();
    private String lastDecade = "上一年代";
    private String selectDecade = "选择年代";
    private String nextDecade = "下一年代";
    private String lastCentury = "上一世纪";
    private String nextCentury = "下一世纪";


    public YMDSelection() {
        setDesPrefix("");
        super.setPrefix("");
        setConVal("");
//        super.setLabel("");


    }

    public YMDSelection(String label) {
//        super.setLabel(label);
        setDesPrefix(label);
        setPrefix(label);
        setConVal(label);


//        initialise();
//        System.out.println("((())))))");
//        System.out.println(getdYMDLastYear() );
//        System.out.println("((())))))");
    }

    public void setPrefix(String label) {
        super.setPrefix(commonObject.get$XInput(label) + "/../..");
        //label[1=1 and text()='客户柜台代码']/../following-sibling::*[1]//input/../..

    }

    public void setPrefix(String label, String leftOrRight) {
        super.setPrefix(commonObject.get$XInput(label) + "/../..//div[contains(@class,\"" + leftOrRight + "\")]");
    }


//    public void modifyPrefix(String label) {
//        super.setPrefix(commonObject.get$XInput(label) + "/../..//div[contains(@class,\"right\")]");
//    }

//    private void initialize() {
//        //label[1=1 and contains(text(),"签署日期")]/../following-sibling::*[1]//input/../..//a
//        xYMDLastYear = getPrefix() + xYMDLastYear;
//        xYMDLastMonth = getPrefix() + xYMDLastMonth;
//        xYMDSelectYear = getPrefix() + xYMDSelectYear;
//        xYMDSelectMonth = getPrefix() + xYMDSelectMonth;
//        xYMDNextMonth = getPrefix() + xYMDNextMonth;
//        xYMDNextYear = getPrefix() + xYMDNextYear;
//        xYMDToday = getPrefix() + xYMDToday;
//        xYMDLastDecade = getPrefix() + xYMDLastDecade;
//        xYMDSelectDecade = getPrefix() + xYMDSelectDecade;
//        xYMDNextDecade = getPrefix() + xYMDNextDecade;
//        xYMDLastYearMP = getPrefix() + xYMDLastYearMP;
//        xYMDSelectYearMP = getPrefix() + xYMDSelectYearMP;
//        xYMDLastCentury = getPrefix() + xYMDLastCentury;
//        xYMDNextCentury = getPrefix() + xYMDNextCentury;
//        xYMDCenturyBetweenLastAndNext = getPrefix() + xYMDCenturyBetweenLastAndNext;
//    }


    protected String dLastYear = "通用-日期控件-上一年-a";
    protected String xLastYear = get$XByTitle(lastYear);
    //a[@title='上一年 (Control键加左方向键)']

    protected String dLastMonth = "通用-日期控件-上个月-a";
    protected String xLastMonth = get$XByTitle(lastMonth);
    //a[@title='上个月 (翻页上键)']


    protected String dSelectYear = "通用-日期控件-选择年份-a";
    protected String xSelectYear = get$XByTitle(selectYear);
    //a[@title='选择年份']

    protected String dSelectMonth = "通用-日期控件-选择月份-a";
    protected String xSelectMonth = get$XByTitle(selectMonth);
    //a[@title='选择月份']

    protected String dNextMonth = "通用-日期控件-下个月-a";
    protected String xNextMonth = get$XByTitle(nextMonth);
    //a[@title='下个月 (翻页下键)']

    protected String dNextYear = "通用-日期控件-下一年-a";
    protected String xNextYear = get$XByTitle(nextYear);
    //a[@title='下一年 (Control键加右方向键)']

    protected String dToday = "通用-日期控件-今天-a";
    protected String xToday = get$XByTitle(today);
    //a[@title='DateFormat.getYMD()']

    ////////////////////点击了XXXX年后
    protected String dLastDecade = "通用-日期控件-上一年代-a";
    protected String xLastDecade = get$XByTitle(lastDecade);
    //a[@title='上一年代']

    protected String dSelectDecade = "通用-日期控件-选择年代-a";
    protected String xSelectDecade = get$XByTitle(selectDecade);
    //a[@title='选择年代']

    protected String dNextDecade = "通用-日期控件-下一年代-a";
    protected String xNextDecade = get$XByTitle(nextDecade);
    //a[@title='下一年代']
//////////////////
    //////////////////////////点击了XX月后

    protected String dLastYearMP = "通用-日期控件-月-上一年-a";
    protected String xLastYearMP = xLastYear.replaceFirst("//a\\[", "//a\\[@role and ");
    //a[@role and @title='上一年 (Control键加左方向键)']

    protected String dSelectYearMP = "通用-日期控件-月-选择年份-a";
    protected String xSelectYearMP = xSelectYear.replaceFirst("//a\\[", "//a\\[@role and " +
            "contains(@class,'month') and ");
    //a[@role and @title='选择年份']

    protected String dNextYearMP = "通用-日期控件-月-下一年-a";
    protected String xNextYearMP = xNextYear.replaceFirst("//a\\[", "//a\\[@role and ");
    //a[@role and @title='下一年 (Control键加右方向键)']

    //////////////////////

////////////////////////////点了 XXXX-XXXX后

    protected String dLastCentury = "通用-日期控件-年/月-上一世纪-a";
    protected String xLastCentury = get$XByTitle(lastCentury);
    //a[@title='下一世纪']


    protected String dCenturyBetweenLastAndNext = "通用-日期控件-年/月-上一世纪和下一世纪当中的世纪-div";
    protected String xCenturyBetweenLastAndNext = xLastCentury + "/following-sibling::div";
    //a[@title='下一世纪']


    protected String dNextCentury = "通用-日期控件-年/月-下一世纪-a";
    protected String xNextCentury = get$XByTitle(nextCentury);
    //a[@title='下一世纪']

    /////////////////////////////


    private String get$XByTitle(String title) {
        String a = getPrefix() + "//a";
        a = a + "[@title='";
        a = a + title;
        a = a + "']";
        return a;
    }


    private String get$XYearByText(String year) {
        //a[@class='ant-calendar-year-panel-year' and text()='2019']
        String a = getPrefix() + "//td[not(contains(@class,'decade'))]/a";
        a = a + "[@class='ant-calendar-year-panel-year' and text()='";
        a = a + year;
        a = a + "']";
        return a;
    }

    private String get$DYearByText(String year) {
        String description = "通用-日期控件-年-";
        description = description + year;
        return description;
    }

    public JSONObject get$YearByTextJson(String year) {
        JsonObject.setJsonObject(get$DYearByText(year), get$XYearByText(year));

        return JsonObject.getJsonObject();
    }


    private String get$XDayByText(String day) {
        //td[not(contains(@class,'next-month')) and not(contains(@class,'last-month'))]/div[@class='ant-calendar-date' and text()='1']
        String a = getPrefix() + "//td[(not(contains(@class,'next-month')) and not(contains(@class,'last-month')))]/div";
        a = a + "[@class='ant-calendar-date' and text()='";
        a = a + day;
        a = a + "']";
        return a;
    }


    private String get$DDayByText(String day) {
        String description = "通用-日期控件-日-";
        description = description + day;
        return description;
    }


    public JSONObject get$DayByTextJson(String day) {
        JsonObject.setJsonObject(get$DDayByText(day), get$XDayByText(day));

        return JsonObject.getJsonObject();
    }


    private String get$XMonthByText(String month) {
        //a[@class='ant-calendar-month-panel-month' and text()='五月']
        String a = getPrefix() + "//a";
        a = a + "[@class='ant-calendar-month-panel-month' and text()='";
        a = a + month;
        a = a + "']";
        return a;
    }

    private String get$DMonthByText(String month) {
        String description = "通用-日期控件-月-";
        description = description + month;
        return description;
    }

    public JSONObject get$MonthByTextJson(String month) {
        JsonObject.setJsonObject(get$DMonthByText(month), get$XMonthByText(month));

        return JsonObject.getJsonObject();
    }


    private String get$XDecadeByText(String yearYear) {
        //a[@class='ant-calendar-decade-panel-decade' and text()='2020-2029']
        String a = getPrefix() + "//td[not(contains(@class,'last'))]/a";
        a = a + "[@class='ant-calendar-decade-panel-decade' and text()='";
        a = a + yearYear;
        a = a + "']";
        return a;
    }

    private String get$DDecadeByText(String yearYear) {
        String description = "通用-日期控件-年-年-";
        description = description + yearYear;
        return description;
    }

    public JSONObject get$DecadeByTextJson(String yearYear) {
        JsonObject.setJsonObject(get$DDecadeByText(yearYear), get$XDecadeByText(yearYear));

        return JsonObject.getJsonObject();
    }


//    public JSONObject getJson(String description) {
//        String str = "";
//        switch (description) {
//            case dYMDLastYear:
//                JsonObject.setJsonObject(dYMDLastYear, xYMDLastYear);
//                break;
//            case dYMDLastMonth:
//                JsonObject.setJsonObject(dYMDLastMonth, xYMDLastMonth);
//                break;
//            case dYMDSelectYear:
//                JsonObject.setJsonObject(dYMDSelectYear, xYMDSelectYear);
//                break;
//            case dYMDSelectMonth:
//                JsonObject.setJsonObject(dYMDSelectMonth, xYMDSelectMonth);
//                break;
//            case dYMDNextMonth:
//                JsonObject.setJsonObject(dYMDNextMonth, xYMDNextMonth);
//                break;
//            case dYMDNextYear:
//                JsonObject.setJsonObject(dYMDNextYear, xYMDNextYear);
//                break;
//            case dYMDToday:
//                JsonObject.setJsonObject(dYMDToday, xYMDToday);
//                break;
//            case dYMDLastDecade:
//                JsonObject.setJsonObject(dYMDLastDecade, xYMDLastDecade);
//                break;
//            case dYMDSelectDecade:
//                JsonObject.setJsonObject(dYMDSelectDecade, xYMDSelectDecade);
//                break;
//            case dYMDNextDecade:
//                JsonObject.setJsonObject(dYMDNextDecade, xYMDNextDecade);
//                break;
//            case dYMDLastYearMP:
//                JsonObject.setJsonObject(dYMDLastYearMP, xYMDLastYearMP);
//                break;
//            case dYMDSelectYearMP:
//                JsonObject.setJsonObject(dYMDSelectYearMP, xYMDSelectYearMP);
//                break;
//            case dYMDNextYearMP:
//                JsonObject.setJsonObject(dYMDNextYearMP, xYMDNextYearMP);
//                break;
//            case dYMDLastCentury:
//                JsonObject.setJsonObject(dYMDLastCentury, xYMDLastCentury);
//                break;
//            case dYMDNextCentury:
//                JsonObject.setJsonObject(dYMDNextCentury, xYMDNextCentury);
//                break;
//            case dYMDCenturyBetweenLastAndNext:
//                JsonObject.setJsonObject(dYMDCenturyBetweenLastAndNext, xYMDCenturyBetweenLastAndNext);
//                break;
//
//        }
//
//        return JsonObject.getJsonObject();
//
//    }


}



























