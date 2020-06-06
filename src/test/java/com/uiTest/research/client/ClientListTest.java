package com.uiTest.research.client;

import com.actions.OpenBrowserAction;
import com.actions.matrix.LoginAction;
import com.actions.matrix.YMDSelectionAction;
import com.alibaba.fastjson.JSONObject;
import com.driver.$;
import com.pageObject.commonObject.CommonObject;
import com.utils.json.Attr;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClientListTest extends $ {
    private Attr attr = new Attr(this.getClass());
    private LoginAction loginAction = new LoginAction();
    boolean flag;


    @Test
    public void test(){
        CommonObject commonObject = new CommonObject();
        commonObject.getObjAttr();
        get("http://10.187.144.60:8080/research/client/clientList");
        WebElement element = findElement(commonObject.getJsonObject(commonObject.getD35()));
        click(element);
        element = findElement(commonObject.getJsonObject(commonObject.getD121()));
        click(element);
        element = findElement(commonObject.getJsonObject(commonObject.getD5()));
        click(element);
        element = findElement(commonObject.getJsonObject(commonObject.getD135From()));
        click(element);



        String a = "2010-06-08";
        String b = "2020-07-09";
        String[] ymdToYmd = new String[2];
        ymdToYmd[0] = a;
        ymdToYmd[1] = b;

        YMDSelectionAction.selectYMDToYMD("调研时间",ymdToYmd);

        element = findElement(commonObject.getJsonObject(commonObject.getD120()));
        click(element);

        JSONObject jsonObject= (commonObject.getJsonObject(commonObject.getD11Tmp()));

        getTableHeader(jsonObject);

        jsonObject= (commonObject.getJsonObject(commonObject.getD10()));

        getTableBody(jsonObject);

    }

    @BeforeClass
    public void beforeClass01() {
        OpenBrowserAction.open("firefox", this.getClass());
        loginAction.login();
    }

    @AfterClass
    public void afterClass01() throws InterruptedException {
        Thread.sleep(5000);
        attr.deleteFromAttrs(this.getClass());
//        $.quit();
    }
}
