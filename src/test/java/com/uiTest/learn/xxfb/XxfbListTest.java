package com.uiTest.learn.xxfb;

import com.actions.OpenBrowserAction;
import com.actions.matrix.LoginAction;
import com.actions.matrix.learn.xxfb.XxfbListAction;
import com.driver.$;
import com.utils.json.Attr;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class XxfbListTest extends $ {


    //    private XxfbList xxfbList = new XxfbList();
    private Attr attr = new Attr(this.getClass());
//    private static int testCount = 0;
    private XxfbListAction xxfbListAction = new XxfbListAction();
    private LoginAction loginAction = new LoginAction();
    //    private CommonObject commonObject = new CommonObject();
    boolean flag;


//    @Test
//    private void dfsdfdf(){
//        get("http://10.187.144.60:8080/custListManager/customAdjustHistory");
//        WebElement element = findElement(By.xpath(" //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not (contains(@style,'height'))][1]/td[4]"));
//        List<WebElement> elementList = element.findElements(By.tagName("span"));
//        System.out.println("!@#!@#!@#!@#@!#!@##");
//        System.out.println(elementList.size());
//        System.out.println("!@#!@#!@#!@#@!#!@##");
//        WebElement element1 = element.findElement(By.tagName("span")).findElement(By.tagName("span"));
//        System.out.println("123123123123");
//        System.out.println(getText(element1));
//        System.out.println("123123123123");
//
//    }

    private void getTargetUrl(){
        xxfbListAction.getXxfbList();//登录后跳转客户维护分配页面
    }

    private void clickNewButton() {
        flag = xxfbListAction.clickNewButton();
        Assert.assertTrue(flag);
    }

    private void selectAttachmentPermission() {
        flag = xxfbListAction.selectAttachmentPermission();
        Assert.assertTrue(flag);
    }

    private void selectIsWatermarked() {
        flag = xxfbListAction.selectIsWatermarked();
        Assert.assertTrue(flag);
    }

    private void selectClassification() {
        flag = xxfbListAction.selectClassification();
        Assert.assertTrue(flag);
    }

    private void inputTitle() {
        flag = xxfbListAction.inputTitle();
        Assert.assertTrue(flag);
    }


    private void inputAbstractText() {
        flag = xxfbListAction.inputAbstractText();
        Assert.assertTrue(flag);
    }

    private void uploadTitleImg() {
        flag = xxfbListAction.uploadTitleImg();
        Assert.assertTrue(flag);
    }

    private void inputSummary() {
        flag = xxfbListAction.inputSummary();
        Assert.assertTrue(flag);
    }

    private void selectPublisher() {
        flag = xxfbListAction.selectPublisher();
        Assert.assertTrue(flag);
    }

    private void selectDisplayOption() {
        flag = xxfbListAction.selectDisplayOption();
        Assert.assertTrue(flag);
    }

    private void inputTopOrder() {
        flag = xxfbListAction.inputTopOrder();
        Assert.assertTrue(flag);
    }

    private void selectTodayMustRead() {
        flag = xxfbListAction.selectTodayMustRead();
        Assert.assertTrue(flag);
    }

    private void inputExternalLink() {
        flag = xxfbListAction.inputExternalLink();
        Assert.assertTrue(flag);
    }

    private void inputMainBodyText() {
        flag = xxfbListAction.inputMainBodyText();
        Assert.assertTrue(flag);
    }

    private void uploadAttachments() {
        flag = xxfbListAction.uploadAttachments();
        Assert.assertTrue(flag);
    }

    private void clickSaveButton() {
        flag = xxfbListAction.clickSaveButton();
        Assert.assertTrue(flag);
    }

    private void checkResult() {
        flag = xxfbListAction.checkResult();
        Assert.assertTrue(flag);
    }

    private void clickEdit() {
        flag = xxfbListAction.clickEdit();
        Assert.assertTrue(flag);
    }

    @Test
    public void createNewXxfb() {
        getTargetUrl();
        clickNewButton();
        uploadAttachments();
        selectAttachmentPermission();
        selectIsWatermarked();
        selectClassification();
        inputTitle();
        inputAbstractText();
        uploadTitleImg();
        inputSummary();
        selectPublisher();
        selectDisplayOption();
        inputTopOrder();
        selectTodayMustRead();
        inputExternalLink();
        inputMainBodyText();
        clickSaveButton();
        checkResult();
    }

    @Test(dependsOnMethods = {"createNewXxfb"})
    public void editXxfb() {
        clickEdit();
        uploadAttachments();
        selectAttachmentPermission();
        selectIsWatermarked();
        selectClassification();
        inputTitle();
        inputAbstractText();
        uploadTitleImg();
        inputSummary();
        selectPublisher();
        selectDisplayOption();
        inputTopOrder();
        selectTodayMustRead();
        inputExternalLink();
        inputMainBodyText();
        clickSaveButton();
        checkResult();
    }


//    public void dfsfsdf() {
//
//        xxfbListAction.clickNewButton();
//
//        xxfbListAction.selectAttachmentPermission();
//
//        xxfbListAction.selectIsWatermarked();
//
//        WebElement element = findElement(commonObject.getJsonObject(commonObject.getD69()));
//        upload(element, "C:\\Users\\WENQIN\\Desktop\\微信图片_20200514171700.png");
//
//        String a = ClipboardMisc.getClipboardString();
//        System.out.println(a);
//
//        ClipboardMisc.setClipboardString("aaaaaaaajjjjjj");
//
//
////        element = findElement(commonObject.getJsonObject(commonObject.getD78()));
////        System.out.println(getAttribute(element,"id"));
////        System.out.println(getAttribute(element,"frameborder"));
////        System.out.println(getAttribute(element,"allowtransparency"));
////        System.out.println(getAttribute(element,"title"));
////        System.out.println(getAttribute(element,"class"));
////
////
////        System.out.println("++++++++++++++++++");
////
////        element = findElement(commonObject.getJsonObject(commonObject.getD78()));
////        System.out.println(getAttribute(element,"id"));
////        System.out.println(getAttribute(element,"frameborder"));
////        System.out.println(getAttribute(element,"allowtransparency"));
////        System.out.println(getAttribute(element,"title"));
////        System.out.println(getAttribute(element,"class"));
////        System.out.println("++++++++++++++++++");
////
////
////        System.out.println("++++++++++++++++++");
////
////        element = findElement(commonObject.getJsonObject(commonObject.getD78()));
////        System.out.println(getAttribute(element,"id"));
////        System.out.println(getAttribute(element,"frameborder"));
////        System.out.println(getAttribute(element,"allowtransparency"));
////        System.out.println(getAttribute(element,"title"));
////        System.out.println(getAttribute(element,"class"));
////        System.out.println("++++++++++++++++++");
////
////
////
////        System.out.println("++++++++++++++++++");
////
////        element = findElement(commonObject.getJsonObject(commonObject.getD78()));
////        System.out.println(getAttribute(element,"id"));
////        System.out.println(getAttribute(element,"frameborder"));
////        System.out.println(getAttribute(element,"allowtransparency"));
////        System.out.println(getAttribute(element,"title"));
////        System.out.println(getAttribute(element,"class"));
////        System.out.println("++++++++++++++++++");
////
////        System.out.println("++++++++++++++++++");
////        element = findIframe();
////        System.out.println(getAttribute(element,"id"));
////        System.out.println(getAttribute(element,"frameborder"));
////        System.out.println(getAttribute(element,"allowtransparency"));
////        System.out.println(getAttribute(element,"title"));
////        System.out.println(getAttribute(element,"class"));
////        System.out.println("++++++++++++++++++");
//
//        element = findIframe(commonObject.getJsonObject(commonObject.getD78()));
//
//
//        switchToFrame(element);
//
//        element = findElement(By.xpath("//body"));
////        click(element);
//        element.sendKeys("~~:");
//
//        pressAndRelease(KeyEvent.VK_CONTROL, KeyEvent.VK_V);
//
//        switchToDefaultContent();
//
//
////        element = findElement(By.xpath("//p[text()='点击或将文件拖拽到这里上传']/../../input"));
////        upload(element, "C:\\Users\\WENQIN\\Desktop\\微信图片_20200514171700.png");
////
////        element = findElement(By.xpath("//p[text()='点击或将文件拖拽到这里上传']/../../input"));
////        upload(element, "C:\\Users\\WENQIN\\Desktop\\微信图片_20200514171700.png");
////
////        element = findElement(By.xpath("//p[text()='点击或将文件拖拽到这里上传']/../../input"));
////        upload(element, "C:\\Users\\WENQIN\\Desktop\\微信图片_20200514171700.png");
////
//
//        String aaa = "C:\\Users\\WENQIN\\Desktop\\微信图片_20200514171700.png";
//
//        String bbb = "C:\\Users\\WENQIN\\Documents\\Apowersoft\\ApowerREC\\20200423_194449.mp4";
//
////        AttachmentUploadAction.uploadAttachments("附件", bbb, bbb, bbb, bbb, bbb, bbb, bbb, bbb, bbb, bbb, bbb, bbb);
//
//
//    }


    @BeforeClass
    public void beforeClass01() {
//        testCount++;
//        System.out.println("+++++{{{{{{{}}}}}}}}}}}");
//        System.out.println(testCount);
//        System.out.println("+++++{{{{{{{}}}}}}}}}}}");
//        OpenBrowserAction.initializeAttrs(this.getClass());
//        CommonObject commonObject = new CommonObject();
//        commonObject.getObjAttr();

//        CommonObjectPopped commonObjectPopped = new CommonObjectPopped();
//        commonObjectPopped=(CommonObjectPopped) commonObjectPopped.getObjAttr();

        OpenBrowserAction.open("firefox", this.getClass());
        loginAction.login();


//        xxfbList.getObjAttr();
//        commonObject.getObjAttr();


    }

    @AfterClass
    public void afterClass01() throws InterruptedException {
//        System.out.println("{{{{{{{}}}}}}}}}}}");
//        System.out.println(testCount);
//        System.out.println("{{{{{{{}}}}}}}}}}}");
//        testCount--;
//        System.out.println("------{{{{{{{}}}}}}}}}}}");
//        System.out.println(testCount);
//        System.out.println("------{{{{{{{}}}}}}}}}}}");
//        attr.getAttrsSize();
        Thread.sleep(5000);

//        if (testCount == 0) {
        attr.deleteFromAttrs(this.getClass());
        $.quit();
//        }
//        attr.getAttrsSize();
    }


}
