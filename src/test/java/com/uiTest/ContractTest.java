package com.uiTest;

import com.actions.OpenBrowserAction;
import com.actions.matrix.LoginAction;
import com.actions.matrix.YMDSelectionAction;
import com.actions.matrix.navigate.TopNavigatorAction;
import com.actions.matrix.orgCust.ClientAction;
import com.actions.matrix.orgCust.ContractAction;
import com.driver.$;
import com.pageObject.matrix.orgCust.Client;
import com.pageObject.matrix.orgCust.Contract;
import com.utils.date.DateMisc;
import com.utils.json.JsonObject;
import com.utils.list.ListMisc;
import com.utils.random.Randoms;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class ContractTest extends $ {
    boolean flag;
    String custName;
    String materialTitle;
    String type;
    String date;
    String amount;
    String bizOpportunity;


    @Test
    public void clickUploadMaterial() {

        ContractAction.clickUploadMaterial();
        flag = ContractAction.isElementAppeared(Contract.getJson(Contract.d30P));
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickUploadMaterial"})
    public void inputMaterialTitle() {
        custName = ContractAction.getRandomCustName();
        materialTitle = ContractAction.getMaterialTitle(custName);
        ContractAction.inputMaterialTitle(materialTitle);
        flag = ContractAction.isStringEqualsText(materialTitle);
        Assert.assertTrue(flag);
    }


    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle"})
    public void inputCustName() {
        ContractAction.inputCustName(custName);
        flag = ContractAction.isStringEqualsText(custName);
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName"})
    public void selectBizOpportunity() {
        bizOpportunity = ContractAction.selectBizOpportunity();
        flag = ContractAction.isStringEqualsText_div(bizOpportunity);
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
            "selectBizOpportunity"})
    public void selectMaterialType() {
        type = ContractAction.selectMaterialType();
        flag = ContractAction.isStringEqualsAttribute(type);
        Assert.assertTrue(flag);


    }


    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
            "selectBizOpportunity", "selectMaterialType"})
    public void selectSignDate() {
        date = DateMisc.getRandomYMD();
        ContractAction.clickAssignDate();
        YMDSelectionAction.selectYMD("签署日期", date);
        findElement(Contract.getJson(Contract.d54P));
        flag = ContractAction.isStringEqualsText(date);
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
            "selectBizOpportunity", "selectMaterialType", "selectSignDate"})
    public void inputContractAmount() {
        amount = ContractAction.inputContractAmount();
        flag = ContractAction.isStringEqualsText(amount);
        Assert.assertTrue(flag);

    }


    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
            "inputContractAmount"})
    public void uploadAttachment() {
        ContractAction.upload("flv");
        flag = ContractAction.isUploadSuccess();
        Assert.assertTrue(flag);

    }

    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
            "inputContractAmount", "uploadAttachment"})
    public void clickConfirmButton() {
        List<List<String>> list1 = ContractAction.getNewContractInfo();

        ContractAction.clickConfirmButton();

        ContractAction.getInfo(1);

        List<List<String>> list2 = tableContent;

        flag = ListMisc.isEqual(list1, list2);

        Assert.assertTrue(flag);


    }


    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
            "inputContractAmount", "uploadAttachment", "clickConfirmButton"})
    public void clickEdit() {
        findElement(Contract.get$D10_action_editSiblingJson(1));
        click();
        flag = ContractAction.isElementAppeared(Contract.getJson(Contract.d30P));
        Assert.assertTrue(flag);
    }

    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
            "inputContractAmount", "uploadAttachment", "clickConfirmButton",
            "clickEdit"})
    public void editMaterialTitle() {
        inputMaterialTitle();
    }

    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
            "inputContractAmount", "uploadAttachment", "clickConfirmButton",
            "clickEdit", "editMaterialTitle"})
    public void editCustName() {
        inputCustName();
    }

    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
            "inputContractAmount", "uploadAttachment", "clickConfirmButton",
            "clickEdit", "editMaterialTitle", "editCustName"})
    public void editBizOpportunity() {
        selectBizOpportunity();
    }


    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
            "inputContractAmount", "uploadAttachment", "clickConfirmButton",
            "clickEdit", "editMaterialTitle", "editCustName",
            "editBizOpportunity"})
    public void editMaterialType() {
        selectMaterialType();
    }

    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
            "inputContractAmount", "uploadAttachment", "clickConfirmButton",
            "clickEdit", "editMaterialTitle", "editCustName",
            "editBizOpportunity", "editMaterialType"})
    public void editSignDate() {
        selectSignDate();
    }

    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
            "inputContractAmount", "uploadAttachment", "clickConfirmButton",
            "clickEdit", "editMaterialTitle", "editCustName",
            "editBizOpportunity", "editMaterialType", "editSignDate"})
    public void editContractAmount() {
        inputContractAmount();
    }

    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
            "inputContractAmount", "uploadAttachment", "clickConfirmButton",
            "clickEdit", "editMaterialTitle", "editCustName",
            "editBizOpportunity", "editMaterialType", "editSignDate",
            "editContractAmount"})
    public void editAttachment() {
        findElement(Contract.getJson(Contract.dUploadP_uploadDone_corss));
        click();
        ContractAction.upload("mp4");
        flag = ContractAction.isUploadSuccess();
        Assert.assertTrue(flag);

    }

    @Test(dependsOnMethods = {"clickUploadMaterial", "inputMaterialTitle", "inputCustName",
            "selectBizOpportunity", "selectMaterialType", "selectSignDate",
            "inputContractAmount", "uploadAttachment", "clickConfirmButton",
            "clickEdit", "editMaterialTitle", "editCustName",
            "editBizOpportunity", "editMaterialType", "editSignDate",
            "editContractAmount","editAttachment"})
    public void clickConfirmButtonAfterEdit() {
        clickConfirmButton();
    }


//    @Test
//    public void tetet() {
//
//
//        String a = ContractAction.getRandomCustName();
//        System.out.println(ContractAction.getMaterialTitle(a));
//        YMDSelectionAction.selectYMD("2020-05-21");
//    }


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
        get(Contract.contract);
        //get(Client.client);//登录后跳转客户维护分配页面


    }

    @AfterClass
    public void afterTest01() throws InterruptedException {

        Thread.sleep(5000);
        $.quit();
    }


}
