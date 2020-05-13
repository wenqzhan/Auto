package com.actions.matrix;

import com.driver.$;
import com.pageObject.commonObject.CustSelection;
import org.openqa.selenium.WebElement;

public class CustSelectionAction extends $ {
    private CustSelection custSelection;// = new CustSelection("操作");

    //    private static String string; //通用的string,用来存string
    public CustSelectionAction() {
        this.custSelection = new CustSelection("操作");
//        custSelection.getObjAttr();
    }


    public CustSelectionAction(String name) {
        this.custSelection = new CustSelection(name);
//        custSelection.getObjAttr();
    }

    private void inputCustName(String custName) {
        String string = custName;
        WebElement element = findElement(custSelection.getJsonObject(custSelection.getDCS2()));
        sendKeys(element, custName);
    }

    private void clickSearchButtonForCustName() {
        WebElement element = findElement(custSelection.getJsonObject(custSelection.getDCS3()));
        click(element);

    }


    private void selectCustNameSearchResult(String custName) {
        WebElement element = findElement(custSelection.get$CS10SiblingByCustNameJson(custName));
        click(element);
        findElement(custSelection.get$CS10SiblingByCustNameJson(custName));


    }

    private void clickConfirmButtonForCustName() {
        WebElement element = findElement(custSelection.getJsonObject(custSelection.getDCS29()));
        click(element);


    }

    public void selectCustName(String custName) {

        inputCustName(custName);
        clickSearchButtonForCustName();
        selectCustNameSearchResult(custName);
        clickConfirmButtonForCustName();

    }


}
