package com.actions.matrix.learn.xxfb;

import com.actions.matrix.AttachmentUploadAction;
import com.actions.matrix.EmpSelectionAction;
import com.alibaba.fastjson.JSONObject;
import com.driver.$;
import com.pageObject.matrix.learn.xxfb.Edit;
import com.pageObject.matrix.learn.xxfb.XxfbList;
import com.sql.matrix.EmpSelectionSql;
import com.utils.file.MyFile;
import com.utils.jdbc.JDBC;
import com.utils.log.LoggerController;
import com.utils.random.Randoms;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class XxfbListAction extends $ {
    XxfbList xxfbList = new XxfbList();
    Edit edit = new Edit();

    public XxfbListAction() {
//        initialiseAttr();
//        System.out.println("ccccckkkkkkccccc");
        xxfbList = (XxfbList) xxfbList.getObjAttr();

        edit = (Edit) edit.getObjAttr();
    }

    private final static LoggerController log = LoggerController.getLogger(XxfbListAction.class);

    public void getXxfbList() {
        get(xxfbList.getXxfbList());
    }

    //信息发布点击新增
    public boolean clickNewButton() {
        boolean flag;
        WebElement element = findElement(xxfbList.getJsonObject(xxfbList.getD35()));
        click(element);
        flag = isElementAppeared(edit.getJsonObject(edit.getD60()));
        flag = getUrl().equals(edit.getEdit());
        if (!flag) {
            log.info("网址不对或者没看到保存按钮");
        }
        return flag;
    }

    //选择附件权限
    public boolean selectAttachmentPermission() {
        JSONObject jsonObject1 = edit.getJsonObject(edit.getD63());
        JSONObject jsonObject2 = edit.getJsonObject(edit.getD63RadioSpan());
        JSONObject jsonObject3 = edit.getJsonObject(edit.getD64());
        JSONObject jsonObject4 = edit.getJsonObject(edit.getD64RadioSpan());
        return randomClickAndCheckAttribute(jsonObject1, jsonObject2, jsonObject3, jsonObject4);
    }

    //选择是否有水印
    public boolean selectIsWatermarked() {
        JSONObject jsonObject1 = edit.getJsonObject(edit.getD65());
        JSONObject jsonObject2 = edit.getJsonObject(edit.getD65RadioSpan());
        JSONObject jsonObject3 = edit.getJsonObject(edit.getD66());
        JSONObject jsonObject4 = edit.getJsonObject(edit.getD66RadioSpan());
        return randomClickAndCheckAttribute(jsonObject1, jsonObject2, jsonObject3, jsonObject4);
    }

    //选择分类
    public boolean selectClassification() {
        boolean flag = true;
        WebElement element = findElement(edit.getJsonObject(edit.getD58()));
        click(element);
        List<Integer> except = new ArrayList<>();
        except.add(6);
        except.add(11);
        int random = Randoms.getRandomNum(1, 13, except);
        String str = random < 10 ? "0" + random : "" + random;
        Field[] fields = edit.getClass().getDeclaredFields();
        String varName = "d58Span" + str;
        String varValue;
        Object o = null;
        for (Field field : fields) {
            try {
                boolean access = field.isAccessible();
                if (!access) field.setAccessible(true);

                if (field.getName().equals(varName)) {
                    o = field.get(edit);
                    break;
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        varValue = (String) o;
        element = findElement(edit.getJsonObject(varValue));
        click(element);
        String value = getClassificationValue();
        if (value.equals("")) {
            flag = false;
        } else {
            flag = varValue.contains(value);
        }
        return flag;
    }

    //输入标题
    public boolean inputTitle() {
        boolean flag;
        String title = getClassificationValue();
        long timestamp = System.currentTimeMillis();
        title = title + "@" + timestamp;
        WebElement element = findElement(edit.getJsonObject(edit.getD67()));
        sendKeys(element, title);
        element = findElement(edit.getJsonObject(edit.getD67()));
        String text = getInputValue(element);
        flag = text.equals(title);
        return flag;
    }


    //输入正文摘要
    public boolean inputAbstractText() {
        boolean flag;
        String abstractText = getClassificationValue();
        String randomStr = Randoms.getRandomStr(Randoms.getRandomNum(10, 50));
        long timestamp = System.currentTimeMillis();
        abstractText = abstractText + randomStr + "@" + timestamp;
        WebElement element = findElement(edit.getJsonObject(edit.getD68()));
        sendKeys(element, abstractText);
        element = findElement(edit.getJsonObject(edit.getD68()));
        String text = getInputValue(element);
        flag = text.equals(abstractText);
        return flag;
    }


    //上传标题图片
    public boolean uploadTitleImg() {
        boolean flag;
        WebElement element;
        try {
            element = findElement(edit.getJsonObject(edit.getD69UploadFileCross()), 1, false);
            click(element);
            Thread.sleep(500);
        } catch (Exception e) {
            //do nothing
        }
        String path = System.getProperty("user.dir");
        path = path + "\\files";
        List<String> files = MyFile.getFiles(path);
        int random = Randoms.getRandomNum(0, files.size() - 1);
        String file = files.get(random);
        System.out.println(file);
        String name = MyFile.getFileName(file);
        System.out.println(name);
        element = findElement(edit.getJsonObject(edit.getD69()));
        upload(element, file);
        element = findElement(edit.getJsonObject(edit.getD69UploadFile()), 60);
        String nameOnWeb = getAttribute(element, "title");
        flag = name.equals(nameOnWeb);
        return flag;
    }

    //输入摘要
    public boolean inputSummary() {
        boolean flag;
        String summary = getClassificationValue();
        String randomStr = Randoms.getRandomGBKStr(Randoms.getRandomNum(50, 150));
        long timestamp = System.currentTimeMillis();
        summary = summary + randomStr + "@" + timestamp;
        WebElement element = findElement(edit.getJsonObject(edit.getD70()));
        sendKeys(element, summary);
        element = findElement(edit.getJsonObject(edit.getD70()));
        String text = getTextareaValue(element);
        flag = text.equals(summary);
        return flag;
    }

    //选择发布人
    public boolean selectPublisher() {
        boolean flag;
        String empName = JDBC.getSqlResultStr(EmpSelectionSql.getSql2());
        WebElement element = findElement(edit.getJsonObject(edit.getD71()));
        click(element);
        flag = EmpSelectionAction.selectEmp("发布人", empName);
        element = findElement(edit.getJsonObject(edit.getD71()));
        String empNameInInput = getInputValue(element);
        flag = flag && empName.equals(empNameInInput);
        return flag;
    }


    //选择显示设置
    public boolean selectDisplayOption() {
        JSONObject jsonObject1 = edit.getJsonObject(edit.getD72());
        JSONObject jsonObject2 = edit.getJsonObject(edit.getD72RadioSpan());
        JSONObject jsonObject3 = edit.getJsonObject(edit.getD73());
        JSONObject jsonObject4 = edit.getJsonObject(edit.getD73RadioSpan());
        return randomClickAndCheckAttribute(jsonObject1, jsonObject2, jsonObject3, jsonObject4);
    }

    //输入置顶顺序
    public boolean inputTopOrder() {
        boolean flag;
        WebElement element = findElement(edit.getJsonObject(edit.getD74()));
        if (getDriver().toString().toLowerCase().contains("firefox")) {
            element.clear();
            element = findElement(edit.getJsonObject(edit.getD74()));
//            System.out.println("!!!!!!!");
            sendKeys(element, "-1");
//            System.out.println("!!!!!!!");

        } else {
            sendKeys(element, "-1");
        }
        element = findElement(edit.getJsonObject(edit.getD74()));
        String text = getInputValue(element);
        flag = text.equals("-1");
        return flag;
    }


    //选择推送今日必读
    public boolean selectTodayMustRead() {
        JSONObject jsonObject1 = edit.getJsonObject(edit.getD75());
        JSONObject jsonObject2 = edit.getJsonObject(edit.getD75RadioSpan());
        JSONObject jsonObject3 = edit.getJsonObject(edit.getD76());
        JSONObject jsonObject4 = edit.getJsonObject(edit.getD76RadioSpan());
        return randomClickAndCheckAttribute(jsonObject1, jsonObject2, jsonObject3, jsonObject4);
    }

    //输入外部链接
    public boolean inputExternalLink() {
        boolean flag;
        String link = "https://www.baidu.com/";
        WebElement element = findElement(edit.getJsonObject(edit.getD77()));
        if (getDriver().toString().toLowerCase().contains("firefox")) {
            element.clear();
            element = findElement(edit.getJsonObject(edit.getD77()));
            sendKeys(element, link);
        } else {
            sendKeys(element, link);
        }
        element = findElement(edit.getJsonObject(edit.getD77()));
        String text = getInputValue(element);
//        System.out.println("SDFSDFSDFF");
//        System.out.println(link);
//        System.out.println(text);
//        System.out.println("SDFSDFSDFF");
        flag = text.equals(link);
        return flag;
    }

    //输入正文
    public boolean inputMainBodyText() {
        boolean flag;
        String mainBodyText = getClassificationValue();
        String randomStr = Randoms.getRandomGBKStr(Randoms.getRandomNum(1500, 2500));
        long timestamp = System.currentTimeMillis();
        mainBodyText = mainBodyText + randomStr + "@" + timestamp;
        WebElement element = findElement(edit.getJsonObject(edit.getD78()));
        switchToFrame(element);
        element = findElement(edit.getJsonObject(edit.getD78IframeBody()));
        sendKeys(element, mainBodyText);
        element = findElement(edit.getJsonObject(edit.getD78IframeBody()));
        String text = getText(element);
        flag = mainBodyText.equals(text);
        switchToDefaultContent();


        return flag;
    }

    //上传附件
    public boolean uploadAttachments() {
        boolean flag;
        String path = System.getProperty("user.dir");
        path = path + "\\files";
        List<String> files = MyFile.getFiles(path);
        Collections.shuffle(files);
        List<String> filesTmp = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            filesTmp.add(files.get(i));
        }
        String[] f = filesTmp.toArray(new String[filesTmp.size()]);
        flag = AttachmentUploadAction.uploadAttachments("附件", f);
        return flag;
    }

    //点击保存
    public boolean clickSaveButton() {
        boolean flag = true;
        WebElement element = findElement(edit.getJsonObject(edit.getD60()));
        click(element);
        element = findElement(edit.getJsonObject(edit.getD80Final()));
        String attribute = getAttribute(element, "class");
//        JSONObject jsonObject1 = edit.getJsonObject(edit.getD48Final());
//        JSONObject jsonObject2 = edit.getJsonObject(edit.getD79Final());
//        element = findElement(jsonObject1,jsonObject2,10,false);
//        String tmp = element.toString();
        if (attribute.contains("warning")) {
            flag = false;
        }
        return flag;
    }

    //获得分类
    private String getClassificationValue() {
        WebElement element = findElement(edit.getJsonObject(edit.getD58Rendered()));
        String value = getAttribute(element, "title");
        return value;
    }

    //点击XXX,校验XXX旁边的radio有没有被选中
    private boolean clickAndCheckAttribute(JSONObject jsonObject1, JSONObject jsonObject2) {
        WebElement element = findElement(jsonObject1);
        click(element);
        element = findElement(jsonObject2);
        String attr = getAttribute(element, "class");
        boolean flag = attr.contains("checked");
        return flag;
    }

    //随机点击XXX,校验XXX旁边的radio有没有被选中
    private boolean randomClickAndCheckAttribute(JSONObject jsonObject1, JSONObject jsonObject2, JSONObject
            jsonObject3, JSONObject jsonObject4) {
        boolean flag = true;
        int num = Randoms.getRandomNum(0, 1);
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println(jsonObject1);
        System.out.println(jsonObject2);
        System.out.println(jsonObject3);
        System.out.println(jsonObject4);
        System.out.println("++++++++++++++++++++++++++++++++");
//        String attr;
        //0 查看; 1 查看&下载
        WebElement element;
        if (num == 0) {
            flag = clickAndCheckAttribute(jsonObject1, jsonObject2);
        } else if (num == 1) {
            flag = clickAndCheckAttribute(jsonObject3, jsonObject4);
        }
        return flag;

    }

    //返回,搜索并检查结果
//    这里完成的是用标题搜索查看结果是几条
    public boolean checkResult() {
        boolean flag;
        WebElement element = findElement(edit.getJsonObject(edit.getD67()));
        String title = getInputValue(element);
        element = findElement(edit.getJsonObject(edit.getD62()));
        click(element);
        element = findElement(xxfbList.getJsonObject(xxfbList.getD35()));
        element = findElement(xxfbList.getJsonObject(xxfbList.getD57()));
        sendKeys(element, "*******");
        element = findElement(xxfbList.getJsonObject(xxfbList.getD3()));
        click(element);
        element = findElement(xxfbList.getJsonObject(xxfbList.getD57()));
        sendKeys(element, title);
        element = findElement(xxfbList.getJsonObject(xxfbList.getD3()));
        click(element);
        JSONObject jsonObject = xxfbList.getJsonObject(xxfbList.getD10());
        flag = isElementAppeared(jsonObject);
        if (!flag) {
            log.error("查询结果没有加载出来");
        }
        List<WebElement> elements = findElements(jsonObject);
        if (elements.size() != 1) {
            flag = false;
            log.info("查询结果不是1个,大概是一条记录查出来2个或者之前保存1次出来了2条记录,接下来再试一次");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            elements = findElements(jsonObject);
            if (elements.size() == 1) {
                flag = true;
                log.info("可能是之前在获取elements的时候,浏览器里面还是有多个element. 过了一段时间后浏览器加载好了, 只有一个element了");
            }
            if (!flag) {
                log.error("没错, 查询结果不是1个,大概是一条记录查出来2个或者之前保存1次出来了2条记录 ");
            }

        }
        return flag;
    }

    public boolean clickEdit() {
        boolean flag;
        WebElement element = findElement(xxfbList.getJsonObject(xxfbList.getD10ActionMore()));
        element = findElement(xxfbList.getJsonObject(xxfbList.getD10ActionMoreEdits()));
        click(element);
        JSONObject jsonObject = edit.getJsonObject(edit.getD60());
        flag = isElementAppeared(jsonObject);
        return flag;
    }


    private List<List<String>> getTable() {
        List<String> strsInHeader = new ArrayList<>();
        List<List<String>> tableContent = new ArrayList<>();
        JSONObject jsonObject;
        if (isNotDisplayed(xxfbList.getJsonObject(xxfbList.getD17()))) {//如果数据加载的那个菊花不显示了,说明已经加载好
            jsonObject = xxfbList.getJsonObject(xxfbList.getD10());
            try {
                findElement(jsonObject, 2, false);
                List<WebElement> elements = findElements(jsonObject);
                tableContent = getTableBody(elements);
            } catch (Exception e) {
                log.info("表格表体应该是空的");
            }
        }
        jsonObject = xxfbList.getJsonObject(xxfbList.getD11Tr1());
        List<WebElement> elements = $.findElements(jsonObject);
        strsInHeader = $.getTableHeader(elements);
        //定位表头,获取表头中的所有文字,存到tableContent中
        tableContent.add(0, strsInHeader);
        return tableContent;

    }


    private List<List<String>> getInfo(int num) {
        List<String> strsInHeader = new ArrayList<>();
        List<List<String>> tableContent = new ArrayList<>();
        JSONObject jsonObject;

        if (isNotDisplayed(xxfbList.getJsonObject(xxfbList.getD17()))) {//如果数据加载的那个菊花不显示了,说明已经加载好
            jsonObject = xxfbList.get$10SiblingJson(num);
            List<WebElement> elements = $.findElements(jsonObject);
            tableContent = $.getTableBody(elements);
        }
        jsonObject = xxfbList.getJsonObject(xxfbList.getD11Tr1());
        List<WebElement> elements = $.findElements(jsonObject);
        //$.getTableHeader();
        //定位表头,获取表头中的所有文字,存到tableContent中
        strsInHeader = $.getTableHeader(elements);
        //定位表头,获取表头中的所有文字,存到tableContent中
        tableContent.add(0, strsInHeader);

        return tableContent;
    }


}
