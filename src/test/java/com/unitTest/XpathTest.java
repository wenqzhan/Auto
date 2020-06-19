package com.unitTest;

import com.alibaba.fastjson.JSONObject;
import com.driver.Xpath;
import com.pageObject.matrix.CommonObject;
import com.pageObject.matrix.*;
import com.pageObject.matrix.learn.xxfb.Edit;
import com.pageObject.matrix.learn.xxfb.XxfbList;
import com.pageObject.matrix.orgCust.Client;
import com.pageObject.matrix.orgCust.Contract;
import com.pageObject.matrix.research.clientList.Detail;
import com.sql.matrix.ProvinceCitySelectionSql;
import com.sql.matrix.research.client.ClientListSql;
import com.utils.date.DateMisc;
import com.utils.file.MyFile;
import com.utils.json.XpathJson;
import com.utils.random.Randoms;
import com.utils.string.StringMisc;
import org.apache.commons.codec.binary.Base64OutputStream;
import org.apache.commons.compress.utils.IOUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;

public class XpathTest {

    @Test
    public void sdfdfsdf(){
       Contract contract = new Contract();
       Contract contractPopped = new Contract("POPPED");
        contract = (Contract) contract.getObjAttr();
        contractPopped = (Contract) contractPopped.getObjAttr("POPPED");

        System.out.println(contractPopped.getJsonObject(contractPopped.getDCustNameInput()));
    }

    @Test
    public void sdfsdfadafa(){
        System.out.println( StringMisc.isDisorderlyLike("1,2","2,1"));
    }

    @Test
    public void dsffdfadawss(){
        Detail detail = new Detail();
        detail = (Detail) detail.getObjAttr();
    Client client = new Client();
    Client clientPopped = new Client("POPPED");
    client = (Client) client.getObjAttr();
    clientPopped = (Client) clientPopped.getObjAttr("POPPED");

        System.out.println(client.getJsonObject(client.getDTableHeaderTr1Ths()));

        System.out.println(clientPopped.getJsonObject(clientPopped.getDCustNameInput()));

        System.out.println(clientPopped.getDCustNameInput());
        System.out.println(client.getDCustNameInput());

        System.out.println(detail.getXExportButtonSpan());

        System.out.println(clientPopped.getPrefix());
        System.out.println(clientPopped.get$DQueryInputJson("联系人姓名"));


    }


    @Test
    public void dfasdfdfasdff(){
        ManagerSelection managerSelection = new ManagerSelection("操作");
        managerSelection = (ManagerSelection) managerSelection.getObjAttr("操作");
        System.out.println(managerSelection.getJsonObject(managerSelection.getXSelectedEmpNameTd()));

    }

    @Test
    public void sdfsdfsdfasxxxf(){
        ProvinceCitySelectionSql provinceCitySelectionSql = new ProvinceCitySelectionSql();
        String cityName = provinceCitySelectionSql.getCityName();
        System.out.println(cityName);
        String provinceName = provinceCitySelectionSql.getProvinceName(cityName);
        System.out.println(provinceName);
    }



    @Test
    public void sdfsdfsss(){
        XXXSelection xxxSelection = new XXXSelection("客户类型-类型选择");
        System.out.println(xxxSelection.get$XXXResultSpan("企业类客户"));

    }


    @Test
    public void sd1fsdfsdf(){
        ClientListSql clientListSql = new ClientListSql();
        System.out.println(clientListSql.getSqlTeamResultStr());
        //
//
//        System.out.println(IntMisc.getIntFromString("dsfsdfs 113123 hjhkjhsssssar3334"));
    }


    @Test
    public void sdfsdfsdfsd(){
        TableContent tableContent = new TableContent();
        tableContent = (TableContent) tableContent.getObjAttr();
        System.out.println(tableContent.getJsonObject(tableContent.getDTableTrsActionMore()));




    }


    public static void main(String[] args) throws IOException {
        dfsssdfsdf();
    }

    public static void dfsssdfsdf() throws IOException {
        String oldFilePath = "D:/upload/abc.mp3";
        String newFilePath = "D:/upload/NewFilePath/abc.mp3";
        File fileOld = new File(oldFilePath);
        File fileNew = new File(newFilePath);
        encode(fileOld,new FileOutputStream(newFilePath));
    }


