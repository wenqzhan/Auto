package com.actions.matrix.orgCust;

import com.actions.matrix.CustSelectionAction;
import com.actions.matrix.navigate.TopNavigatorAction;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.driver.$;
import com.pageObject.matrix.orgCust.Client;
import com.pageObject.matrix.orgCust.Contract;
import com.sql.matrix.orgCust.ContractSql;
import com.utils.date.DateMisc;
import com.utils.jdbc.JDBC;
import com.utils.log.LoggerController;
import com.utils.num.IntMisc;
import com.utils.random.Randoms;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContractAction extends $ {
    private final static LoggerController log = LoggerController.getLogger(ContractAction.class);

    public static void getTable() {
        jsonObject = Contract.getJson(Contract.d11);
        $.findElements(jsonObject);
        $.getTableHeader();
        //定位表头,获取表头中的所有文字,存到tableContent中
        if (isNotDisplayed(Contract.getJson(Contract.d17))) {//如果数据加载的那个菊花不显示了,说明已经加载好
            jsonObject = Contract.getJson(Contract.d10);
            try {
                findElement(jsonObject, 2, false);
                findElements(jsonObject);
                getTableBody();
            } catch (Exception e) {
                log.info("表格表体应该是空的");
            }
        }
    }


    public static void getInfo(int num) {
        jsonObject = Contract.getJson(Contract.d11);
        $.findElements(jsonObject);
        $.getTableHeader();
        //定位表头,获取表头中的所有文字,存到tableContent中

        if (isNotDisplayed(Contract.getJson(Contract.d17))) {//如果数据加载的那个菊花不显示了,说明已经加载好
            jsonObject = Contract.get$D10SiblingJson(num);
            $.findElements(jsonObject);
            $.getTableBody();
        }

    }

    public static boolean isElementAppeared(JSONObject jsonObject) {
        boolean flag = true;
        try {
            findElement(jsonObject);
        } catch (Exception e) {
            flag = false;
        } finally {
            $.jsonObject = null;
        }
        log.info("isElementAppeared:" + flag);
        return flag;
    }


    public static boolean isElementAppeared() {
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

    public static boolean isStringEqualsText(String string) {
        boolean flag = true;
        getInputValue();
        flag = string.equals(text);
        text = "";
        log.info("isStringEqualsText:" + flag);
        return flag;
    }

    public static boolean isStringEqualsText_div(String string) {
        boolean flag = true;
        getText();
        flag = string.equals(text);
        text = "";
        log.info("isStringEqualsText_div:" + flag);
        return flag;
    }


    public static boolean isStringEqualsAttribute(String string) {
        boolean flag = true;
        getAttribute("title");
        flag = string.equals(attributeValue);
        attributeValue = "";
        log.info("isStringEqualsAttribute:" + flag);
        return flag;
    }

    public static boolean isSelected() {
        boolean flag = true;
        getAttribute("class");
        flag = (attributeValue.contains("selected") || attributeValue.contains("checked"));
        attributeValue = "";
        log.info("isSelected:" + flag);
        return flag;
    }


    public static void getPerPageNum() {
        findElement(Contract.getJson(Contract.d18));//定位 条/页
        getText();//获取 条/页 里的文本
        perPageNum = IntMisc.getPerPageNum(text);
    }

    public static String getMaterialTitle(String custName) {
        String martialName;

        martialName = custName + "证明材料" + DateMisc.getTimeStamp();

        return martialName;

    }

    public static String getRandomCustName() {
        String custName;
        String userID = TopNavigatorAction.getUserID();
        String sql = ContractSql.getSql1(userID);
        custName = JDBC.getSqlResultStr(sql);

        return custName;
    }

    public static void inputCustName(String custName) {
        findElement(Contract.getJson(Contract.d2P));
        click();
        CustSelectionAction custSelectionAction = new CustSelectionAction("操作");
        custSelectionAction.selectCustName(custName);
        findElement(Contract.getJson(Contract.d2P));
    }

    public static void clickUploadMaterial() {
        findElement(Contract.getJson(Contract.d52));
        click();

    }

    public static void inputMaterialTitle(String title) {
        findChildElement(Contract.getJson(Contract.d49P));
        sendKeys(title);

    }

    public static String selectMaterialType() {
        int random = Randoms.getRandomNum(1, 3);
        String type = "";
        findElement(Contract.getJson(Contract.d50P));
        click();
        switch (random) {
            case 1:
                findElement(Contract.getJson(Contract.d50Pl1));
                type = "专项战略合作协议";
                click();
                break;
            case 2:
                findElement(Contract.getJson(Contract.d50Pl2));
                type = "全面战略合作协议";
                click();
                break;
            case 3:
                findElement(Contract.getJson(Contract.d50Pl3));
                type = "业务协议";
                click();
                break;

        }
        findElement(Contract.getJson(Contract.d50P_span));

        return type;
    }


    public static void clickAssignDate() {
        findElement(Contract.getJson(Contract.d54P));
        click();
    }

    public static String inputContractAmount() {
        String amount = "" + Randoms.getRandomNum(0, 999999);
        findElement(Contract.getJson(Contract.d55P));
        sendKeys(amount);
        return amount;
    }

    public static void upload(String fileNme) {
        findElement(Contract.getJson(Contract.dUploadP));
        click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("开始上传文件");
            if(fileNme.equals("flv")) {
                Runtime.getRuntime().exec("D:\\AutoIT\\uploadfile_flv.exe");
            }else if(fileNme.equals("mp4")){
                Runtime.getRuntime().exec("D:\\AutoIT\\uploadfile_mp4.exe");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //只能用于一个附件上传的场景
    public static boolean isUploadSuccess() {
        boolean flag;
        boolean f;
        int timeOutInSeconds = 4;
        try {

            findElement(Contract.getJson(Contract.dUploadP_uploading), timeOutInSeconds, false);
            f = isNotDisplayed(Contract.getJson(Contract.dUploadP_uploading), 100);
        } catch (Exception e) {
            f = true;
            log.info(timeOutInSeconds + "秒内没有找到转菊花,可能早就上传成功了");
        }
        if (f) {
            JSONObject jsonObject1 = JSON.parseObject(String.valueOf(Contract.getJson(Contract.dUploadP_uploadDone)));
            JSONObject jsonObject2 = JSON.parseObject(String.valueOf(Contract.getJson(Contract.dUploadP_uploadError)));

            findElement(jsonObject1, jsonObject2, 10, false);
            getAttribute("class");
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

    public static String selectBizOpportunity() {
        Contract.setI56P_div2();

        boolean nd = isNotDisplayed(Contract.getJson(Contract.d56P_div3), 4);
        if (!nd) {
            getText();
        }

        if (!text.equals("")) {
            findElement(Contract.getJson(Contract.d56P_div1_cross));
            click();
        }
        findElement(Contract.getJson(Contract.d56P));
        click();
        findElements(Contract.get$d56_div2_liJson(0));
        int size = elements.size();
        int random = Randoms.getRandomNum(1, size);
        findElement(Contract.get$d56_div2_liJson(random));
        String text = getText();
        click();
        findElement(Contract.getJson(Contract.d56P_div3));
        return text;
    }


    public static List<List<String>> getNewContractInfo() {
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

        findElement(Contract.getJson(Contract.d49P));
        getInputValue();
        String s1 = text;
        list3.add(s1);

        findElement(Contract.getJson(Contract.d2P));
        getInputValue();
        String s2 = text;
        list3.add(s2);

        findElement(Contract.getJson(Contract.d53P));
        getInputValue();
        String s3 = text;
        list3.add(s3);

        findElement(Contract.getJson(Contract.d50P_span));
        getText();
        String s4 = text;
        list3.add(s4);


        findElement(Contract.getJson(Contract.d56P_div3));
        getText();
        String s5 = text;
        list3.add(s5);


        findElement(Contract.getJson(Contract.dUploadP_uploadDone_file));
        getText();
        String s6 = text;
        list3.add(s6);

        findElement(Contract.getJson(Contract.d54P));
        getInputValue();
        String s7 = text;
        list3.add(s7);


        list1.add(list2);
        list1.add(list3);


        return list1;
    }


    public static void clickConfirmButton() {
        findElement(Contract.getJson(Contract.d29P));
        click();
        findElement(Contract.getJson(Contract.d48));
    }


}
