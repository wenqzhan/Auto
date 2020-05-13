package com.actions.matrix.orgCust.custListManage;

import com.alibaba.fastjson.JSONObject;
import com.driver.$;
import com.pageObject.matrix.orgCust.OrgCustList;
import com.pageObject.matrix.orgCust.custListManage.CustomAdjustHistory;
import org.openqa.selenium.WebElement;

import java.awt.event.KeyEvent;
import java.util.List;

public class CustomAdjustHistoryAction extends $ {
//    private  JSONObject jsonObject;
//    private CustomAdjustHistory customAdjustHistory = new CustomAdjustHistory();
//
//    public  void getTable() {
//        jsonObject = customAdjustHistory.getJson(customAdjustHistory.d10);
//        List<WebElement> elements = $.findElements(jsonObject);
//        $.getTableHeader(elements);
//        //定位表头,获取表头中的所有文字,存到tableContent中
//        jsonObject = customAdjustHistory.getJson(customAdjustHistory.d9);
//        //System.out.println(jsonObject);
//        elements =$.findElements(jsonObject);
//        $.getTableBody(elements);
//        //定位表体,获取表体中的所有问题,存到tableContent中
//        //System.out.println(elements2.size()+"1111111111");
//        //System.out.println("-----------------");
//        //PrintList.printList(tableContent);
//        //System.out.println("*****************");
//    }
//
//    public  void getTable(int i) {
//
//        jsonObject = customAdjustHistory.getJson(customAdjustHistory.d15);
//        WebElement element =$.findElement(jsonObject);
//        $.click(element);//点击下一页
//
////        jsonObject = customAdjustHistory.getJson(customAdjustHistory.d12);
////        $.findElements(jsonObject);
////        $.sendKeys(String.valueOf(i));
////        $.pressAndRelease(KeyEvent.VK_ENTER);
//
////        jsonObject = customAdjustHistory.getJson(customAdjustHistory.d13);
////        $.findElements(jsonObject);
//
//
//        jsonObject = customAdjustHistory.getJson(customAdjustHistory.d14);
//        $.findElement(jsonObject);
//        if ($.isNotDisplayed(jsonObject)) {//如果数据加载的那个菊花不显示了,说明已经加载好
//            jsonObject = customAdjustHistory.getJson(customAdjustHistory.d9);
//            //System.out.println(jsonObject);
//            List<WebElement> elements = $.findElements(jsonObject);
//            $.getTableBody(elements);
//        }
//
//    }
//
//
//
//
//    /**
//     * 在客户查询功能中根据传入的OA查询
//     *
//     * @param oa 客户名称,可以是全名或者部分
//     */
//    public  void searchCustOA(String oa) {
//        jsonObject = customAdjustHistory.getJson(customAdjustHistory.d1);
//        WebElement element = $.findElement(jsonObject);//定位OA账号查询框
//        $.clear(element);//框内框内有数据,先清空
//        $.sendKeys(element,oa);//输入客户名称
//        jsonObject = customAdjustHistory.getJson(customAdjustHistory.d3);
//        element=$.findElement(jsonObject);//定位查询按钮
//        $.click(element);//点击查询按钮
//        jsonObject = customAdjustHistory.getJson(customAdjustHistory.d9);
//        $.findElements(jsonObject);
//        //定位查询结果(表格的表体,定位到了说明查询有结果了.不能定位表头,因为表头一直存在)
//    }
//
//    /**
//     * 在客户查询功能中根据传入的OA查询
//     *
//     * @param custName 客户名称,可以是全名或者部分
//     */
//    public  void searchCustCustName(String custName) {
//        jsonObject = customAdjustHistory.getJson(customAdjustHistory.d2);
//        WebElement element =$.findElement(jsonObject);//定位客户名称查询框
//        $.clear(element);//框内框内有数据,先清空
//        $.sendKeys(element,custName);//输入客户名称
//        jsonObject = customAdjustHistory.getJson(customAdjustHistory.d3);
//       element= $.findElement(jsonObject);//定位查询按钮
//        $.click(element);//点击查询按钮
//        jsonObject = customAdjustHistory.getJson(customAdjustHistory.d9);
//        $.findElements(jsonObject);
//        //定位查询结果(表格的表体,定位到了说明查询有结果了.不能定位表头,因为表头一直存在)
//    }
//
//
//    public  void searchAll(List<String> strings){
//
//    }

}
