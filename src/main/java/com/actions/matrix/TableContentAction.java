package com.actions.matrix;

import com.actions.matrix.learn.xxfb.XxfbListAction;
import com.alibaba.fastjson.JSONObject;
import com.driver.$;
import com.pageObject.matrix.TableContent;
import com.utils.log.LoggerController;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TableContentAction extends $ {


    private final static LoggerController log = LoggerController.getLogger(TableContentAction.class);

    public static List<List<String>> getTable(TableContent tableContent) {
        List<String> strsInHeader;
        List<List<String>> contents = new ArrayList<>();
        JSONObject jsonObject;

        jsonObject = tableContent.getJsonObject(tableContent.getD11());

        strsInHeader = $.getTableHeader(jsonObject);

        if (isNotDisplayed(tableContent.getJsonObject(tableContent.getDTableLoadingSignSpan()))) {//如果数据加载的那个菊花不显示了,说明已经加载好
            jsonObject = tableContent.getJsonObject(tableContent.getDTableTrs());
            try {
                findElement(jsonObject, 2, false);
                contents = getTableBody(jsonObject);
            } catch (Exception e) {
                log.info("表格表体应该是空的");
            }
        }
        //定位表头,获取表头中的所有文字,存到tableContent中
        contents.add(0, strsInHeader);
        return contents;

    }


    public static List<List<String>> getInfo(TableContent tableContent, int num) {
        List<String> strsInHeader;
        List<List<String>> contents = new ArrayList<>();
        JSONObject jsonObject;

        jsonObject = tableContent.getJsonObject(tableContent.getD11());

        strsInHeader = $.getTableHeader(jsonObject);

        if (isNotDisplayed(tableContent.getJsonObject(tableContent.getDTableLoadingSignSpan()))) {//如果数据加载的那个菊花不显示了,说明已经加载好
            jsonObject = tableContent.get$TableTrsSiblingJson(num);
            try {
                findElement(jsonObject, 2, false);
                contents = getTableBody(jsonObject);
            } catch (Exception e) {
                log.info("表格表体应该是空的,或者输入的num有误");
            }
        }
        //定位表头,获取表头中的所有文字,存到tableContent中
        contents.add(0, strsInHeader);

        return contents;
    }



}
