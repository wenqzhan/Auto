package com.pageObject.matrix.navigate;

import com.alibaba.fastjson.JSONObject;
import com.utils.json.JsonObject;
import lombok.Data;

@Data
public class LeftNavigator extends JsonObject {

    public final  String d1="左上角搜索框";
    private final  String x1="//input[1=1 and contains(@placeholder,'Search...')]";

//    public  JSONObject getJson(String description){
//        switch (description){
//            case d1:
//                JsonObject.setJsonObject(d1,x1);
//                break;
//        }
//        return JsonObject.getJsonObject();
//    }



}
