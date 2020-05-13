package com.uiTest;

import com.actions.OpenBrowserAction;
import com.actions.matrix.LoginAction;
import com.actions.matrix.orgCust.ClientAction;
import com.driver.$;
import com.pageObject.commonObject.*;
import com.pageObject.matrix.orgCust.Client;
import com.sql.matrix.orgCust.ClientSql;
import com.utils.jdbc.JDBC;
import com.utils.list.ListMisc;
import com.utils.log.LoggerController;
import com.utils.random.RandomInfo;
import com.utils.random.Randoms;
import org.openqa.selenium.WebElement;
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
    private static String string;
    private static int perPageNum;
    private List<List<String>> tableContent = new ArrayList<>();
    private List<String> tableHeader = new ArrayList<>();
    private ClientAction clientAction = new ClientAction();
    private BizLineSelection bizLineSelection = new BizLineSelection();
    private Client client = new Client();

    private void setAttr(){
//        empSelection.getObjAttr();
//        clientAction.getAttr();
//        bizLineSelection.getObjAttr();
//        client.getObjAttr();
    }
//    @Test
    public void clickNewClientButton() {
        setAttr();
//        custSelection.getObjAttr();
//        empSelection.getObjAttr();
        List<WebElement> elements = findElements(client.getJsonObject(client.getD11()));
        tableHeader = getTableHeader(elements);
        WebElement element = findElement(client.getJsonObject(client.getD35()));
        click(element);
        flag = clientAction.isElementAppeared(client.getJsonObject(client.getD30P()));
        Assert.assertTrue(flag);
    }


//    @Test(dependsOnMethods = {"clickNewClientButton"})
    public void inputClientName() {
        WebElement element = findElement(client.getJsonObject(client.getD37P()));
        string = RandomInfo.getChineseName();
        sendKeys(element, string);
        flag = clientAction.isStringEqualsText(element,string);
        Assert.assertTrue(flag);
    }

//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName"})
    public void inputEmail() {
        WebElement element = findElement(client.getJsonObject(client.getD41P()));
        String email = RandomInfo.getEmail(5, 15);
        string = email;
        sendKeys(element, email);
        flag = clientAction.isStringEqualsText(element,string);
//        int random = Randoms.getRandomNum(0,1);
//        if(random==1){
//            flag = true;
//        }else {
//            flag = false;
//        }
        Assert.assertTrue(flag);
    }

//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail"})
    public void clickCustName() {
        WebElement element = findElement(client.getJsonObject(client.getD2P()));
        click(element);
        flag = clientAction.isElementAppeared(custSelection.getJsonObject(custSelection.getDCS30()));
        Assert.assertTrue(flag);
    }

//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail", "clickCustName"})
    public void inputRandomCustName() {
        randomCustName = JDBC.getSqlResultStr(ClientSql.getSql1());
        string = randomCustName;
        WebElement element = findElement(custSelection.getJsonObject(custSelection.getDCS2()));
        sendKeys(element, randomCustName);
        flag = clientAction.isStringEqualsText(element,string);
        Assert.assertTrue(flag);
    }
//
//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName"})
    public void clickSearchButtonForCustName() {
        WebElement element = findElement(custSelection.getJsonObject(custSelection.getDCS3()));
        click(element);
        flag = clientAction.isElementAppeared(custSelection.getJsonObject(custSelection.getDCS10()));
        Assert.assertTrue(flag);
    }

//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName"})
    public void selectCustNameSearchResult() {
        WebElement element = findElement(custSelection.get$CS10SiblingByCustNameJson(randomCustName));
        click(element);
        element = findElement(custSelection.get$CS10SiblingByCustNameJson(randomCustName));
        flag = clientAction.isSelected(element);
        Assert.assertTrue(flag);

    }

//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult"})
    public void clickConfirmButtonForCustName() {
        WebElement element = findElement(custSelection.getJsonObject(custSelection.getDCS29()));
        click(element);
        flag = clientAction.isElementAppeared(client.getJsonObject(client.getD30P()));
        Assert.assertTrue(flag);
    }
//
//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName"})
    public void checkCustNameInput() {
        string = randomCustName;
      WebElement element= findElement(client.getJsonObject(client.getD2P()));
        flag = clientAction.isStringEqualsText(element,string);
        Assert.assertTrue(flag);
    }

//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput"})
    public void inputRandomDept() {
        randomDeptName = Randoms.getRandomDeptName();
        string = randomDeptName;
        WebElement element = findElement(client.getJsonObject(client.getD39P()));
        sendKeys(element, randomDeptName);
        flag = clientAction.isStringEqualsText(element,string);
        Assert.assertTrue(flag);
    }

