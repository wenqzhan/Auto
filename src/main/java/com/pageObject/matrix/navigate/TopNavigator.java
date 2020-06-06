package com.pageObject.matrix.navigate;

import com.alibaba.fastjson.JSONObject;
import com.utils.json.JsonObject;
import lombok.Data;

@Data
public class TopNavigator extends JsonObject {

    private final  String dTNFold ="菜单折叠按钮";
    private final  String xTNFold ="//*[name()=\"svg\" and @data-icon='menu-fold']";

    private final  String dTNArrow ="顶端右上角用户名[工号]右边的下三角箭头";
    private final  String xTNArrow ="//*[name()=\"svg\" and @data-icon='caret-down']";

    private final  String dTNPwdChange ="密码修改按钮";
    private final  String xTNPwdChange ="//span[1=1 and contains(text(),\"密码修改\")]";

    private final  String dTNLogOut ="退出登录按钮";
    private final  String xTNLogOut ="//span[1=1 and contains(text(),\"退出登录\")]";

    private final  String dTNLogOutCancel ="注销提示,取消按钮";
    private final  String xTNLogOutCancel ="//button[1=1 and contains(@type,'button') and contains(@class,'ant-btn')]//span[1=1 and contains(text(),\"取 消\")]";

    private final  String dTNLogOutConfirm ="注销提示,确定按钮";
    private final  String xTNLogOutConfirm ="//button[1=1 and contains(@type,'button') and contains(@class,'ant-btn')]//span[1=1 and contains(text(),\"确 定\")]";

    private final  String dTNUserName ="登录用户的用户名";
    private final  String xTNUserName ="//*[name()=\"svg\" and @data-icon='caret-down']/../..";

    private final  String dTNUserCode ="登录用户的工号";
    private final  String xTNUserCode ="//*[name()=\"svg\" and @data-icon='caret-down']/../../span[2]";


//    public  JSONObject getJson(String description){
//        switch (description){
//            case dTNFold:
//                JsonObject.setJsonObject(dTNFold, xTNFold);
//                break;
//            case dTNArrow:
//                JsonObject.setJsonObject(dTNArrow, xTNArrow);
//                break;
//            case dTNPwdChange:
//                JsonObject.setJsonObject(dTNPwdChange, xTNPwdChange);
//                break;
//            case dTNLogOut:
//                JsonObject.setJsonObject(dTNLogOut, xTNLogOut);
//                break;
//            case dTNLogOutCancel:
//                JsonObject.setJsonObject(dTNLogOutCancel, xTNLogOutCancel);
//                break;
//            case dTNLogOutConfirm:
//                JsonObject.setJsonObject(dTNLogOutConfirm, xTNLogOutConfirm);
//                break;
//            case dTNUserName:
//                JsonObject.setJsonObject(dTNUserName, xTNUserName);
//                break;
//            case dTNUserCode:
//                JsonObject.setJsonObject(dTNUserCode, xTNUserCode);
//                break;
//        }
//        return JsonObject.getJsonObject();
//    }


}
