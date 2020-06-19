package com.actions.matrix;

import com.driver.$;
import com.pageObject.matrix.CustSelection;
import org.openqa.selenium.WebElement;

public class CustSelectionAction extends $ {
    private CustSelection custSelection;// = new CustSelection("操作");

    //    private static String string; //通用的string,用来存string
    public CustSelectionAction() {
        custSelection = new CustSelection("操作");
        custSelection = (CustSelection) custSelection.getObjAttr("操作");
    }


    public CustSelectionAction(String name) {
        custSelection = new CustSelection(name);
        custSelection = (CustSelection) custSelection.getObjAttr(name);
    }

    private void inputCustName(String custName) {
        String string = custName;
        WebElement element = findElement(custSelection.getJsonObject(custSelection.getDCustNameInput()));
        sendKeys(element, custName);
    }

    private void clickSearchButtonForCustName() {
        WebElement element = findElement(custSelection.getJsonObject(custSelection.getDSearchButtonSpan()));
        click(element);

    }


    private void selectCustNameSearchResult(String custName) {
        WebElement element = findElement(custSelection.get$TableTrsSiblingByCustNameJson(custName));
        click(element);
        findElement(custSelection.get$TableTrsSiblingByCustNameJson(custName));


    }

    private void clickConfirmButtonForCustName() {
        WebElement element = findElement(custSelection.getJsonObject(custSelection.getDConfirmButtonSpan()));
        click(element);


    }

    public void selectCustName(String custName) {

        inputCustName(custName);
        clickSearchButtonForCustName();
        selectCustNameSearchResult(custName);
        clickConfirmButtonForCustName();

    }

//    public static void selectCustName(CustSelectionAction custSelectionAction,String custName){
//        custSelectionAction.inputCustName(custName);
//        custSelectionAction.clickSearchButtonForCustName();
//        custSelectionAction.selectCustNameSearchResult(custName);
//        custSelectionAction.clickConfirmButtonForCustName();
//    }


}
