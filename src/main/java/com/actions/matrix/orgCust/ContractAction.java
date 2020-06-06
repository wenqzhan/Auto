package com.actions.matrix.orgCust;

import com.actions.matrix.CustSelectionAction;
import com.actions.matrix.navigate.TopNavigatorAction;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.driver.$;
import com.pageObject.matrix.orgCust.Contract;
import com.sql.matrix.orgCust.ContractSql;
import com.utils.date.DateMisc;
import com.utils.jdbc.JDBC;
import com.utils.log.LoggerController;
import com.utils.num.IntMisc;
import com.utils.random.Randoms;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContractAction extends $ {
    private final LoggerController log = LoggerController.getLogger(ContractAction.class);
    private String attributeValue;//通过getAttribute()获得
    private int perPageNum;
    private String text; //一般用在获取input,textarea中的文字,或者其他标签内的文字
    private JSONObject jsonObject;
    private Contract contract = new Contract();
    private TopNavigatorAction topNavigatorAction = new TopNavigatorAction();

    public ContractAction() {
//        contract.getObjAttr();
    }

    public List<List<String>> getTable() {
        List<String> strsInHeader = new ArrayList<>();
        List<List<String>> tableContent = new ArrayList<>();


        if (isNotDisplayed(contract.getJsonObject(contract.getD17()))) {//如果数据加载的那个菊花不显示了,说明已经加载好
            jsonObject = contract.getJsonObject(contract.getD10());
            try {
                findElement(jsonObject, 2, false);
                List<WebElement> elements = findElements(jsonObject);
                tableContent = getTableBody(elements);
            } catch (Exception e) {
                log.info("表格表体应该是空的");
            }
        }
        jsonObject = contract.getJsonObject(contract.getD11Tr1());
        List<WebElement> elements = $.findElements(jsonObject);
        strsInHeader = $.getTableHeader(elements);
        //定位表头,获取表头中的所有文字,存到tableContent中
        tableContent.add(0, strsInHeader);
        return tableContent;

    }


    public List<List<String>> getInfo(int num) {
        List<String> strsInHeader = new ArrayList<>();
        List<List<String>> tableContent = new ArrayList<>();

        if (isNotDisplayed(contract.getJsonObject(contract.getD17()))) {//如果数据加载的那个菊花不显示了,说明已经加载好
            jsonObject = contract.get$10SiblingJson(num);
            List<WebElement> elements = $.findElements(jsonObject);
            tableContent = $.getTableBody(elements);
        }

        jsonObject = contract.getJsonObject(contract.getD11Tr1());
        List<WebElement> elements = $.findElements(jsonObject);
        strsInHeader = $.getTableHeader(elements);
        //定位表头,获取表头中的所有文字,存到tableContent中
        tableContent.add(0, strsInHeader);
        return tableContent;
    }

//    public boolean isElementAppeared(JSONObject jsonObject) {
//        boolean flag = true;
//        try {
//            findElement(jsonObject);
//        } catch (Exception e) {
//            flag = false;
//        } finally {
//            //$.jsonObject = null;
//        }
//        log.info("isElementAppeared:" + flag);
//        return flag;
//    }


    public boolean isElementAppeared() {
        boolean flag = true;
        try {
            findElement(jsonObject);
        } catch (Exception e) {
            flag = false;
        } finally {
            jsonObject = null;
        }
        log.info("isElementAppeared:" + flag);
        return flag;
    }

    public boolean isStringEqualsText(WebElement element, String string) {
        boolean flag = true;
        text = getInputValue(element);
        flag = string.equals(text);
        text = "";
        log.info("isStringEqualsText:" + flag);
        return flag;
    }

    public boolean isStringEqualsText_div(String string) {
        boolean flag = true;
        WebElement element = findElement(contract.getJsonObject(contract.getD56PDiv3()));
        text = getText(element);
        flag = string.equals(text);
        text = "";
        log.info("isStringEqualsText_div:" + flag);
        return flag;
    }


    public boolean isStringEqualsAttribute(WebElement element, String string) {
        boolean flag = true;
        attributeValue = getAttribute(element, "title");
        flag = string.equals(attributeValue);
        attributeValue = "";
        log.info("isStringEqualsAttribute:" + flag);
        return flag;
    }

    public boolean isSelected(WebElement element) {
        boolean flag = true;
        attributeValue = getAttribute(element, "class");
        flag = (attributeValue.contains("selected") || attributeValue.contains("checked"));
        attributeValue = "";
        log.info("isSelected:" + flag);
        return flag;
    }


    public int getPerPageNum() {
        WebElement element = findElement(contract.getJsonObject(contract.getD18()));//定位 条/页
        text = getText(element);//获取 条/页 里的文本
        perPageNum = IntMisc.getPerPageNum(text);
        return perPageNum;
    }

    public String getMaterialTitle(String custName) {
        String martialName;

        martialName = custName + "证明材料" + DateMisc.getTimeStamp();

        return martialName;

    }

    public String getRandomCustName() {
        String custName;
        String userID = topNavigatorAction.getUserID();
        String sql = ContractSql.getSql1(userID);
        custName = JDBC.getSqlResultStr(sql);

        return custName;
    }

    public WebElement inputCustName(String custName) {
        WebElement element = findElement(contract.getJsonObject(contract.getD2P()));
        click(element);
        CustSelectionAction custSelectionAction = new CustSelectionAction("操作");

        custSelectionAction.selectCustName(custName);
        findElement(contract.getJsonObject(contract.getD2P()));
        return element;
    }

    public void clickUploadMaterial() {
        WebElement element = findElement(contract.getJsonObject(contract.getD52()));
        click(element);

    }

    public WebElement inputMaterialTitle(String title) {
        WebElement element = findElement(contract.getJsonObject(contract.getD49P()));
        sendKeys(element, title);
        return element;
    }

    public String selectMaterialType() {
        int random = Randoms.getRandomNum(1, 3);
        String type = "";
        WebElement element = findElement(contract.getJsonObject(contract.getD50P()));
        click(element);
        switch (random) {
            case 1:
                element = findElement(contract.getJsonObject(contract.getD50PL1()));
                type = "专项战略合作协议";
                click(element);
                break;
            case 2:
                element = findElement(contract.getJsonObject(contract.getD50PL2()));
                type = "全面战略合作协议";
                click(element);
                break;
            case 3:
                element = findElement(contract.getJsonObject(contract.getD50PL3()));
                type = "业务协议";
                click(element);
                break;

        }


        return type;
    }


    public void clickAssignDate() {
        WebElement element = findElement(contract.getJsonObject(contract.getD54P()));
        click(element);
    }

    public String inputContractAmount() {
        String amount = "" + Randoms.getRandomNum(0, 999999);
        WebElement element = findElement(contract.getJsonObject(contract.getD55P()));
        sendKeys(element, amount);
        return amount;
    }

    public void upload(String fileNme) {
        WebElement element = findElement(contract.getJsonObject(contract.getDUploadP()));
        click(element);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("开始上传文件");
            if (fileNme.equals("flv")) {
                Runtime.getRuntime().exec("D:\\AutoIT\\uploadfile_flv.exe");
            } else if (fileNme.equals("mp4")) {
                Runtime.getRuntime().exec("D:\\AutoIT\\uploadfile_mp4.exe");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //只能用于一个附件上传的场景
    public boolean isUploadSuccess() {
        boolean flag;
        boolean f;
        int timeOutInSeconds = 4;
        try {

            findElement(contract.getJsonObject(contract.getDUploadPUploading()), timeOutInSeconds, false);
            f = isNotDisplayed(contract.getJsonObject(contract.getDUploadPUploading()), 300);
        } catch (Exception e) {
            f = true;
            log.info(timeOutInSeconds + "秒内没有找到转菊花,可能早就上传成功了");
        }
        if (f) {
            JSONObject jsonObject1 = JSON.parseObject(String.valueOf(contract.getJsonObject(contract.getDUploadPUploadDone())));
            JSONObject jsonObject2 = JSON.parseObject(String.valueOf(contract.getJsonObject(contract.getDUploadPUploadError())));

            WebElement element = findElement(jsonObject1, jsonObject2, 10, false);
            attributeValue = getAttribute(element, "class");
            if (attributeValue.contains("done")) {
                flag = true;
                log.info("应该是上传成功了");
            } else if (attributeValue.contains("error")) {
                flag = false;
                log.info("应该是上传失败了");
            } else {
                flag = false;
                log.info("其他问题");
            }

        } else {
            flag = false;
            log.info("可能是一直在上传转菊花导致了上传失败");
        }

        return flag;

    }

    public String selectBizOpportunity() {
        contract.setI56PDiv2();
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
//        System.out.println(contract.getI56PDiv2());
//        System.out.println(Attr.getAttr().get("i56PDiv2"));
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!");

        boolean nd = isNotDisplayed(contract.getJsonObject(contract.getD56PDiv3()), 4);
        if (!nd) {
            WebElement element = findElement(contract.getJsonObject(contract.getD56PDiv3()));
            text = getText(element);
        }

        if (!text.equals("")) {
            WebElement element = findElement(contract.getJsonObject(contract.getD56PDiv1Cross()));
            click(element);
        }
        WebElement element = findElement(contract.getJsonObject(contract.getD56P()));
        click(element);
        List<WebElement> elements = findElements(contract.get$56Div2LiJson(0));
        int size = elements.size();
        int random = Randoms.getRandomNum(1, size);
        element = findElement(contract.get$56Div2LiJson(random));
        String text = getText(element);
        click(element);

        return text;
    }


    public List<List<String>> getNewContractInfo() {
        List<List<String>> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        list2.add("材料名称");
        list2.add("客户名称");
        list2.add("联系人");
        list2.add("材料类型");
        list2.add("所属商机");

        //list2.add("合同金额(万元)");
        list2.add("支持文件");
        list2.add("签署日期");

        WebElement element = findElement(contract.getJsonObject(contract.getD49P()));
        text = getInputValue(element);
        String s1 = text;
        list3.add(s1);

        element = findElement(contract.getJsonObject(contract.getD2P()));
        text = getInputValue(element);
        String s2 = text;
        list3.add(s2);

        element = findElement(contract.getJsonObject(contract.getD53P()));
        text = getInputValue(element);
        String s3 = text;
        list3.add(s3);

        element = findElement(contract.getJsonObject(contract.getD50PSpan()));
        text = getText(element);
        String s4 = text;
        list3.add(s4);


        element = findElement(contract.getJsonObject(contract.getD56PDiv3()));
        text = getText(element);
        String s5 = text;
        list3.add(s5);


        element = findElement(contract.getJsonObject(contract.getDUploadPUploadDoneFile()));
        text = getText(element);
        String s6 = text;
        list3.add(s6);

        element = findElement(contract.getJsonObject(contract.getD54P()));
        text = getInputValue(element);
        String s7 = text;
        list3.add(s7);


        list1.add(list2);
        list1.add(list3);


        return list1;
    }


    public void clickConfirmButton() {
        WebElement element = findElement(contract.getJsonObject(contract.getD29P()));
        click(element);
        findElement(contract.getJsonObject(contract.getD81Final()));
    }


}
