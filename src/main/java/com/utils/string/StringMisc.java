package com.utils.string;

import com.utils.list.ListMisc;
import com.utils.random.Randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringMisc {

    public static int isEqual(String a, String b) {
        int flag = 0;//not equal

        if (a.equals(b)) {
            flag = 1;//equals
        } else if (isLike(a, b)) {
            flag = 2;//only like
        } else if (isDisorderlyLike(a,b)){
            flag = 3;//disorderly like
        }


        return flag;


    }

    public static boolean isDisorderlyLike(String str1, String str2){
        boolean flag = false;
        List<String> l1;
        List<String> l2;
        if(str1.contains(",")&&str2.contains(",")){
            l1 = new ArrayList<>(Arrays.asList(str1.split(",")));
            l2 = new ArrayList<>(Arrays.asList(str2.split(",")));
            Collections.sort(l1);
            Collections.sort(l2);
            String s1 = "";
            String s2 = "";
            for (String s:l1){
                s1 = s1 + s;
            }

            for (String s:l2){
                s2 = s2 + s;
            }

            flag = s1.equals(s2);
        }
        return flag;
    }

    public static boolean isLike(String str1, String str2) {
        boolean flag = false;
        String s1 = "账号,帐号";
        String s2 = "部门客户,部门级客户";
        String s3 = "集团战略客户,集团级战略客户";

        List<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (String str : list) {
            String string1 = str.split(",")[0];
            String string2 = str.split(",")[1];
            str1 = str1.replace(string1, string2);
            str2 = str2.replace(string1, string2);
        }

        flag = str1.equals(str2);


        return flag;
    }


    public static String getPartialStr(String str) {
        int b = str.length();
        int a = Randoms.getRandomNum(0, b - 1);
        b = Randoms.getRandomNum(a+1,b);
        String s = str.substring(a, b);
        return s;
    }


}
