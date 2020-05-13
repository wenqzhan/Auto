package com.utils.screenshot;

import com.driver.$;
import com.utils.date.DateMisc;
import com.utils.file.MyFile;
import com.utils.log.LoggerController;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Screenshot extends $ {
    private static final LoggerController log = LoggerController.getLogger(Screenshot.class);
    private static String path = System.getProperties().getProperty("user.dir") + "\\error\\";

    /**
     * 错误截图，通过日期命名的截图
     **/
    public static void screenShot() {

        screenshot("", "");
    }

    /**
     * 错误截图,通过传入name来给截图命名
     **/
    public static void screenshot(String name, String className) {
        Map<String, WebDriver> ds = drivers;

        for (Map.Entry<String, WebDriver> entry : ds.entrySet()) {
            if (entry.getKey().equals(className)) {
                String[] a = entry.getKey().split("\\.");
                String b = entry.getKey();
//            System.out.println("++++++++++++++++++++++++++++++++");
                int num = a.length - 1;
                //System.out.println(a.toString());
//            System.out.println(b);
//            System.out.println("++++++++++++++++++++++++++++++++");
                System.out.println(num);
                String clazzName = a[num];
                WebDriver driver = entry.getValue();
                WebDriver augmentedDriver = new Augmenter().augment(driver);
                File file = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
                try {
                    MyFile.createFolder(path + DateMisc.format(DateMisc.CHECK_LOG_FORMAT));
                    //log.info(DateFormat.format(DateFormat.ZH_DATE_FORMAT));
                    FileUtils.copyFile(file, new File(path + DateMisc.format(DateMisc.CHECK_LOG_FORMAT) + "/" + clazzName + "_" + name + DateMisc.format(DateMisc.REPORT_CSV_FORMAT) + "_" + DateMisc.time() + ".jpg"));

                } catch (IOException e) {
                    log.error("截图失败！！");
                    e.printStackTrace();
                }
                log.info("截图成功");
                break;
            }
        }

    }

    //**
     /* 判断文件夹，没有就新建
    / */
/*    public static void fileExists() {
        String fileName = DateUtil.format(DateUtil.CHECK_LOG_FORMAT);
        File file = new File(path + fileName);
        if (!file.exists()) {
            file.mkdirs();
        }
    }*/


}
