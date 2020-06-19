package com.actions.matrix;

import com.driver.$;
import com.pageObject.matrix.ProvinceCitySelection;
import com.sql.matrix.ProvinceCitySelectionSql;
import org.openqa.selenium.WebElement;


public class ProvinceCitySelectionAction extends $ {


    public static void selectProvince(String province) {

        ProvinceCitySelection provinceCitySelection = new ProvinceCitySelection();
        provinceCitySelection = (ProvinceCitySelection) provinceCitySelection.getObjAttr();
        selectProvince(provinceCitySelection, province);

    }


    public static void selectProvince(String label, String province) {

        ProvinceCitySelection provinceCitySelection = new ProvinceCitySelection(label);
        provinceCitySelection = (ProvinceCitySelection) provinceCitySelection.getObjAttr(label);
        selectProvince(provinceCitySelection, province);

    }

    private static void selectProvince(ProvinceCitySelection provinceCitySelection,String province){
        WebElement element = findElement(provinceCitySelection.get$ProvinceJson(province));
        click(element);
    }


    public static void selectCity(String city) {

        ProvinceCitySelection provinceCitySelection = new ProvinceCitySelection();
        provinceCitySelection = (ProvinceCitySelection) provinceCitySelection.getObjAttr();
        selectCity(provinceCitySelection, city);

    }


    public static void selectCity(String label, String city) {

        ProvinceCitySelection provinceCitySelection = new ProvinceCitySelection(label);
        provinceCitySelection = (ProvinceCitySelection) provinceCitySelection.getObjAttr(label);
        selectCity(provinceCitySelection, city);
    }

    private static void selectCity(ProvinceCitySelection provinceCitySelection,String city){
        WebElement element = findElement(provinceCitySelection.get$CityJson(city));
        click(element);
    }

    public static void selectProvinceCity(String province, String city){
        selectProvince(province);
        selectCity(city);
    }

    public static void selectProviceCity(String city){
        ProvinceCitySelectionSql provinceCitySelectionSql = new ProvinceCitySelectionSql();
        String province = provinceCitySelectionSql.getProvinceName(city);
        selectProvinceCity(province,city);

    }

}
