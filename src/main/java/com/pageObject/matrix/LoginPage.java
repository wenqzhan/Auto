package com.pageObject.matrix;

import com.alibaba.fastjson.JSONObject;
import com.utils.json.JsonObject;

public class LoginPage extends JsonObject {

    public static String matrixLoginUrl = "http://10.187.144.60:8081/user/login";
    public static String matrix = "http://10.187.144.60:8081/";

    public final static String dLPUserNameInput = "新matrix登录页面用户名输入框";
    private final static String iLPUserNameInput = "username";

    public final static String dLPPWDInput = "新matrix登录页面密码输入框";
    private final static String iLPPWDInput = "password";

    public final static String dLPLoginFailPromot = "新matrix登录页面登录失败提示";
    private final static String xLPLoginFailPromot = "//div[@class='ant-notification-notice-message']";

    public final static String dLPLoginButton = "新matrix登录页面登录按钮";
    private final static String x4LPLoginButton = "//button[@type='submit']";

    public final static String dLPLoginFailDetails = "新matrix登录页面登录失败详细说明";
    private final static String xLPLoginFailDetails = "//div[@class='ant-notification-notice-description']";

    //public final static String d5="ddddddd";
    //private final static String x5="//*[name()=\"svg\" and @data-icon='caret-down']";

    //*[name()="svg" and @data-icon='caret-down']

    public static JSONObject getJson(String description) {
        switch (description) {
            case dLPUserNameInput:
                JsonObject.setJsonObject(dLPUserNameInput, "id", iLPUserNameInput);
                break;
            case dLPPWDInput:
                JsonObject.setJsonObject(dLPPWDInput, "id", iLPPWDInput);
                break;
            case dLPLoginFailPromot:
                JsonObject.setJsonObject(dLPLoginFailPromot, xLPLoginFailPromot);
                break;
            case dLPLoginButton:
                JsonObject.setJsonObject(dLPLoginButton, x4LPLoginButton);
                break;
            case dLPLoginFailDetails:
                JsonObject.setJsonObject(dLPLoginFailDetails, xLPLoginFailDetails);
                break;
            //case d5:
            //JsonObject.setJsonObject(d5,x5);
            //break;
        }


        return JsonObject.getJsonObject();
    }


}
