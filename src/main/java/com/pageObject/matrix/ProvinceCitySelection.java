package com.pageObject.matrix;

import com.alibaba.fastjson.JSONObject;
import com.utils.json.JsonObject;

public class ProvinceCitySelection extends JsonObject {
    private CommonObject commonObject = new CommonObject();

    public ProvinceCitySelection() {
        setDesPrefix("");
        super.setPrefix("");
        setConVal("");
    }

    public ProvinceCitySelection(String label) {
        setDesPrefix(label);
        setPrefix(label);
        setConVal(label);

    }

    public void setPrefix(String label) {
        super.setPrefix(commonObject.get$XInput(label) + "/../..");
        //label[1=1 and text()='客户柜台代码']/../following-sibling::*[1]//input/../..

    }

    private String get$DProvince(String province) {
        String description = "通用-选择省控件-";
        description = description + province;
        return description;
    }

    private String get$XProvince(String province) {
        //label[1=1 and text()='办公省市']/../following-sibling::*[1]//input/../..//ul[@class='ant-cascader-menu'][1]/li[@title='北京']
        String a = getPrefix() + "//ul[@class='ant-cascader-menu'][1]";
        a = a + "/li[@title='" + province + "']";
        return a;
    }


    public JSONObject get$ProvinceJson(String province) {
        JsonObject.setJsonObject(get$DProvince(province), get$XProvince(province));

        return JsonObject.getJsonObject();
    }

    private String get$DCity(String city) {
        String description = "通用-选择市控件-";
        description = description + city;
        return description;
    }

    private String get$XCity(String city) {
        //label[1=1 and text()='办公省市']/../following-sibling::*[1]//input/../..//ul[@class='ant-cascader-menu'][1]/li[@title='北京']
        String a = getPrefix() + "//ul[@class='ant-cascader-menu'][2]";
        a = a + "/li[@title='" + city + "']";
        return a;
    }


    public JSONObject get$CityJson(String city) {
        JsonObject.setJsonObject(get$DCity(city), get$XCity(city));

        return JsonObject.getJsonObject();
    }



}
