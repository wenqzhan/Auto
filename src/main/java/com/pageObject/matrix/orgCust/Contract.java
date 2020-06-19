package com.pageObject.matrix.orgCust;

import com.alibaba.fastjson.JSONObject;
import com.driver.$;
import com.pageObject.matrix.CommonObject;
//import com.pageObject.matrix.commonObject.CommonObjectPopped;
import com.utils.json.Attr;
import com.utils.json.JsonObject;
import lombok.Data;
import org.openqa.selenium.WebElement;

@Data
public class Contract extends JsonObject {//证明材料


    public Contract() {
        setDesPrefix("证明材料");
        super.setPrefix("");
        setConVal("");
        commonObject = (CommonObject) commonObject.getObjAttr();

    }

    public Contract(String label) {
        commonObject = (CommonObject) commonObject.getObjAttr();
        setDesPrefix("证明材料" + label);
        setPrefix(label);
        setConVal(label);
    }

    public void setPrefix(String label) {
        if (label.toLowerCase().contains("popped")) {
            super.setPrefix(getPoppedPrefix());
        }
    }

    //    private CommonObjectPopped commonObjectPopped = new CommonObjectPopped();
    private CommonObject commonObject = new CommonObject();

    private String contract =
            "http://10.187.144.60:8080/orgcust/contract";

    private String dUploadSupportingMaterialsButtonSpan ;
    private String xUploadSupportingMaterialsButtonSpan ;
    //span[1=1 and contains(text(),"上传证明材料")]


