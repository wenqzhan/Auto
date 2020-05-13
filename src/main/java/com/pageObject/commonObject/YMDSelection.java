package com.pageObject.commonObject;

import com.alibaba.fastjson.JSONObject;
import com.utils.date.DateMisc;
import com.utils.json.JsonObject;
import lombok.Data;

@Data
public class YMDSelection extends JsonObject {
    private CommonObject commonObject = new CommonObject();
//    private String prefix = "";

    private final String lastYear = "上一年 (Control键加左方向键)";
    private final String lastMonth = "上个月 (翻页上键)";
    private final String selectYear = "选择年份";
    private final String selectMonth = "选择月份";
    private final String nextMonth = "下个月 (翻页下键)";
    private final String nextYear = "下一年 (Control键加右方向键)";
    private final String today = DateMisc.getYMD();
    private final String lastDecade = "上一年代";
    private final String selectDecade = "选择年代";
    private final String nextDecade = "下一年代";
    private final String lastCentury = "上一世纪";
    private final String nextCentury = "下一世纪";


    public YMDSelection() {

    }

    public YMDSelection(String label) {
        setPrefix(label);
//        initialise();
//        System.out.println("((())))))");
//        System.out.println(getdYMDLastYear() );
//        System.out.println("((())))))");
    }

    public void setPrefix(String label) {
        super.setPrefix(commonObject.get$XQueryInput(label) + "/../..");

    }

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


    private final String dYMDLastYear = "通用-日期控件-上一年-a";
    private String xYMDLastYear = get$XByTitle(lastYear);
    //a[@title='上一年 (Control键加左方向键)']

    private final String dYMDLastMonth = "通用-日期控件-上个月-a";
    private String xYMDLastMonth = get$XByTitle(lastMonth);
    //a[@title='上个月 (翻页上键)']


    private final String dYMDSelectYear = "通用-日期控件-选择年份-a";
    private String xYMDSelectYear = get$XByTitle(selectYear);
    //a[@title='选择年份']

    private final String dYMDSelectMonth = "通用-日期控件-选择月份-a";
    private String xYMDSelectMonth = get$XByTitle(selectMonth);
    //a[@title='选择月份']

    private final String dYMDNextMonth = "通用-日期控件-下个月-a";
    private String xYMDNextMonth = get$XByTitle(nextMonth);
    //a[@title='下个月 (翻页下键)']

    private final String dYMDNextYear = "通用-日期控件-下一年-a";
    private String xYMDNextYear = get$XByTitle(nextYear);
    //a[@title='下一年 (Control键加右方向键)']

    private final String dYMDToday = "通用-日期控件-今天-a";
    private String xYMDToday = get$XByTitle(today);
    //a[@title='DateFormat.getYMD()']

    ////////////////////点击了XXXX年后
    private final String dYMDLastDecade = "通用-日期控件-上一年代-a";
    private String xYMDLastDecade = get$XByTitle(lastDecade);
    //a[@title='上一年代']

    private final String dYMDSelectDecade = "通用-日期控件-选择年代-a";
    private String xYMDSelectDecade = get$XByTitle(selectDecade);
    //a[@title='选择年代']

    private final String dYMDNextDecade = "通用-日期控件-下一年代-a";
    private String xYMDNextDecade = get$XByTitle(nextDecade);
    //a[@title='下一年代']
//////////////////
    //////////////////////////点击了XX月后

    private final String dYMDLastYearMP = "通用-日期控件-月-上一年-a";
    private String xYMDLastYearMP = xYMDLastYear.replaceFirst("//a\\[", "//a\\[@role and ");
    //a[@role and @title='上一年 (Control键加左方向键)']

    private final String dYMDSelectYearMP = "通用-日期控件-月-选择年份-a";
    private String xYMDSelectYearMP = xYMDSelectYear.replaceFirst("//a\\[", "//a\\[@role and " +
            "contains(@class,'month') and ");
    //a[@role and @title='选择年份']

    private final String dYMDNextYearMP = "通用-日期控件-月-下一年-a";
    private String xYMDNextYearMP = xYMDNextYear.replaceFirst("//a\\[", "//a\\[@role and ");
    //a[@role and @title='下一年 (Control键加右方向键)']

    //////////////////////

////////////////////////////点了 XXXX-XXXX后

    private final String dYMDLastCentury = "通用-日期控件-年/月-上一世纪-a";
    private String xYMDLastCentury = get$XByTitle(lastCentury);
    //a[@title='下一世纪']


    private final String dYMDCenturyBetweenLastAndNext = "通用-日期控件-年/月-上一世纪和下一世纪当中的世纪-div";
    private String xYMDCenturyBetweenLastAndNext = xYMDLastCentury + "/following-sibling::div";
    //a[@title='下一世纪']


    private final String dYMDNextCentury = "通用-日期控件-年/月-下一世纪-a";
    private String xYMDNextCentury = get$XByTitle(nextCentury);
    //a[@title='下一世纪']

    /////////////////////////////


    private String get$XByTitle(String title) {
        String a = getPrefix() + "//a";
        a = a + "[@title='";
        a = a + title;
        a = a + "']";
        return a;
    }


    public String get$XYearByText(String year) {
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
        //td[not(contains(@class,'month'))]/div[@class='ant-calendar-date' and text()='1']
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



























