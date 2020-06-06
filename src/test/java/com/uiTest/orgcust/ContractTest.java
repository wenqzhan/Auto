package com.uiTest.orgcust;

import com.actions.OpenBrowserAction;
import com.actions.matrix.LoginAction;
import com.actions.matrix.YMDSelectionAction;
import com.actions.matrix.orgCust.ContractAction;
import com.driver.$;
import com.pageObject.commonObject.*;
import com.pageObject.matrix.orgCust.Client;
import com.pageObject.matrix.orgCust.Contract;
import com.utils.date.DateMisc;
import com.utils.json.Attr;
import com.utils.list.ListMisc;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class ContractTest extends $ {
    private static int testCount = 0;
    private Attr attr = new Attr(this.getClass());
    boolean flag;
    String custName;
    String materialTitle;
    String type;
    String date;
    String amount;
    String bizOpportunity;
    private ContractAction contractAction = new ContractAction();
    private Contract contract = new Contract();
    LoginAction loginAction = new LoginAction();

//    @Test
    public void clickUploadMaterial() {

        contractAction.clickUploadMaterial();
        flag = contractAction.isElementAppeared(contract.getJsonObject(contract.getD30P()));
        Assert.assertTrue(flag);
    }

//    @Test(dependsOnMethods = {"clickUploadMaterial"})
    public void inputMaterialTitle() {
        custName = contractAction.getRandomCustName();
        materialTitle = contractAction.getMaterialTitle(custName);
        WebElement element = contractAction.inputMaterialTitle(materialTitle);
        flag = contractAction.isStringEqualsText(element, materialTitle);
        Assert.assertTrue(flag);
    }


    //    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle"})
    public void inputCustName() {
        WebElement element = contractAction.inputCustName(custName);
        flag = contractAction.isStringEqualsText(element, custName);
        Assert.assertTrue(flag);
    }

    //    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName"})
    public void selectBizOpportunity() {
        bizOpportunity = contractAction.selectBizOpportunity();
        flag = contractAction.isStringEqualsText_div(bizOpportunity);
        Assert.assertTrue(flag);
    }

    //    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
//            "selectBizOpportunity"})
    public void selectMaterialType() {
        type = contractAction.selectMaterialType();
        WebElement element = findElement(contract.getJsonObject(contract.getD50PSpan()));
        flag = contractAction.isStringEqualsAttribute(element, type);
        Assert.assertTrue(flag);


    }


    //    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
//            "selectBizOpportunity", "selectMaterialType"})
    public void selectSignDate() {
        date = DateMisc.getRandomYMD();
        contractAction.clickAssignDate();
        YMDSelectionAction.selectYMD("签署日期", date);
        WebElement element = findElement(contract.getJsonObject(contract.getD54P()));
        flag = contractAction.isStringEqualsText(element, date);
        Assert.assertTrue(flag);
    }

    //    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
//            "selectBizOpportunity", "selectMaterialType", "selectSignDate"})
    public void inputContractAmount() {
        amount = contractAction.inputContractAmount();
        WebElement element = findElement(contract.getJsonObject(contract.getD55P()));
        flag = contractAction.isStringEqualsText(element, amount);
        Assert.assertTrue(flag);

    }


    //    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
//            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
//            "inputContractAmount"})
    public void uploadAttachment() {


        try {
            WebElement element = findElement(contract.getJsonObject(contract.getDUploadPUploadDoneCorss()),
                    contract.getJsonObject(contract.getDUploadPUploadingCorss()), 4, false);
            click(element);
        } catch (Exception e) {
            //do nothing
        }


        contractAction.upload("flv");
        flag = contractAction.isUploadSuccess();
        Assert.assertTrue(flag);

    }

    //    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
//            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
//            "inputContractAmount", "uploadAttachment"})
    public void clickConfirmButton() {
        List<List<String>> list1 = contractAction.getNewContractInfo();

        contractAction.clickConfirmButton();


        List<List<String>> list2 = contractAction.getInfo(1);
        ;

        flag = ListMisc.isEqual(list1, list2);

        Assert.assertTrue(flag);


    }


    //    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
//            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
//            "inputContractAmount", "uploadAttachment", "clickConfirmButton"})
    public void clickEdit() {
        WebElement element = findElement(contract.get$10ActionEditSiblingJson(1));
        click(element);
        flag = contractAction.isElementAppeared(contract.getJsonObject(contract.getD30P()));
        Assert.assertTrue(flag);
    }

    //    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
//            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
//            "inputContractAmount", "uploadAttachment", "clickConfirmButton",
//            "clickEdit"})
    public void editMaterialTitle() {
        inputMaterialTitle();
    }

    //    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
//            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
//            "inputContractAmount", "uploadAttachment", "clickConfirmButton",
//            "clickEdit", "editMaterialTitle"})
    public void editCustName() {
        inputCustName();
    }

    //    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
//            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
//            "inputContractAmount", "uploadAttachment", "clickConfirmButton",
//            "clickEdit", "editMaterialTitle", "editCustName"})
    public void editBizOpportunity() {
        selectBizOpportunity();
    }


    //    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
//            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
//            "inputContractAmount", "uploadAttachment", "clickConfirmButton",
//            "clickEdit", "editMaterialTitle", "editCustName",
//            "editBizOpportunity"})
    public void editMaterialType() {
        selectMaterialType();
    }

    //    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
//            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
//            "inputContractAmount", "uploadAttachment", "clickConfirmButton",
//            "clickEdit", "editMaterialTitle", "editCustName",
//            "editBizOpportunity", "editMaterialType"})
    public void editSignDate() {
        selectSignDate();
    }

    //    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
//            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
//            "inputContractAmount", "uploadAttachment", "clickConfirmButton",
//            "clickEdit", "editMaterialTitle", "editCustName",
//            "editBizOpportunity", "editMaterialType", "editSignDate"})
    public void editContractAmount() {
        inputContractAmount();
    }

    //    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
//            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
//            "inputContractAmount", "uploadAttachment", "clickConfirmButton",
//            "clickEdit", "editMaterialTitle", "editCustName",
//            "editBizOpportunity", "editMaterialType", "editSignDate",
//            "editContractAmount"})
    public void editAttachment() {

        try {
            WebElement element = findElement(contract.getJsonObject(contract.getDUploadPUploadDoneCorss()),
                    contract.getJsonObject(contract.getDUploadPUploadingCorss()), 4, false);
            click(element);
        } catch (Exception e) {
            //do nothing
        }


        WebElement element = findElement(contract.getJsonObject(contract.getDUploadPUploadDoneCorss()));
        click(element);
        contractAction.upload("mp4");
        flag = contractAction.isUploadSuccess();
        Assert.assertTrue(flag);

    }

    //    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
//            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
//            "inputContractAmount", "uploadAttachment", "clickConfirmButton",
//            "clickEdit", "editMaterialTitle", "editCustName",
//            "editBizOpportunity", "editMaterialType", "editSignDate",
//            "editContractAmount","editAttachment"})
    public void clickConfirmButtonAfterEdit() {
        clickConfirmButton();
    }


//    @Test
//    public void tetet() {
//
//
//        String a = contractAction.getRandomCustName();
//        System.out.println(contractAction.getMaterialTitle(a));
//        YMDSelectionAction.selectYMD("2020-05-21");
//    }


//    @BeforeMethod()
//    public void beforeMethod(){
//        String name = this.getClass().getName();
//        WebDriver driver1 = map.get(name);
//        driver = driver1;
//
//    }

    @Test
    public void createNewContractMaterial() {
        clickUploadMaterial();
        inputMaterialTitle();
        inputCustName();
        selectBizOpportunity();
        selectMaterialType();
        selectSignDate();
        inputContractAmount();
        uploadAttachment();
        clickConfirmButton();


    }

    @Test(dependsOnMethods = {"createNewContractMaterial"})
    public void editContractMaterial() {
        clickEdit();
        editMaterialTitle();
        editCustName();
        editBizOpportunity();
        editMaterialType();
        editSignDate();
        editContractAmount();
        editAttachment();
        clickConfirmButtonAfterEdit();
    }

    @BeforeClass
    public void beforeClass01() {
        testCount++;
        OpenBrowserAction.open("chrome", this.getClass());
        loginAction.login();
        get(contract.getContract());
        //get(Client.client);//登录后跳转客户维护分配页面





        Contract contract = new Contract();




        contract.getObjAttr();



    }

    @AfterClass
    public void afterClass01() throws InterruptedException {
        testCount--;
        Thread.sleep(5000);
        if (testCount == 0) {
            attr.deleteFromAttrs(this.getClass());
        }
        $.quit();
    }


}