//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept"})
    public void clickManager() {//国君服务联系人
        WebElement element = findElement(client.getJsonObject(client.getD47P()));
        click(element);
        flag = clientAction.isElementAppeared(empSelection.getJsonObject(empSelection.getDES33()));
        Assert.assertTrue(flag);

    }


//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager"})
    public void inputEmpName() {
        randomEmpName = JDBC.getSqlResultStr(ClientSql.getSql2());
        string = randomEmpName;
        WebElement element = findElement(empSelection.getJsonObject(empSelection.getDES33()));
        sendKeys(element, randomEmpName);
        flag = clientAction.isStringEqualsText(element,string);
        Assert.assertTrue(flag);
    }

//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName"})
    public void clickSearchButtonForEmpName() {
        WebElement element = findElement(empSelection.getJsonObject(empSelection.getDES33Span()));
        click(element);
        flag = clientAction.isElementAppeared(empSelection.getJsonObject(empSelection.getDES10()));
        Assert.assertTrue(flag);
    }
//
//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName",
//            "clickSearchButtonForEmpName"})
    public void selectEmpNameSearchResult() {
        WebElement element = findElement(empSelection.get$JsonES10SiblingByUserName(randomEmpName));
        click(element);
        element = findElement(empSelection.get$JsonES10SiblingByUserName(randomEmpName));
        flag = clientAction.isSelected(element);
        Assert.assertTrue(flag);

    }

//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName",
//            "clickSearchButtonForEmpName", "selectEmpNameSearchResult"})
    public void clickConfirmButtonForEmpName() {
        WebElement element = findElement(empSelection.getJsonObject(empSelection.getDES29()));
        click(element);
        flag = clientAction.isElementAppeared(client.getJsonObject(client.getD30P()));
        Assert.assertTrue(flag);
    }

//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName",
//            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName"})
    public void checkManagerInput() {
        string = randomEmpName;
        WebElement element=findElement(client.getJsonObject(client.getD47P()));
        flag = clientAction.isStringEqualsText(element,string);
        Assert.assertTrue(flag);
    }

//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName",
//            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
//            "checkManagerInput"})
    public void inputFAX() {
        randomFAX = RandomInfo.getTel();
        string = randomFAX;
        WebElement element = findElement(client.getJsonObject(client.getD40P()));
        sendKeys(element, randomFAX);
        flag = clientAction.isStringEqualsText(element,string);
        Assert.assertTrue(flag);
    }

//
//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName",
//            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
//            "checkManagerInput", "inputFAX"})
    public void inputMobile() {
        randomMobile = clientAction.getRandomMobile();
        string = randomMobile;
        WebElement element = findElement(client.getJsonObject(client.getD38P()));
        sendKeys(element, randomMobile);
        flag = clientAction.isStringEqualsText(element,string);
        Assert.assertTrue(flag);
    }

//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName",
//            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
//            "checkManagerInput", "inputFAX", "inputMobile"})
    public void clickBizLine() {
        WebElement element = findElement(client.getJsonObject(client.getD34P()));
        click(element);
        flag = clientAction.isElementAppeared(bizLineSelection.getJsonObject(bizLineSelection.getDBLS30()));
        Assert.assertTrue(flag);

    }

//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName",
//            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
//            "checkManagerInput", "inputFAX", "inputMobile",
//            "clickBizLine"})
    public void selectBizLine() {

        clientAction.clickRandomBizLine();
        flag = clientAction.isBizLineSelected();
        Assert.assertTrue(flag);
    }

//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName",
//            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
//            "checkManagerInput", "inputFAX", "inputMobile",
//            "clickBizLine", "selectBizLine"})
    public void clickConfirmButtonForBizLine() {
        WebElement element = findElement(bizLineSelection.getJsonObject(bizLineSelection.getDBLS29()));
        click(element);
        flag = clientAction.isElementAppeared(client.getJsonObject(client.getD30P()));
        Assert.assertTrue(flag);
    }

//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName",
//            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
//            "checkManagerInput", "inputFAX", "inputMobile",
//            "clickBizLine", "selectBizLine", "clickConfirmButtonForBizLine"})
    public void checkBizLineInput() {

        flag = clientAction.isBizLinesEqualsStrings();
        Assert.assertTrue(flag);
    }


//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName",
//            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
//            "checkManagerInput", "inputFAX", "inputMobile",
//            "clickBizLine", "selectBizLine", "clickConfirmButtonForBizLine",
//            "checkBizLineInput"})
    public void inputJobPosition() {
        randomJobPosition = Randoms.getJobPosition();
        string = randomJobPosition;
        WebElement element = findElement(client.getJsonObject(client.getD43P()));
        sendKeys(element, randomJobPosition);
        flag = clientAction.isStringEqualsText(element,string);
        Assert.assertTrue(flag);
    }

