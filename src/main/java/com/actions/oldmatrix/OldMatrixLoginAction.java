package com.actions.oldmatrix;


import com.alibaba.fastjson.JSONObject;
import com.driver.$;
import com.pageObject.oldMatrix.OldLoginPage;
import org.openqa.selenium.WebElement;

public class OldMatrixLoginAction extends $ {
    private static JSONObject jsonObject;
    public static void login(){
        $.get(OldLoginPage.matrixLoginUrl);
        jsonObject = OldLoginPage.getJson(OldLoginPage.d1);
        WebElement element =$.findElement(jsonObject);
        $.clear(element);
        $.sendKeys(element,"029527");
        jsonObject = OldLoginPage.getJson(OldLoginPage.d2);

        element=$.findElement(jsonObject);
        $.clear(element);
        $.sendKeys(element,"gtja@2020");

        jsonObject = OldLoginPage.getJson(OldLoginPage.d4);
        element=$.findElement(jsonObject);
        $.click(element);
    }


}
