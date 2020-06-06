package com.pageObject.matrix;

import com.pageObject.commonObject.CommonObject;

public class YMDToYMDRightSelection extends YMDSelection {
    private CommonObject commonObject = new CommonObject();


    public YMDToYMDRightSelection() {
        setDesPrefix("");
        super.setPrefix("");
        setConVal("");


    }

    public YMDToYMDRightSelection(String label) {

        setDesPrefix(label+"-右侧部分");
        setPrefix(label);
        setConVal(label);


    }


    public void setPrefix(String label) {
        super.setPrefix(label,"right");
        //label[1=1 and text()='客户柜台代码']/../following-sibling::*[1]//input/../..//div[contains(@class,"right")]
    }
}