//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName",
//            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
//            "checkManagerInput", "inputFAX", "inputMobile",
//            "clickBizLine", "selectBizLine", "clickConfirmButtonForBizLine",
//            "checkBizLineInput", "inputJobPosition"})
    public void inputTel() {
        randomTel = RandomInfo.getTel();
        string = randomTel;
        WebElement element = findElement(client.getJsonObject(client.getD44P()));
        sendKeys(element, randomTel);
        flag = clientAction.isStringEqualsText(element,string);
        Assert.assertTrue(flag);
    }

//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName",
//            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
//            "checkManagerInput", "inputFAX", "inputMobile",
//            "clickBizLine", "selectBizLine", "clickConfirmButtonForBizLine",
//            "checkBizLineInput", "inputJobPosition", "inputTel"})
    public void inputOfficeAddress() {
        randomAddress = RandomInfo.getRoadAddress();
        string = randomAddress;
        WebElement element = findElement(client.getJsonObject(client.getD46P()));
        sendKeys(element, randomAddress);
        flag = clientAction.isStringEqualsText(element,string);
        Assert.assertTrue(flag);

    }


//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName",
//            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
//            "checkManagerInput", "inputFAX", "inputMobile",
//            "clickBizLine", "selectBizLine", "clickConfirmButtonForBizLine",
//            "checkBizLineInput", "inputJobPosition", "inputTel", "inputOfficeAddress"})
    public void clickConfirmButtonForNewClient() {
        strings1 = clientAction.getWebpageInfo(tableHeader);


        WebElement element = findElement(client.getJsonObject(client.getD29P()));
        click(element);
        flag = clientAction.isElementAppeared(client.getJsonObject(client.getD48()));
        Assert.assertTrue(flag);

    }

//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName",
//            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
//            "checkManagerInput", "inputFAX", "inputMobile",
//            "clickBizLine", "selectBizLine", "clickConfirmButtonForBizLine",
//            "checkBizLineInput", "inputJobPosition", "inputTel", "inputOfficeAddress",
//            "clickConfirmButtonForNewClient"})
    public void compareInputWithWeb() {
        tableContent = clientAction.getInfo(1);
        WebElement element = findElement(client.get$D10SiblingJson(1));
        doubleClick(element);
        strings2 = clientAction.getWebpageInfo(tableHeader);
        flag = ListMisc.isEqual1(strings1, strings2);
        Assert.assertTrue(flag);

        flag = clientAction.isInTableEqualsInDetail(tableContent);
        element = findElement(client.getJsonObject(client.getD30P()));
        click(element);
        Assert.assertTrue(flag);
    }

//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName",
//            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
//            "checkManagerInput", "inputFAX", "inputMobile",
//            "clickBizLine", "selectBizLine", "clickConfirmButtonForBizLine",
//            "checkBizLineInput", "inputJobPosition", "inputTel", "inputOfficeAddress",
//            "clickConfirmButtonForNewClient", "compareInputWithWeb"})
    public void compareWebWithDatabase() {
        tableContent = clientAction.getTable();

        perPageNum = clientAction.getPerPageNum();//获得当前页面的条/页
        pagination = JDBC.getPagination(1, perPageNum);//获得分页语句

        sql = ClientSql.getSql4(pagination, where, whereLike, order);//拼上分页语句

        List<List<String>> list1 = JDBC.getResultToList(sql);
        List<List<String>> list2 = tableContent;
        flag = ListMisc.isEqual(list1, list2);

        initialiseParm();

        Assert.assertTrue(flag);

    }


    @Test
    public void createNewClient(){
        clickNewClientButton();
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

    @Test(dependsOnMethods = {"createNewClient"})
    public void editClient() {
        WebElement element = findElement(client.get$D10_actionSiblingJson(1));
        click(element);
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

        element = findElement(client.getJsonObject(client.getD34PCross()));
        click(element);

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


//    @BeforeMethod()
//    public void beforeMethod(){
//        String name = this.getClass().getName();
//        WebDriver driver1 = map.get(name);
//        driver = driver1;
//
//    }





    @BeforeClass
    public void beforeClass01() {
        OpenBrowserAction.open("chrome",this.getClass());
        LoginAction.login();
        get(client.getClient());//登录后跳转客户维护分配页面

        Client client = new Client();


        client.getObjAttr();

    }

    @AfterClass
    public void afterClass01() throws InterruptedException {

        Thread.sleep(5000);
        $.quit();
    }

}
