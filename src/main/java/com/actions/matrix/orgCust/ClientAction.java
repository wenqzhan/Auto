package com.actions.matrix.orgCust;

import com.alibaba.fastjson.JSONObject;
import com.driver.$;

import com.pageObject.commonObject.BizLineSelection;
import com.pageObject.matrix.navigate.TopNavigator;
import com.pageObject.matrix.orgCust.AssignCust;
import com.pageObject.matrix.orgCust.Client;
import com.sql.matrix.orgCust.ClientSql;
import com.utils.jdbc.JDBC;
import com.utils.list.ListMisc;
import com.utils.log.LoggerController;
import com.utils.num.IntMisc;
import com.utils.random.RandomInfo;
import com.utils.random.Randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ClientAction extends $ {
    private final static LoggerController log = LoggerController.getLogger(ClientAction.class);


    public static void getTable() {
        jsonObject = Client.getJson(Client.d11);
        $.findElements(jsonObject);
        $.getTableHeader();
        //定位表头,获取表头中的所有文字,存到tableContent中
        if (isNotDisplayed(Client.getJson(Client.d17))) {//如果数据加载的那个菊花不显示了,说明已经加载好
            jsonObject = Client.getJson(Client.d10);
            try {
                findElement(jsonObject, 2, false);
                findElements(jsonObject);
                getTableBody();
            } catch (Exception e) {
                log.info("表格表体应该是空的");
            }
        }
    }


    public static void getInfo(int num) {
        jsonObject = Client.getJson(Client.d11);
        $.findElements(jsonObject);
        $.getTableHeader();
        //定位表头,获取表头中的所有文字,存到tableContent中

        if (isNotDisplayed(Client.getJson(Client.d17))) {//如果数据加载的那个菊花不显示了,说明已经加载好
            jsonObject = Client.get$D10SiblingJson(num);
            $.findElements(jsonObject);
            $.getTableBody();
        }

    }

    public static boolean isElementAppeared(JSONObject jsonObject) {
        boolean flag = true;
        try {
            findElement(jsonObject);
        } catch (Exception e) {
            flag = false;
        } finally {
            $.jsonObject = null;
        }
        log.info("isElementAppeared:" + flag);
        return flag;
    }


    public static boolean isElementAppeared() {
        boolean flag = true;
        try {
            findElement(jsonObject);
        } catch (Exception e) {
            flag = false;
        } finally {
            jsonObject = null;
        }
        log.info("isElementAppeared:" + flag);
        return flag;
    }


    public static boolean isBizLinesEqualsStrings() {
        boolean flag = true;
        getInputValue();
        List<String> list = Arrays.asList(text.split(","));
        strings2 = new ArrayList<>(list);
        flag = ListMisc.isEqualAfterSorted(strings1, strings2);
        strings1.clear();
        strings2.clear();
        log.info("isBizLinesEqualsStrings:" + flag);
        return flag;
    }


    public static boolean isStringEqualsText() {
        boolean flag = true;
        getInputValue();
        flag = string.equals(text);
        string = "";
        text = "";
        log.info("isStringEqualsText:" + flag);
        return flag;
    }

    public static boolean isSelected() {
        boolean flag = true;
        getAttribute("class");
        flag = (attributeValue.contains("selected") || attributeValue.contains("checked"));
        attributeValue = "";
        log.info("isSelected:" + flag);
        return flag;
    }

    public static String getRandomMobile() {
        String mobile = "";

        while (true) {
            mobile = RandomInfo.getMobil();
            String count = JDBC.getSqlResultStr(ClientSql.getSql3(mobile));
            if (count.equals("0")) {
                break;
            }

        }
        log.info("random mobile is :" + mobile);
        return mobile;
    }

    public static boolean isBizLineSelected() {
        boolean flag = true;
        int a = nums.size();
        for (int i = 0; i < a; i++) {
            findElement(BizLineSelection.getJsonBLS34_1Sibling(nums.get(i)));
            flag = isSelected();
            if (!flag) {
                break;
            }
        }
        log.info("isBizLineSelected:" + flag);
        nums.clear();
        return flag;

    }

    public static void clickRandomBizLine() {
        findElements(BizLineSelection.getJson(BizLineSelection.dBLS34_1));
        int num = elements.size();
        for (int i = 0; i < num; i++) {
            int random = Randoms.getRandomNum(0, 1);
            if (random == 1) {
                element = elements.get(i);
                click();
                getAttribute("title");
                strings1.add(attributeValue);
                attributeValue = null;
                int a = i + 1;
                nums.add(a);
            } else if (random == 0) {
                //do nothing
            }
        }
    }


    public static boolean isInTableEqualsInDetail() {
        boolean flag = true;
        List<List<String>> tc = tableContent;
        List<String> listHead = tc.get(0);
        List<String> listBody = tc.get(1);
        for (int i = 1; i < listHead.size(); i++) {
            String head = listHead.get(i);
            System.out.println(head + ":前面的是表头里的列明");
            if (listHead.get(i).equals("客户经理")) {
                head = "国君服务联系人";
            } else {
                head = listHead.get(i);
            }
            String body = listBody.get(i);

            if (!(head.equals("开通道合APP") || head.equals("道合APP有效期") || head.equals("更新时间"))) {
                findElement(Client.get$DPQueryInputJson(head));
                String inputValue = getInputValue();
                flag = inputValue.equals(body);
            } else if (head.equals("创建人")) {
                findElement(TopNavigator.getJson(TopNavigator.dTNUserName));
                getText();
                String userName = text.trim();
                flag = userName.equals(body);
            }
            if (!flag) {
                log.info("第:" + i + ";" + head + ";" + body + ";" + text + ";");
                break;
            }

        }
        return flag;
    }


    public static void getPerPageNum() {
        findElement(Client.getJson(Client.d18));//定位 条/页
        getText();//获取 条/页 里的文本
        perPageNum = IntMisc.getPerPageNum(text);
    }

    public static List<String> getWebpageInfo() {
        List<String> webInfo = new ArrayList<>();
        List<String> listHead = strsInHeader;
        for (int i = 1; i < listHead.size(); i++) {
            String head = listHead.get(i);
            System.out.println(head + ":前面的是表头里的列明");
            if (listHead.get(i).equals("客户经理")) {
                head = "国君服务联系人";
            } else {
                head = listHead.get(i);
            }

            if (!(head.equals("开通道合APP") || head.equals("道合APP有效期") || head.equals("更新时间"))) {
                findElement(Client.get$DPQueryInputJson(head));
                String inputValue = getInputValue();
                webInfo.add(inputValue);
            } else if (head.equals("创建人")) {
                findElement(TopNavigator.getJson(TopNavigator.dTNUserName));
                getText();
                String userName = text.trim();
                webInfo.add(userName);
            }

        }
        return webInfo;
    }


}
