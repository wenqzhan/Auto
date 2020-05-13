package com.unitTest;

import com.alibaba.fastjson.JSONObject;
import com.driver.Xpath;
import com.pageObject.commonObject.*;
import com.pageObject.matrix.orgCust.Client;
import com.pageObject.matrix.orgCust.Contract;
import com.utils.date.DateMisc;
import com.utils.json.XpathJson;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.HashMap;

public class XpathTest {



    @Test
    public void sdffsd(){
//        YMDSelection ymdSelection = new YMDSelection("签署日期");
//        System.out.println("___________________________");
//        System.out.println(ymdSelection.getdYMDLastYear());
//        System.out.println("___________________________");
//        ymdSelection.getObjAttr("签署日期");
//        CommonObjectPopped commonObjectPopped = new CommonObjectPopped();
//        commonObjectPopped.getObjAttr();
//        System.out.println(commonObjectPopped.getJsonObject(commonObjectPopped.getD34P()));
        System.out.println("[[[[[[[[[[[[[]]]]]]]]]]]]]]]");
        CustSelection test = new CustSelection("国君服务联系人");
        test.getObjAttr();
//        empSelection.getObjAttr();
//        System.out.println("1111111111111111111111111");
//        System.out.println(empSelection.getPrefix());
//        System.out.println("1111111111111111111111111");
//        //System.out.println(ymdSelection.getJsonObject(ymdSelection.getDYMDLastYear()));
//        System.out.println("2222222222222222222222222");
//        System.out.println(empSelection.get$JsonES10SiblingByUserName("拜拜拜拜不"));
//        System.out.println("2222222222222222222222222");

        System.out.println("1111111111111111");
        System.out.println(test.getPrefix());
        System.out.println("1111111111111111");



        System.out.println("1111111111111111");
        System.out.println((test.get$CS10SiblingByCustNameJson("KKKKK")));
        System.out.println("1111111111111111");


        System.out.println("11111qqq11111111111");
//        System.out.println(test.get$XPQuerySelect("QQQQ"));
        System.out.println("11111qqq11111111111");

        System.out.println("11111qqq11111bbb111111");
//        System.out.println(test.get$X10PSibling(1));
        System.out.println("11111qqq1111bbb1111111");
    }


    @Test
    public void dfsdf(){
        System.out.println(this.getClass().getName());
    }

    @Test
    public void fsfsdf(){
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
    public void ffgfgf(){
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

    public void teeeee(){

        String parentXpath ="";
        String childTagName ="span";
        String childTagText ="中国邮政储蓄银行股份有限公司双辽市王奔镇营业所";
        String[] containsAttributeValue ={};
        String[] notContainsAttributeValue ={};
        JSONObject jsonObject = XpathJson.fabricateJsonObject(parentXpath,childTagName,childTagText,containsAttributeValue,notContainsAttributeValue);


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
