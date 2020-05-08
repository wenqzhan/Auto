package com.uiTest;

import com.actions.OpenBrowserAction;
import com.actions.matrix.LoginAction;
import com.actions.matrix.orgCust.ClientAction;
import com.driver.$;
import com.pageObject.commonObject.BizLineSelection;
import com.pageObject.commonObject.CustSelection;
import com.pageObject.commonObject.EmpSelection;
import com.pageObject.matrix.orgCust.Client;
import com.sql.matrix.orgCust.ClientSql;
import com.utils.jdbc.JDBC;
import com.utils.list.ListMisc;
import com.utils.log.LoggerController;
import com.utils.random.RandomInfo;
import com.utils.random.Randoms;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

public class ClientTest extends $ {
    private final static LoggerController log = LoggerController.getLogger(ClientTest.class);
    private String sql;
    private String pagination[] = new String[]{"", ""};
    private String where = "";
    private String whereLike = "";
    private String order = "";
    private CustSelection custSelection = new CustSelection();
    private EmpSelection empSelection = new EmpSelection("国君服务联系人");
    boolean flag;
    String randomCustName;
    String randomDeptName;
    String randomEmpName;
    String randomFAX;
    String randomMobile;
    String randomJobPosition;
    String randomTel;
    String randomAddress;
    List<String> randomBizLines = new ArrayList<>();
    List<String> strings1 = new ArrayList<>();
    List<String> strings2 = new ArrayList<>();



    @Test
    public void clickNewClientButton() {
        findElements(Client.getJson(Client.d11));
        getTableHeader();
        findElement(Client.getJson(Client.d35));
        click();
        flag = ClientAction.isElementAppeared(Client.getJson(Client.d30P));
        Assert.assertTrue(flag);
    }


