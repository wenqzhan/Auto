package com.uiTest.orgcust;

import com.actions.OpenBrowserAction;
import com.actions.matrix.LoginAction;
import com.actions.matrix.orgCust.ClientAction;
import com.driver.$;
import com.pageObject.matrix.BizLineSelection;
import com.pageObject.matrix.CustSelection;
import com.pageObject.matrix.EmpSelection;
import com.pageObject.matrix.orgCust.Client;
import com.sql.matrix.orgCust.ClientSql;
import com.utils.jdbc.JDBC;
import com.utils.json.Attr;
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
    private static int testCount = 0;
    private Attr attr = new Attr(this.getClass());
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
    private Client clientPopped = new Client("POPPED");
    private LoginAction loginAction = new LoginAction();


    private void setAttr() {
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
        List<WebElement> elements = findElements(client.getJsonObject(client.getDTableHeaderTr1Ths()));
        tableHeader = getTableHeader(elements);
        WebElement element = findElement(client.getJsonObject(client.getDNewButtonSpan()));
        click(element);
        flag = clientAction.isElementAppeared(clientPopped.getJsonObject(clientPopped.getDCloseButtonSpan()));
        Assert.assertTrue(flag);
    }


    //    @Test(dependsOnMethods = {"clickNewClientButton"})
    public void inputClientName() {
        WebElement element = findElement(clientPopped.getJsonObject(clientPopped.getDContactNameInput()));
        string = RandomInfo.getChineseName();
        sendKeys(element, string);
        flag = clientAction.isStringEqualsText(element, string);
        Assert.assertTrue(flag);
    }

    //    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName"})
    public void inputEmail() {
        WebElement element = findElement(clientPopped.getJsonObject(clientPopped.getDEmailInput()));
        String email = RandomInfo.getEmail(5, 15);
        string = email;
        sendKeys(element, email);
        flag = clientAction.isStringEqualsText(element, string);
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
        WebElement element = findElement(clientPopped.getJsonObject(clientPopped.getDCustNameInput()));
        click(element);
        flag = clientAction.isElementAppeared(custSelection.getJsonObject(custSelection.getDCloseButtonSpan()));
        Assert.assertTrue(flag);
    }

    //    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail", "clickCustName"})
    public void inputRandomCustName() {
        randomCustName = JDBC.getSqlResultStr(ClientSql.getSql1());
        string = randomCustName;
        WebElement element = findElement(custSelection.getJsonObject(custSelection.getDCustNameInput()));
        sendKeys(element, randomCustName);
        flag = clientAction.isStringEqualsText(element, string);
        Assert.assertTrue(flag);
    }

    //
//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName"})
    public void clickSearchButtonForCustName() {
        WebElement element = findElement(custSelection.getJsonObject(custSelection.getDSearchButtonSpan()));
        click(element);
        flag = clientAction.isElementAppeared(custSelection.getJsonObject(custSelection.getDTableTrs()));
        Assert.assertTrue(flag);
    }

    //    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName"})
    public void selectCustNameSearchResult() {
        WebElement element = findElement(custSelection.get$TableTrsSiblingByCustNameJson(randomCustName));
        click(element);
        element = findElement(custSelection.get$TableTrsSiblingByCustNameJson(randomCustName));
        flag = clientAction.isSelected(element);
        Assert.assertTrue(flag);

    }

    //    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult"})
    public void clickConfirmButtonForCustName() {
        WebElement element = findElement(custSelection.getJsonObject(custSelection.getDConfirmButtonSpan()));
        click(element);
        flag = clientAction.isElementAppeared(clientPopped.getJsonObject(clientPopped.getDCloseButtonSpan()));
        Assert.assertTrue(flag);
    }

    //
//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName"})
    public void checkCustNameInput() {
        string = randomCustName;
        WebElement element = findElement(clientPopped.getJsonObject(clientPopped.getDCustNameInput()));
        flag = clientAction.isStringEqualsText(element, string);
        Assert.assertTrue(flag);
    }

    //    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput"})
    public void inputRandomDept() {
        randomDeptName = Randoms.getRandomDeptName();
        string = randomDeptName;
        WebElement element = findElement(clientPopped.getJsonObject(clientPopped.getDDepartmentInput()));
        sendKeys(element, randomDeptName);
        flag = clientAction.isStringEqualsText(element, string);
        Assert.assertTrue(flag);
    }

    //    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept"})
    public void clickManager() {//国君服务联系人
        WebElement element = findElement(clientPopped.getJsonObject(clientPopped.getDGTJAContactInput()));
        click(element);
        flag = clientAction.isElementAppeared(empSelection.getJsonObject(empSelection.getDUserQueryInput()));
        Assert.assertTrue(flag);

    }


    //    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager"})
    public void inputEmpName() {
        randomEmpName = JDBC.getSqlResultStr(ClientSql.getSql2());
        string = randomEmpName;
        WebElement element = findElement(empSelection.getJsonObject(empSelection.getDUserQueryInput()));
        sendKeys(element, randomEmpName);
        flag = clientAction.isStringEqualsText(element, string);
        Assert.assertTrue(flag);
    }

    //    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName"})
    public void clickSearchButtonForEmpName() {
        WebElement element = findElement(empSelection.getJsonObject(empSelection.getDUserQueryInputSearchSpan()));
        click(element);
        flag = clientAction.isElementAppeared(empSelection.getJsonObject(empSelection.getDTableTrs()));
        Assert.assertTrue(flag);
    }

    //
