package com.actions.matrix;

import com.actions.matrix.orgCust.ClientAction;
import com.driver.$;
import com.pageObject.commonObject.CustSelection;
import com.pageObject.matrix.orgCust.Client;
import com.sql.matrix.orgCust.ClientSql;
import com.utils.jdbc.JDBC;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustSelectionAction extends $ {
    private CustSelection custSelection = new CustSelection();

    public CustSelectionAction(){}

    public CustSelectionAction(String name) {
    this.custSelection = new CustSelection(name);
    }

    private void inputCustName(String custName) {
        string = custName;
        findElement(custSelection.getJson(custSelection.dCS2));
        sendKeys(custName);
    }

    private void clickSearchButtonForCustName() {
        findElement(custSelection.getJson(custSelection.dCS3));
        click();

    }


    private void selectCustNameSearchResult(String custName) {
        findElement(custSelection.getJsonCS10SiblingByCustName(custName));
        click();
        findElement(custSelection.getJsonCS10SiblingByCustName(custName));


    }

    private void clickConfirmButtonForCustName() {
        findElement(custSelection.getJson(custSelection.dCS29));
        click();


    }

    public void selectCustName(String custName){

        inputCustName(custName);
        clickSearchButtonForCustName();
        selectCustNameSearchResult(custName);
        clickConfirmButtonForCustName();

    }


}
