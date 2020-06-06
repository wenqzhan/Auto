package com.actions.matrix;

import com.driver.$;
import com.pageObject.matrix.YMDSelection;
import com.pageObject.matrix.YMDToYMDLeftSelection;
import com.pageObject.matrix.YMDToYMDRightSelection;
import org.openqa.selenium.WebElement;

public class YMDSelectionAction extends $ {
//    private static String text;

    public static void selectYMD(String ymd) {

        YMDSelection ymdSelection = new YMDSelection();
        ymdSelection = (YMDSelection) ymdSelection.getObjAttr();
        selectYMD(ymdSelection, ymd);

    }


    public static void selectYMD(String label, String ymd) {

        YMDSelection ymdSelection = new YMDSelection(label);
        ymdSelection = (YMDSelection) ymdSelection.getObjAttr(label);
        selectYMD(ymdSelection, ymd);

    }


    public static void selectYMDToYMD(String[] ymdToYmd) {
        String fromYMD = ymdToYmd[0];
        String toYMD = ymdToYmd[1];
        YMDToYMDLeftSelection ymdToYMDLeftSelection = new YMDToYMDLeftSelection();
        ymdToYMDLeftSelection = (YMDToYMDLeftSelection) ymdToYMDLeftSelection.getObjAttr();
        selectYMD(ymdToYMDLeftSelection, fromYMD);

        YMDToYMDRightSelection ymdToYMDRightSelection = new YMDToYMDRightSelection();
        ymdToYMDRightSelection = (YMDToYMDRightSelection) ymdToYMDRightSelection.getObjAttr();
        selectYMD(ymdToYMDRightSelection, toYMD);

    }

    public static void selectYMDToYMD(String label, String[] ymdToYmd) {

        String fromYMD = ymdToYmd[0];
        String toYMD = ymdToYmd[1];

        YMDToYMDRightSelection ymdToYMDRightSelection = new YMDToYMDRightSelection(label);
        ymdToYMDRightSelection = (YMDToYMDRightSelection) ymdToYMDRightSelection.getObjAttr(label);

        YMDToYMDLeftSelection ymdToYMDLeftSelection = new YMDToYMDLeftSelection(label);
        ymdToYMDLeftSelection = (YMDToYMDLeftSelection) ymdToYMDLeftSelection.getObjAttr(label);


        String thisYearLeft = getText(findElement(ymdToYMDLeftSelection.getJsonObject(ymdToYMDLeftSelection.getDSelectYear())));
        String thisYearRight = getText(findElement(ymdToYMDRightSelection.getJsonObject(ymdToYMDRightSelection.getDSelectYear())));

        String thisMonthLeft = getText(findElement(ymdToYMDLeftSelection.getJsonObject(ymdToYMDLeftSelection.getDSelectMonth())));
        String thisMonthRight = getText(findElement(ymdToYMDRightSelection.getJsonObject(ymdToYMDRightSelection.getDSelectMonth())));

        int tyl = Integer.parseInt(thisYearLeft.split("年")[0]);
        int tyr = Integer.parseInt(thisYearRight.split("年")[0]);

        int tml = Integer.parseInt(thisMonthLeft.split("月")[0]);
        int tmr = Integer.parseInt(thisMonthRight.split("月")[0]);

        int thisYearMonthLeft = tyl * 100 + tml;
        int thisYearMonthRight = tyr * 100 + tmr;

        String[] fYmd = fromYMD.split("-");
        String[] tYmd = toYMD.split("-");

        int fromYearMonth = Integer.parseInt(fYmd[0] + fYmd[1]);
        int toYearMonth = Integer.parseInt(tYmd[0] + tYmd[1]);

        String fromDay = Integer.parseInt(fYmd[2])+"";
        String toDay = Integer.parseInt(tYmd[2])+"";

        if (toYearMonth > thisYearMonthRight) {

            selectYMD(ymdToYMDRightSelection, toYMD);
            selectYMD(ymdToYMDLeftSelection, fromYMD);

        } else if (fromYearMonth < thisYearMonthLeft) {

            selectYMD(ymdToYMDLeftSelection, fromYMD);
            selectYMD(ymdToYMDRightSelection, toYMD);

        } else if (fromYearMonth == thisYearMonthLeft && toYearMonth == thisYearMonthLeft) {

            selectDay(ymdToYMDLeftSelection, fromDay);
            selectDay(ymdToYMDLeftSelection, toDay);

        } else if (fromYearMonth == thisYearMonthRight && toYearMonth == thisYearMonthRight) {

            selectDay(ymdToYMDRightSelection, fromDay);
            selectDay(ymdToYMDRightSelection, toDay);

        } else if (fromYearMonth == thisYearMonthLeft && toYearMonth == thisYearMonthRight) {

            selectDay(ymdToYMDLeftSelection, fromDay);
            selectDay(ymdToYMDRightSelection, toDay);

        }
    }


    private static void selectDay(YMDSelection ymdSelection, String day) {
        WebElement element = findElement(ymdSelection.get$DayByTextJson(String.valueOf(day)));
        click(element);
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

        System.out.println("++++++++++++");
        System.out.println(ymdSelection.getJsonObject(ymdSelection.getDSelectMonth()));

        System.out.println("++++++++++++");
        WebElement element = findElement(ymdSelection.getJsonObject(ymdSelection.getDSelectMonth()));
        click(element);//点击月份选择

        element = findElement(ymdSelection.getJsonObject(ymdSelection.getDSelectYearMP()));
        click(element);//点击月份里面的年份选择

        element = findElement(ymdSelection.getJsonObject(ymdSelection.getDSelectDecade()));
        click(element);//点击年代选择

        while (true) {
            int boundary1;
            int boundary2;
            element = findElement(ymdSelection.getJsonObject(ymdSelection.getDCenturyBetweenLastAndNext()));
            String text = getText(element);
            boundary1 = Integer.parseInt(text.split("-")[0]);
            boundary2 = Integer.parseInt(text.split("-")[1]);
            System.out.println(boundary1 + ":b1");
            System.out.println(boundary2 + ":b2");
            System.out.println(year + ":year");

            if (year < boundary1) {
                element = findElement(ymdSelection.getJsonObject(ymdSelection.getDLastCentury()));
                click(element);
            } else if (year >= boundary1 && year <= boundary2) {
                break;
            } else if (year > boundary2) {
                element = findElement(ymdSelection.getJsonObject(ymdSelection.getDNextCentury()));
                click(element);
            }

        }

        String tmp = String.valueOf(year).substring(0, 3);
        String yearYear = tmp + "0-" + tmp + "9";

        element = findElement(ymdSelection.get$DecadeByTextJson(yearYear));

        click(element);

        element = findElement(ymdSelection.get$YearByTextJson(String.valueOf(year)));
        click(element);

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


        element = findElement(ymdSelection.get$MonthByTextJson(m));

        click(element);

        element = findElement(ymdSelection.get$DayByTextJson(String.valueOf(day)));

        click(element);
    }


}
