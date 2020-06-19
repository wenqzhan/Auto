package com.actions.matrix.research.client;

import com.actions.matrix.*;
import com.alibaba.fastjson.JSONObject;
import com.driver.$;
import com.pageObject.matrix.QueryHandller;
import com.pageObject.matrix.TableContent;
import com.pageObject.matrix.research.client.ClientList;
import com.pageObject.matrix.research.clientList.Detail;
import com.sql.matrix.research.client.ClientListSql;
import com.utils.log.LoggerController;
import com.utils.num.IntMisc;
import com.utils.random.Randoms;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ClientListAction extends $ {
    private final static LoggerController log = LoggerController.getLogger(ClientListAction.class);
    ClientList clientList = new ClientList();
    QueryHandller queryHandller = new QueryHandller("研究服务客户");
    CustSelectionAction custSelectionAction = new CustSelectionAction("操作");
    ClientListSql clientListSql = new ClientListSql();
    TableContent tableContent = new TableContent();
    Detail detail = new Detail();

    //构造函数,获取成员变量不是null的实例
    public ClientListAction() {
        clientList = (ClientList) clientList.getObjAttr();
        queryHandller = (QueryHandller) queryHandller.getObjAttr("研究服务客户");
        tableContent = (TableContent) tableContent.getObjAttr();
        detail = (Detail) detail.getObjAttr();
    }

    //跳转研究服务客户
    public void getClientList() {
        get(clientList.getClientlist());
    }

    //点击展开
    private void clickExpand() {
        reset();
        WebElement element = findElement(queryHandller.getJsonObject(queryHandller.getDUnfoldFoldButtonSpan()));
        String text = element.getText();
        if (text.contains("展开")) {
            click(element);
        }
    }

    private void reset() {
        getClientList();
//        WebElement element = findElement(queryHandller.getJsonObject(queryHandller.getD4()));
//        click(element);
//        if (isNotDisplayed(tableContent.getJsonObject(tableContent.getD17()))){
//            log.info("菊花应该已经消失了");
//        }
    }

    public boolean clickNew(){
        boolean flag = true;
        WebElement element = findElement(clientList.getJsonObject(clientList.getDNewButtonSpan()));
        click(element);
        flag = isElementAppeared(detail.getJsonObject(detail.getDSaveButtonSpan()));
        return flag;
    }

    public boolean queryCustNameNE(String custName) {
        boolean flag = true;
        clickExpand();
        List<List<String>> table = queryCustName(custName);
        flag = checkResult(table);

        return flag;
    }

    public boolean queryCustNameE(String custName) {
        boolean flag = true;
        clickExpand();
        List<List<String>> table = queryCustName(custName);
        flag = checkResult(table, "客户名称", custName);

        return flag;
    }


    private void clickSearch() {
        WebElement element = findElement(queryHandller.getJsonObject(queryHandller.getDQueryButtonSpan()));
        click(element);
    }

    //查询条件选择客户名称
    private List<List<String>> queryCustName(String custName) {
        WebElement element = findElement(clientList.getJsonObject(clientList.getDCustNameInputSearch()));
        click(element);
        custSelectionAction.selectCustName(custName);
        clickSearch();
        return TableContentAction.getTable(tableContent);
    }

    private boolean checkResult(List<List<String>> lists) {
        return checkResult(lists, false, null, null);
    }

    private boolean checkResult(List<List<String>> lists, String name, String valueShouldBe) {
        return checkResult(lists, true, name, valueShouldBe);
    }


    private boolean checkResult(List<List<String>> lists, boolean indicator, String name, String valueShouldBe) {
        boolean flag = true;
        if (!indicator) {
            int size = lists.size();
            if (size > 1) {
                flag = false;
            }
        } else {
            List<String> title = lists.get(0);
            int index = 0;
            for (int i = 0; i < title.size(); i++) {
                if (title.get(i).equals(name)) {
                    index = i;
                    break;
                }
            }
            for (int i = 1; i < lists.size(); i++) {
                String value = lists.get(i).get(index);
                if (!value.equals(valueShouldBe)) {
                    flag = false;
                    log.info("第" + i + "行数据中的" + "[" + value + "]" + "应该是" + "[" + valueShouldBe + "]");
                    break;
                }
            }

        }


        return flag;
    }

    //查询条件选择是否核心客户
    public boolean queryIsCoreCust() {
        boolean flag = true;
        clickExpand();
        int random = Randoms.getRandomNum(0, 2);
        if (random == 0) {
            WebElement element = findElement(tableContent.getJsonObject(tableContent.getDTotalCounts()));
            String tmp = getText(element);
            int total1 = IntMisc.getIntFromString(tmp);
            clickSearch();
            element = findElement(tableContent.getJsonObject(tableContent.getDTotalCounts()));
            tmp = getText(element);
            int total2 = IntMisc.getIntFromString(tmp);
            flag = total1 == total2;
            if (!flag) {
                log.info("点击查询后的总数和重置后/原始的总数不同");
            }

        } else if (random == 1) {
            WebElement element = findElement(clientList.getJsonObject(clientList.getDIsCoreCustYesSpan()));
            click(element);
            element = findElement(clientList.getJsonObject(clientList.getDIsCoreCustYesSpanRadioSpan()));
            String attr = getAttribute(element, "class");
            flag = attr.contains("checked");
            if (!flag) {
                log.info("点击了是否核心客户-是,但是貌似没选中");
            }
            if (flag) {
                clickSearch();
                List<List<String>> lists = TableContentAction.getTable(tableContent);
                flag = checkResult(lists, "是否核心客户", "是");
            }

        } else if (random == 2) {
            WebElement element = findElement(clientList.getJsonObject(clientList.getDIsCoreCustNoSpan()));
            click(element);
            element = findElement(clientList.getJsonObject(clientList.getDIsCoreCustNoSpanRadioSpan()));
            String attr = getAttribute(element, "class");
            flag = attr.contains("checked");
            if (!flag) {
                log.info("点击了是否核心客户-是,但是貌似没选中");
            }
            if (flag) {
                clickSearch();
                List<List<String>> lists = TableContentAction.getTable(tableContent);
                flag = checkResult(lists, "是否核心客户", "否");
            }

        }


        return flag;
    }

    //查询条件选择研究服务等级
    public boolean queryResearchLevel() {
        boolean flag = true;
        clickExpand();
        int random = Randoms.getRandomNum(0, 4);
        List<JSONObject> jsonObjects = new ArrayList<>();
        JSONObject jsonObject1 = clientList.getJsonObject(clientList.getDResearchLevelSpanA());
        JSONObject jsonObject2 = clientList.getJsonObject(clientList.getDResearchLevelSpanB());
        JSONObject jsonObject3 = clientList.getJsonObject(clientList.getDResearchLevelSpanC());
        JSONObject jsonObject4 = clientList.getJsonObject(clientList.getDResearchLevelSpanD());
        JSONObject jsonObject5 = clientList.getJsonObject(clientList.getDResearchLevelSpanE());
        jsonObjects.add(jsonObject1);
        jsonObjects.add(jsonObject2);
        jsonObjects.add(jsonObject3);
        jsonObjects.add(jsonObject4);
        jsonObjects.add(jsonObject5);
        WebElement element = findElement(clientList.getJsonObject(clientList.getDResearchLevelDiv()));
        click(element);
        element = findElement(jsonObjects.get(random));
        String value = getAttribute(element, "title");
        click(element);
        clickSearch();
        List<List<String>> lists = TableContentAction.getTable(tableContent);
        flag = checkResult(lists, "研究服务等级", value);

        return flag;


    }

    //查询条件选择研究服务签约状态
    public boolean querySignState() {
        boolean flag = true;
        clickExpand();
        int random = Randoms.getRandomNum(0, 3);
        List<JSONObject> jsonObjects = new ArrayList<>();
        JSONObject jsonObject1 = clientList.getJsonObject(clientList.getDResearchContractStateSpanNil());
        JSONObject jsonObject2 = clientList.getJsonObject(clientList.getDResearchContractStateSpanSigning());
        JSONObject jsonObject3 = clientList.getJsonObject(clientList.getDResearchContractStateSpanSigned());
        JSONObject jsonObject4 = clientList.getJsonObject(clientList.getDResearchContractStateSpanPostponed());

        jsonObjects.add(jsonObject1);
        jsonObjects.add(jsonObject2);
        jsonObjects.add(jsonObject3);
        jsonObjects.add(jsonObject4);

        WebElement element = findElement(clientList.getJsonObject(clientList.getDResearchContractStateDiv()));
        click(element);
        element = findElement(jsonObjects.get(random));
        String value = getAttribute(element, "title");
        click(element);
        clickSearch();
        List<List<String>> lists = TableContentAction.getTable(tableContent);
        flag = checkResult(lists, "研究服务签约状态", value);

        return flag;
    }

    //查询条件选择研究服务到期日
    public boolean queryDueDate(String ymd) {
        boolean flag = true;
        clickExpand();

        WebElement element = findElement(clientList.getJsonObject(clientList.getDResearchDueDateInput()));
        click(element);
        YMDSelectionAction.selectYMD("研究服务到期日", ymd);

        element = findElement(clientList.getJsonObject(clientList.getDResearchDueDateInput()));
        String value = getInputValue(element);
        clickSearch();
        List<List<String>> lists = TableContentAction.getTable(tableContent);
        flag = checkResult(lists, "研究服务到期日", value);


        return flag;
    }

    //查询条件选择客户经理
    public boolean queryCustManager(String manager) {
        boolean flag = true;
        clickExpand();

        WebElement element = findElement(clientList.getJsonObject(clientList.getDCustManagerInput()));
        click(element);
        EmpSelectionAction.selectEmp("客户经理", manager);

        element = findElement(clientList.getJsonObject(clientList.getDCustManagerInput()));
        String value = getInputValue(element);
        clickSearch();
        List<List<String>> lists = TableContentAction.getTable(tableContent);
        if (lists.size() == 1) {
            log.error("有什么地方出错了,查得到客户经理,但是查不到研究服务客户的记录");
            return false;
        }
        int index = 0;
        for (int i = 0; i < lists.get(0).size(); i++) {
            if (lists.get(0).get(i).equals("主办客户经理")) {
                index = i;
                break;
            }

        }

        for (int i = 1; i < lists.size(); i++) {
            String managers = lists.get(i).get(index) + "," + lists.get(i).get(index + 1);
//            System.out.println("#@$!@#$#@$@#$@#$^^^^");
//            System.out.println(managers);
//            System.out.println("#@$!@#$#@$@#$@#$^^^^");
            if (!managers.contains(manager)) {
                flag = false;
                log.info("貌似主办和协办里都没这个人,可能在第" + i + "行");
                break;

            }


        }



        return flag;
    }

    //查询条件选择所属团队
    public boolean queryTeam(String team) {
        boolean flag = true;
        clickExpand();
        WebElement element = findElement(clientList.getJsonObject(clientList.getDTeamBelongedInputSearchI()));
        click(element);
        XXXSelectionAction.selectXXX("所属团队-类型选择",  team);
        clickSearch();
        List<List<String>> lists = TableContentAction.getTable(tableContent);
        if (lists.size() == 1) {
            log.error("有什么地方出错了,查得到所属团队,但是查不到研究服务客户的记录");
            return false;
        }
        int index = 0;
        for (int i = 0; i < lists.get(0).size(); i++) {
            if (lists.get(0).get(i).equals("所属团队")) {
                index = i;
                break;
            }
        }

        for (int i = 1; i < lists.size(); i++) {
            String teams = lists.get(i).get(index);
            if (!teams.contains(team)) {
                flag = false;
                log.info("貌似查询结果的团队里没这个团队,可能在第" + i + "行");
                break;
            }
        }

        return flag;
    }

    //查询条件选择统一社会信用代码
    public boolean queryCUSCC(String cuscc){
        boolean flag = true;
        clickExpand();
        WebElement element = findElement(clientList.getJsonObject(clientList.getDUnifiedSocialCreditCodeInput()));
        sendKeys(element,cuscc);
        clickSearch();
        List<List<String>> lists = TableContentAction.getTable(tableContent);
        flag = checkResult(lists, "统一社会信用代码", cuscc);

        return flag;

    }


    //查询条件选择客户级别
    public boolean queryCustLevel() {
        boolean flag = true;
        clickExpand();
        int random = Randoms.getRandomNum(0, 3);
        List<JSONObject> jsonObjects = new ArrayList<>();
        JSONObject jsonObject1 = clientList.getJsonObject(clientList.getDCustLevelSpanGroup());
        JSONObject jsonObject2 = clientList.getJsonObject(clientList.getDCustLevelSpanDistrict());
        JSONObject jsonObject3 = clientList.getJsonObject(clientList.getDCustLevelSpanDepart());
        JSONObject jsonObject4 = clientList.getJsonObject(clientList.getDCustLevelSpanOrdinary());

        jsonObjects.add(jsonObject1);
        jsonObjects.add(jsonObject2);
        jsonObjects.add(jsonObject3);
        jsonObjects.add(jsonObject4);

        WebElement element = findElement(clientList.getJsonObject(clientList.getDCustLevel()));
        click(element);
        element = findElement(jsonObjects.get(random));
        String value = getAttribute(element, "title");
        click(element);
        clickSearch();
        List<List<String>> lists = TableContentAction.getTable(tableContent);
        flag = checkResult(lists, "客户级别", value);

        return flag;
    }
    //查询条件选择客户类型
    public boolean queryCustType(String custType){
        boolean flag = true;
        clickExpand();
        WebElement element = findElement(clientList.getJsonObject(clientList.getDCustTypeInputSearch()));
        click(element);
        XXXSelectionAction.selectXXX("客户类型-类型选择",  custType);
        clickSearch();
        List<List<String>> lists = TableContentAction.getTable(tableContent);
        if (lists.size() == 1) {
            log.error("有什么地方出错了,查得到客户类型,但是查不到研究服务客户的记录");
            return false;
        }
        flag = checkResult(lists, "客户级别", custType);

        return flag;
    }

    //点击查询
    //校验结果
    //点击重置


}
