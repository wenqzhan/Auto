package com.uiTest.research.client;

import com.actions.OpenBrowserAction;
import com.actions.matrix.LoginAction;
import com.actions.matrix.YMDSelectionAction;
import com.actions.matrix.research.client.ClientListAction;
import com.actions.matrix.research.clientList.DetailAction;
import com.alibaba.fastjson.JSONObject;
import com.driver.$;
import com.pageObject.matrix.CommonObject;
import com.sql.matrix.research.client.ClientListSql;
import com.utils.json.Attr;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClientListTest extends $ {
    private Attr attr = new Attr(this.getClass());
    private LoginAction loginAction = new LoginAction();
    ClientListAction clientListAction = new ClientListAction();
    ClientListSql clientListSql = new ClientListSql();
    DetailAction detailAction = new DetailAction();
    boolean flag;
    String custNameNE;
    String custNameE;

    @Test
    public void queryCheck() {
        queryCustNameCheck();
        //验证客户名称查询条件
        queryIsCoreCustCheck();
        //验证是否核心客户查询条件
        queryResearchLevelCheck();
        //验证研究服务等级查询条件
        querySignStateCheck();
        //验证研究服务签约状态查询条件
        queryCustLevelCheck();
        //验证客户级别查询条件++++++++
        queryDueDateCheck();
        //验证研究服务到期日查询条件
        queryCustManagerCheck();
        //验证客户经理查询条件
        queryTeamCheck();
        //验证所属团队查询条件
        queryUSCCCheck();
        //验证统一社会信用代码查询条件
        queryCustTypeCheck();
        //验证客户类型查询条件
//        clickNewCheck();
//        //新建
//        selectCustNameCheck();
//        //选择客户
//        selectCreditDispatchTypeCheck();
//        //选择派点类型
//        inputCreditDispatchWeightsCheck();
//        //输入爬电权重
//        selectResearchCustTypeCheck();
//        //选择研究服务客户类型
//        selectContractPreliminaryReviewAccessCheck();
//        //选择签约初审准入
//        selectResearchLevelCheck();
//        //选择研究服务等级
//        selectCustChannelCheck();
//        //选择客户渠道
//        selectResearchDueDateCheck();
//        //选择研究服务到期日
//        selectResearchSignedDateCheck();
//        //选择签约时间
//        selectIsCoreCustCheck();
//        //选择是否核心客户
//        selectIsPotentialCustCheck();
//        //选择是否潜在客户
//        selectActivityLimitsCheck();
//        //选择活动权限
//        inputOfficePostcodeCheck();
//        //输入办公邮编
//        inputOfficeCentralTelephoneExchangeNoCheck();
//        //输入公司总机
//        inputOfficeFaxNoCheck();
//        //输入公式传真
//        inputOfficeProvinceCityCheck();
//        //输入办公省市
//        selectHostAccountManagerCheck();
//        //选择主办客户经理
//        selectCoOrganizingAccountManagersCheck();
//        //选择协办客户经理
//        clickSaveCheck();


    }

    private void clickSaveCheck() {
        boolean flag = true;
        flag = detailAction.clickSave();
        Assert.assertTrue(flag);
    }

    private void selectCoOrganizingAccountManagersCheck() {
        boolean flag = true;
        flag = detailAction.selectCoOrganizingAccountManagers();
        Assert.assertTrue(flag);
    }

    private void selectHostAccountManagerCheck() {
        boolean flag = true;
        flag = detailAction.selectHostAccountManager();
        Assert.assertTrue(flag);
    }

    private void inputOfficeProvinceCityCheck() {
        boolean flag = true;
        flag = detailAction.inputOfficeProvinceCity();
        Assert.assertTrue(flag);
    }

    private void inputOfficeFaxNoCheck() {
        boolean flag = true;
        flag = detailAction.inputOfficeFaxNo();
        Assert.assertTrue(flag);
    }

    private void inputOfficeCentralTelephoneExchangeNoCheck() {
        boolean flag = true;
        flag = detailAction.inputOfficeCentralTelephoneExchangeNo();
        Assert.assertTrue(flag);
    }

    private void inputOfficePostcodeCheck() {
        boolean flag = true;
        flag = detailAction.inputOfficePostcode();
        Assert.assertTrue(flag);
    }

    private void selectActivityLimitsCheck() {
        boolean flag = true;
        flag = detailAction.selectActivityLimits();
        Assert.assertTrue(flag);
    }

    private void selectIsPotentialCustCheck() {
        boolean flag = true;
        flag = detailAction.selectIsPotentialCust();
        Assert.assertTrue(flag);
    }

    private void selectIsCoreCustCheck() {
        boolean flag = true;
        flag = detailAction.selectIsCoreCust();
        Assert.assertTrue(flag);
    }

    private void selectResearchSignedDateCheck() {
        boolean flag = true;
        flag = detailAction.selectResearchSignedDate();
        Assert.assertTrue(flag);
    }

    private void selectResearchDueDateCheck() {
        boolean flag = true;
        flag = detailAction.selectResearchDueDate();
        Assert.assertTrue(flag);
    }

    private void selectCustChannelCheck() {
        boolean flag = true;
        flag = detailAction.selectCustChannel();
        Assert.assertTrue(flag);
    }

    private void selectResearchLevelCheck() {
        boolean flag = true;
        flag = detailAction.selectResearchLevel();
        Assert.assertTrue(flag);
    }

    private void selectContractPreliminaryReviewAccessCheck() {
        boolean flag = true;
        flag = detailAction.selectContractPreliminaryReviewAccess();
        Assert.assertTrue(flag);
    }

    private void selectResearchCustTypeCheck() {
        boolean flag = true;
        flag = detailAction.selectResearchCustType();
        Assert.assertTrue(flag);
    }

    private void inputCreditDispatchWeightsCheck() {
        boolean flag = true;
        flag = detailAction.inputCreditDispatchWeights();
        Assert.assertTrue(flag);
    }

    private void selectCreditDispatchTypeCheck() {
        boolean flag = true;
        flag = detailAction.selectCreditDispatchType();
        Assert.assertTrue(flag);
    }

    private void selectCustNameCheck(){
        boolean flag = true;
        String custName = clientListSql.getSqlCustNameNotInCustServiceInfoWithCustLevelResultStr();
        flag = detailAction.selectCustName(custName);
        Assert.assertTrue(flag);
    }

    private void clickNewCheck() {
        boolean flag = true;
        flag = clientListAction.clickNew();
        Assert.assertTrue(flag);
    }

    private void queryCustTypeCheck() {
        boolean flag = true;
        String type = clientListSql.getSqlLevelNameResultStr();
        flag = clientListAction.queryCustType(type);
        Assert.assertTrue(flag);
    }

    private void queryUSCCCheck() {
        boolean flag = true;
        String uscc =  clientListSql.getSqlUSCCResultStr();
        flag = clientListAction.queryCUSCC(uscc);
        Assert.assertTrue(flag);
    }

    private void queryTeamCheck() {
        boolean flag = true;
        String team =  clientListSql.getSqlTeamResultStr();
        flag = clientListAction.queryTeam(team);
        Assert.assertTrue(flag);
    }

    private void queryCustManagerCheck() {
        boolean flag = true;
        String manager =  clientListSql.getSqlManagerResultStr();
        flag = clientListAction.queryCustManager(manager);
        Assert.assertTrue(flag);

    }

    private void queryDueDateCheck() {
        boolean flag = true;
        String ymd =  clientListSql.getSqlDueDateResultStr();
        flag = clientListAction.queryDueDate(ymd);
        Assert.assertTrue(flag);
    }

    private void queryCustLevelCheck() {
        boolean flag = true;
        flag = clientListAction.queryCustLevel();
        Assert.assertTrue(flag);
    }

    private void querySignStateCheck() {
        boolean flag = true;
        flag = clientListAction.querySignState();
        Assert.assertTrue(flag);

    }

    private void queryResearchLevelCheck() {
        boolean flag = true;
        flag = clientListAction.queryResearchLevel();
        Assert.assertTrue(flag);
    }

    private void queryIsCoreCustCheck() {
        boolean flag = true;
        flag = clientListAction.queryIsCoreCust();
        Assert.assertTrue(flag);
    }


    public void queryCustNameCheck() {
        boolean flag = true;
        custNameNE = clientListSql.getSqlCustNameNotInCustServiceInfoResultStr();
        custNameE = clientListSql.getSqlCustNameResultStr();

        flag = clientListAction.queryCustNameNE(custNameNE);
        Assert.assertTrue(flag);

        flag = clientListAction.queryCustNameE(custNameE);
        Assert.assertTrue(flag);

    }


    @Test
    public void test() {
        CommonObject commonObject = new CommonObject();
        commonObject.getObjAttr();

//        clientListAction.queryCustName("1231312");

        WebElement element = findElement(commonObject.getJsonObject(commonObject.getDTableTrs()));
        click(element);
        element = findElement(commonObject.getJsonObject(commonObject.getDResearchServiceSurveyStatisticsDiv()));
        click(element);
        element = findElement(commonObject.getJsonObject(commonObject.getDUnfoldFoldButtonSpan()));
        click(element);
        element = findElement(commonObject.getJsonObject(commonObject.getDInvestigationTimeFromInput()));
        click(element);


        String a = "2010-06-08";
        String b = "2020-07-09";
        String[] ymdToYmd = new String[2];
        ymdToYmd[0] = a;
        ymdToYmd[1] = b;

        YMDSelectionAction.selectYMDToYMD("调研时间", ymdToYmd);

        element = findElement(commonObject.getJsonObject(commonObject.getDResearchServiceContactsDiv()));
        click(element);

        JSONObject jsonObject = (commonObject.getJsonObject(commonObject.getD11Tmp()));

        getTableHeader(jsonObject);

        jsonObject = (commonObject.getJsonObject(commonObject.getDTableTrs()));

        getTableBody(jsonObject);

    }

    @BeforeClass
    public void beforeClass01() {
        OpenBrowserAction.open("firefox", this.getClass());
        loginAction.login();
        get("http://10.187.144.60:8080/research/client/clientList");
    }

    @AfterClass
    public void afterClass01() throws InterruptedException {

        Thread.sleep(5000);
        attr.deleteFromAttrs(this.getClass());
//        $.quit();
    }
}
