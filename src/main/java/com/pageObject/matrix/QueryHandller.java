package com.pageObject.matrix;

//import com.pageObject.matrix.commonObject.CommonObjectPopped;
import com.utils.json.JsonObject;
import lombok.Data;

@Data
public class QueryHandller extends JsonObject {

    CommonObject commonObject = new CommonObject();
//    CommonObjectPopped commonObjectPopped = new CommonObjectPopped();
    String popped = commonObject.getPoppedPrefix(); //div[@tabindex]
    String tabbed = "//div[contains(@class,'-active')]";


    public QueryHandller() {
        setDesPrefix("");
        super.setPrefix("");
        setConVal("");
    }

    public QueryHandller(String type) {
        setDesPrefix(type);
        setPrefix(type);
        setConVal(type);
    }

    public void setPrefix(String type) {
        String prefix = "";
        if (type.toLowerCase().contains("popped")) {
            prefix = prefix + popped;
        }
        if (type.toLowerCase().contains("tabbed")) {
            prefix = prefix + tabbed;
        }
        super.setPrefix(prefix);
        //label[1=1 and text()='客户柜台代码']/../following-sibling::*[1]//input/../..

    }

    private String dQueryButtonSpan;
    //"通用-查询按钮-span";
    private String xQueryButtonSpan;
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"查询")]

    private String dResetConditionsButtonSpan;
    //= "通用-重置按钮-span";
    private String xResetConditionsButtonSpan;
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]

    private String dUnfoldFoldButtonSpan;
    //= "通用-查询条件展开收起按钮-a";
    private String xUnfoldFoldButtonSpan;
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]/../../a


}