    private String dQueryButtonSpan ;
    private String xQueryButtonSpan ;
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"查询")]

    private String dResetConditionsButtonSpan ;
    private String xResetConditionsButtonSpan ;
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]

    private String dUnfoldFoldButtonSpan;
    private String xUnfoldFoldButtonSpan ;
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]/../../a


    private String dMaterialNameInput ;
    private String xMaterialNameInput ;
    //label[1=1 and contains(text(),"材料名称")]/../following-sibling::*[1]//input

    private String dCustNameInput;
    private String xCustNameInput ;
    //label[1=1 and contains(text(),"客户名称")]/../following-sibling::*[1]//input

    private String dMaterialTypeDiv ;/////
    private String xMaterialTypeDiv ;
    //label[1=1 and contains(text(),"材料类型")]/../following-sibling::div[1]


    private String dBusinessOpportunityBelongedInput ;
    private String xBusinessOpportunityBelongedInput;
    //label[1=1 and contains(text(),"所属商机")]/../following-sibling::*[1]//input

    //////////////////////////////////
    private String dTableTable ;
    private String xTableTable ;
    //table[1=1 and contains(@class,'ant-table-fixed')]

    private String dTableTrs ;
    private String xTableTrs ;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not (contains(@style,'height'))] //不包含编辑那列,比如客户联系人,具体取决于样式

    private String dTableActionTrs;
    private String xTableActionTrs;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]

    private String dTableActionEditsAs ;
    private String xTableActionEditsAs ;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]//a[text()='编辑']


    private String dTableTrsActionDeleteAs ;
    private String xTableTrsActionDeleteAs ;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]//a[text()='删除']

    private String dTableTrsSelectedTrs ;
    private String xTableTrsSelectedTrs ;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected')]

    private String dTableTrsNotSelectedTrs ;
    private String xTableTrsNotSelectedTrs ;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected'))]

    private String dTableHeaderTr1Ths;
    private String xTableHeaderTr1Ths ;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[not(@key='selection-column')]

    private String dTableHeaderMultiCheckboxTh ;
    private String xTableHeaderMultiCheckboxTh;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']


    private String dTableLastPageButtonLi ;
    private String xTableLastPageButtonLi ;
    //li[1=1 and contains(@title,'上一页')]

    private String dTableNextPageButtonLi ;
    private String xTableNextPageButtonLi ;
    //li[1=1 and contains(@title,'下一页')]

    private String dMaxPageButtonA;
    private String xMaxPageButtonA ;
    //li[1=1 and contains(@title,'下一页')]/preceding-sibling::li[1]/a

    private String dTableJumpToInput ;
    private String xTableJumpToInput ;
    //div[1=1 and contains(text(),"跳至")]/input

    private String dTableJumpDiv ;
    private String xTableJumpDiv ;
    //div[1=1 and contains(text(),"跳至")]

    private String dTableLoadingSignSpan;
    private String xTableLoadingSignSpan ;
    //span[1=1 and contains(@class,'ant-spin-dot')]

    private String dTableLinesPerPageDiv ;
    private String xTableLinesPerPageDiv ;
    //div[1=1 and contains(@title,'条/页')]

    private String dTableFiveLinesPerPageLi ;
    private String xTableFiveLinesPerPageLi ;
    //li[1=1 and text()='5 条/页' ]

    private String dTableTenLinesPerPageLi;
    private String xTableTenLinesPerPageLi ;
    //li[1=1 and text()='10 条/页' ]

    private String dTableTwentyLinesPerPageLi ;
    private String xTableTwentyLinesPerPageLi ;
    //li[1=1 and text()='20 条/页' ]

    private String dTableThirtyLinesPerPageLi ;
    private String xTableThirtyLinesPerPageLi ;
    //li[1=1 and text()='30 条/页' ]

    private String dTableHeaderMultiCheckboxInput ;
    private String xTableHeaderMultiCheckboxInput;
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']//input

    /////////////////////////////////



    private String dContactsInput ;
    private String xContactsInput ;
    //div[@tabindex]//label[1=1 and contains(text(),"联系人")]/../following-sibling::*[1]//input

    private String dAssociatedBusinessOpportunities;
    private String xAssociatedBusinessOpportunities;
    //div[@tabindex]//label[1=1 and contains(text(),"关联商机")]/../following-sibling::*[1]//input

    private String dAssociatedBusinessOpportunitiesDiv1 ;
    private String xAssociatedBusinessOpportunitiesDiv1 ;
    //div[@tabindex]//label[1=1 and contains(text(),"关联商机")]/../following-sibling::*[1]//div[@aria-controls]

    private String dAssociatedBusinessOpportunitiesDiv1Cross ;
    private String xAssociatedBusinessOpportunitiesDiv1Cross ;
    //div[@tabindex]//label[1=1 and contains(text(),"关联商机")]/../following-sibling::*[1]//div[@aria-controls]//i[1=1 and contains(@class,'close-circle')]


    private String dAssociatedBusinessOpportunitiesDiv3 ;
    private String xAssociatedBusinessOpportunitiesDiv3 ;
    //div[@tabindex]//label[1=1 and contains(text(),"关联商机")]/../following-sibling::*[1]//div[@aria-controls]//div[@title]


    private String dAssociatedBusinessOpportunitiesDiv2 = "证明材料-first popped-关联商机框-下的框div";
    private String iAssociatedBusinessOpportunitiesDiv2 = "";

    public void setIAssociatedBusinessOpportunitiesDiv2() {
        iAssociatedBusinessOpportunitiesDiv2 = getBizOpportunityID();
        Attr.setAttr("iAssociatedBusinessOpportunitiesDiv2", iAssociatedBusinessOpportunitiesDiv2);
    }


    private String dMaterialTypeDivSpan ;/////
    private String xMaterialTypeDivSpan ;
    //div[@tabindex]//label[1=1 and contains(text(),"材料类型")]/../following-sibling::div[1]//div[contains(@class,"selected")]/span


    private String dMaterialTypeSpecialStrategicCooperationAgreementSpan ;
    private String xMaterialTypeSpecialStrategicCooperationAgreementSpan ;
    //div[@tabindex]//li/span[1=1 and @title='专项战略合作协议' ]

    private String dMaterialTypeComprehensiveStrategicCooperationAgreement ;
    private String xMaterialTypeComprehensiveStrategicCooperationAgreement ;
    //div[@tabindex]//li/span[1=1 and @title='全面战略合作协议' ]

    private String dMaterialTypeBusinessAgreement ;
    private String xMaterialTypeBusinessAgreement ;
    //div[@tabindex]//li/span[1=1 and @title='业务协议' ]

    private String dContractSignedDateInput;
    private String xContractSignedDateInput;
    //div[@tabindex]//label[1=1 and contains(text(),"签署日期")]/../following-sibling::*[1]//input

    private String dContractAmountInTenThousandsInput;
    private String xContractAmountInTenThousandsInput;
    //div[@tabindex]//label[1=1 and contains(text(),"合同金额(万元)")]/../following-sibling::*[1]//input

    private String dUpload ;
    private String xUpload ;
    //div[@tabindex]//p[text()='点击或将文件拖拽到这里上传']


    private String dConfirmButtonSpan;
    private String xConfirmButtonSpan;
    //div[@tabindex]//span[1=1 and contains(text(),"确 定")]

    private String dCloseButtonSpan;
    private String xCloseButtonSpan;
    //div[@tabindex]//span[1=1 and contains(text(),"关 闭")]


    private String dUploadPUploading = "证明材料-first popped-上传文件-上传中-span";
    private String xUploadPUploading = "//div[contains(@class,\"item-uploading\")]";


    private String dUploadPUploadingCorss = "证明材料-first popped-上传文件-上传中-删除-i";
    private String xUploadPUploadingCorss = commonObject.getCross(xUploadPUploading);
    //div[contains(@class,"item-done")]//i[1=1 and contains(@class,'close-circle') or contains(@class,'anticon-close')]


    private String dUploadPUploadDone = "证明材料-first popped-上传文件-上传成功-span";
    private String xUploadPUploadDone = "//div[contains(@class,\"item-done\")]";


    private String dUploadPUploadDoneCorss = "证明材料-first popped-上传文件-上传成功-删除-i";
    private String xUploadPUploadDoneCorss = commonObject.getCross(xUploadPUploadDone);
    //div[contains(@class,"item-done")]//i[1=1 and contains(@class,'close-circle') or contains(@class,'anticon-close')]

    private String dUploadPUploadDoneFile = "证明材料-first popped-上传文件-上传成功的文件-span";
    private String xUploadPUploadDoneFile = "//div[contains(@class,\"item-done\")]";


    private String dUploadPUploadError = "证明材料-first popped-上传文件-上传失败-span";
    private String xUploadPUploadError = "//div[contains(@class,\"item-error\")]";


    private String dSuccessPromptWithGreenCheckDivFinal = "证明材料-添加/修改-成功系统提示信息";
    private String xSuccessPromptWithGreenCheckDivFinal = commonObject.getXSuccessPromptWithGreenCheckDivFinal();
    //div[@class='ant-message-success']


    private String getBizOpportunityID() {
        String attributeValue;
        String id;

        WebElement element = $.findElement(getJsonObject(dAssociatedBusinessOpportunitiesDiv1));
        attributeValue = $.getAttribute(element, "aria-controls");
        id = attributeValue;

        return id;
    }


    private String get$XAssociatedBusinessOpportunitiesDiv2Li(int num) {
        String xpath;
        String id = iAssociatedBusinessOpportunitiesDiv2;
        String n;
        if (num > 0) {
            n = "" + num;
        } else if (num == 0) {
            return "//div[@id='" + id + "']//li";
        } else if (num == -1) {
            n = "last()";
        } else {
            return "error, the num must be [-1,+∞)";
        }

        xpath = "//div[@id='" + id + "']";
        xpath = xpath + "//li[" + n + "]";


        return xpath;

    }


    private String get$dAssociatedBusinessOpportunitiesDiv2Li(int num) {
        String description = "证明材料-关联商机-候选第";
        if (num > 0) {
            description = description + num;
        } else if (num == 0) {
            return "证明材料-关联商机-所有候选项";
        } else if (num == -1) {
            description = description + "最后一";
        } else {
            return "error, the num must be [-1,+∞)";
        }
        description = description + "行";

        return description;

    }


    private String get$XQueryInput(String label) {
        //div[@tabindex]//label[1=1 and contains(text(),"客户柜台代码")]/../following-sibling::*[1]//input
        return commonObject.get$XQueryInput(label);
    }


    private String get$DQueryInput(String label) {
        return commonObject.get$DQueryInput(label).
                replaceFirst("通用", "证明材料");
    }

    private String get$XTableTrsSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(@style)][30]
        String xpath = commonObject.get$XTableTrsSibling(num);
        return xpath;
    }

    private String get$DTableTrsSibling(int num) {
        //证明材料-表格表体-第1行
        String description = commonObject.get$DTableTrsSibling(num);
        description = description.replaceFirst("通用", "证明材料");
        return description;
    }


    private String get$XTableTrsActionSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style][30]
        String xpath = commonObject.get$XTableTrsActionSibling(num);
        return xpath;
    }

    private String get$DTableTrsActionSibling(int num) {
        //证明材料-表格表体-第1行
        String description = commonObject.get$DTableTrsActionSibling(num);
        description = description.replaceFirst("通用", "证明材料");
        return description;
    }

    private String get$XTableTrsActionEditSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style][30]//a[text()='编辑']
        String xpath = get$XTableTrsActionSibling(num) + "[text()='编辑']";
        return xpath;
    }

    private String get$DTableTrsActionEditSibling(int num) {
        //证明材料-表格表体-第1行
        String description = commonObject.get$DTableTrsActionSibling(num);
        description = get$DTableTrsActionSibling(num) + "编辑";
        return description;
    }


    private String get$XTableTrsActionDeleteSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style][30]//a[text()='删除']
        String xpath = get$DTableTrsActionSibling(num) + "//a[text()='删除']";
        return xpath;
    }

    private String get$DTableTrsActionDeleteSibling(int num) {
        //证明材料-表格表体-第1行
        String description = commonObject.get$DTableTrsActionSibling(num);
        description = get$DTableTrsActionSibling(num) + "删除";
        return description;
    }


    public JSONObject get$QueryInputJson(String label) {
        JsonObject.setJsonObject(get$DQueryInput(label), get$XQueryInput(label));
        return JsonObject.getJsonObject();
    }


    public JSONObject get$TableTrsSiblingJson(int num) {
        JsonObject.setJsonObject(get$DTableTrsSibling(num), get$XTableTrsSibling(num));
        return JsonObject.getJsonObject();
    }


    public JSONObject get$TableTrsActionSiblingJson(int num) {
        JsonObject.setJsonObject(get$DTableTrsActionSibling(num), get$XTableTrsActionSibling(num));
        return JsonObject.getJsonObject();
    }


    public JSONObject get$TableTrsActionEditSiblingJson(int num) {
        JsonObject.setJsonObject(get$DTableTrsActionEditSibling(num), get$XTableTrsActionEditSibling(num));
        return JsonObject.getJsonObject();
    }

    public JSONObject get$TableTrsActionDeleteSiblingJson(int num) {
        JsonObject.setJsonObject(get$DTableTrsActionDeleteSibling(num), get$XTableTrsActionDeleteSibling(num));
        return JsonObject.getJsonObject();
    }

    public JSONObject get$AssociatedBusinessOpportunitiesDiv2LiJson(int num) {
        JsonObject.setJsonObject(get$dAssociatedBusinessOpportunitiesDiv2Li(num), get$XAssociatedBusinessOpportunitiesDiv2Li(num));
        return JsonObject.getJsonObject();
    }