//    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName",
//            "clickSearchButtonForEmpName"})
    public void selectEmpNameSearchResult() {
        WebElement element = findElement(empSelection.get$JsonTableTrsSiblingByUserName(randomEmpName));
        click(element);
        element = findElement(empSelection.get$JsonTableTrsSiblingByUserName(randomEmpName));
        flag = clientAction.isSelected(element);
        Assert.assertTrue(flag);

    }

    //    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName",
//            "clickSearchButtonForEmpName", "selectEmpNameSearchResult"})
    public void clickConfirmButtonForEmpName() {
        WebElement element = findElement(empSelection.getJsonObject(empSelection.getDConfirmButtonSpan()));
        click(element);
        flag = clientAction.isElementAppeared(clientPopped.getJsonObject(clientPopped.getDCloseButtonSpan()));
        Assert.assertTrue(flag);
    }

    //    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName",
//            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName"})
    public void checkManagerInput() {
        string = randomEmpName;
        WebElement element = findElement(clientPopped.getJsonObject(clientPopped.getDGTJAContactInput()));
        flag = clientAction.isStringEqualsText(element, string);
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
        WebElement element = findElement(clientPopped.getJsonObject(clientPopped.getDFaxInput()));
        sendKeys(element, randomFAX);
        flag = clientAction.isStringEqualsText(element, string);
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
        WebElement element = findElement(clientPopped.getJsonObject(clientPopped.getDMobileInput()));
        sendKeys(element, randomMobile);
        flag = clientAction.isStringEqualsText(element, string);
        Assert.assertTrue(flag);
    }

    //    @Test(dependsOnMethods = {"clickNewClientButton", "inputClientName", "inputEmail",
//            "clickCustName", "inputRandomCustName", "clickSearchButtonForCustName",
//            "selectCustNameSearchResult", "clickConfirmButtonForCustName", "checkCustNameInput",
//            "inputRandomDept", "clickManager", "inputEmpName",
//            "clickSearchButtonForEmpName", "selectEmpNameSearchResult", "clickConfirmButtonForEmpName",
//            "checkManagerInput", "inputFAX", "inputMobile"})
    public void clickBizLine() {
        WebElement element = findElement(clientPopped.getJsonObject(clientPopped.getDBusinessLineInput()));
        click(element);
        flag = clientAction.isElementAppeared(bizLineSelection.getJsonObject(bizLineSelection.getDCloseButtonSpan()));
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
        WebElement element = findElement(bizLineSelection.getJsonObject(bizLineSelection.getDConfirmButtonSpan()));
        click(element);
        flag = clientAction.isElementAppeared(clientPopped.getJsonObject(clientPopped.getDCloseButtonSpan()));
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
        WebElement element = findElement(clientPopped.getJsonObject(clientPopped.getDPositionInput()));
        sendKeys(element, randomJobPosition);
        flag = clientAction.isStringEqualsText(element, string);
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
        WebElement element = findElement(clientPopped.getJsonObject(clientPopped.getDTelInput()));
        sendKeys(element, randomTel);
        flag = clientAction.isStringEqualsText(element, string);
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
        WebElement element = findElement(clientPopped.getJsonObject(clientPopped.getDOfficeAddressInput()));
        sendKeys(element, randomAddress);
        flag = clientAction.isStringEqualsText(element, string);
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


        WebElement element = findElement(clientPopped.getJsonObject(clientPopped.getDConfirmButtonSpan()));
        click(element);
        flag = clientAction.isElementAppeared(client.getJsonObject(client.getDSuccessPromptWithGreenCheckDivFinal()));
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
        WebElement element = findElement(client.get$TableTrsSiblingJson(1));
        doubleClick(element);
        strings2 = clientAction.getWebpageInfo(tableHeader);
        System.out.println("s1s1s1s1s1s1s1s1");
        for(String str:strings1){
            System.out.println(str);
        }
        System.out.println("s1s1s1s1s1s1s1s1");
        System.out.println("s2s2s2s2s2s2s2s2");
        for(String str:strings2){
            System.out.println(str);
        }
        System.out.println("s2s2s2s2s2s2s2s2");
        flag = ListMisc.isEqual1(strings1, strings2);
        Assert.assertTrue(flag);

        flag = clientAction.isInTableEqualsInDetail(tableContent);
        element = findElement(clientPopped.getJsonObject(clientPopped.getDCloseButtonSpan()));
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
    public void createNewClient() {
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
        WebElement element = findElement(client.get$TableTrs_actionSiblingJson(1));
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

        element = findElement(clientPopped.getJsonObject(clientPopped.getDBusinessLineInputCrossI()));
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


        custSelection = (CustSelection) custSelection.getObjAttr();
        empSelection = (EmpSelection) empSelection.getObjAttr("国君服务联系人");
        clientPopped = (Client) clientPopped.getObjAttr("POPPED");
        testCount++;
        OpenBrowserAction.open("chrome", this.getClass());
        loginAction.login();
        get(client.getClient());//登录后跳转客户维护分配页面

//        Client client = new Client();

        empSelection = (EmpSelection) empSelection.getObjAttr("国君服务联系人");
        client = (Client) client.getObjAttr();

    }

    @AfterClass
    public void afterClass01() throws InterruptedException {
        testCount--;
        Thread.sleep(5000);
        if (testCount == 0) {
            attr.deleteFromAttrs(this.getClass());
        }
//        $.quit();

    }

}
