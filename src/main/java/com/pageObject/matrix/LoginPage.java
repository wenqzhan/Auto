package com.pageObject.matrix;

import com.alibaba.fastjson.JSONObject;
import com.utils.json.JsonObject;
import lombok.Data;

@Data
public class LoginPage extends JsonObject {

    private  String matrixLoginUrl = "http://10.187.144.60:8080/user/login";
    private  String matrixUrl = "http://10.187.144.60:8080/";

    private final  String dLPUserNameInput = "新matrix登录页面用户名输入框";
    private final  String iLPUserNameInput = "username";

    private final  String dLPPWDInput = "新matrix登录页面密码输入框";
    private final  String iLPPWDInput = "password";

    private final  String dLPLoginFailPromote = "新matrix登录页面登录失败提示";
    private final  String xLPLoginFailPromote = "//div[@class='ant-notification-notice-message']";

    private final  String dLPLoginButton = "新matrix登录页面登录按钮";
    private final  String xLPLoginButton = "//button[@type='submit']";

    private final  String dLPLoginFailDetails = "新matrix登录页面登录失败详细说明";
    private final  String xLPLoginFailDetails = "//div[@class='ant-notification-notice-description']";

    //public final  String d5="ddddddd";
    //private final  String x5="//*[name()=\"svg\" and @data-icon='caret-down']";

    //*[name()="svg" and @data-icon='caret-down']

//    public JSONObject getJson(String description) {
//        switch (description) {
//            case dLPUserNameInput:
//                JsonObject.setJsonObject(dLPUserNameInput, "id", iLPUserNameInput);
//                break;
//            case dLPPWDInput:
//                JsonObject.setJsonObject(dLPPWDInput, "id", iLPPWDInput);
//                break;
//            case dLPLoginFailPromot:
//                JsonObject.setJsonObject(dLPLoginFailPromot, xLPLoginFailPromot);
//                break;
//            case dLPLoginButton:
//                JsonObject.setJsonObject(dLPLoginButton, x4LPLoginButton);
//                break;
//            case dLPLoginFailDetails:
//                JsonObject.setJsonObject(dLPLoginFailDetails, xLPLoginFailDetails);
//                break;
//            //case d5:
//            //JsonObject.setJsonObject(d5,x5);
//            //break;
//        }
//
//
//        return JsonObject.getJsonObject();
//    }


}
