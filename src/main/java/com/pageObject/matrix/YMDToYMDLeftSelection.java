package com.pageObject.matrix;

import com.pageObject.commonObject.CommonObject;

public class YMDToYMDLeftSelection extends YMDSelection{
    private CommonObject commonObject = new CommonObject();

    public YMDToYMDLeftSelection() {
        setDesPrefix("");
        super.setPrefix("");
        setConVal("");


    }

    public YMDToYMDLeftSelection(String label) {

        setDesPrefix(label+"-左侧部分");
        setPrefix(label);
        setConVal(label);


    }




    public void setPrefix(String label) {
        super.setPrefix(label,"left");
        //label[1=1 and text()='客户柜台代码']/../following-sibling::*[1]//input/../..//div[contains(@class,"left")]
    }

}