    @Test(dependsOnMethods = {"clickNewClientButton"})
    public void inputClientName() {
        findElement(Client.getJson(Client.d37P));
        string = RandomInfo.getChineseName();
        sendKeys(string);
        flag = ClientAction.isStringEqualsText();
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName"})
    public void inputEmail() {
        findElement(Client.getJson(Client.d41P));
        String email = RandomInfo.getEmail(5, 15);
        string = email;
        sendKeys(email);
        flag = ClientAction.isStringEqualsText();
//        int random = Randoms.getRandomNum(0,1);
//        if(random==1){
//            flag = true;
//        }else {
//            flag = false;
//        }
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail"})
    public void clickCustName() {
        findElement(Client.getJson(Client.d2P));
        click();
        flag = ClientAction.isElementAppeared(custSelection.getJson(custSelection.dCS30));
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail", "clickCustName"})
    public void inputRandomCustName() {
        randomCustName = JDBC.getSqlResultStr(ClientSql.getSql1());
        string = randomCustName;
        findElement(custSelection.getJson(custSelection.dCS2));
        sendKeys(randomCustName);
        flag = ClientAction.isStringEqualsText();
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName"})
    public void clickSearchButtonForCustName() {
        findElement(custSelection.getJson(custSelection.dCS3));
        click();
        flag = ClientAction.isElementAppeared(custSelection.getJson(custSelection.dCS10));
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName"})
    public void selectCustNameSearchResult() {
        findElement(custSelection.getJsonCS10SiblingByCustName(randomCustName));
        click();
        findElement(custSelection.getJsonCS10SiblingByCustName(randomCustName));
        flag = ClientAction.isSelected();
        Assert.assertTrue(flag);

    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult"})
    public void clickConfirmButtonForCustName() {
        findElement(custSelection.getJson(custSelection.dCS29));
        click();
        flag = ClientAction.isElementAppeared(Client.getJson(Client.d30P));
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName"})
    public void checkCustNameInput() {
        string = randomCustName;
        findElement(Client.getJson(Client.d2P));
        flag = ClientAction.isStringEqualsText();
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput"})
    public void inputRandomDept() {
        randomDeptName = Randoms.getRandomDeptName();
        string = randomDeptName;
        findElement(Client.getJson(Client.d39P));
        sendKeys(randomDeptName);
        flag = ClientAction.isStringEqualsText();
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
            "inputRandomDept"})
    public void clickManager() {//国君服务联系人
        findElement(Client.getJson(Client.d47P));
        click();
        flag = ClientAction.isElementAppeared(empSelection.getJson(empSelection.dES33));
        Assert.assertTrue(flag);

    }


    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
            "inputRandomDept", "clickManager"})
    public void inputEmpName() {
        randomEmpName = JDBC.getSqlResultStr(ClientSql.getSql2());
        string = randomEmpName;
        findElement(empSelection.getJson(empSelection.dES33));
        sendKeys(randomEmpName);
        flag = ClientAction.isStringEqualsText();
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
            "inputRandomDept", "clickManager", "inputEmpName"})
    public void clickSearchButtonForEmpName() {
        findElement(empSelection.getJson(empSelection.dES33_1));
        click();
        flag = ClientAction.isElementAppeared(empSelection.getJson(empSelection.dES10));
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
            "inputRandomDept", "clickManager", "inputEmpName",
            "clickSearchButtonForEmpName"})
    public void selectEmpNameSearchResult() {
        findElement(empSelection.get$JsonES10SiblingByUserName(randomEmpName));
        click();
        findElement(empSelection.get$JsonES10SiblingByUserName(randomEmpName));
        flag = ClientAction.isSelected();
        Assert.assertTrue(flag);

    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
            "inputRandomDept", "clickManager", "inputEmpName",
            "clickSearchButtonForEmpName", "selectEmpNameSearchResult"})
    public void clickConfirmButtonForEmpName() {
        findElement(empSelection.getJson(empSelection.dES29));
        click();
        flag = ClientAction.isElementAppeared(Client.getJson(Client.d30P));
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
            "inputRandomDept", "clickManager", "inputEmpName",
            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName"})
    public void checkManagerInput() {
        string = randomEmpName;
        findElement(Client.getJson(Client.d47P));
        flag = ClientAction.isStringEqualsText();
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
            "inputRandomDept", "clickManager", "inputEmpName",
            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
            "checkManagerInput"})
    public void inputFAX() {
        randomFAX = RandomInfo.getTel();
        string = randomFAX;
        findElement(Client.getJson(Client.d40P));
        sendKeys(randomFAX);
        flag = ClientAction.isStringEqualsText();
        Assert.assertTrue(flag);
    }


    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
            "inputRandomDept", "clickManager", "inputEmpName",
            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
            "checkManagerInput", "inputFAX"})
    public void inputMobile() {
        randomMobile = ClientAction.getRandomMobile();
        string = randomMobile;
        findElement(Client.getJson(Client.d38P));
        sendKeys(randomMobile);
        flag = ClientAction.isStringEqualsText();
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
            "inputRandomDept", "clickManager", "inputEmpName",
            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
            "checkManagerInput", "inputFAX", "inputMobile"})
    public void clickBizLine() {
        findElement(Client.getJson(Client.d34P));
        click();
        flag = ClientAction.isElementAppeared(BizLineSelection.getJson(BizLineSelection.dBLS30));
        Assert.assertTrue(flag);

    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
            "inputRandomDept", "clickManager", "inputEmpName",
            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
            "checkManagerInput", "inputFAX", "inputMobile",
            "clickBizLine"})
    public void selectBizLine() {

        ClientAction.clickRandomBizLine();
        flag = ClientAction.isBizLineSelected();
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
            "inputRandomDept", "clickManager", "inputEmpName",
            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
            "checkManagerInput", "inputFAX", "inputMobile",
            "clickBizLine", "selectBizLine"})
    public void clickConfirmButtonForBizLine() {
        findElement(BizLineSelection.getJson(BizLineSelection.dBLS29));
        click();
        flag = ClientAction.isElementAppeared(Client.getJson(Client.d30P));
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
            "inputRandomDept", "clickManager", "inputEmpName",
            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
            "checkManagerInput", "inputFAX", "inputMobile",
            "clickBizLine", "selectBizLine", "clickConfirmButtonForBizLine"})
    public void checkBizLineInput() {
        findElement(Client.getJson(Client.d34P));
        flag = ClientAction.isBizLinesEqualsStrings();
        Assert.assertTrue(flag);
    }


    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
            "inputRandomDept", "clickManager", "inputEmpName",
            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
            "checkManagerInput", "inputFAX", "inputMobile",
            "clickBizLine", "selectBizLine", "clickConfirmButtonForBizLine",
            "checkBizLineInput"})
    public void inputJobPosition() {
        randomJobPosition = Randoms.getJobPosition();
        string = randomJobPosition;
        findElement(Client.getJson(Client.d43P));
        sendKeys(randomJobPosition);
        flag = ClientAction.isStringEqualsText();
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
            "inputRandomDept", "clickManager", "inputEmpName",
            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
            "checkManagerInput", "inputFAX", "inputMobile",
            "clickBizLine", "selectBizLine", "clickConfirmButtonForBizLine",
            "checkBizLineInput", "inputJobPosition"})
    public void inputTel() {
        randomTel = RandomInfo.getTel();
        string = randomTel;
        findElement(Client.getJson(Client.d44P));
        sendKeys(randomTel);
        flag = ClientAction.isStringEqualsText();
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
            "inputRandomDept", "clickManager", "inputEmpName",
            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
            "checkManagerInput", "inputFAX", "inputMobile",
            "clickBizLine", "selectBizLine", "clickConfirmButtonForBizLine",
            "checkBizLineInput", "inputJobPosition", "inputTel"})
    public void inputOfficeAddress() {
        randomAddress = RandomInfo.getRoadAddress();
        string = randomAddress;
        findElement(Client.getJson(Client.d46P));
        sendKeys(randomAddress);
        flag = ClientAction.isStringEqualsText();
        Assert.assertTrue(flag);

    }


    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
            "inputRandomDept", "clickManager", "inputEmpName",
            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
            "checkManagerInput", "inputFAX", "inputMobile",
            "clickBizLine", "selectBizLine", "clickConfirmButtonForBizLine",
            "checkBizLineInput", "inputJobPosition", "inputTel", "inputOfficeAddress"})
    public void clickConfirmButtonForNewClient() {
        strings1 = ClientAction.getWebpageInfo();


        findElement(Client.getJson(Client.d29P));
        click();
        flag = ClientAction.isElementAppeared(Client.getJson(Client.d48));
        Assert.assertTrue(flag);

    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
            "inputRandomDept", "clickManager", "inputEmpName",
            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
            "checkManagerInput", "inputFAX", "inputMobile",
            "clickBizLine", "selectBizLine", "clickConfirmButtonForBizLine",
            "checkBizLineInput", "inputJobPosition", "inputTel", "inputOfficeAddress",
            "clickConfirmButtonForNewClient"})
    public void compareInputWithWeb() {
        ClientAction.getInfo(1);
        findElement(Client.get$D10SiblingJson(1));
        doubleClick();
        strings2 = ClientAction.getWebpageInfo();
        flag = ListMisc.isEqual1(strings1,strings2);
        Assert.assertTrue(flag);

        flag = ClientAction.isInTableEqualsInDetail();
        findElement(Client.getJson(Client.d30P));
        click();
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
            "inputRandomDept", "clickManager", "inputEmpName",
            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
            "checkManagerInput", "inputFAX", "inputMobile",
            "clickBizLine", "selectBizLine", "clickConfirmButtonForBizLine",
            "checkBizLineInput", "inputJobPosition", "inputTel", "inputOfficeAddress",
            "clickConfirmButtonForNewClient", "compareInputWithWeb"})
    public void compareWebWithDatabase() {
        ClientAction.getTable();

        ClientAction.getPerPageNum();//获得当前页面的条/页
        pagination = JDBC.getPagination(1, perPageNum);//获得分页语句

        sql = ClientSql.getSql4(pagination, where, whereLike, order);//拼上分页语句

        List<List<String>> list1 = JDBC.getResultToList(sql);
        List<List<String>> list2 = tableContent;
        flag = ListMisc.isEqual(list1, list2);

        initialiseParm();

        Assert.assertTrue(flag);

    }


    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
            "inputRandomDept", "clickManager", "inputEmpName",
            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
            "checkManagerInput", "inputFAX", "inputMobile",
            "clickBizLine", "selectBizLine", "clickConfirmButtonForBizLine",
            "checkBizLineInput", "inputJobPosition", "inputTel", "inputOfficeAddress",
            "clickConfirmButtonForNewClient", "compareInputWithWeb", "compareWebWithDatabase"})
    public void edit() {
        findElement(Client.get$D10_actionSiblingJson(1));
        click();
        inputClientName();
        inputEmail();
        clickCustName();
        inputRandomCustName();
        clickSearchButtonForCustName();
        selectCustNameSearchResult();
        clickConfirmButtonForCustName();
        checkCustNameInput();
        inputRandomDept();
        clickManager();
        inputEmpName();
        clickSearchButtonForEmpName();
        selectEmpNameSearchResult();
        clickConfirmButtonForEmpName();
        checkManagerInput();
        inputFAX();
        inputMobile();

        findElement(Client.getJson(Client.d34P_cross));
        click();

        clickBizLine();
        selectBizLine();
        clickConfirmButtonForBizLine();
        checkBizLineInput();
        inputJobPosition();
        inputTel();
        inputOfficeAddress();
        clickConfirmButtonForNewClient();
        compareInputWithWeb();
        compareWebWithDatabase();
    }


    private void initialiseParm() {
        sql = "";
        where = "";
        whereLike = "";
        order = "";
        pagination = new String[]{"", ""};
    }


    @BeforeMethod()
    public void beforeMethod(){
        String name = this.getClass().getName();
        WebDriver driver1 = map.get(name);
        driver = driver1;

    }


    @BeforeClass
    public void beforeTest01() {
        OpenBrowserAction.open("chrome",this.getClass());
        LoginAction.login();
        get(Client.client);//登录后跳转客户维护分配页面



    }

    @AfterClass
    public void afterTest01() throws InterruptedException {

        Thread.sleep(5000);
        //$.quit();
    }

}
