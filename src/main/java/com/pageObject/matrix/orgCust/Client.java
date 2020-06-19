package com.pageObject.matrix.orgCust;

import com.alibaba.fastjson.JSONObject;
import com.pageObject.matrix.CommonObject;
import com.utils.json.JsonObject;
import lombok.Data;

@Data
public class Client extends JsonObject {//客户联系人
    //    private CommonObjectPopped commonObjectPopped = new CommonObjectPopped();
    private CommonObject commonObject = new CommonObject();
//    private String X = "xpath";
//    private String D = "description";

    public Client() {
        setDesPrefix("客户联系人");
        super.setPrefix("");
        setConVal("");
    }

    public Client(String label) {
        setDesPrefix("客户联系人" + label);
        setPrefix(label);
        setConVal(label);
    }

    public void setPrefix(String label) {
        if (label.toLowerCase().contains("popped")) {
            super.setPrefix(getPoppedPrefix());
        }
    }


    private String client =
            "http://10.187.144.60:8080/orgcust/client";

    private String dNewButtonSpan;
    private String xNewButtonSpan;
    //span[1=1 and contains(text(),"新增")]

    private String dExportButtonSpan;
    private String xExportButtonSpan;
    //span[1=1 and contains(text(),"导出")]

    private String dGrantVintexPermissionSpan;
    private String xGrantVintexPermissionSpan;
    //span[1=1 and contains(text(),"开通道合")]


    private String dContactNameInput;
    private String xContactNameInput;
    //label[1=1 and contains(text(),"联系人姓名")]/../following-sibling::*[1]//input

    private String dMobileInput;
    private String xMobileInput;
    //label[1=1 and contains(text(),"手机")]/../following-sibling::*[1]//input

    private String dEmailInput;
    private String xEmailInput;
    //label[1=1 and contains(text(),"邮箱")]/../following-sibling::*[1]//input

    private String dQueryButtonSpan;
    private String xQueryButtonSpan;
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"查询")]

    private String dResetConditionsButtonSpan;
    private String xResetConditionsButtonSpan;
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]

    ///////////////////////
    private String dTableTable;
    private String xTableTable;
    //table[1=1 and contains(@class,'ant-table-fixed')]

    private String dTableTrs;
    private String xTableTrs;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not (contains(@style,'height'))]

    private String dTableTrsSelectedTrs;
    private String xTableTrsSelectedTrs;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected')]

    private String dTableTrsNotSelectedTrs;
    private String xTableTrsNotSelectedTrs;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected'))]

    private String dTableHeaderTr1Ths;
    private String xTableHeaderTr1Ths;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[not(@key='selection-column') and not(@key='action')]

    private String dTableHeaderMultiCheckboxTh;
    private String xTableHeaderMultiCheckboxTh;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']

    private String dTableLastPageButtonLi;
    private String xTableLastPageButtonLi;
    //li[1=1 and contains(@title,'上一页')]

    private String dTableNextPageButtonLi;
    private String xTableNextPageButtonLi;
    //li[1=1 and contains(@title,'下一页')]

    private String dMaxPageButtonA;
    private String xMaxPageButtonA;
    //li[1=1 and contains(@title,'下一页')]/preceding-sibling::li[1]/a

    private String dTableJumpToInput;
    private String xTableJumpToInput;
    //div[1=1 and contains(text(),"跳至")]/input

    private String dTableJumpDiv;
    private String xTableJumpDiv;
    //div[1=1 and contains(text(),"跳至")]

    private String dTableLoadingSignSpan;
    private String xTableLoadingSignSpan;
    //span[1=1 and contains(@class,'ant-spin-dot')]

    private String dTableLinesPerPageDiv;
    private String xTableLinesPerPageDiv;
    //div[1=1 and contains(@title,'条/页')]

    private String dTableFiveLinesPerPageLi;
    private String xTableFiveLinesPerPageLi;
    //li[1=1 and text()='5 条/页' ]

    private String dTableTenLinesPerPageLi;
    private String xTableTenLinesPerPageLi;
    //li[1=1 and text()='10 条/页' ]

    private String dTableTwentyLinesPerPageLi;
    private String xTableTwentyLinesPerPageLi;
    //li[1=1 and text()='20 条/页' ]

    private String dTableThirtyLinesPerPageLi;
    private String xTableThirtyLinesPerPageLi;
    //li[1=1 and text()='30 条/页' ]

    private String dTableHeaderMultiCheckboxInput;
    private String xTableHeaderMultiCheckboxInput;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']//input

    private String dSuccessPromptWithGreenCheckDivFinal;
    private String xSuccessPromptWithGreenCheckDivFinal;
    //div[@class='ant-message-content']
    //////////////
    private String dBusinessLineInput;
    private String xBusinessLineInput;
    //div[@tabindex]//label[1=1 and contains(text(),"业务条线")]/../following-sibling::*[1]//input

    private String dBusinessLineInputCrossI;
    private String xBusinessLineInputCrossI;
    //div[@tabindex]//label[1=1 and contains(text(),"业务条线")]/../following-sibling::*[1]//input/..//i[1=1 and contains(@class,'close-circle')]

    private String dOAAccountInput;
    private String xOAAccountInput;
    //label[1=1 and contains(text(),"OA账号")]/../following-sibling::*[1]//input

    private String dCustNameInput;
    private String xCustNameInput;
    //label[1=1 and contains(text(),"客户名称")]/../following-sibling::*[1]//input


