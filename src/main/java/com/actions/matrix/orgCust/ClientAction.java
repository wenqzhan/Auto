package com.actions.matrix.orgCust;

import com.alibaba.fastjson.JSONObject;
import com.driver.$;

import com.pageObject.matrix.BizLineSelection;
import com.pageObject.matrix.navigate.TopNavigator;
import com.pageObject.matrix.orgCust.Client;
import com.sql.matrix.orgCust.ClientSql;
import com.utils.jdbc.JDBC;
import com.utils.list.ListMisc;
import com.utils.log.LoggerController;
import com.utils.num.IntMisc;
import com.utils.random.RandomInfo;
import com.utils.random.Randoms;
import com.utils.string.StringMisc;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientAction extends $ {
    private final LoggerController log = LoggerController.getLogger(ClientAction.class);

    private List<String> strings1 = new ArrayList<>();//通用的list,用来存放诸如 XXXX,XXXX,XXXX的数据
    private List<String> strings2 = new ArrayList<>();//通用的list,用来存放诸如 XXXX,XXXX,XXXX的数据
    private List<Integer> nums = new ArrayList<>();//通用的list,用来存放int
    private String attributeValue;//通过getAttribute()获得
    private String string;//通过getAttribute()获得
    private String text;//通过getAttribute()获得
    private int perPageNum;
    private JSONObject jsonObject;
    private BizLineSelection bizLineSelection = new BizLineSelection();
    private Client client = new Client();
    private Client clientPopped = new Client("POPPED");
    private TopNavigator topNavigator = new TopNavigator();

    public ClientAction() {
        bizLineSelection = (BizLineSelection) bizLineSelection.getObjAttr();
        client = (Client) client.getObjAttr();
        topNavigator = (TopNavigator) topNavigator.getObjAttr();
        clientPopped = (Client) clientPopped.getObjAttr("POPPED");
    }

    public List<List<String>> getTable() {
        List<String> strsInHeader = new ArrayList<>();
        List<List<String>> tableContent = new ArrayList<>();
        if (isNotDisplayed(client.getJsonObject(client.getDTableLoadingSignSpan()))) {//如果数据加载的那个菊花不显示了,说明已经加载好
            jsonObject = client.getJsonObject(client.getDTableTrs());
            try {
                findElement(jsonObject, 2, false);
                List<WebElement> elements = findElements(jsonObject);
                tableContent = getTableBody(elements);
            } catch (Exception e) {
                log.info("表格表体应该是空的");
            }
        }
        jsonObject = client.getJsonObject(client.getDTableHeaderTr1Ths());
        List<WebElement> elements = $.findElements(jsonObject);
        strsInHeader = $.getTableHeader(elements);
        //定位表头,获取表头中的所有文字,存到tableContent中
        tableContent.add(0, strsInHeader);
        return tableContent;

    }


    public List<List<String>> getInfo(int num) {
        List<String> strsInHeader = new ArrayList<>();
        List<List<String>> tableContent = new ArrayList<>();


        if (isNotDisplayed(client.getJsonObject(client.getDTableLoadingSignSpan()))) {//如果数据加载的那个菊花不显示了,说明已经加载好
            jsonObject = client.get$TableTrsSiblingJson(num);
            List<WebElement> elements = $.findElements(jsonObject);
            tableContent = $.getTableBody(elements);
        }
        jsonObject = client.getJsonObject(client.getDTableHeaderTr1Ths());
        List<WebElement> elements = $.findElements(jsonObject);
        //$.getTableHeader();
        //定位表头,获取表头中的所有文字,存到tableContent中
        strsInHeader = $.getTableHeader(elements);
        //定位表头,获取表头中的所有文字,存到tableContent中
        tableContent.add(0, strsInHeader);

//        System.out.println("======================");
//
//        for (int i = 0; i <tableContent.size() ; i++) {
//            for (int j = 0; j <tableContent.get(i).size() ; j++) {
//                System.out.print(tableContent.get(i).get(j)+"\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println("======================");
        return tableContent;
    }

//    public boolean isElementAppeared(JSONObject jsonObject) {
//        boolean flag = true;
//        try {
//            findElement(jsonObject);
//        } catch (Exception e) {
//            flag = false;
//        } finally {
//            //$.jsonObject = null;
//        }
//        log.info("isElementAppeared:" + flag);
//        return flag;
//    }


    public boolean isElementAppeared() {
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


    public boolean isBizLinesEqualsStrings() {
        boolean flag = true;
        WebElement element = findElement(clientPopped.getJsonObject(clientPopped.getDBusinessLineInput()));
        text = getInputValue(element);
        List<String> list = Arrays.asList(text.split(","));
        strings2 = new ArrayList<>(list);
        flag = ListMisc.isEqualAfterSorted(strings1, strings2);
        strings1.clear();
        strings2.clear();
        log.info("isBizLinesEqualsStrings:" + flag);
        return flag;
    }


    public boolean isStringEqualsText(WebElement element, String string) {
        boolean flag = true;
        text = getInputValue(element);
        flag = string.equals(text);
        string = "";
        text = "";
        log.info("isStringEqualsText:" + flag);
        return flag;
    }

//    public boolean isSelected(WebElement element) {
//        boolean flag = true;
//        attributeValue = getAttribute(element, "class");
//        flag = (attributeValue.contains("selected") || attributeValue.contains("checked"));
//        attributeValue = "";
//        log.info("isSelected:" + flag);
//        return flag;
//    }

    public String getRandomMobile() {
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

    public boolean isBizLineSelected() {
        boolean flag = true;
        int a = nums.size();
        for (int i = 0; i < a; i++) {

            WebElement element = findElement(bizLineSelection.getBusinessLineInputSpanSiblingJson(nums.get(i)));

            flag = isSelected(element);
            if (!flag) {
                break;
            }
        }
        log.info("isBizLineSelected:" + flag);
        nums.clear();
        return flag;

    }

    public void clickRandomBizLine() {
        List<WebElement> webElements =
                findElements(bizLineSelection.getJsonObject(bizLineSelection.getDBusinessLineInputSpan()));
        int num = webElements.size();
        WebElement element;

        for (int i = 0; i < num; i++) {
            int random = Randoms.getRandomNum(0, 1);
            if (random == 1) {
                element = webElements.get(i);
                click(element);
                attributeValue = getAttribute(element, "title");
                strings1.add(attributeValue);
                attributeValue = null;
                int a = i + 1;
                nums.add(a);
            } else if (random == 0) {
                //do nothing
            }
        }
    }


    public boolean isInTableEqualsInDetail(List<List<String>> tableContent) {
        boolean flag = true;
        List<List<String>> tc = tableContent;
        List<String> listHead = tc.get(0);
        List<String> listBody = tc.get(1);
        String text = "";
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
                WebElement element = findElement(clientPopped.get$DQueryInputJson(head));
                text = getInputValue(element);
                flag = text.equals(body);
                if(!flag){
                    flag = StringMisc.isDisorderlyLike(text,body);
                }
            } else if (head.equals("创建人")) {
                WebElement element = findElement(topNavigator.getJsonObject(topNavigator.getDTNUserName()));
                text = getText(element);
                String userName = text.trim();
                flag = userName.equals(body);
            }
            if (!flag) {
                log.info("第:" + i + ";" + head + ";" + body + ";-------" + text + ";");
                break;
            }

        }
        return flag;
    }


    public int getPerPageNum() {
        WebElement element = findElement(client.getJsonObject(client.getDTableLinesPerPageDiv()));//定位 条/页
        text = getText(element);//获取 条/页 里的文本
        perPageNum = IntMisc.getPerPageNum(text);
        return perPageNum;
    }

    public List<String> getWebpageInfo(List<String> strsInHeader) {
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
                WebElement element = findElement(clientPopped.get$DQueryInputJson(head));
                String inputValue = getInputValue(element);
                webInfo.add(inputValue);
            } else if (head.equals("创建人")) {
                WebElement element = findElement(topNavigator.getJsonObject(topNavigator.getDTNUserName()));
                text = getText(element);
                String userName = text.trim();
                webInfo.add(userName);
            }

        }
        return webInfo;
    }


}
