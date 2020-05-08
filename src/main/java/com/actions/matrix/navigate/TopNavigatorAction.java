package com.actions.matrix.navigate;

import com.actions.matrix.orgCust.ContractAction;
import com.driver.$;
import com.pageObject.matrix.navigate.TopNavigator;
import com.sql.matrix.navigate.TopNavigatorSql;
import com.utils.jdbc.JDBC;
import com.utils.log.LoggerController;

public class TopNavigatorAction extends $ {
    private final static LoggerController log = LoggerController.getLogger(TopNavigatorAction.class);


    public static String getUserCode(){
        findElement(TopNavigator.getJson(TopNavigator.dTNUserCode));
        String userCode = getText().trim().replace("[","").
                replace("]","");
        return userCode;
    }

    public static String getUserName(){
        findElement(TopNavigator.getJson(TopNavigator.dTNUserName));
        String userName = getText();
        int index = userName.indexOf("[");
        userName = userName.substring(0,index);
        return userName;
    }



    public static String getUserID(){
        String id;
        String userCode = getUserCode();
        String userName = getUserName();
        String sql = TopNavigatorSql.getSql1(userCode,userName);
        //System.out.println(sql);
        id = JDBC.getSqlResultStr(sql);

        return id;

    }


}
