package com.pageObject.matrix.navigate;

import com.alibaba.fastjson.JSONObject;
import com.utils.json.JsonObject;

public class TopNavigator extends JsonObject {

    public final static String dTNFold ="菜单折叠按钮";
    private final static String xTNFold ="//*[name()=\"svg\" and @data-icon='menu-fold']";

    public final static String dTNArrow ="顶端右上角用户名[工号]右边的下三角箭头";
    private final static String xTNArrow ="//*[name()=\"svg\" and @data-icon='caret-down']";

    public final static String dTNPwdChange ="密码修改按钮";
    private final static String xTNPwdChange ="//span[1=1 and contains(text(),\"密码修改\")]";

    public final static String dTNLogOut ="退出登录按钮";
    private final static String xTNLogOut ="//span[1=1 and contains(text(),\"退出登录\")]";

    public final static String dTNLogOutCancel ="注销提示,取消按钮";
    private final static String xTNLogOutCancel ="//button[1=1 and contains(@type,'button') and contains(@class,'ant-btn')]//span[1=1 and contains(text(),\"取 消\")]";

    public final static String dTNLogOutConfirm ="注销提示,确定按钮";
    private final static String xTNLogOutConfirm ="//button[1=1 and contains(@type,'button') and contains(@class,'ant-btn')]//span[1=1 and contains(text(),\"确 定\")]";

    public final static String dTNUserName ="登录用户的用户名";
    private final static String xTNUserName ="//*[name()=\"svg\" and @data-icon='caret-down']/../..";

    public final static String dTNUserCode ="登录用户的工号";
    private final static String xTNUserCode ="//*[name()=\"svg\" and @data-icon='caret-down']/../../span[2]";


    public static JSONObject getJson(String description){
        switch (description){
            case dTNFold:
                JsonObject.setJsonObject(dTNFold, xTNFold);
                break;
            case dTNArrow:
                JsonObject.setJsonObject(dTNArrow, xTNArrow);
                break;
            case dTNPwdChange:
                JsonObject.setJsonObject(dTNPwdChange, xTNPwdChange);
                break;
            case dTNLogOut:
                JsonObject.setJsonObject(dTNLogOut, xTNLogOut);
                break;
            case dTNLogOutCancel:
                JsonObject.setJsonObject(dTNLogOutCancel, xTNLogOutCancel);
                break;
            case dTNLogOutConfirm:
                JsonObject.setJsonObject(dTNLogOutConfirm, xTNLogOutConfirm);
                break;
            case dTNUserName:
                JsonObject.setJsonObject(dTNUserName, xTNUserName);
                break;
            case dTNUserCode:
                JsonObject.setJsonObject(dTNUserCode, xTNUserCode);
                break;
        }
        return jsonObject;
    }


}