//    private   String d37 ;
//    private   String x37 ;
//    //label[1=1 and contains(text(),"联系人姓名")]/../following-sibling::*[1]//input

//    private   String d38 ;
//    private   String x38 ;
//    //label[1=1 and contains(text(),"手机")]/../following-sibling::*[1]//input

    private String dDepartmentInput;
    private String xDepartmentInput;
    //label[1=1 and contains(text(),"部门")]/../following-sibling::*[1]//input


    private String dFaxInput;
    private String xFaxInput;
    //label[1=1 and contains(text(),"FAX")]/../following-sibling::*[1]//input

//    private   String d41 ;
//    private   String x41 ;
//    //label[1=1 and contains(text(),"邮箱")]/../following-sibling::*[1]//input

    private String dCustAbbInput;
    private String xCustAbbInput;


    private String dPositionInput;
    private String xPositionInput;
    //label[1=1 and contains(text(),"职务")]/../following-sibling::*[1]//input


    private String dTelInput;
    private String xTelInput;
    //label[1=1 and contains(text(),"座机")]/../following-sibling::*[1]//input

    private String dCreatorInput;
    private String xCreatorInput;
    //label[1=1 and contains(text(),"创建人")]/../following-sibling::*[1]//input

    private String dOfficeAddressInput;
    private String xOfficeAddressInput;
    //label[1=1 and contains(text(),"办公地址")]/../following-sibling::*[1]//input
//
//    private final  String d27P = "客户联系人-first popped-客户经理框-input";
//    private final  String x27P = commonObjectPopped.getXpath(commonObjectPopped.d27P);
//    //label[1=1 and contains(text(),"客户经理")]/../following-sibling::*[1]//input
//
    private String dGTJAContactInput;
    private String xGTJAContactInput;
    //label[1=1 and contains(text(),"国君服务联系人")]/../following-sibling::*[1]//input


    private String dConfirmButtonSpan;
    private String xConfirmButtonSpan;
    //div[@tabindex]//span[1=1 and contains(text(),"确 定")]

    private String dCloseButtonSpan;
    private String xCloseButtonSpan;
    //div[@tabindex]//span[1=1 and contains(text(),"关 闭")]


    private String get$XQueryInput(String label) {
        //div[@tabindex]//label[1=1 and contains(text(),"客户柜台代码")]/../following-sibling::*[1]//input
        return getPrefix()+ commonObject.get$XQueryInput(label);
    }


    private String get$DQueryInput(String label) {
        return commonObject.get$DQueryInput(label).
                replaceFirst("通用", "客户联系人");
    }

    private String get$XTableTrsSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(@style)][30]
        String xpath = commonObject.get$XTableTrsSibling(num);
        return xpath;
    }

    private String get$DTableTrsSibling(int num) {
        //客户联系人-表格表体-第1行
        String description = commonObject.get$DTableTrsSibling(num);
        description = description.replaceFirst("通用", "客户联系人");
        return description;
    }


    private String get$XTableTrs_actionSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style][30]
        String xpath = commonObject.get$XTableTrsActionSibling(num);
        return xpath;
    }

    private String get$DTableTrs_actionSibling(int num) {
        //客户联系人-表格表体-第1行
        String description = commonObject.get$DTableTrsActionSibling(num);
        description = description.replaceFirst("通用", "客户联系人");
        return description;
    }

    public JSONObject get$DQueryInputJson(String label) {
        JsonObject.setJsonObject(get$DQueryInput(label), get$XQueryInput(label));
        return JsonObject.getJsonObject();
    }


    public JSONObject get$TableTrsSiblingJson(int num) {
        JsonObject.setJsonObject(get$DTableTrsSibling(num), get$XTableTrsSibling(num));
        return JsonObject.getJsonObject();
    }


    public JSONObject get$TableTrs_actionSiblingJson(int num) {
        JsonObject.setJsonObject(get$DTableTrs_actionSibling(num), get$XTableTrs_actionSibling(num));
        return JsonObject.getJsonObject();
    }