    public static void encode(File file, OutputStream base64OutputStream) throws IOException {
        InputStream is = new FileInputStream(file);
        OutputStream out = new Base64OutputStream(base64OutputStream);
        IOUtils.copy(is, out);
        is.close();
        out.close();
    }


    @Test
    public void dfasdfsdfsdfas(){

        String oldFilePath = "D:/upload/abc.mp3";
        String newFilePath = "D:/upload/NewFilePath/abc.mp3";
        File fileOld = new File(oldFilePath);
        File fileNew = new File(newFilePath);
        fileNew.deleteOnExit();
        try {
            FileInputStream inputStream = new FileInputStream(fileOld);
            ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
            byte[] by ;
            byte[] array = new byte[1024];
            int ch=0;
            while ((ch=inputStream.read()) != -1) {
                arrayOutputStream.write(array, 0, ch);
            }
            by = arrayOutputStream.toByteArray();

            BASE64Encoder encoder = new BASE64Encoder();
            String str = encoder.encode(by);
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] newBy = decoder.decodeBuffer(str);
            FileOutputStream outputStream = new FileOutputStream(newFilePath);
            BufferedOutputStream bos = new BufferedOutputStream(outputStream);
            bos.write(newBy);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void sdfsadfasf(){
        String[] dfsdf = DateMisc.getRandomYMDToYMD();
        System.out.println(dfsdf[0]);
        System.out.println(dfsdf[1]);
    }


    @Test
    public void sdfsadfsadf(){
//        YMDSelection ymdSelection = new YMDSelection("调研时间");
//        ymdSelection = (YMDSelection) ymdSelection.getObjAttr();
//        System.out.println(ymdSelection.getPrefix());

        YMDToYMDRightSelection YMDToYMDRightSelection = new YMDToYMDRightSelection("调研时间");
        YMDToYMDRightSelection = (YMDToYMDRightSelection) YMDToYMDRightSelection.getObjAttr("调研时间");
        System.out.println(YMDToYMDRightSelection.getPrefix());
        System.out.println(YMDToYMDRightSelection.getXLastYear());
//        System.out.println(ymdymdRightSelection.getJsonObject(ymdymdRightSelection.getDLastYear()));

    }

    @Test
    public void sdfsdfsadf() {
        CommonObject commonObject = new CommonObject();
        commonObject.getObjAttr();
//        CommonObjectPopped commonObjectPopped = new CommonObjectPopped();
//        commonObjectPopped =(CommonObjectPopped) commonObjectPopped.getObjAttr();
        System.out.println("FSDFSDFSADFSDFFDFFSDFSDF");
//        System.out.println(commonObjectPopped.getDUploadP());
//        System.out.println(commonObjectPopped.getXUploadP());
        System.out.println("FSDFSDFSADFSDFFDFFSDFSDF");
//        System.out.println(commonObjectPopped.getJsonObject(commonObjectPopped.getDUploadP()));


    }


    @Test
    public void sdfdaa() {
        CommonObject commonObject = new CommonObject();
//        CommonObjectPopped commonObjectPopped = new CommonObjectPopped();
        commonObject.getObjAttr();
//        commonObjectPopped.getObjAttr();
        XxfbList xxfbList = new XxfbList();
        xxfbList = (XxfbList) xxfbList.getObjAttr();
        System.out.println(xxfbList.getJsonObject(xxfbList.getDTableTrsActionMore()));
        System.out.println(xxfbList.getJsonObject(xxfbList.getDTableTrsActionDetails()));


    }


    @Test
    public void sdfsdfsdf() {
//        Object o = XxfbListTest.getPrivateConst("testCount");
//        System.out.println(o);
    }


    @Test
    public void sdfsdfddd() {
        AttachmentUpload attachmentUpload = new AttachmentUpload("附件");
        attachmentUpload = (AttachmentUpload) attachmentUpload.getObjAttr("附件");
        System.out.println(attachmentUpload.getJsonObject(attachmentUpload.getDUploadPUploadDoneFile()));
        System.out.println(attachmentUpload.getJsonObject(attachmentUpload.getDSuccessPromptDivFinal()));
    }

    @Test
    public void sdfsdfs() {
        String path = System.getProperty("user.dir");
        path = path + "\\files";
        List<String> files = MyFile.getFiles(path);
        int random = Randoms.getRandomNum(0, files.size() - 1);
        String file = files.get(random);
        System.out.println(file);
        String name = MyFile.getFileName(file);
        System.out.println(name);


    }


    @Test
    public void dfsdfsdf() {
        YMDSelection ymdSelection = new YMDSelection("签署日期");
        ymdSelection = (YMDSelection) ymdSelection.getObjAttr("签署日期");
        System.out.println(ymdSelection.getPrefix());
//        System.out.println(ymdSelection.getLabel());
        System.out.println(ymdSelection.get$DecadeByTextJson("2030-2040"));

    }


    @Test
    public void sdfsdf1() {
        String name = "操作";
        CustSelection custSelection = new CustSelection(name);
        custSelection = (CustSelection) custSelection.getObjAttr();
        System.out.println(custSelection.getJsonObject(custSelection.getDCustNameInput()));
        System.out.println();

    }


    @Test
    public void YMDATest() {
        YMDSelection ymdSelection = new YMDSelection("签署日期");
        ymdSelection = (YMDSelection) ymdSelection.getObjAttr();

        Field[] fields2 = ymdSelection.getClass().getDeclaredFields();
        for (Field field : fields2) {
            boolean access = field.isAccessible();
            if (!access) field.setAccessible(true);
            System.out.println("!!!!!1oooo1111!!!!");
            Object caaa = null;
            try {
                caaa = field.get(ymdSelection);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            System.out.println(field.getName() + ":" + caaa);
            System.out.println("@@@@@@11oooo1111@@@");
        }

        System.out.println(ymdSelection.getDLastCentury());
        System.out.println(ymdSelection.getXLastCentury());

        System.out.println(ymdSelection.getJsonObject(ymdSelection.getDLastCentury()));


    }


    @Test
    public void sfsdfsdf() {
        CommonObject commonObject = new CommonObject();
        commonObject.getObjAttr();

//        CommonObjectPopped commonObjectPopped = new CommonObjectPopped();
//        commonObjectPopped.getObjAttr();


        XxfbList xxfbList = new XxfbList();
//        System.out.println("DFFGGGGG");
//        System.out.println(xxfbList.getConVal());
//        System.out.println("DFFGGGGG");
        xxfbList = (XxfbList) xxfbList.getObjAttr();
        System.out.println("@#!@#!@#!@#");
        System.out.println(xxfbList.getXQueryButtonSpan());
        System.out.println(xxfbList.getXxfbList());

        System.out.println("@#!@#!@#!@#");


    }


    @Test
    public void sdfdf() {
        AttachmentUpload attachmentUpload = new AttachmentUpload();
        System.out.println(attachmentUpload.get$UploadedFileStatus(1, "上传成功"));
        System.out.println(attachmentUpload.get$UploadedFileStatus(1, "上传中"));
        System.out.println(attachmentUpload.get$UploadedFileStatus(1, "上传失败"));


    }


    @Test
    public void sfdf() {
        CommonObject commonObject = new CommonObject();
        commonObject.getObjAttr();
        Edit edit = new Edit();
        edit = (Edit) edit.getObjAttr();
        JSONObject jsonObject3 = edit.getJsonObject(edit.getDTitleImageInputUploadFileCross());
        System.out.println(edit.getXTitleImageInputUploadFileCross());
        System.out.println(edit.getDTitleImageInputUploadFileCross());
        System.out.println(jsonObject3);

    }


    @Test
    public void sdffsd() {
//        YMDSelection ymdSelection = new YMDSelection("签署日期");
//        System.out.println("___________________________");
//        System.out.println(ymdSelection.getdYMDLastYear());
//        System.out.println("___________________________");
//        ymdSelection.getObjAttr("签署日期");
//        CommonObjectPopped commonObjectPopped = new CommonObjectPopped();
//        commonObjectPopped.getObjAttr();
//        System.out.println(commonObjectPopped.getJsonObject(commonObjectPopped.getD34P()));
        System.out.println("[[[[[[[[[[[[[]]]]]]]]]]]]]]]");
//        CommonObjectPopped test = new CommonObjectPopped();
//        test.getObjAttr();
//        empSelection.getObjAttr();
//        System.out.println("1111111111111111111111111");
//        System.out.println(empSelection.getPrefix());
//        System.out.println("1111111111111111111111111");
//        //System.out.println(ymdSelection.getJsonObject(ymdSelection.getDYMDLastYear()));
//        System.out.println("2222222222222222222222222");
//        System.out.println(empSelection.get$JsonES10SiblingByUserName("拜拜拜拜不"));
//        System.out.println("2222222222222222222222222");

        System.out.println("1111111111111111");
//        System.out.println(test.getPrefix());
        System.out.println("1111111111111111");


        System.out.println("1111111111111111");
//        System.out.println((test.get$XPLi("KKKKK")));
        System.out.println("1111111111111111");


        System.out.println("11111qqq11111111111");
//        System.out.println(test.get$XPQuerySelect("QQQQ"));
        System.out.println("11111qqq11111111111");

        System.out.println("11111qqq11111bbb111111");
//        System.out.println(test.get$X10PSibling(1));
        System.out.println("11111qqq1111bbb1111111");
    }


    @Test
    public void dfsdf() {
        System.out.println(this.getClass().getName());
    }

    @Test
    public void fsfsdf() {
        //System.out.println(CommonObjectPopped.x50Pl1);
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\drivers\\chromedriver.exe");
        System.out.println(path + "\\drivers\\chromedriver.exe");
        String downloadPath = "D:\\ChromeDownload";
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("download.default_directory", downloadPath);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("prefs", hashMap);
//            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//            desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

        WebDriver webDriver1;
        WebDriver webDriver2;


        WebDriver driver = new ChromeDriver();

        webDriver1 = driver;


        System.setProperty("webdriver.gecko.driver", path + "\\drivers\\geckodriver.exe");
        System.out.println(path + "\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver = new FirefoxDriver();

        webDriver2 = driver;

        System.out.println(webDriver1);
        System.out.println(webDriver2);


    }


    @Test
    public void ffgfgf() {
        //System.out.println(EmpSelection.get$dES10(1));
//        String a = AssignCust.xx5t;
//        System.out.println(a);

        System.out.println(DateMisc.getRandomYMD());
//        System.out.println(ymdSelection.get$aByText("2019"));
//        System.out.println(ymdSelection.get$a("上一年 (Control键加左方向键)"));
        // System.out.println(empSelection.getXpath(empSelection.dES32));
//        Date date=new Date();//此时date为当前的时间
//
//        Calendar calendar = new GregorianCalendar();
//        calendar.setTime(date);
//        calendar.add(calendar.DATE,185); //把日期往后增加一天,整数  往后推,负数往前移动
//        date=calendar.getTime(); //这个时间就是日期往后推一天的结果

//
//        SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY年M月dd日"); //设置当前时间的格式，为年-月-日
//        System.out.println(dateFormat.format(date));
    }


    @Test

    public void teeeee() {

        String parentXpath = "";
        String childTagName = "span";
        String childTagText = "中国邮政储蓄银行股份有限公司双辽市王奔镇营业所";
        String[] containsAttributeValue = {};
        String[] notContainsAttributeValue = {};
        JSONObject jsonObject = XpathJson.fabricateJsonObject(parentXpath, childTagName, childTagText, containsAttributeValue, notContainsAttributeValue);


        //long startTime = System.currentTimeMillis();


        Xpath.getXpath(jsonObject);

//        parentXpath ="/html/body/div[3]/div/div/ul/li[2]/i";
//        childTagName ="svg";
//        childTagText ="";
//        containsAttributeValue =new String[]{};
//        notContainsAttributeValue =new String[]{};
//        jsonObject = XpathJson.fabricateJsonObject(parentXpath,childTagName,childTagText,containsAttributeValue,notContainsAttributeValue);


        //Xpath.getXpath(jsonObject);

        //long endTime = System.currentTimeMillis();
        //System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
    }

}