//    public  JSONObject getJson(String description) {
//        switch (description) {
//            case d52:
//                JsonObject.setJsonObject(d52, x52);
//                break;
//            case d3:
//                JsonObject.setJsonObject(d3, x3);
//                break;
//            case d4:
//                JsonObject.setJsonObject(d4, x4);
//                break;
//            case d5:
//                JsonObject.setJsonObject(d5, x5);
//                break;
//            case d49:
//                JsonObject.setJsonObject(d49, x49);
//                break;
//            case d2:
//                JsonObject.setJsonObject(d2, x2);
//                break;
//            case d50:
//                JsonObject.setJsonObject(d50, x50);
//                break;
//            case d51:
//                JsonObject.setJsonObject(d51, x51);
//                break;
//            case d9:
//                JsonObject.setJsonObject(d9, x9);
//                break;
//            case d10:
//                JsonObject.setJsonObject(d10, x10);
//                break;
//            case d10Action:
//                JsonObject.setJsonObject(d10Action, x10Action);
//                break;
//            case d10ActionEdit:
//                JsonObject.setJsonObject(d10ActionEdit, x10ActionEdit);
//                break;
//            case d10ActionDelete:
//                JsonObject.setJsonObject(d10ActionDelete, x10ActionDelete);
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
//            case d49P:
//                JsonObject.setJsonObject(d49P, x49P);
//                break;
//            case d2P:
//                JsonObject.setJsonObject(d2P, x2P);
//                break;
//            case d53P:
//                JsonObject.setJsonObject(d53P, x53P);
//                break;
//            case d56P:
//                JsonObject.setJsonObject(d56P, x56P);
//                break;
//            case d50P:
//                JsonObject.setJsonObject(d50P, x50P);
//                break;
//            case d50PL1:
//                JsonObject.setJsonObject(d50PL1, x50PL1);
//                break;
//            case d50PL2:
//                JsonObject.setJsonObject(d50PL2, x50PL2);
//                break;
//            case d50PL3:
//                JsonObject.setJsonObject(d50PL3, x50PL3);
//                break;
//            case d54P:
//                JsonObject.setJsonObject(d54P, x54P);
//                break;
//            case d55P:
//                JsonObject.setJsonObject(d55P, x55P);
//                break;
//            case dUploadP:
//                JsonObject.setJsonObject(dUploadP, xUploadP);
//                break;
//            case d29P:
//                JsonObject.setJsonObject(d29P, x29P);
//                break;
//            case d30P:
//                JsonObject.setJsonObject(d30P, x30P);
//                break;
//            case d50PSpan:
//                JsonObject.setJsonObject(d50PSpan, x50PSpan);
//                break;
//            case dUploadPUploading:
//                JsonObject.setJsonObject(dUploadPUploading, xUploadPUploading);
//                break;
//            case dUploadPUploadingCorss:
//                JsonObject.setJsonObject(dUploadPUploadingCorss, xUploadPUploadingCorss);
//                break;
//            case dUploadPUploadDone:
//                JsonObject.setJsonObject(dUploadPUploadDone, xUploadPUploadDone);
//                break;
//            case dUploadPUploadDoneCorss:
//                JsonObject.setJsonObject(dUploadPUploadDoneCorss, xUploadPUploadDoneCorss);
//                break;
//            case dUploadPUploadError:
//                JsonObject.setJsonObject(dUploadPUploadError, xUploadPUploadError);
//                break;
//            case d56PDiv1:
//                JsonObject.setJsonObject(d56PDiv1, x56PDiv1);
//                break;
//            case d56PDiv2:
//                JsonObject.setJsonObject(d56PDiv2, "id", i56PDiv2);
//                break;
//            case dUploadPUploadDoneFile:
//                JsonObject.setJsonObject(dUploadPUploadDoneFile, xUploadPUploadDoneFile);
//                break;
//            case d48:
//                JsonObject.setJsonObject(d48, x48);
//                break;
//            case d56PDiv3:
//                JsonObject.setJsonObject(d56PDiv3, x56PDiv3);
//                break;
//            case d56PDiv1Cross:
//                JsonObject.setJsonObject(d56PDiv1Cross, x56PDiv1Cross);
//                break;
//        }
//
//        return JsonObject.getJsonObject();
//
//    }


}




















