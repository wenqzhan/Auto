package com.utils.date;

import com.utils.log.LoggerController;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateMisc {
    final static LoggerController log = LoggerController.getLogger(DateMisc.class);
    public static final String ZH_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String ZN_DATE_FORMAT = "yyyy年MM月dd日 HH:mm:ss";
    public static final String ZC_DATE_FORMAT = "yyyy年MM月dd日";
    public static final String SHORT_DATE_TIME_FORMAT = "yy-MM-dd HH:mm";
    public static final String CHECK_LOG_FORMAT = "yyyyMMdd";
    public static final String REPORT_CSV_FORMAT = "yyyyMMdd_HHmmss";
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
    public final static String ZC_DATE_FORMAT_no0 = "yyyy年M月dd日";
    public static final String SHORT_DATE_FORMAT = "yyyy-MM-dd";


    public static String format(String type) {
        simpleDateFormat = new SimpleDateFormat(type);
        String s = simpleDateFormat.format(new Date());
        log.info("当前时间为：" + s);
        return s;
    }

    /*根据当前时间获取11位随机数*/
    public static String time() {
        long currentTime = System.currentTimeMillis() / 100;
        String randomNum = String.valueOf(currentTime);
        log.info("11位的随机数为：" + randomNum);
        return randomNum;
    }


    public static String getYMD() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat(ZC_DATE_FORMAT_no0);
        return dateFormat.format(date);
    }

    public static long getTimeStamp() {
        return System.currentTimeMillis();
    }


    private static Date randomDate(String beginDate, String endDate) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date start = format.parse(beginDate);// 构造开始日期
            Date end = format.parse(endDate);// 构造结束日期
            // getTime()表示返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
            if (start.getTime() >= end.getTime()) {
                return null;
            }
            long date = random(start.getTime(), end.getTime());
            return new Date(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    private static long random(long begin, long end) {
        long rtn = begin + (long) (Math.random() * (end - begin));
        // 如果返回的是开始时间和结束时间，则递归调用本函数查找随机值
        if (rtn == begin || rtn == end) {
            return random(begin, end);
        }
        return rtn;
    }

    public static String getRandomYMD(){
        Date randomDate = randomDate("2000-01-01", "2099-12-31");
        SimpleDateFormat format = new SimpleDateFormat(SHORT_DATE_FORMAT);
        String result = format.format(randomDate);

        return result;

    }

    public static String[] getRandomYMDToYMD(){
        String[] strings = new String[2];
        Date randomFromDate = randomDate("2000-01-01", "2099-12-31");
        SimpleDateFormat format = new SimpleDateFormat(SHORT_DATE_FORMAT);
        String rfd = format.format(randomFromDate);
        Date randomToDate = randomDate(rfd, "2099-12-31");
        String rtd = format.format(randomToDate);
        strings[0]=rfd;
        strings[1]=rtd;
        return strings;
    }



}


