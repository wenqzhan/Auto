package com.pageObject.matrix.orgCust;

import com.alibaba.fastjson.JSONObject;
import com.driver.$;
import com.pageObject.commonObject.CommonObject;
import com.pageObject.commonObject.CommonObjectPopped;
import com.pageObject.matrix.CustSelection;
import com.utils.json.Attr;
import com.utils.json.JsonObject;
import lombok.Data;
import org.openqa.selenium.WebElement;
@Data
public class Contract extends JsonObject {//证明材料

    public Contract(){
        CommonObject commonObject = new CommonObject();
        CommonObjectPopped commonObjectPopped = new CommonObjectPopped();
        CustSelection custSelection = new CustSelection();
//        YMDSelection ymdSelection = new YMDSelection("签署日期");
//        commonObject.getObjAttr();
//        commonObjectPopped.getObjAttr();
        custSelection.getObjAttr();
//        ymdSelection.getObjAttr();
    }

    private CommonObjectPopped commonObjectPopped = new CommonObjectPopped();
    private CommonObject commonObject = new CommonObject();
    
    private  String contract =
            "http://10.187.144.60:8080/orgcust/contract";

    private final  String d52 = "证明材料-上传证明材料-span";
    private final  String x52 = commonObject.getX52();
    //span[1=1 and contains(text(),"上传证明材料")]