//    public  JSONObject getJson(String description) {
//        switch (description) {
//            case d35:
//                JsonObject.setJsonObject(d35, x35);
//                break;
//            case d6:
//                JsonObject.setJsonObject(d6, x6);
//                break;
//            case d36:
//                JsonObject.setJsonObject(d36, x36);
//                break;
//            case d37:
//                JsonObject.setJsonObject(d37, x37);
//                break;
//            case d38:
//                JsonObject.setJsonObject(d38, x38);
//                break;
//            case d41:
//                JsonObject.setJsonObject(d41, x41);
//                break;
//            case d3:
//                JsonObject.setJsonObject(d3, x3);
//                break;
//            case d4:
//                JsonObject.setJsonObject(d4, x4);
//                break;
//            case d34P:
//                JsonObject.setJsonObject(d34P, x34P);
//                break;
//            case d1P:
//                JsonObject.setJsonObject(d1P, x1P);
//                break;
//            case d2P:
//                JsonObject.setJsonObject(d2P, x2P);
//                break;
//            case d37P:
//                JsonObject.setJsonObject(d37P, x37P);
//                break;
//            case d38P:
//                JsonObject.setJsonObject(d38P, x38P);
//                break;
//            case d39P:
//                JsonObject.setJsonObject(d39P, x39P);
//                break;
//            case d40P:
//                JsonObject.setJsonObject(d40P, x40P);
//                break;
//            case d41P:
//                JsonObject.setJsonObject(d41P, x41P);
//                break;
//            case d42P:
//                JsonObject.setJsonObject(d42P, x42P);
//                break;
//            case d43P:
//                JsonObject.setJsonObject(d43P, x43P);
//                break;
//            case d44P:
//                JsonObject.setJsonObject(d44P, x44P);
//                break;
//            case d45P:
//                JsonObject.setJsonObject(d45P, x45P);
//                break;
//            case d46P:
//                JsonObject.setJsonObject(d46P, x46P);
//                break;
////            case d27P:
////                JsonObject.setJsonObject(d27P,x27P);
////                break;
//            case d29P:
//                JsonObject.setJsonObject(d29P, x29P);
//                break;
//            case d30P:
//                JsonObject.setJsonObject(d30P, x30P);
//                break;
//            case d47P:
//                JsonObject.setJsonObject(d47P, x47P);
//                break;
//            case d9:
//                JsonObject.setJsonObject(d9, x9);
//                break;
//            case d10:
//                JsonObject.setJsonObject(d10, x10);
//                break;
//            case d10Selected:
//                JsonObject.setJsonObject(d10Selected, x10Selected);
//                break;
//            case d10NotSelected:
//                JsonObject.setJsonObject(d10NotSelected, x10NotSelected);
//                break;
//            case d11:
//                JsonObject.setJsonObject(d11, x11);
//                break;
//            case d31:
//                JsonObject.setJsonObject(d31, x31);
//                break;
//            case d12:
//                JsonObject.setJsonObject(d12, x12);
//                break;
//            case d13:
//                JsonObject.setJsonObject(d13, x13);
//                break;
//            case d14:
//                JsonObject.setJsonObject(d14, x14);
//                break;
//            case d15:
//                JsonObject.setJsonObject(d15, x15);
//                break;
//            case d16:
//                JsonObject.setJsonObject(d16, x16);
//                break;
//            case d17:
//                JsonObject.setJsonObject(d17, x17);
//                break;
//            case d18:
//                JsonObject.setJsonObject(d18, x18);
//                break;
//            case d18l5:
//                JsonObject.setJsonObject(d18l5, x18l5);
//                break;
//            case d18l10:
//                JsonObject.setJsonObject(d18l10, x18l10);
//                break;
//            case d18l20:
//                JsonObject.setJsonObject(d18l20, x18l20);
//                break;
//            case d18l30:
//                JsonObject.setJsonObject(d18l30, x18l30);
//                break;
//            case d28:
//                JsonObject.setJsonObject(d28, x28);
//                break;
//            case d48:
//                JsonObject.setJsonObject(d48, x48);
//                break;
//            case d34P_cross:
//                JsonObject.setJsonObject(d34P_cross, x34P_cross);
//                break;
//
//        }
//
//        return JsonObject.getJsonObject();
//
//    }

}
