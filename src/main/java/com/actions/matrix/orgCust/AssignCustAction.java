package com.actions.matrix.orgCust;

import com.alibaba.fastjson.JSONObject;
import com.driver.$;
import com.pageObject.matrix.orgCust.AssignCust;
import com.utils.jdbc.JDBC;
import com.utils.log.LoggerController;
import com.utils.num.IntMisc;
import com.utils.string.StringMisc;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AssignCustAction extends $ {
//    private final  LoggerController log = LoggerController.getLogger(AssignCustAction.class);
//    private AssignCust assignCust = new AssignCust();
////    private  String string; //通用的string,用来存string
//    private  int randomPerPageNum;
//    private  int randomPageNum;
//    private  int maxPageNum;
//    private  int perPageNum;
//    private  String text;
//    public  List<String> strsInTable = new ArrayList<>();
//    public  List<String> strsInHeader = new ArrayList<>();
//    private  JSONObject jsonObject;
//
//
//    public  void getTable() {
//        jsonObject = assignCust.getJson(assignCust.d11);
//        List<WebElement> elements =$.findElements(jsonObject);
//        $.getTableHeader(elements);
//        //定位表头,获取表头中的所有文字,存到tableContent中
//        jsonObject = assignCust.getJson(assignCust.d10);
//        try {
//            findElement(jsonObject, 2, false);
//            elements = findElements(jsonObject);
//            getTableBody(elements);
//        } catch (Exception e) {
//            log.info("表格表体应该是空的");
//        }
//    }
//
//    public  void getPoppedTable() {
////        jsonObject = assignCust.getJson(assignCust.dd2Pd11t);
//        List<WebElement> elements = $.findElements(jsonObject);
//        $.getTableHeader(elements);
//        //定位表头,获取表头中的所有文字,存到tableContent中
////        jsonObject = assignCust.getJson(assignCust.dd2Pd10t);
//        try {
//            findElement(jsonObject, 2, false);
//             elements =findElements(jsonObject);
//            getTableBody(elements);
//        } catch (Exception e) {
//            log.info("弹出的表格表体应该是空的");
//        }
//    }
//
//
//    public  int getLastPageTable() {
//        WebElement element = findElement(assignCust.getJson(assignCust.d14));
//        text = getText(element);//获取第几页,保存到text里
//        maxPageNum = IntMisc.getMaxPageNum(text);
//        click(element);
//        //findElement(assignCust.getJson(assignCust.d17));//定位菊花
//        if (isNotDisplayed(assignCust.getJson(assignCust.d17))) {//如果数据加载的那个菊花不显示了,说明已经加载好
//            getTable();
//        }
//        return maxPageNum;
//    }
//
//
//    public  int getRandomPageTable() {
//        WebElement element =findElement(assignCust.getJson(assignCust.d14));
//        text =getText(element);//获取第几页,保存到text里
//        randomPageNum = IntMisc.getRandomPageNum(text);
//        element = findElement(assignCust.getJson(assignCust.d15));
//        //clear();
//        sendKeys(element,"" + randomPageNum);
//        findElement(assignCust.getJson(assignCust.d28));
//        click(element);//点一下页面其他元素,会开始查询
//        //findElement(assignCust.getJson(assignCust.d17));//定位菊花
//        if (isNotDisplayed(assignCust.getJson(assignCust.d17))) {//如果数据加载的那个菊花不显示了,说明已经加载好
//            getTable();
//        }
//        return randomPageNum;
//    }
//
//
//    public  int getMaxPageNum() {
//        WebElement element =findElement(assignCust.getJson(assignCust.d14));
//        text = getText(element);
//        maxPageNum = IntMisc.getMaxPageNum(text);
//        return maxPageNum;
//    }
//
//
//    public  int getPerPageNum() {
//        WebElement element =findElement(assignCust.getJson(assignCust.d18));//定位 条/页
//        text= getText(element);//获取 条/页 里的文本
//        perPageNum = IntMisc.getPerPageNum(text);
//        return perPageNum;
//    }
//
//    public  int getPoppedPerPageNum() {
////        WebElement element =findElement(assignCust.getJson(assignCust.dd2Pd18t));//定位 条/页
////        text =getText(element);//获取 条/页 里的文本
//        perPageNum = IntMisc.getPerPageNum(text);
//        return perPageNum;
//    }
//
//
//
//    public  int getRandomPerPageNum() {
//        getPerPageNum();
//        randomPerPageNum = IntMisc.getRandomPerPageNum(perPageNum);
//        return randomPerPageNum;
//    }
//
//
//    public  void changeToPerPage(int randomPerPageNum) {
//        WebElement element = findElement(assignCust.getJson(assignCust.d18));
//        click(element);
//        switch (randomPerPageNum) {
//            case 5:
//                element=findElement(assignCust.getJson(assignCust.d18l5));
//                break;
//            case 10:
//                element=findElement(assignCust.getJson(assignCust.d18l10));
//                break;
//            case 20:
//                element=findElement(assignCust.getJson(assignCust.d18l20));
//                break;
//            case 30:
//                element=findElement(assignCust.getJson(assignCust.d18l30));
//                break;
//        }
//        click(element);
//
//
//    }
//
//
//    //获取表头+某一行数据
//    public  void getInfo(String num) {
//        jsonObject = assignCust.getJson(assignCust.d11);
//        List<WebElement> elements = $.findElements(jsonObject);
//        strsInHeader =$.getTableHeader(elements);
//        //定位表头,获取表头中的所有文字,存到tableContent中
//        jsonObject = assignCust.get$Json1(num);
//       elements = $.findElements(jsonObject);
//        $.getTableBody(elements);
//    }
//
//
//    public  void getTable(int i) {
//
//        jsonObject = assignCust.getJson(assignCust.d13);
//        WebElement element = $.findElement(jsonObject);
//        $.click(element);//点击下一页
//
////        jsonObject = CustomerRelationshipFundAccount.getJson(CustomerRelationshipFundAccount.d12);
////        $.findElements(jsonObject);
////        $.sendKeys(String.valueOf(i));
////        $.pressAndRelease(KeyEvent.VK_ENTER);
//
////        jsonObject = CustomerRelationshipFundAccount.getJson(CustomerRelationshipFundAccount.d13);
////        $.findElements(jsonObject);
//
//
//        //jsonObject = assignCust.getJson(assignCust.d17);
//        $.findElement(assignCust.getJson(assignCust.d17));
//        if ($.isNotDisplayed(jsonObject)) {//如果数据加载的那个菊花不显示了,说明已经加载好
//            getTable();
//        }
//
//    }
//
//
//    public  String getSqlResultStr(String sql) {
//        String str = JDBC.getSqlResultStr(sql);
//        //string = str;
//        return str;
//    }
//
//
//    public  String getPartialSqlResultStr(String sql) {
//        String str = JDBC.getSqlResultStr(sql);
//        str = StringMisc.getPartialStr(str);
//        //string = str;
//        return str;
//    }
//
//
//    public  void searchCustName(String custName) {
//        WebElement element = findElement(assignCust.getJson(assignCust.d2));//找到客户名称输入框
//        //clear();//清除已有内容
//        sendKeys(element,custName);//根据传入的内容输入客户名称
//        element=findElement(assignCust.getJson(assignCust.d3));//找到查询按钮
//        click(element);//点击查询按钮
//        //findElement(assignCust.getJson(assignCust.d17));//定位转菊花
//
//        if ($.isNotDisplayed(assignCust.getJson(assignCust.d17))) {//如果数据加载的那个菊花不显示了,说明已经加载好
//            getTable();//获取页面数据
//        }
//
//    }
//
//
//    public  void searchOAAccount(String OAAccount) {
//        WebElement element = findElement(assignCust.getJson(assignCust.d1));//找到客户名称输入框
//        //clear();//清除已有内容
//        sendKeys(element,OAAccount);//根据传入的内容输入客户名称
//        element=findElement(assignCust.getJson(assignCust.d3));//找到查询按钮
//        click(element);//点击查询按钮
//        //findElement(assignCust.getJson(assignCust.d17));//定位转菊花
//
//        if ($.isNotDisplayed(assignCust.getJson(assignCust.d17))) {//如果数据加载的那个菊花不显示了,说明已经加载好
//            getTable();//获取页面数据
//        }
//
//    }
//
//
//    public  void searchCustManager(String custManager) {
//
//        while (true) {
//            int a =0;
//            try {
//                a++;
//                if(a>100){
//                    log.error("找不到输入框,要死循环了,跳出吧");
//                    break;
//                }
//                findElement(assignCust.getJson(assignCust.d27), 2, false);
//                break;
//            } catch (Exception e) {
//                WebElement element = findElement(assignCust.getJson(assignCust.d5));
//                click(element);//点击展开
//            }
//        }    //如果找不到客户经理输入框,那么可能是被折叠了,那么展开
//
//        WebElement element = findElement(assignCust.getJson(assignCust.d27));//找到客户经理输入框
//        //clear();//清除已有内容
//        sendKeys(element,custManager);//根据传入的内容输入客户名称
//        element=findElement(assignCust.getJson(assignCust.d3));//找到查询按钮
//        click(element);//点击查询按钮
//        //findElement(assignCust.getJson(assignCust.d17));//定位转菊花
//
//        if ($.isNotDisplayed(assignCust.getJson(assignCust.d17))) {//如果数据加载的那个菊花不显示了,说明已经加载好
//            getTable();//获取页面数据
//        }
//
//    }
//

}
