package com.actions.matrix;

import com.driver.$;
import com.pageObject.commonObject.YMDSelection;
import org.openqa.selenium.By;

public class YMDSelectionAction extends $ {

    public static void selectYMD(String ymd) {

        YMDSelection ymdSelection = new YMDSelection();
        selectYMD(ymdSelection, ymd);
    }


    public static void selectYMD(String label, String ymd) {

        YMDSelection ymdSelection = new YMDSelection(label);
        selectYMD(ymdSelection, ymd);

    }


    private static void selectYMD(YMDSelection ymdSelection, String ymd) {
        int year = 9999;
        int month = 12;
        int day = 31;
        if (!ymd.contains("-")) {
            year = Integer.parseInt(ymd.substring(0, 4));
            month = Integer.parseInt(ymd.substring(4, 6));
            day = Integer.parseInt(ymd.substring(6, 8));
        } else if (ymd.contains("-")) {
            String[] tmp = ymd.split("-");
            year = Integer.parseInt(tmp[0]);
            month = Integer.parseInt(tmp[1]);
            day = Integer.parseInt(tmp[2]);
        }


        findElement(ymdSelection.getJson(ymdSelection.dYMDSelectMonth));
        click();//点击月份选择

        findElement(ymdSelection.getJson(ymdSelection.dYMDSelectYearMP));
        click();//点击月份里面的年份选择

        findElement(ymdSelection.getJson(ymdSelection.dYMDSelectDecade));
        click();//点击年代选择

        while (true) {
            int boundary1;
            int boundary2;
            findElement(ymdSelection.getJson(ymdSelection.dYMDCenturyBetweenLastAndNext));
            getText();
            boundary1 = Integer.parseInt(text.split("-")[0]);
            boundary2 = Integer.parseInt(text.split("-")[1]);
            System.out.println(boundary1 + ":b1");
            System.out.println(boundary2 + ":b2");
            System.out.println(year + ":year");

            if (year < boundary1) {
                findElement(ymdSelection.getJson(ymdSelection.dYMDLastCentury));
                click();
            } else if (year >= boundary1 && year <= boundary2) {
                break;
            } else if (year > boundary2) {
                findElement(ymdSelection.getJson(ymdSelection.dYMDNextCentury));
                click();
            }

        }

        String tmp = String.valueOf(year).substring(0, 3);
        String yearYear = tmp + "0-" + tmp + "9";

        findElement(ymdSelection.get$DecadeByTextJson(yearYear));

        click();

        findElement(ymdSelection.get$YearByTextJson(String.valueOf(year)));
        click();

        String m = "";

        switch (month) {
            case 1:
                m = "一月";
                break;
            case 2:
                m = "二月";
                break;
            case 3:
                m = "三月";
                break;
            case 4:
                m = "四月";
                break;
            case 5:
                m = "五月";
                break;
            case 6:
                m = "六月";
                break;
            case 7:
                m = "七月";
                break;
            case 8:
                m = "八月";
                break;
            case 9:
                m = "九月";
                break;
            case 10:
                m = "十月";
                break;
            case 11:
                m = "十一月";
                break;
            case 12:
                m = "十二月";
                break;
        }


        findElement(ymdSelection.get$MonthByTextJson(m));

        click();

        findElement(ymdSelection.get$DayByTextJson(String.valueOf(day)));

        click();
    }


}