    private final  String d3 = "证明材料-查询按钮-span";
    private final  String x3 = commonObject.getX3();
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"查询")]

    private final  String d4 = "证明材料-重置按钮-span";
    private final  String x4 = commonObject.getX4();
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]

    private final  String d5 = "证明材料-查询条件展开收起按钮-a";
    private final  String x5 = commonObject.getX5();
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]/../../a


    private final  String d49 = "证明材料-材料名称框-input";
    private final  String x49 = commonObject.getX49();
    //label[1=1 and contains(text(),"材料名称")]/../following-sibling::*[1]//input

    private final  String d2 = "证明材料-客户名称框-input";
    private final  String x2 = commonObject.getX2();
    //label[1=1 and contains(text(),"客户名称")]/../following-sibling::*[1]//input

    private final  String d50 = "证明材料-材料类型框-div";/////
    private final  String x50 = commonObject.getX50();
    //label[1=1 and contains(text(),"材料类型")]/../following-sibling::div[1]


    private final  String d51 = "证明材料-所属商机框-input";
    private final  String x51 = commonObject.getX51();
    //label[1=1 and contains(text(),"所属商机")]/../following-sibling::*[1]//input

    //////////////////////////////////
    private final  String d9 = "证明材料-表格-table";
    private final  String x9 = commonObject.getX9();
    //table[1=1 and contains(@class,'ant-table-fixed')]

    private final  String d10 = "证明材料-表格表体rows-tr";
    private final  String x10 = commonObject.getX10();
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not (contains(@style,'height'))] //不包含编辑那列,比如客户联系人,具体取决于样式

    private final  String d10Action = "证明材料-表格表体rows-tr-action(编辑,查看...)";
    private final  String x10Action = commonObject.getX10Action();
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]

    private final  String d10ActionEdit = "证明材料-表格表体rows-tr-action(编辑,查看...)-编辑-a";
    private final  String x10ActionEdit = x10Action + "//a[text()='编辑']";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]//a[text()='编辑']


    private final  String d10ActionDelete = "证明材料-表格表体rows-tr-action(编辑,查看...)-删除-a";
    private final  String x10ActionDelete = x10Action + "//a[text()='删除']";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]//a[text()='删除']

    private final  String d10Selected = "证明材料-表格表体rows-selected-tr";
    private final  String x10Selected = commonObject.getX10Selected();
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected')]

    private final  String d10NotSelected = "证明材料-表格表体rows-not selected-tr";
    private final  String x10NotSelected = commonObject.getX10NotSelected();
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected'))]

    private final  String d11Tr1 = "证明材料-表格表头row下的tr[1]/th col-th";
    private final  String x11Tr1 = commonObject.getX11Tr1();
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[not(@key='selection-column')]

    private final  String d31 = "证明材料-表格表头-多选框-th";
    private final  String x31 = commonObject.getX31();
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']


    private final  String d12 = "证明材料-表格下方翻页按钮-上一页-li";
    private final  String x12 = commonObject.getX12();
    //li[1=1 and contains(@title,'上一页')]

    private final  String d13 = "证明材料-表格下方翻页按钮-下一页-li";
    private final  String x13 = commonObject.getX13();
    //li[1=1 and contains(@title,'下一页')]

    private final  String d14 = "证明材料-表格下方翻页按钮-下一页前的按钮,可以看出共多少页-a";
    private final  String x14 = commonObject.getX14();
    //li[1=1 and contains(@title,'下一页')]/preceding-sibling::li[1]/a

    private final  String d15 = "证明材料-表格下方跳页输入框-input";
    private final  String x15 = commonObject.getX15();
    //div[1=1 and contains(text(),"跳至")]/input

    private final  String d16 = "证明材料-表格下方跳页输入框左边的跳至两个字-div";
    private final  String x16 = commonObject.getX16();
    //div[1=1 and contains(text(),"跳至")]

    private final  String d17 = "证明材料-数据加载(转菊花)-span";
    private final  String x17 = commonObject.getX17();
    //span[1=1 and contains(@class,'ant-spin-dot')]

    private final  String d18 = "证明材料-条/页-div";
    private final  String x18 = commonObject.getX18();
    //div[1=1 and contains(@title,'条/页')]

    private final  String d18L5 = "证明材料-条/页-5 条/页-li";
    private final  String x18L5 = commonObject.getX18L5();
    //li[1=1 and text()='5 条/页' ]

    private final  String d18L10 = "证明材料-条/页-10 条/页-li";
    private final  String x18L10 = commonObject.getX18L10();
    //li[1=1 and text()='10 条/页' ]

    private final  String d18L20 = "证明材料-条/页-20 条/页-li";
    private final  String x18L20 = commonObject.getX18L20();
    //li[1=1 and text()='20 条/页' ]

    private final  String d18L30 = "证明材料-条/页-30 条/页-li";
    private final  String x18L30 = commonObject.getX18L30();
    //li[1=1 and text()='30 条/页' ]

    private final  String d28 = "证明材料-表头多选框-input";
    private final  String x28 = commonObject.getX28();
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']//input

    /////////////////////////////////

    private final  String d49P = commonObjectPopped.getD49P().replaceFirst("通用","证明材料");
    private final  String x49P = commonObjectPopped.getX49P();
    //div[@tabindex]//label[1=1 and contains(text(),"材料名称")]/../following-sibling::*[1]//input

    private final  String d2P = commonObjectPopped.getD2P().replaceFirst("通用","证明材料");
    private final  String x2P = commonObjectPopped.getX2P();
    //div[@tabindex]//label[1=1 and contains(text(),"客户名称")]/../following-sibling::*[1]//input

    private final  String d53P = commonObjectPopped.getD53P().replaceFirst("通用","证明材料");
    private final  String x53P = commonObjectPopped.getX53P();
    //div[@tabindex]//label[1=1 and contains(text(),"联系人")]/../following-sibling::*[1]//input

    private final  String d56P = commonObjectPopped.getD56P().replaceFirst("通用","证明材料");
    private final  String x56P = commonObjectPopped.getX56P();
    //div[@tabindex]//label[1=1 and contains(text(),"关联商机")]/../following-sibling::*[1]//input

    private final  String d56PDiv1 = "证明材料-first popped-关联商机框-div-用来获取下拉框的id";
    private final  String x56PDiv1 = x56P.replaceFirst("input", "div[@aria-controls]");
    //div[@tabindex]//label[1=1 and contains(text(),"关联商机")]/../following-sibling::*[1]//div[@aria-controls]

    private final  String d56PDiv1Cross = commonObjectPopped.getD56P().replaceFirst("通用","证明材料");
    private final  String x56PDiv1Cross =commonObjectPopped.getX56P();
    //div[@tabindex]//label[1=1 and contains(text(),"关联商机")]/../following-sibling::*[1]//div[@aria-controls]//i[1=1 and contains(@class,'close-circle')]


    private final  String d56PDiv3 = "证明材料-first popped-关联商机框-div-用来获取已选中商机的文本";
    private final  String x56PDiv3 = x56PDiv1 +"//div[@title]";
    //div[@tabindex]//label[1=1 and contains(text(),"关联商机")]/../following-sibling::*[1]//div[@aria-controls]//div[@title]


    private final  String d56PDiv2 = "证明材料-first popped-关联商机框-下的框div";
    private  String i56PDiv2 = "";

    public  void setI56PDiv2(){
        i56PDiv2 = getBizOpportunityID();
        Attr.setAttr("i56PDiv2",i56PDiv2);
    }

    private final  String d50P = commonObjectPopped.getD50P().replaceFirst("通用","证明材料");
    private final  String x50P = commonObjectPopped.getX50P();
    //div[@tabindex]//label[1=1 and contains(text(),"材料类型")]/../following-sibling::div[1]

    private final  String d50PSpan = "证明材料-first popped-材料类型框-div-span";/////
    private final  String x50PSpan = x50P + "//div[contains(@class,\"selected\")]/span";
    //div[@tabindex]//label[1=1 and contains(text(),"材料类型")]/../following-sibling::div[1]]//div[contains(@class,"selected")]/span


    private final  String d50PL1 = commonObjectPopped.getD50PL1().replaceFirst("通用","证明材料");
    private final  String x50PL1 = commonObjectPopped.getX50PL1();
    //div[@tabindex]//li/span[1=1 and @title='专项战略合作协议' ]

    private final  String d50PL2 = commonObjectPopped.getD50PL2().replaceFirst("通用","证明材料");
    private final  String x50PL2 = commonObjectPopped.getX50PL2();
    //div[@tabindex]//li/span[1=1 and @title='专项战略合作协议' ]

    private final  String d50PL3 = commonObjectPopped.getD50PL3().replaceFirst("通用","证明材料");
    private final  String x50PL3 = commonObjectPopped.getX50PL3();
    //div[@tabindex]//li/span[1=1 and @title='业务协议' ]

    private final  String d54P = commonObjectPopped.getD54P().replaceFirst("通用","证明材料");
    private final  String x54P = commonObjectPopped.getX54P();
    //div[@tabindex]//label[1=1 and contains(text(),"签署日期")]/../following-sibling::*[1]//input

    private final  String d55P = commonObjectPopped.getD55P().replaceFirst("通用","证明材料");
    private final  String x55P = commonObjectPopped.getX55P();
    //div[@tabindex]//label[1=1 and contains(text(),"合同金额(万元)")]/../following-sibling::*[1]//input

    private final  String dUploadP = commonObjectPopped.getDUploadP().replaceFirst("通用","证明材料");
    private final  String xUploadP = commonObjectPopped.getXUploadP();
    //div[@tabindex]//p[text()='点击或将文件拖拽到这里上传']


    private final  String d29P = commonObjectPopped.getD29P().replaceFirst("通用","证明材料");
    private final  String x29P = commonObjectPopped.getX29P();
    //div[@tabindex]//span[1=1 and contains(text(),"确 定")]

    private final  String d30P = commonObjectPopped.getD30P().replaceFirst("通用","证明材料");
    private final  String x30P = commonObjectPopped.getX30P();
    //div[@tabindex]//span[1=1 and contains(text(),"关 闭")]


    private final  String dUploadPUploading = "证明材料-first popped-上传文件-上传中-span";
    private final  String xUploadPUploading = "//div[contains(@class,\"item-uploading\")]";


    private final  String dUploadPUploadingCorss = "证明材料-first popped-上传文件-上传中-删除-i";
    private final  String xUploadPUploadingCorss =commonObjectPopped.getCross(xUploadPUploading);
    //div[contains(@class,"item-done")]//i[1=1 and contains(@class,'close-circle') or contains(@class,'anticon-close')]


    private final  String dUploadPUploadDone = "证明材料-first popped-上传文件-上传成功-span";
    private final  String xUploadPUploadDone = "//div[contains(@class,\"item-done\")]";


    private final  String dUploadPUploadDoneCorss = "证明材料-first popped-上传文件-上传成功-删除-i";
    private final  String xUploadPUploadDoneCorss =commonObjectPopped.getCross(xUploadPUploadDone);
    //div[contains(@class,"item-done")]//i[1=1 and contains(@class,'close-circle') or contains(@class,'anticon-close')]

    private final  String dUploadPUploadDoneFile = "证明材料-first popped-上传文件-上传成功的文件-span";
    private final  String xUploadPUploadDoneFile = "//div[contains(@class,\"item-done\")]";


    private final  String dUploadPUploadError = "证明材料-first popped-上传文件-上传失败-span";
    private final  String xUploadPUploadError = "//div[contains(@class,\"item-error\")]";


    private final  String d81Final = "证明材料-添加/修改-成功系统提示信息";
    private final  String x81Final = commonObject.getX81Final();
    //div[@class='ant-message-success']


    private  String getBizOpportunityID() {
        String attributeValue;
        String id;

        WebElement element =$.findElement(getJsonObject(d56PDiv1));
        attributeValue= $.getAttribute(element,"aria-controls");
        id = attributeValue;

        return id;
    }


    private  String get$X56Div2Li(int num) {
        String xpath;
        String id = i56PDiv2;
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


    private  String get$d56Div2Li(int num) {
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


    private  String get$XPQueryInput(String label) {
        //div[@tabindex]//label[1=1 and contains(text(),"客户柜台代码")]/../following-sibling::*[1]//input
        return commonObjectPopped.get$XPQueryInput(label);
    }


    private  String get$DPQueryInput(String label) {
        return commonObjectPopped.get$DPQueryInput(label).
                replaceFirst("通用", "证明材料");
    }

    private  String get$X10Sibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(@style)][30]
        String xpath = commonObject.get$X10Sibling(num);
        return xpath;
    }

    private  String get$D10Sibling(int num) {
        //证明材料-表格表体-第1行
        String description = commonObject.get$D10Sibling(num);
        description = description.replaceFirst("通用", "证明材料");
        return description;
    }


    private  String get$X10ActionSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style][30]
        String xpath = commonObject.get$X10ActionSibling(num);
        return xpath;
    }

    private  String get$D10ActionSibling(int num) {
        //证明材料-表格表体-第1行
        String description = commonObject.get$D10ActionSibling(num);
        description = description.replaceFirst("通用", "证明材料");
        return description;
    }

    private  String get$X10ActionEditSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style][30]//a[text()='编辑']
        String xpath = get$X10ActionSibling(num) + "[text()='编辑']";
        return xpath;
    }

    private  String get$D10ActionEditSibling(int num) {
        //证明材料-表格表体-第1行
        String description = commonObject.get$D10ActionSibling(num);
        description = get$D10ActionSibling(num) + "编辑";
        return description;
    }


    private  String get$X10ActionDeleteSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style][30]//a[text()='删除']
        String xpath = get$D10ActionSibling(num) + "//a[text()='删除']";
        return xpath;
    }

    private  String get$D10ActionDeleteSibling(int num) {
        //证明材料-表格表体-第1行
        String description = commonObject.get$D10ActionSibling(num);
        description = get$D10ActionSibling(num) + "删除";
        return description;
    }


    public  JSONObject get$PQueryInputJson(String label) {
        JsonObject.setJsonObject(get$DPQueryInput(label), get$XPQueryInput(label));
        return JsonObject.getJsonObject();
    }


    public  JSONObject get$10SiblingJson(int num) {
        JsonObject.setJsonObject(get$D10Sibling(num), get$X10Sibling(num));
        return JsonObject.getJsonObject();
    }


    public  JSONObject get$10ActionSiblingJson(int num) {
        JsonObject.setJsonObject(get$D10ActionSibling(num), get$X10ActionSibling(num));
        return JsonObject.getJsonObject();
    }


    public  JSONObject get$10ActionEditSiblingJson(int num) {
        JsonObject.setJsonObject(get$D10ActionEditSibling(num), get$X10ActionEditSibling(num));
        return JsonObject.getJsonObject();
    }

    public  JSONObject get$10ActionDeleteSiblingJson(int num) {
        JsonObject.setJsonObject(get$D10ActionDeleteSibling(num), get$X10ActionDeleteSibling(num));
        return JsonObject.getJsonObject();
    }

    public  JSONObject get$56Div2LiJson(int num) {
        JsonObject.setJsonObject(get$d56Div2Li(num), get$X56Div2Li(num));
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




















