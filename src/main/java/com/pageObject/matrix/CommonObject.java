package com.pageObject.matrix;

import com.utils.json.JsonObject;
import lombok.Data;

@Data
public class CommonObject extends JsonObject {

    public CommonObject() {
        setDesPrefix("");
        super.setPrefix("");
        setConVal("");
    }

    public CommonObject(String label) {
        setDesPrefix(label);
        setPrefix(label);
        setConVal(label);
    }

    public void setPrefix(String label) {
        if (label.toLowerCase().contains("popped")) {
            super.setPrefix(getPoppedPrefix());
        }
    }


    private String search = "/following-sibling::*//i[1=1 and contains(@class,'')]";

    private String cross = "//i[1=1 and contains(@class,'close-circle') or contains(@class,'anticon-close')]";

    private String arrow = "//i[1=1 and contains(@class,'arrow')]";

    private String radio = "/preceding-sibling::span";

    private String render = "//div[contains(@class,\"rendered\")]//span";

    private String picker = "//span[contains(@class,\"ant-cascader-picker-label\")]";

    private String dOAAccountInput = "通用-OA账号框-input";
    private String xOAAccountInput = get$XInput("OA账号");
    //1 //label[1=1 and contains(text(),"OA账号")]/../following-sibling::*[1]//input

    private String dCustNameInput = "通用-客户名称框-input";
    private String xCustNameInput = get$XInput("客户名称");
    //2 //label[1=1 and contains(text(),"客户名称")]/../following-sibling::*[1]//input

    private String dCustNameInputSearch = "通用-客户名称框-input-search按钮-i";
    private String xCustNameInputSearch = getSearch(getXCustNameInput());
    //label[1=1 and contains(text(),"客户名称")]/../following-sibling::*[1]//input/following-sibling::*//i[1=1 and contains(@class,'')]

    private String dCustCounterCodeInput = "通用-客户柜台代码框-input";
    private String xCustCounterCodeInput = get$XInput("客户柜台代码");
    //label[1=1 and contains(text(),"客户柜台代码")]/../following-sibling::*[1]//input

    private String dAccountNameInput = "通用-账户名称框-input";
    private String xAccountNameInput = get$XInput("账户名称");
    //label[1=1 and contains(text(),"账户名称")]/../following-sibling::*[1]//input

    private String dFundAccountInput = "通用-资金账号框-input";
    private String xFundAccountInput = get$XInput("资金账号");
    //label[1=1 and contains(text(),"资金账号")]/../following-sibling::*[1]//input

    private String dAccountTypeDiv = "通用-账户类型框-div";/////
    private String xAccountTypeDiv = get$XDiv("账户类型");/////
    //label[1=1 and contains(text(),"账户类型")]/../following-sibling::div[1]

    private String dOrgBlongedInput = "通用-归属机构框-input";
    private String xOrgBlongedInput = get$XInput("归属机构");
    //label[1=1 and contains(text(),"归属机构")]/../following-sibling::*[1]//input

    private String dDevelopmentTypeDiv = "通用-开发类型框-div";/////
    private String xDevelopmentTypeDiv = get$XDiv("开发类型");/////
    //label[1=1 and contains(text(),"开发类型")]/../following-sibling::div[1]

    private String dBrokerageTypeDiv = "通用-经纪业务关系类型框-div";////
    private String xBrokerageTypeDiv = get$XDiv("经纪业务关系类型");////
    //label[1=1 and contains(text(),"经纪业务关系类型")]/../following-sibling::div[1]

    private String dRegisterInput = "通用-登记人框-input";
    private String xRegisterInput = get$XInput("登记人");
    //label[1=1 and contains(text(),"登记人")]/../following-sibling::*[1]//input

    private String dCustManagerInput = "通用-客户经理框-input";
    //通用-客户经理框-input
    private String xCustManagerInput = get$XInput("客户经理");
    //label[1=1 and contains(text(),"客户经理")]/../following-sibling::*[1]//input

    private String dBusinessLineInput = "通用-业务条线框-input";
    private String xBusinessLineInput = get$XInput("业务条线");
    //label[1=1 and contains(text(),"业务条线")]/../following-sibling::*[1]//input

    private String dBusinessLineInputCrossI = dBusinessLineInput + "-大×";
    private String xBusinessLineInputCrossI = xBusinessLineInput + "/.." + getCross();
    //label[1=1 and contains(text(),"业务条线")]/../following-sibling::*[1]//input/..//i[1=1 and contains(@class,'close-circle')]


    private String dContactNameInput = "通用-联系人姓名框-input";
    private String xContactNameInput = get$XInput("联系人姓名");
    //label[1=1 and contains(text(),"联系人姓名")]/../following-sibling::*[1]//input

    private String dMobileInput = "通用-手机框-input";
    private String xMobileInput = get$XInput("手机");
    //label[1=1 and contains(text(),"手机")]/../following-sibling::*[1]//input

    private String dDepartmentInput = "通用-部门框-input";
    private String xDepartmentInput = get$XInput("部门");
    //label[1=1 and contains(text(),"部门")]/../following-sibling::*[1]//input


    private String dFaxInput = "通用-FAX框-input";
    private String xFaxInput = get$XInput("FAX");
    //label[1=1 and contains(text(),"FAX")]/../following-sibling::*[1]//input

    private String dEmailInput = "通用-邮箱框-input";
    private String xEmailInput = get$XInput("邮箱");
    //label[1=1 and contains(text(),"邮箱")]/../following-sibling::*[1]//input

    private String dCustAbbInput = "通用-客户简称框-input";
    private String xCustAbbInput = get$XInput("客户简称");
    //label[1=1 and contains(text(),"客户简称")]/../following-sibling::*[1]//input

    private String dPositionInput = "通用-职务框-input";
    private String xPositionInput = get$XInput("职务");
    //label[1=1 and contains(text(),"职务")]/../following-sibling::*[1]//input


    private String dTelInput = "通用-座机框-input";
    private String xTelInput = get$XInput("座机");
    //label[1=1 and contains(text(),"座机")]/../following-sibling::*[1]//input

    private String dCreatorInput = "通用-创建人框-input";
    private String xCreatorInput = get$XInput("创建人");
    //label[1=1 and contains(text(),"创建人")]/../following-sibling::*[1]//input

    private String dOfficeAddressInput = "通用-办公地址框-input";
    private String xOfficeAddressInput = get$XInput("办公地址");
    //label[1=1 and contains(text(),"办公地址")]/../following-sibling::*[1]//input


    private String dGTJAContactInput = "通用-国君服务联系人框-input";
    private String xGTJAContactInput = get$XInput("国君服务联系人");
    //label[1=1 and contains(text(),"国君服务联系人")]/../following-sibling::*[1]//input

    private String dMaterialNameInput = "通用-材料名称框-input";
    private String xMaterialNameInput = get$XInput("材料名称");
    //label[1=1 and contains(text(),"材料名称")]/../following-sibling::*[1]//input

    private String dMaterialTypeDiv = "通用-材料类型框-div";/////
    private String xMaterialTypeDiv = get$XDiv("材料类型");/////
    //label[1=1 and contains(text(),"材料类型")]/../following-sibling::div[1]


    private String dMaterialTypeSpecialStrategicCooperationAgreementSpan = "通用-first popped-材料类型框-专项战略合作协议-span";
    private String xMaterialTypeSpecialStrategicCooperationAgreementSpan = get$XLiSpan("专项战略合作协议");
    //li/span[1=1 and @title='专项战略合作协议' ]

    private String dMaterialTypeComprehensiveStrategicCooperationAgreement = "通用-first popped-材料类型框-全面战略合作协议-span";
    private String xMaterialTypeComprehensiveStrategicCooperationAgreement = get$XLiSpan("全面战略合作协议");
    //li/span[1=1 and @title='全面战略合作协议' ]

    private String dMaterialTypeBusinessAgreement = "通用-first popped-材料类型框-业务协议-span";
    private String xMaterialTypeBusinessAgreement = get$XLiSpan("业务协议");
    //li/span[1=1 and @title='业务协议' ]

    private String dMaterialTypeDivSpan = "通用-材料类型框-div-span";/////
    private String xMaterialTypeDivSpan = xMaterialTypeDiv + "//div[contains(@class,\"selected\")]/span";
    //div[@tabindex]//label[1=1 and contains(text(),"材料类型")]/../following-sibling::div[1]//div[contains(@class,"selected")]/span

    private String dBusinessOpportunityBelongedInput = "通用-所属商机框-input";
    private String xBusinessOpportunityBelongedInput = get$XInput("所属商机");
    //label[1=1 and contains(text(),"所属商机")]/../following-sibling::*[1]//input

    private String dContactsInput = "通用-联系人框-input";
    private String xContactsInput = get$XInput("联系人");
    //label[1=1 and contains(text(),"联系人")]/../following-sibling::*[1]//input

    private String dContractSignedDateInput = "通用-签署日期框-input";
    private String xContractSignedDateInput = get$XInput("签署日期");
    //label[1=1 and contains(text(),"签署日期")]/../following-sibling::*[1]//input

    private String dContractAmountInTenThousandsInput = "通用-合同金额(万元)框-input";
    private String xContractAmountInTenThousandsInput = get$XInput("合同金额(万元)");
    //label[1=1 and contains(text(),"合同金额(万元)")]/../following-sibling::*[1]//input


    private String dAssociatedBusinessOpportunities = "通用-关联商机框-input";
    private String xAssociatedBusinessOpportunities = get$XInput("关联商机");
    //label[1=1 and contains(text(),"合同金额(万元)")]/../following-sibling::*[1]//input

    private String dAssociatedBusinessOpportunitiesDiv1 = "通用-关联商机框-div-用来获取下拉框的id";
    private String xAssociatedBusinessOpportunitiesDiv1 = xAssociatedBusinessOpportunities.replaceFirst("input", "div[@aria-controls]");
    //div[@tabindex]//label[1=1 and contains(text(),"关联商机")]/../following-sibling::*[1]//div[@aria-controls]

    private String dAssociatedBusinessOpportunitiesDiv1Cross = getDAssociatedBusinessOpportunitiesDiv1() + "cross";
    private String xAssociatedBusinessOpportunitiesDiv1Cross = getXAssociatedBusinessOpportunitiesDiv1() + getCross();
    //div[@tabindex]//label[1=1 and contains(text(),"关联商机")]/../following-sibling::*[1]//div[@aria-controls]//i[1=1 and contains(@class,'close-circle')]

    private String dAssociatedBusinessOpportunitiesDiv3 = "通用-first popped-关联商机框-div-用来获取已选中商机的文本";
    private String xAssociatedBusinessOpportunitiesDiv3 = xAssociatedBusinessOpportunitiesDiv1 + "//div[@title]";
    //div[@tabindex]//label[1=1 and contains(text(),"关联商机")]/../following-sibling::*[1]//div[@aria-controls]//div[@title]

    private String dTitleInput = "通用-标题框-input";
    private String xTitleInput = get$XInput("标题");
    //label[1=1 and contains(text(),"标题")]/../following-sibling::*[1]//input


    private String dClassificationDiv = "通用-分类框-div";////
    private String xClassificationDiv = get$XDiv("分类");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]

    private String dClassificationDivRendered = "通用-分类框-div-rendered-span";
    private String xClassificationDivRendered = xClassificationDiv + "//div[contains(@class,\"rendered\")]//span";


    private String dClassificationDivApplicationCasesSpan = "通用-分类框-应用案例-span";////
    private String xClassificationDivApplicationCasesSpan = get$XSpanByTitle("应用案例");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='应用案例']

    private String dClassificationDivInstitutionsAnnouncementSpan = "通用-分类框-制度公告-span";////
    private String xClassificationDivInstitutionsAnnouncementSpan = get$XSpanByTitle("制度公告");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='制度公告']

    private String dClassificationDivSystemIntroductionSpan = "通用-分类框-系统介绍-span";////
    private String xClassificationDivSystemIntroductionSpan = get$XSpanByTitle("系统介绍");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='系统介绍']

    private String dClassificationDivVocationalStudySpan = "通用-分类框-业务学习-span";////
    private String xClassificationDivVocationalStudySpan = get$XSpanByTitle("业务学习");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='业务学习']

    private String dClassificationDivFAQSpan = "通用-分类框-常见问答-span";////
    private String xClassificationDivFAQSpan = get$XSpanByTitle("常见问答");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='常见问答']

    private String dClassificationDivMustReadTodaySpan = "通用-分类框-今日必读-span";////
    private String xClassificationDivMustReadTodaySpan = get$XSpanByTitle("今日必读");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='今日必读']

    private String dClassificationDivServiceProductsSpan = "通用-分类框-服务产品-span";////
    private String xClassificationDivServiceProductsSpan = get$XSpanByTitle("服务产品");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='服务产品']

    private String dClassificationDivDataServiceSpan = "通用-分类框-数据服务-span";////
    private String xClassificationDivDataServiceSpan = get$XSpanByTitle("数据服务");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='数据服务']

    private String dClassificationDivIndustryAnalysisSpan = "通用-分类框-行业分析-span";////
    private String xClassificationDivIndustryAnalysisSpan = get$XSpanByTitle("行业分析");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='行业分析']

    private String dClassificationDivMarketingPlatformSpan = "通用-分类框-营销平台-span";////
    private String xClassificationDivMarketingPlatformSpan = get$XSpanByTitle("营销平台");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='营销平台']

    private String dClassificationDivBizOrgSpan = "通用-分类框-企业机构-span";////
    private String xClassificationDivBizOrgSpan = get$XSpanByTitle("企业机构");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='企业机构']

    private String dClassificationDivMarketDynamicsSpan = "通用-分类框-市场动态-span";////
    private String xClassificationDivMarketDynamicsSpan = get$XSpanByTitle("市场动态");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='市场动态']

    private String dClassificationDivResearchAnalysisSpan = "通用-分类框-研究分析-span";////
    private String xClassificationDivResearchAnalysisSpan = get$XSpanByTitle("研究分析");////
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[1=1 and @title='研究分析']


    ///-----------------------////

    private String dQueryButtonSpan = "通用-查询按钮(query)-span";
    private String xQueryButtonSpan = "//button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),\"查询\")]";
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"查询")]

    private String dResetConditionsButtonSpan = "通用-重置按钮-span";
    private String xResetConditionsButtonSpan = "//button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),\"重置\")]";
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]

    private String dUnfoldFoldButtonSpan = "通用-查询条件展开收起按钮-a";
    private String xUnfoldFoldButtonSpan = "//button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),\"重置\")]/../../a";
    //button[1=1 and contains(@type,'button') and contains(@class,'ant-btn ant-btn-primary')]//span[1=1 and contains(text(),"重置")]/../../a

    private String dExportButtonSpan = "通用-导出按钮-span";
    private String xExportButtonSpan = "//span[1=1 and contains(text(),\"导出\")]";
    //span[1=1 and contains(text(),"导出")]

    private String dNewButtonSpan = "通用-新增按钮-span";
    private String xNewButtonSpan = "//span[1=1 and contains(text(),\"新增\")]";
    //35 //span[1=1 and contains(text(),"新增")]

    private String dGrantVintexPermissionSpan = "通用-开通道合按钮-span";
    private String xGrantVintexPermissionSpan = "//span[1=1 and contains(text(),\"开通道合\")]";
    //span[1=1 and contains(text(),"开通道合")]

    private String dUploadSupportingMaterialsButtonSpan = "通用-上传证明材料-span";
    private String xUploadSupportingMaterialsButtonSpan = "//span[1=1 and contains(text(),\"上传证明材料\")]";
    //span[1=1 and contains(text(),"上传证明材料")]

    private String d7 = "通用-报表导出确认按钮-span";
    private String x7 = "//span[1=1 and contains(text(),\"确认\")]";
    //span[1=1 and contains(text(),"确认")]

    private String d8 = "通用-报表导出文件名输入框-input";
    private String x8 = "//div[1=1 and contains(text(),\"文件名\")]/..//input";
    //div[1=1 and contains(text(),"文件名")]/..//input
//////////////////////////////////
    private String dTableTable = "通用-表格-table";
    private String xTableTable = "//table[1=1 and contains(@class,'ant-table-fixed')]";
    //table[1=1 and contains(@class,'ant-table-fixed')]

    private String dTableTrs = "通用-表格表体rows-tr";
    private String xTableTrs = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not (contains(@style,'height'))]";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not (contains(@style,'height'))]
    // 不包含编辑那列,比如客户联系人,具体取决于样式

    private String dTableActionTrs = "通用-表格表体rows-tr-action(编辑,查看...)";
    private String xTableActionTrs = "//table[1=1 and contains(@class,'ant-table-fixed') and @style]//tr[@data-row-key]";
    //table[1=1 and contains(@class,'ant-table-fixed') and @style]//tr[@data-row-key]

    private String dTableTrsActionDetails = "通用-表格表体rows-tr-action(详情,更多...)-详情-a";
    private String xTableTrsActionDetails = xTableActionTrs + "//a[text()='详情']";
    //table[1=1 and contains(@class,'ant-table-fixed')  and @style]//tr[@data-row-key]//a[text()='详情']

    private String dTableActionEditsAs = "通用-表格表体rows-tr-action(详情,更多...)-编辑-a";
    private String xTableActionEditsAs = xTableActionTrs + "//a[text()='编辑']";
    //table[1=1 and contains(@class,'ant-table-fixed')  and @style]//tr[@data-row-key]//a[text()='编辑']

    private String dTableTrsActionMore = "通用-表格表体rows-tr-action(详情,更多...)-更多-a";
    //"信息发布-表格表体rows-tr-action(详情,更多...)-更多-a";
    private String xTableTrsActionMore = xTableTrsActionDetails + "/following-sibling::a[1]";
    //table[1=1 and contains(@class,'ant-table-fixed')  and @style]//tr[@data-row-key]//a[text()='详情']/following-sibling::a[1]

    private String dTableTrsActionDeleteAs = "证明材料-表格表体rows-tr-action(编辑,查看...)-删除-a";
    private String xTableTrsActionDeleteAs = xTableActionTrs + "//a[text()='删除']";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and @style]//a[text()='删除']

    private String dTableTrsActionMoreEdits = "通用-表格表体rows-selected-tr";
    ;
    // "信息发布-表格表体rows-selected-tr";
    private String xTableTrsActionMoreEdits = "//a[text()='编辑']";
    //a[text()='编辑']这个需要进一步处理,定位最后一个


    private String dTableTrsActionMoreDeletes = "通用-表格表体rows-selected-tr";
    // "信息发布-表格表体rows-selected-tr";
    private String xTableTrsActionMoreDeletes = "//a[text()='删除']";
    //a[text()='删除'] 这个需要进一步处理,定位最后一个

    private String dTableTrsSelectedTrs = "通用-表格表体rows-selected-tr";
    private String xTableTrsSelectedTrs = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected') and not(@style)]";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and contains(@class,'selected') and not(@style)]

    private String dTableTrsNotSelectedTrs = "通用-表格表体rows-not selected-tr";
    private String xTableTrsNotSelectedTrs = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected')) and not(@style)]";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(contains(@class,'selected')) and not(@style)]

    private String d11 = "通用-表格表头(可能有多表头)-tr";
    private String x11 = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]

    private String d11Tmp = "临时";
    private String x11Tmp = "//div[contains(@class,'-active')]//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[not(@key='selection-column') and not(@key='action')]/..";

    private String dTableHeaderTr1Ths = "通用-表格表头row下的tr[1]/th col-th";
    private String xTableHeaderTr1Ths = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)][1]//th[not(@key='selection-column') and not(@key='action')]";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)][1]//th[not(@key='selection-column') and not(@key='action')]

    private String d11Tr2 = "通用-表格表头row下的tr[2]/th col-th";
    private String x11Tr2 = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)][2]//th[not(@key='selection-column') and not(@key='action')]";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)][1]//th[not(@key='selection-column') and not(@key='action')]


    private String dTableHeaderMultiCheckboxTh = "通用-表格表头-多选框-th";
    private String xTableHeaderMultiCheckboxTh = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']


    private String dTableLastPageButtonLi = "通用-表格下方翻页按钮-上一页-li";
    private String xTableLastPageButtonLi = "//li[1=1 and contains(@title,'上一页')]";
    //li[1=1 and contains(@title,'上一页')]

    private String dTableNextPageButtonLi = "通用-表格下方翻页按钮-下一页-li";
    private String xTableNextPageButtonLi = "//li[1=1 and contains(@title,'下一页')]";
    //li[1=1 and contains(@title,'下一页')]

    private String dMaxPageButtonA = "通用-表格下方翻页按钮-下一页前的按钮,可以看出共多少页-a";
    private String xMaxPageButtonA = "//li[1=1 and contains(@title,'下一页')]/preceding-sibling::li[1]/a";
    //li[1=1 and contains(@title,'下一页')]/preceding-sibling::li[1]/a

    private String dTableJumpToInput = "通用-表格下方跳页输入框-input";
    private String xTableJumpToInput = "//div[1=1 and contains(text(),\"跳至\")]/input";
    //div[1=1 and contains(text(),"跳至")]/input

    private String dTableJumpDiv = "通用-表格下方跳页输入框左边的跳至两个字-div";
    private String xTableJumpDiv = "//div[1=1 and contains(text(),\"跳至\")]";
    //div[1=1 and contains(text(),"跳至")]

    private String dTableLoadingSignSpan = "通用-数据加载(转菊花)-span";
    private String xTableLoadingSignSpan = "//span[1=1 and contains(@class,'ant-spin-dot')]";
    //span[1=1 and contains(@class,'ant-spin-dot')]

    private String dTableLinesPerPageDiv = "通用-条/页-div";
    private String xTableLinesPerPageDiv = "//div[1=1 and contains(@title,'条/页')]";
    //div[1=1 and contains(@title,'条/页')]

    private String dTableFiveLinesPerPageLi = "通用-条/页-5 条/页-li";
    private String xTableFiveLinesPerPageLi = "//li[1=1 and text()='5 条/页' ]";
    //li[1=1 and text()='5 条/页' ]

    private String dTableTenLinesPerPageLi = "通用-条/页-10 条/页-li";
    private String xTableTenLinesPerPageLi = "//li[1=1 and text()='10 条/页' ]";
    //li[1=1 and text()='10 条/页' ]

    private String dTableTwentyLinesPerPageLi = "通用-条/页-20 条/页-li";
    private String xTableTwentyLinesPerPageLi = "//li[1=1 and text()='20 条/页' ]";
    //li[1=1 and text()='20 条/页' ]

    private String dTableThirtyLinesPerPageLi = "通用-条/页-30 条/页-li";
    private String xTableThirtyLinesPerPageLi = "//li[1=1 and text()='30 条/页' ]";
    //li[1=1 and text()='30 条/页' ]

    private String dTableHeaderMultiCheckboxInput = "通用-表头多选框-input";
    private String xTableHeaderMultiCheckboxInput = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']//input";
    //table[1=1 and contains(@class,'ant-table-fixed')]//tr[not(@data-row-key)]//th[@key='selection-column']//input

    private String dTotalCounts = "通用-共XXX条-i";
    //共 521 条
    private String xTotalCounts = "//li[@class='ant-pagination-total-text']";
    /////////////////////////////////
    private String dConfirmButtonSpan = "通用-确定按钮-span";
    private String xConfirmButtonSpan = get$XSpan("确 定");
    //span[1=1 and contains(text(),"确 定")]

    private String dCloseButtonSpan = "通用-关闭按钮-span";
    private String xCloseButtonSpan = get$XSpan("关 闭");
    //span[1=1 and contains(text(),"关 闭")]

    private String dSearchButtonSpan = "通用-查询按钮-span";
    private String xSearchButtonSpan = get$XSpan("查询");
    //span[1=1 and contains(text(),"查询")]

    private String dResetButtonSpan = "通用-重置按钮-span";
    private String xResetButtonSpan = get$XSpan("重置");
    //span[1=1 and contains(text(),"重置")]

    private String dCancelButtonSpan = "通用-取消-span";
    private String xCancelButtonSpan = get$XSpan("取 消");
    //span[1=1 and contains(text(),"取 消")]

    private String dQueryInput = "通用-输入查询框-input";
    private String xQueryInput = "//input[1=1 and contains(@placeholder,'输入查询')]";
    //input[1=1 and contains(@placeholder,'输入查询')]

    private String dUserQueryInput = "通用-用户名查询框-input";
    private String xUserQueryInput = "//input[1=1 and contains(@placeholder,'输入用户名')]";
    //input[1=1 and contains(@placeholder,'输入用户名')]


    private String dSaveButtonSpan = "通用-保存按钮-span";
    private String xSaveButtonSpan = get$XSpan("保存");
    //60 //span[1=1 and contains(text(),"保存")]

    private String dPreviewButton = "通用-预览按钮-span";
    private String xPreviewButton = get$XSpan("预览");
    //span[1=1 and contains(text(),"预览")]

    private String dBackButtonSpan = "通用-返回按钮-span";
    private String xBackButtonSpan = get$XSpan("返回");
    //62 //span[1=1 and contains(text(),"返回")]

    ////////////////////////
    private String dSuccessPromptWithGreenCheckDivFinal = "通用-XXXX-添加/修改-成功系统提示信息(有绿钩子的)";
    private String xSuccessPromptWithGreenCheckDivFinal = "//div[contains(@class,\"ant-message-success\")]";

    private String dSuccessPromptDivFinal = "通用-XXXX-添加/修改-成功系统提示信息";
    private String xSuccessPromptDivFinal = "//div[@class='ant-message-notice-success']";

    private String dWarningPromptDivFinal = "通用-XXXX-添加/修改-警告系统提示信息";
    private String xWarningPromptDivFinal = "//div[@class='ant-message-notice-warning']";

    private String dNoticePromptDivFinal = "通用-XXXX-添加/修改-XX系统提示信息";
    private String xNoticePromptDivFinal = "//div[@class='ant-message-notice-content']/div";
    ////////////////////////////

    private String dAttachmentAccessViewOnlySpan = "通用-附件权限-查看radio-span";
    //通用-附件权限-查看radio-span
    private String xAttachmentAccessViewOnlySpan = get$XRadio("附件权限", "查看");
    //label[1=1 and contains(@title,"附件权限")]/../following-sibling::*[1]//span[text()='查看']

    private String dAttachmentAccessViewOnlySpanRadioSpan = dAttachmentAccessViewOnlySpan + "-小圈圈";
    //通用-附件权限-查看radio-span-小圈圈
    private String xAttachmentAccessViewOnlySpanRadioSpan = getRadio(xAttachmentAccessViewOnlySpan);
    //label[1=1 and contains(@title,"附件权限")]/../following-sibling::*[1]//span[text()='查看']/preceding-sibling::span


    private String dAttachmentAccessViewAndDownloadSpan = "通用-附件权限-查看&下载radio-span";
    //通用-附件权限-查看&下载radio-span
    private String xAttachmentAccessViewAndDownloadSpan = get$XRadio("附件权限", "查看&下载");
    //label[1=1 and contains(@title,"附件权限")]/../following-sibling::*[1]//span[text()='查看&下载']


    private String dAttachmentAccessViewAndDownloadSpanRadioSpan = dAttachmentAccessViewAndDownloadSpan + "-小圈圈";
    //通用-附件权限-看&下载radio-span-小圈圈
    private String xAttachmentAccessViewAndDownloadSpanRadioSpan = getRadio(xAttachmentAccessViewAndDownloadSpan);
    //label[1=1 and contains(@title,"附件权限")]/../following-sibling::*[1]//span[text()='看&下载']/preceding-sibling::span


    private String dIsWaterMarkedYesSpan = "通用-水印-有水印radio-span";
    //通用-水印-有水印radio-span
    private String xIsWaterMarkedYesSpan = get$XRadio("水印", "有水印");
    //label[1=1 and contains(@title,"水印")]/../following-sibling::*[1]//span[text()='有水印']

    private String dIsWaterMarkedYesSpanRadioSpan = dIsWaterMarkedYesSpan + "-小圈圈";
    //通用-附件权限-有水印radio-span-小圈圈
    private String xIsWaterMarkedYesSpanRadioSpan = getRadio(xIsWaterMarkedYesSpan);
    //label[1=1 and contains(@title,"水印")]/../following-sibling::*[1]//span[text()='有水印']/preceding-sibling::span

    private String dIsWaterMarkedNoSpan = "通用-水印-无水印radio-span";
    //通用-水印-无水印radio-span
    private String xIsWaterMarkedNoSpan = get$XRadio("水印", "无水印");
    //label[1=1 and contains(@title,"水印")]/../following-sibling::*[1]//span[text()='无水印']

    private String dIsWaterMarkedNoSpanRadioSpan = dIsWaterMarkedNoSpan + "-小圈圈";
    //通用-附件权限-无水印radio-span-小圈圈
    private String xIsWaterMarkedNoSpanRadioSpan = getRadio(xIsWaterMarkedNoSpan);
    //label[1=1 and contains(@title,"水印")]/../following-sibling::*[1]//span[text()='无水印']/preceding-sibling::span

    private String dMainBodyInput = "通用-正文摘要框-input";
    //通用-正文摘要框-input
    private String xMainBodyInput = get$XInput("正文摘要");
    //label[1=1 and text()='正文摘要']/../following-sibling::*[1]//input

    private String dTitleImageInput = "通用-标题图片框-input";
    //通用-标题图片框-input
    private String xTitleImageInput = get$XInput("标题图片");
    //label[1=1 and text()='标题图片']/../following-sibling::*[1]//input

    private String dTitleImageInputUploadFileStatus = dTitleImageInput + "-上传status-div";
    //通用-标题图片框-input-上传status-div
    private String xTitleImageInputUploadFileStatus = xTitleImageInput + "/../../following-sibling::div";
    //label[1=1 and text()='标题图片']/../following-sibling::*[1]//input/../../following-sibling::div

    private String dTitleImageInputUploadFileCross = "//通用-标题图片框-input-上传-删除-i";
    private String xTitleImageInputUploadFileCross = xTitleImageInputUploadFileStatus + getCross();
    //label[1=1 and text()='标题图片']/../following-sibling::*[1]//input/../../following-sibling::div//i[1=1 and contains(@class,'close-circle') or contains(@class,'anticon-close')]


    private String dTitleImageInputUploadFile = dTitleImageInputUploadFileStatus + "-文件-a";
    //通用-标题图片框-input-上传status-div-文件-span
    private String xTitleImageInputUploadFile = xTitleImageInputUploadFileStatus + "//a[@title]";
    //label[1=1 and text()='标题图片']/../following-sibling::*[1]//input/../../following-sibling::div//span[@title]

    private String dSummaryTextarea = "通用-摘要框-textarea";
    //通用-摘要框-textarea
    private String xSummaryTextarea = get$XTextarea("摘要");
    //label[1=1 and text()='摘要']/../following-sibling::*[1]//textarea

    private String dPublisherIpnt = "通用-发布人框-input";
    //通用-发布人框-input
    private String xPublisherIpnt = get$XInput("发布人");
    //label[1=1 and text()='发布人']/../following-sibling::*[1]//input

    //下面是58,信息发布编辑页面


    private String dDisplaySetupOfflineSpan = "通用-显示设置-下线隐藏radio-span";
    //通用-显示设置-下线隐藏radio-span
    private String xDisplaySetupOfflineSpan = get$XRadio("显示设置", "下线隐藏");
    //label[1=1 and contains(@title,"显示设置")]/../following-sibling::*[1]//span[text()='下线隐藏']

    private String dDisplaySetupOfflineSpanRadioSpan = dDisplaySetupOfflineSpan + "-小圈圈";
    //通用-附件权限-下线隐藏radio-span-小圈圈
    private String xDisplaySetupOfflineSpanRadioSpan = getRadio(xDisplaySetupOfflineSpan);
    //label[1=1 and contains(@title,"显示设置")]/../following-sibling::*[1]//span[text()='下线隐藏']/preceding-sibling::span


    private String dDisplaySetupOnlineSpan = "通用-显示设置-公开展示radio-span";
    //通用-显示设置-公开展示radio-span
    private String xDisplaySetupOnlineSpan = get$XRadio("显示设置", "公开展示");
    //label[1=1 and contains(@title,"显示设置")]/../following-sibling::*[1]//span[text()='公开展示']

    private String dDisplaySetupOnlineSpanRadioSpan = dDisplaySetupOnlineSpan + "-小圈圈";
    //通用-附件权限-下线隐藏radio-span-小圈圈
    private String xDisplaySetupOnlineSpanRadioSpan = getRadio(xDisplaySetupOnlineSpan);
    //label[1=1 and contains(@title,"显示设置")]/../following-sibling::*[1]//span[text()='公开展示']/preceding-sibling::span

    private String dTopOrderInput = "通用-置顶顺序框-input";
    //通用-置顶顺序框-input
    private String xTopOrderInput = get$XInput("置顶顺序");
    //label[1=1 and text()='置顶顺序']/../following-sibling::*[1]//input

    private String dPushTodayMustReadYesSpan = "通用-推送今日必读-是radio-span";
    //通用-推送今日必读-是radio-span
    private String xPushTodayMustReadYesSpan = get$XRadio("推送今日必读", "是");
    //label[1=1 and contains(@title,"推送今日必读")]/../following-sibling::*[1]//span[text()='是']

    private String dPushTodayMustReadYesSpanRadioSpan = dPushTodayMustReadYesSpan + "-小圈圈";
    //通用-附件权限-下是radio-span-小圈圈
    private String xPushTodayMustReadYesSpanRadioSpan = getRadio(xPushTodayMustReadYesSpan);
    //label[1=1 and contains(@title,"推送今日必读")]/../following-sibling::*[1]//span[text()='是']/preceding-sibling::span

    private String dPushTodayMustReadNoSpan = "通用-推送今日必读-否radio-span";
    //通用-推送今日必读-否radio-span
    private String xPushTodayMustReadNoSpan = get$XRadio("推送今日必读", "否");
    //label[1=1 and contains(@title,"推送今日必读")]/../following-sibling::*[1]//span[text()='否']

    private String dPushTodayMustReadNoSpanRadioSpan = dPushTodayMustReadNoSpan + "-小圈圈";
    //通用-附件权限-下线隐藏radio-span-小圈圈
    private String xPushTodayMustReadNoSpanRadioSpan = getRadio(xPushTodayMustReadNoSpan);
    //label[1=1 and contains(@title,"推送今日必读")]/../following-sibling::*[1]//span[text()='否']/preceding-sibling::span

    private String dExternalLinkInput = "通用-外部链接框-input";
    //通用-外部链接框-input
    private String xExternalLinkInput = get$XInput("外部链接");
    //label[1=1 and text()='外部链接']/../following-sibling::*[1]//input

    private String dMainBodyTextIframe = "通用-内容框-iframe";
    //通用-内容框-input
    private String xMainBodyTextIframe = get$XIframe("内容");
    //label[1=1 and text()='内容']/../following-sibling::*[1]//iframe

    private String dMainBodyTextIframeIframeBody = "通用-内容框-iframe里面的-body";

    private String xMainBodyTextIframeIframeBody = "//body";

/////////////////////////////////////////////////
    //2 客户名称

    private String dIsCoreCustYesSpan = "通用-是否核心客户-是radio-span";
    //通用-是否核心客户-是radio-span
    private String xIsCoreCustYesSpan = get$XRadio("是否核心客户", "是");
    //label[1=1 and contains(@title,"是否核心客户")]/../following-sibling::*[1]//span[text()='是']

    private String dIsCoreCustYesSpanRadioSpan = dIsCoreCustYesSpan + "-小圈圈";
    //通用-附件权限-下线隐藏radio-span-小圈圈
    private String xIsCoreCustYesSpanRadioSpan = getRadio(xIsCoreCustYesSpan);
    //label[1=1 and contains(@title,"是否核心客户")]/../following-sibling::*[1]//span[text()='是']/preceding-sibling::span

    private String dIsCoreCustNoSpan = "通用-是否核心客户-否radio-span";
    //通用-是否核心客户-否radio-span
    private String xIsCoreCustNoSpan = get$XRadio("是否核心客户", "否");
    //label[1=1 and contains(@title,"推送今日必读")]/../following-sibling::*[1]//span[text()='否']

    private String dIsCoreCustNoSpanRadioSpan = dIsCoreCustNoSpan + "-小圈圈";
    //通用-附件权限-下线隐藏radio-span-小圈圈
    private String xIsCoreCustNoSpanRadioSpan = getRadio(xIsCoreCustNoSpan);
    //label[1=1 and contains(@title,"是否核心客户")]/../following-sibling::*[1]//span[text()='否']/preceding-sibling::span

    private String dResearchLevelDiv = "通用-研究服务等级-div";/////
    private String xResearchLevelDiv = get$XDiv("研究服务等级");/////
    //84 //label[1=1 and contains(text(),"研究服务等级")]/../following-sibling::div[1]

    private String dResearchLevelRenderedSpan = "通用-研究服务等级-div-rendered-span";
    ;
    private String xResearchLevelRenderedSpan = xResearchLevelDiv + getRender();

    private String dResearchLevelInput = "通用-研究服务等级-input";
    private String xResearchLevelInput = get$XInput("研究服务等级");
    //label[1=1 and contains(text(),"研究服务等级")]/../following-sibling::*[1]//input

    private String dResearchLevelSpanA = "通用-研究服务等级-A-span";
    //通用-研究服务等级-A-span
    private String xResearchLevelSpanA = get$XLiSpan("A");
    //li/span[1=1 and @title='A' ]

    private String dResearchLevelSpanB = "通用-研究服务等级-B-span";
    //通用-研究服务等级-A-span
    private String xResearchLevelSpanB = get$XLiSpan("B");
    //li/span[1=1 and @title='A' ]

    private String dResearchLevelSpanC = "通用-研究服务等级-C-span";
    //通用-研究服务等级-A-span
    private String xResearchLevelSpanC = get$XLiSpan("C");
    //li/span[1=1 and @title='A' ]

    private String dResearchLevelSpanD = "通用-研究服务等级-D-span";
    //通用-研究服务等级-A-span
    private String xResearchLevelSpanD = get$XLiSpan("D");
    //li/span[1=1 and @title='A' ]

    private String dResearchLevelSpanE = "通用-研究服务等级-E-span";
    //通用-研究服务等级-A-span
    private String xResearchLevelSpanE = get$XLiSpan("E");
    //li/span[1=1 and @title='A' ]

    private String dResearchContractStateDiv = "通用-研究服务签约状态-div";/////
    private String xResearchContractStateDiv = get$XDiv("研究服务签约状态");/////
    //85 //label[1=1 and contains(text(),"研究服务签约状态")]/../following-sibling::div[1]

    private String dResearchContractStateInput = "通用-研究服务签约状态-input";/////
    private String xResearchContractStateInput = get$XInput("研究服务签约状态");
    //label[1=1 and contains(text(),"研究服务签约状态")]/../following-sibling::*[1]//input

    private String dResearchContractStateSpanNil = "通用-研究服务签约状态-空-span";
    //通用-研究服务签约状态-空-span
    private String xResearchContractStateSpanNil = get$XLiSpan("空");
    //li/span[1=1 and @title='空' ]

    private String dResearchContractStateSpanSigning = "通用-研究服务签约状态-签约中-span";
    //通用-研究服务签约状态-签约中-span
    private String xResearchContractStateSpanSigning = get$XLiSpan("签约中");
    //li/span[1=1 and @title='签约中' ]


    private String dResearchContractStateSpanSigned = "通用-研究服务签约状态-已签约-span";
    //通用-研究服务签约状态-已签约-span
    private String xResearchContractStateSpanSigned = get$XLiSpan("已签约");
    //li/span[1=1 and @title='已签约' ]

    private String dResearchContractStateSpanPostponed = "通用-研究服务签约状态-已顺延-span";
    //通用-研究服务签约状态-已顺延-span
    private String xResearchContractStateSpanPostponed = get$XLiSpan("已顺延");
    //li/span[1=1 and @title='已顺延' ]


    private String dResearchDueDateInput = "通用-研究服务到期日-input";
    private String xResearchDueDateInput = get$XInput("研究服务到期日");
    //86 //label[1=1 and contains(text(),"研究服务到期日")]/../following-sibling::*[1]//input

    //27 客户经理

    private String dTeamBelongedInput = "通用-所属团队-input";
    private String xTeamBelongedInput = get$XInput("所属团队");
    //label[1=1 and contains(text(),"所属团队")]/../following-sibling::*[1]//input

    private String dTeamBelongedInputSearchI = "通用-所属团队-input-serach-i";
    private String xTeamBelongedInputSearchI = getSearch(xTeamBelongedInput);
    //label[1=1 and contains(text(),"所属团队")]/../following-sibling::*[1]//input/following-sibling::*//i[1=1 and contains(@class,'')]

    private String dUnifiedSocialCreditCodeInput = "通用-统一社会信用代码-input";
    private String xUnifiedSocialCreditCodeInput = get$XInput("统一社会信用代码");
    //88 //label[1=1 and contains(text(),"统一社会信用代码")]/../following-sibling::*[1]//input

    private String dCustLevel = "通用-客户级别-div";/////
    private String xCustLevel = get$XDiv("客户级别");/////
    //89 //label[1=1 and contains(text(),"客户级别")]/../following-sibling::div[1]

    private String dCustLevelInput = "通用-客户级别-input";
    private String xCustLevelInput = get$XInput("客户级别");
    //89 //label[1=1 and contains(text(),"客户级别")]/../following-sibling::*[1]//input

    private String dCustLevelSpanGroup = "通用-客户级别-集团级战略客户-span";
    //通用-客户级别-集团级战略客户-span
    private String xCustLevelSpanGroup = get$XLiSpan("集团级战略客户");
    //89 //li/span[1=1 and @title='集团级战略客户' ]

    private String dCustLevelSpanDistrict = "通用-客户级别-区域级重点客户-span";
    //通用-客户级别-区域级重点客户-span
    private String xCustLevelSpanDistrict = get$XLiSpan("区域级重点客户");
    //89 //li/span[1=1 and @title='区域级重点客户' ]

    private String dCustLevelSpanDepart = "通用-客户级别-部门客户-span";
    //89 //通用-客户级别-部门客户-span
    private String xCustLevelSpanDepart = get$XLiSpan("部门客户");
    //89 //li/span[1=1 and @title='部门客户' ]

    private String dCustLevelSpanOrdinary = "通用-客户级别-普通客户-span";
    //89 //通用-客户级别-普通客户-span
    private String xCustLevelSpanOrdinary = get$XLiSpan("普通客户");
    //89 //li/span[1=1 and @title='普通客户' ]

    private String dCustTypeInput = "通用-客户类型-input";
    private String xCustTypeInput = get$XInput("客户类型");
    //90 //label[1=1 and contains(text(),"客户类型")]/../following-sibling::*[1]//input

    private String dCustTypeInputSearch = "通用-客户类型-input-serach-i";
    private String xCustTypeInputSearch = getSearch(xCustTypeInput);
    //90 //label[1=1 and contains(text(),"客户类型")]/../following-sibling::*[1]//input/following-sibling::*//i[1=1 and contains(@class,'')]

    private String dCreditDispatchTypeIncomeCreditDispatchSpan = "通用-派点类型-收入派点-radio-span";
    //通用-派点类型-收入派点-radio-span
    private String xCreditDispatchTypeIncomeCreditDispatchSpan = get$XRadio("派点类型", "收入派点");
    //91 //label[1=1 and contains(@title,"派点类型")]/../following-sibling::*[1]//span[text()='收入派点']

    private String dCreditDispatchTypeIncomeCreditDispatchRadioSpan = dCreditDispatchTypeIncomeCreditDispatchSpan + "-小圈圈";
    //通用-派点类型-收入派点-radio-span-小圈圈
    private String xCreditDispatchTypeIncomeCreditDispatchRadioSpan = getRadio(xCreditDispatchTypeIncomeCreditDispatchSpan);
    //label[1=1 and contains(@title,"派点类型")]/../following-sibling::*[1]//span[text()='收入派点']/preceding-sibling::span

    private String dCreditDispatchTypeStrategicCreditDispatchSpan = "通用-派点类型-战略派点-radio-span";
    //通用-派点类型-战略派点-radio-span
    private String xCreditDispatchTypeStrategicCreditDispatchSpan = get$XRadio("派点类型", "战略派点");
    //92 //label[1=1 and contains(@title,"派点类型")]/../following-sibling::*[1]//span[text()='战略派点']

    private String dCreditDispatchTypeStrategicCreditDispatchRadioSpan = dCreditDispatchTypeStrategicCreditDispatchSpan + "-小圈圈";
    //通用-派点类型-战略派点-radio-span-小圈圈
    private String xCreditDispatchTypeStrategicCreditDispatchRadioSpan = getRadio(xCreditDispatchTypeStrategicCreditDispatchSpan);
    //label[1=1 and contains(@title,"派点类型")]/../following-sibling::*[1]//span[text()='战略派点']/preceding-sibling::span

    private String dCreditDispatchWeightsInput = "通用-派点权重-input";
    private String xCreditDispatchWeightsInput = get$XInput("派点权重");
    //93 //label[1=1 and contains(text(),"派点权重")]/../following-sibling::*[1]//input

    private String dResearchCustTypeResearchCustSpan = "通用-研究服务客户类型-研究服务客户-radio-span";
    //通用-研究服务客户类型-研究服务客户-radio-span
    private String xResearchCustTypeResearchCustSpan = get$XRadio("研究服务客户类型", "研究服务客户");
    //94 //label[1=1 and contains(@title,"研究服务客户类型")]/../following-sibling::*[1]//span[text()='研究服务客户']

    private String dResearchCustTypeResearchCustRadioSpan = dResearchCustTypeResearchCustSpan + "-小圈圈";
    //通用-研究服务客户类型-研究服务客户-radio-span-小圈圈
    private String xResearchCustTypeResearchCustRadioSpan = getRadio(xResearchCustTypeResearchCustSpan);
    //label[1=1 and contains(@title,"研究服务客户类型")]/../following-sibling::*[1]//span[text()='研究服务客户']/preceding-sibling::span

    private String dResearchCustTypeNonResearchCustSpan = "通用-研究服务客户类型-非研究服务客户-radio-span";
    //通用-研究服务客户类型-非研究服务客户-radio-span
    private String xResearchCustTypeNonResearchCustSpan = get$XRadio("研究服务客户类型", "非研究服务客户");
    //95 //label[1=1 and contains(@title,"研究服务客户类型")]/../following-sibling::*[1]//span[text()='非研究服务客户']

    private String dResearchCustTypeNonResearchCustRadioSpan = dResearchCustTypeNonResearchCustSpan + "-小圈圈";
    //通用-研究服务客户类型-非研究服务客户-radio-span-小圈圈
    private String xResearchCustTypeNonResearchCustRadioSpan = getRadio(xResearchCustTypeNonResearchCustSpan);
    //label[1=1 and contains(@title,"研究服务客户类型")]/../following-sibling::*[1]//span[text()='非研究服务客户']/preceding-sibling::span

    private String dResearchCustTypeServiceSuspendedSpan = "通用-研究服务客户类型-暂停服务-radio-span";
    //通用-研究服务客户类型-暂停服务-radio-span
    private String xResearchCustTypeServiceSuspendedSpan = get$XRadio("研究服务客户类型", "暂停服务");
    //96 //label[1=1 and contains(@title,"研究服务客户类型")]/../following-sibling::*[1]//span[text()='暂停服务']

    private String dResearchCustTypeServiceSuspendedRadioSpan = dResearchCustTypeServiceSuspendedSpan + "-小圈圈";
    //通用-研究服务客户类型-暂停服务-radio-span-小圈圈
    private String xResearchCustTypeServiceSuspendedRadioSpan = getRadio(xResearchCustTypeServiceSuspendedSpan);
    //label[1=1 and contains(@title,"研究服务客户类型")]/../following-sibling::*[1]//span[text()='暂停服务']/preceding-sibling::span

    private String dContractPreliminaryReviewAccessYesSpan = "通用-签约初审准入-是-radio-span";
    //通用-签约初审准入-是-radio-span
    private String xContractPreliminaryReviewAccessYesSpan = get$XRadio("签约初审准入", "是");
    //97 //label[1=1 and contains(@title,"签约初审准入")]/../following-sibling::*[1]//span[text()='是']

    private String dContractPreliminaryReviewAccessYesRadioSpan = dContractPreliminaryReviewAccessYesSpan + "-小圈圈";
    //通用-签约初审准入-是-radio-span-小圈圈
    private String xContractPreliminaryReviewAccessYesRadioSpan = getRadio(xContractPreliminaryReviewAccessYesSpan);
    //label[1=1 and contains(@title,"签约初审准入")]/../following-sibling::*[1]//span[text()='是']/preceding-sibling::span

    private String dContractPreliminaryReviewAccessNoSpan = "通用-签约初审准入-否-radio-span";
    //通用-签约初审准入-否-radio-span
    private String xContractPreliminaryReviewAccessNoSpan = get$XRadio("签约初审准入", "否");
    //label[1=1 and contains(@title,"签约初审准入")]/../following-sibling::*[1]//span[text()='否']

    private String dContractPreliminaryReviewAccessNoRadioSpan = dContractPreliminaryReviewAccessNoSpan + "-小圈圈";
    //通用-签约初审准入-否-radio-span-小圈圈
    private String xContractPreliminaryReviewAccessNoRadioSpan = getRadio(xContractPreliminaryReviewAccessNoSpan);
    //label[1=1 and contains(@title,"签约初审准入")]/../following-sibling::*[1]//span[text()='否']/preceding-sibling::span

    private String dResearchSignedDateInput = "通用-签约时间-input";
    private String xResearchSignedDateInput = get$XInput("签约时间");
    //label[1=1 and contains(text(),"签约时间")]/../following-sibling::*[1]//input

    private String dCustChannelPublicOfferSpan = "通用-客户渠道-公募-radio-span";
    //通用-客户渠道-公募-radio-span
    private String xCustChannelPublicOfferSpan = get$XRadio("客户渠道", "公募");
    //100 //label[1=1 and contains(@title,"客户渠道")]/../following-sibling::*[1]//span[text()='公募']

    private String dCustChannelPublicOfferRadioSpan = dCustChannelPublicOfferSpan + "-小圈圈";
    //通用-客户渠道-公募-radio-span-小圈圈
    private String xCustChannelPublicOfferRadioSpan = getRadio(xCustChannelPublicOfferSpan);
    //label[1=1 and contains(@title,"客户渠道")]/../following-sibling::*[1]//span[text()='公募']/preceding-sibling::span

    private String dCustChannelNonPublicOfferSpan = "通用-客户渠道-非公募-radio-span";
    //通用-客户渠道-非公募-radio-span
    private String xCustChannelNonPublicOfferSpan = get$XRadio("客户渠道", "非公募");
    //101 //label[1=1 and contains(@title,"客户渠道")]/../following-sibling::*[1]//span[text()='非公募']

    private String dCustChannelNonPublicOfferRadioSpan = dCustChannelNonPublicOfferSpan + "-小圈圈";
    //通用-客户渠道-非公募-radio-span-小圈圈
    private String xCustChannelNonPublicOfferRadioSpan = getRadio(xCustChannelNonPublicOfferSpan);
    //label[1=1 and contains(@title,"客户渠道")]/../following-sibling::*[1]//span[text()='非公募']/preceding-sibling::span

    private String dCustChannelOtherSpan = "通用-客户渠道-其他-radio-span";
    //通用-客户渠道-其他-radio-span
    private String xCustChannelOtherSpan = get$XRadio("客户渠道", "其他");
    //102 //label[1=1 and contains(@title,"客户渠道")]/../following-sibling::*[1]//span[text()='其他']

    private String dCustChannelOtherRadioSpan = dCustChannelOtherSpan + "-小圈圈";
    //通用-客户渠道-其他-radio-span-小圈圈
    private String xCustChannelOtherRadioSpan = getRadio(xCustChannelOtherSpan);
    //label[1=1 and contains(@title,"客户渠道")]/../following-sibling::*[1]//span[text()='其他']/preceding-sibling::span

    private String dIsPotentialCustYesSpan = "通用-是否潜在客户-是-radio-span";
    //通用-是否潜在客户-是-radio-span
    private String xIsPotentialCustYesSpan = get$XRadio("是否潜在客户", "是");
    //105 //label[1=1 and contains(@title,"是否潜在客户")]/../following-sibling::*[1]//span[text()='是']

    private String dIsPotentialCustYesRadioSpan = dIsPotentialCustYesSpan + "-小圈圈";
    //通用-是否潜在客户-是-radio-span-小圈圈
    private String xIsPotentialCustYesRadioSpan = getRadio(xIsPotentialCustYesSpan);
    //label[1=1 and contains(@title,"是否潜在客户")]/../following-sibling::*[1]//span[text()='是']/preceding-sibling::span

    private String dIsPotentialCustNoSpan = "通用-是否潜在客户-否-radio-span";
    //通用-是否潜在客户-否-radio-span
    private String xIsPotentialCustNoSpan = get$XRadio("是否潜在客户", "否");
    //106 //label[1=1 and contains(@title,"是否潜在客户")]/../following-sibling::*[1]//span[text()='否']

    private String dIsPotentialCustNoRadioSpan = dIsPotentialCustNoSpan + "-小圈圈";
    //通用-是否潜在客户-否-radio-span-小圈圈
    private String xIsPotentialCustNoRadioSpan = getRadio(xIsPotentialCustNoSpan);
    //label[1=1 and contains(@title,"是否潜在客户")]/../following-sibling::*[1]//span[text()='否']/preceding-sibling::span

    private String dActivityLimitsResearchCustManagerSpan = "通用-活动权限-研究服务客户经理-radio-span";
    //通用-活动权限-研究服务客户经理-radio-span
    private String xActivityLimitsResearchCustManagerSpan = get$XCheckBox("活动权限", "研究服务客户经理");
    //107 //label[1=1 and contains(@title,"活动权限")]/../following-sibling::*[1]//span[text()='研究服务客户经理']

    private String dActivityLimitsResearchCustManagerCheckBoxSpan = dActivityLimitsResearchCustManagerSpan + "-小框框";
    //通用-活动权限-研究服务客户经理-radio-span-小圈圈
    private String xActivityLimitsResearchCustManagerCheckBoxSpan = getCheckBox(xActivityLimitsResearchCustManagerSpan);
    //label[1=1 and contains(@title,"活动权限")]/../following-sibling::*[1]//span[text()='研究服务客户经理']/preceding-sibling::span

    private String dActivityLimitsJointResearchSpan = "通用-活动权限-联合调研-radio-span";
    //通用-活动权限-联合调研-radio-span
    private String xActivityLimitsJointResearchSpan = get$XCheckBox("活动权限", "联合调研");
    //108 //label[1=1 and contains(@title,"活动权限")]/../following-sibling::*[1]//span[text()='联合调研']

    private String dActivityLimitsJointResearchCheckBoxSpan = dActivityLimitsJointResearchSpan + "-小圈圈";
    //通用-活动权限-联合调研-radio-span-小圈圈
    private String xActivityLimitsJointResearchCheckBoxSpan = getCheckBox(xActivityLimitsJointResearchSpan);
    //label[1=1 and contains(@title,"活动权限")]/../following-sibling::*[1]//span[text()='联合调研']/preceding-sibling::span

    private String dActivityLimitsConferenceSpan = "通用-活动权限-大型会议-radio-span";
    //通用-活动权限-大型会议-radio-span
    private String xActivityLimitsConferenceSpan = get$XCheckBox("活动权限", "大型会议");
    //109 //label[1=1 and contains(@title,"活动权限")]/../following-sibling::*[1]//span[text()='大型会议']

    private String dActivityLimitsConferenceCheckBoxSpan = dActivityLimitsConferenceSpan + "-小圈圈";
    //通用-活动权限-大型会议-radio-span-小圈圈
    private String xActivityLimitsConferenceCheckBoxSpan = getCheckBox(xActivityLimitsConferenceSpan);
    //label[1=1 and contains(@title,"活动权限")]/../following-sibling::*[1]//span[text()='大型会议']/preceding-sibling::span

    private String dActivityLimitsSmallScaleCommunicationSpan = "通用-活动权限-小范围交流-radio-span";
    //通用-活动权限-小范围交流-radio-span
    private String xActivityLimitsSmallScaleCommunicationSpan = get$XCheckBox("活动权限", "小范围交流");
    //110 //label[1=1 and contains(@title,"活动权限")]/../following-sibling::*[1]//span[text()='小范围交流']

    private String dActivityLimitsSmallScaleCommunicationCheckBoxSpan = dActivityLimitsSmallScaleCommunicationSpan + "-小圈圈";
    //通用-活动权限-小范围交流-radio-span-小圈圈
    private String xActivityLimitsSmallScaleCommunicationCheckBoxSpan = getCheckBox(xActivityLimitsSmallScaleCommunicationSpan);
    //label[1=1 and contains(@title,"活动权限")]/../following-sibling::*[1]//span[text()='小范围交流']/preceding-sibling::span

    private String dActivityLimitsTelephoneConferenceSpan = "通用-活动权限-电话会议-radio-span";
    //通用-活动权限-电话会议-radio-span
    private String xActivityLimitsTelephoneConferenceSpan = get$XCheckBox("活动权限", "电话会议");
    //111 //label[1=1 and contains(@title,"活动权限")]/../following-sibling::*[1]//span[text()='电话会议']

    private String dActivityLimitsTelephoneConferenceCheckBoxSpan = dActivityLimitsTelephoneConferenceSpan + "-小圈圈";
    //通用-活动权限-电话会议-radio-span-小圈圈
    private String xActivityLimitsTelephoneConferenceCheckBoxSpan = getCheckBox(xActivityLimitsTelephoneConferenceSpan);
    //label[1=1 and contains(@title,"活动权限")]/../following-sibling::*[1]//span[text()='电话会议']/preceding-sibling::span

    private String dVintexPushDiv = "通用-道合推送-div";/////
    private String xVintexPushDiv = get$XDiv("道合推送");/////
    //112 //label[1=1 and contains(text(),"道合推送")]/../following-sibling::div[1]

    private String dOfficePostcodeInput = "通用-办公邮编-input";
    private String xOfficePostcodeInput = get$XInput("办公邮编");
    //113 //label[1=1 and contains(text(),"办公邮编")]/../following-sibling::*[1]//input

    private String dOfficeCentralTelephoneExchangeNoInput = "通用-公司总机-input";
    private String xOfficeCentralTelephoneExchangeNoInput = get$XInput("公司总机");
    //114 //label[1=1 and contains(text(),"公司总机")]/../following-sibling::*[1]//input

    private String dOfficeFaxNoInput = "通用-公司传真-input";
    private String xOfficeFaxNoInput = get$XInput("公司传真");
    //115 //label[1=1 and contains(text(),"公司传真")]/../following-sibling::*[1]//input

    private String dOfficeProvinceCityDiv = "通用-办公省市-div";/////
    private String xOfficeProvinceCityDiv = get$XDiv("办公省市");/////
    //116 //label[1=1 and contains(text(),"办公省市")]/../following-sibling::div[1]

    private String dOfficeProvinceCityPickerSpan = "通用-办公省市-div-rendered-span";
    ;
    private String xOfficeProvinceCityPickerSpan = xOfficeProvinceCityDiv + getPicker();
//label[1=1 and contains(text(),"")]/../following-sibling::div[1]//span[contains(@class,"ant-cascader-picker-label")]

    private String dHostAccountManagerInput = "通用-主办客户经理-input";
    private String xHostAccountManagerInput = get$XInput("主办客户经理");
    //117 //label[1=1 and contains(text(),"主办客户经理")]/../following-sibling::*[1]//input


    private String dCoOrganizingAccountManagerInput = "通用-协办客户经理-input";
    private String xCoOrganizingAccountManagerInput = get$XInput("协办客户经理");
    //118 //label[1=1 and contains(text(),"协办客户经理")]/../following-sibling::*[1]//input


    private String dResearchServiceContactsDiv = "通用-研究服务联系人-tab-div";
    private String xResearchServiceContactsDiv = get$XTabDiv("研究服务联系人");
    //120 //div[1=1 and text()='研究服务联系人']

    private String dResearchServiceSurveyStatisticsDiv = "通用-研究服务调研统计-tab-div";
    private String xResearchServiceSurveyStatisticsDiv = get$XTabDiv("研究服务调研统计");
    //121 //div[1=1 and text()='研究服务调研统计']

    private String dResearchServiceCustOfficeAddressDiv = "通用-研究服务客户办公地址-tab-div";
    private String xResearchServiceCustOfficeAddressDiv = get$XTabDiv("研究服务客户办公地址");
    //122 //div[1=1 and text()='研究服务客户办公地址']

    private String dResearchServiceOfficeEmailDiv = "通用-研究服务公司邮箱-tab-div";
    private String xResearchServiceOfficeEmailDiv = get$XTabDiv("研究服务公司邮箱");
    //123 //div[1=1 and text()='研究服务公司邮箱']

    private String dResearchServiceCustContractsDiv = "通用-研究服务客户合同-tab-div";
    private String xResearchServiceCustContractsDiv = get$XTabDiv("研究服务客户合同");
    //div[1=1 and text()='研究服务客户合同']

    private String dResearchServiceServiceFrequencyDiv = "通用-研究服务服务频次-tab-div";
    private String xResearchServiceServiceFrequencyDiv = get$XTabDiv("研究服务服务频次");
    //div[1=1 and text()='研究服务服务频次']

    private String dResearchServiceAssociatedCustsDiv = "通用-研究服务关联客户-tab-div";
    private String xResearchServiceAssociatedCustsDiv = get$XTabDiv("研究服务关联客户");
    //div[1=1 and text()='研究服务关联客户']

    private String dSetUpSpan = "通用-创建按钮-span";
    private String xSetUpSpan = get$XSpan("创建");
    //span[1=1 and text()='创建']

    private String dDeleteSpan = "通用-删除按钮-span";
    private String xDeleteSpan = get$XSpan("删除");
    //span[1=1 and text()='删除']

    private String dSynchronizeVintexSpan = "通用-同步道合按钮-span";
    private String xSynchronizeVintexSpan = get$XSpan("同步道合");
    //span[1=1 and text()='同步道合']

    private String dSecuritiesNameInput = "通用-证券名称-input";
    private String xSecuritiesNameInput = get$XInput("证券名称");
    //label[1=1 and contains(text(),"证券名称")]/../following-sibling::*[1]//input

    private String dSecuritiesCodeInput = "通用-证券代码-input";
    private String xSecuritiesCodeInput = get$XInput("证券代码");
    //label[1=1 and contains(text(),"证券代码")]/../following-sibling::*[1]//input

    private String dSegmentsInput = "通用-板块-input";
    private String xSegmentsInput = get$XInput("板块");
    //label[1=1 and contains(text(),"板块")]/../following-sibling::*[1]//input

    private String dIndustryInvolvedInput = "通用-所属行业-input";
    private String xIndustryInvolvedInput = get$XInput("所属行业");
    //label[1=1 and contains(text(),"所属行业")]/../following-sibling::*[1]//input

    private String dInvestigatorNameInput = "通用-调研人员姓名-input";
    private String xInvestigatorNameInput = get$XInput("调研人员姓名");
    //label[1=1 and contains(text(),"调研人员姓名")]/../following-sibling::*[1]//input

    private String dInvestigationTimeFromInput = "通用-调研时间-开始日期-input";
    private String xInvestigationTimeFromInput = get$XInput("调研时间") + "[1]";
    //label[1=1 and contains(text(),"调研时间")]/../following-sibling::*[1]//input[1]

    private String dInvestigationTimeToInput = "通用-调研时间-结束日期-input";
    private String xInvestigationTimeToInput = get$XInput("调研时间") + "[2]";
    //label[1=1 and contains(text(),"调研时间")]/../following-sibling::*[1]//input[2]

    private String dDeleteInBatchesI = "通用-批量操作-删除-i";
    private String xDeleteInBatchesI = "//i[@aria-label='图标: delete']";

    private String dEmailSuffixInput = "通用-邮箱后缀-input";
    private String xEmailSuffixInput = get$XInput("邮箱后缀");
    //label[1=1 and contains(text(),"邮箱后缀")]/../following-sibling::*[1]//input

    private String dUploaderInput = "通用-上传人-input";
    private String xUploaderInput = get$XInput("上传人");
    //label[1=1 and contains(text(),"上传人")]/../following-sibling::*[1]//input

    private String dContractAmountInput = "通用-合同费用金额-input";
    private String xContractAmountInput = get$XInput("合同费用金额");
    //label[1=1 and contains(text(),"合同费用金额")]/../following-sibling::*[1]//input

    private String dDueDateAgreedInput = "通用-用印协议时间期限-input";
    private String xDueDateAgreedInput = get$XInput("用印协议时间期限");
    //label[1=1 and contains(text(),"用印协议时间期限")]/../following-sibling::*[1]//input

    private String dContractTypeSigningSpan= "通用-合同类型-签约-radio-span";
    //通用-合同类型-签约-radio-span
    private String xContractTypeSigningSpan= get$XRadio("合同类型", "签约");
    //label[1=1 and contains(@title,"合同类型")]/../following-sibling::*[1]//span[text()='签约']

    private String dContractTypeSigningRadioSpan = dContractTypeSigningSpan+ "-小圈圈";
    //通用-合同类型-签约-radio-span-小圈圈
    private String xContractTypeSigningRadioSpan = getRadio(xContractTypeSigningSpan);
    //label[1=1 and contains(@title,"合同类型")]/../following-sibling::*[1]//span[text()='签约']/preceding-sibling::span

    private String dContractTypePostponedSpan = "通用-合同类型-顺延-radio-span";
    //通用-合同类型-顺延-radio-span
    private String xContractTypePostponedSpan = get$XRadio("合同类型", "顺延");
    //label[1=1 and contains(@title,"合同类型")]/../following-sibling::*[1]//span[text()='顺延']

    private String dContractTypePostponedRadioSpan = dContractTypePostponedSpan + "-小圈圈";
    //通用-合同类型-顺延-radio-span-小圈圈
    private String xContractTypePostponedRadioSpan = getRadio(xContractTypePostponedSpan);
    //label[1=1 and contains(@title,"合同类型")]/../following-sibling::*[1]//span[text()='顺延']/preceding-sibling::span

    private String dRemarksContentTextarea = "通用-备注说明-textarea";
    //通用-摘要框-textarea
    private String xRemarksContentTextarea = get$XTextarea("备注说明");
    //label[1=1 and text()='备注说明']/../following-sibling::*[1]//textarea

    private String dTimeOfTakingEffectFromInput = "通用-生效时间-开始日期-input";
    private String xTimeOfTakingEffectFromInput = get$XInput("生效时间") + "[1]";
    //label[1=1 and contains(text(),"生效时间")]/../following-sibling::*[1]//input[1]

    private String dTimeOfTakingEffectToInput = "通用-生效时间-结束日期-input";
    private String xTimeOfTakingEffectToInput = get$XInput("生效时间") + "[2]";
    //label[1=1 and contains(text(),"生效时间")]/../following-sibling::*[1]//input[2]

    private String dConferenceAndEventOrganiserMaxCountInput = "通用-会议活动机构参会次数上限-input";
    private String xConferenceAndEventOrganiserMaxCountInput = get$XInput("会议活动机构参会次数上限");
    //label[1=1 and contains(text(),"会议活动机构参会次数上限")]/../following-sibling::*[1]//input

    private String dConferenceNumberOfCountInput = "通用-会议活动已参会次数-input";
    private String xConferenceNumberOfCountInput = get$XInput("会议活动已参会次数");
    //label[1=1 and contains(text(),"会议活动已参会次数")]/../following-sibling::*[1]//input

    private String dConferenceParticipantLimitInput = "通用-会议活动每次参会人数上限-input";
    private String xConferenceParticipantLimitInput = get$XInput("会议活动每次参会人数上限");
    //label[1=1 and contains(text(),"会议活动每次参会人数上限")]/../following-sibling::*[1]//input

    private String dListedCompanyOrgConferenceLimitInput = "通用-上市公司机构参会次数上限-input";
    private String xListedCompanyOrgConferenceLimitInput = get$XInput("上市公司机构参会次数上限");
    //label[1=1 and contains(text(),"上市公司机构参会次数上限")]/../following-sibling::*[1]//input

    private String dListCompanyNumberOfParticipantInput = "通用-上市公司已参会次数-input";
    private String xListCompanyNumberOfParticipantInput = get$XInput("上市公司已参会次数");
    //label[1=1 and contains(text(),"上市公司已参会次数")]/../following-sibling::*[1]//input

    private String dListedCompanyLimitPerConferenceInput = "通用-上市公司每次参会人数上限-input";
    private String xListedCompanyLimitPerConferenceInput = get$XInput("上市公司每次参会人数上限");
    //label[1=1 and contains(text(),"上市公司每次参会人数上限")]/../following-sibling::*[1]//input

    private String dListedCompanySelectableCompanyLimitInput = "通用-上市公司可选公司数上限-input";
    private String xListedCompanySelectableCompanyLimitInput = get$XInput("上市公司可选公司数上限");
    //label[1=1 and contains(text(),"上市公司可选公司数上限")]/../following-sibling::*[1]//input

    private String dJointResearchOrgConferenceLimitInput = "通用-联合调研机构参会次数上限-input";
    private String xJointResearchOrgConferenceLimitInput = get$XInput("联合调研机构参会次数上限");
    //label[1=1 and contains(text(),"联合调研机构参会次数上限")]/../following-sibling::*[1]//input

    private String dJointResearchNumberOfParticipantInput = "通用-联合调研已参会次数-input";
    private String xJointResearchNumberOfParticipantInput = get$XInput("联合调研已参会次数");
    //label[1=1 and contains(text(),"联合调研已参会次数")]/../following-sibling::*[1]//input

    private String dJointResearchLimitPerConferenceInput = "通用-联合调研每次参会人数上限-input";
    private String xJointResearchLimitPerConferenceInput = get$XInput("联合调研每次参会人数上限");
    //label[1=1 and contains(text(),"联合调研每次参会人数上限")]/../following-sibling::*[1]//input

    private String dRoadShowOrgConferenceLimitInput = "通用-路演服务机构参会次数上限-input";
    private String xRoadShowOrgConferenceLimitInput = get$XInput("路演服务机构参会次数上限");
    //label[1=1 and contains(text(),"路演服务机构参会次数上限")]/../following-sibling::*[1]//input

    private String dRoadShowNumberOfParticipantInput = "通用-路演服务已参会次数-input";
    private String xRoadShowNumberOfParticipantInput = get$XInput("路演服务已参会次数");
    //label[1=1 and contains(text(),"路演服务已参会次数")]/../following-sibling::*[1]//input

    private String dEmpCodeInput = "通用-员工号-input";
    private String xEmpCodeInput = get$XInput("员工号");
    //label[1=1 and contains(text(),"员工号")]/../following-sibling::*[1]//input

    private String dEmpNameInput = "通用-员工姓名-input";
    private String xEmpNameInput = get$XInput("员工姓名");
    //label[1=1 and contains(text(),"员工姓名")]/../following-sibling::*[1]//input

    private String dEmpDeptInput = "通用-所属部门-input";
    private String xEmpDeptInput = get$XInput("所属部门");
    //label[1=1 and contains(text(),"所属部门")]/../following-sibling::*[1]//input

    private String dSelectedEmpNameTd = "通用-选中人员姓名-td";
    private String xSelectedEmpNameTd = "//div[@class='selected']//i[not(contains(@class,\"delete\"))]/../../td[1]";
    //div[@class='selected']//i[not(contains(@class,"delete"))]/../../td[1]
    //这个如果是多选的情况,可能有多个


    private String dUpload = "通用-上传文件-p";
    private String xUpload = "//p[text()='点击或将文件拖拽到这里上传']";
    //p[text()='点击或将文件拖拽到这里上传']


    public String get$XTabDiv(String label) {
        //div[1=1 and text()='研究服务联系人']
        String xpath = "//div[1=1 and text()='";
        xpath = xpath + label + "']";
        return xpath;
    }

    public String get$XTableTrsSibling(String num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][30]
        String xpath = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][";
        xpath = xpath + num;
        xpath = xpath + "]";

        return xpath;
    }

    public String get$DTableTrsSibling(String num) {
        //通用-表格表体-第1行
        String description = "通用-表格表体-第";
        description = description + num;
        description = description + "行";

        return description;
    }


    public String get$XTableTrsSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(@style)][30]
        String xpath = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key and not(@style)]";
        if (num > 0) {
            xpath = xpath + "[" + num;
        } else if (num == -1) {
            xpath = xpath + "[last()";
        } else if (num == 0) {
            xpath = xpath;
        } else {
            return "error, the num must be positive or equals -1";
        }
        xpath = xpath + "]";

        return xpath;
    }

    public String get$DTableTrsSibling(int num) {
        //通用-表格表体-第1行
        String desc = "通用-表格表体-第";
        return get$D(num, desc);
    }


    public String get$XTableTrsActionSibling(int num) {
        //table[1=1 and contains(@class,'ant-table-fixed')  and @style]//tr[@data-row-key][30]
        String xpath = "//table[1=1 and contains(@class,'ant-table-fixed')  and @style]//tr[@data-row-key]";
        if (num > 0) {
            xpath = xpath + "[" + num;
        } else if (num == -1) {
            xpath = xpath + "[last()";
        } else if (num == 0) {
            xpath = xpath;
        } else {
            return "error, the num must be positive or equals -1";
        }
        xpath = xpath + "]//td[last()]//a";

        return xpath;
    }

    public String get$DTableTrsActionSibling(int num) {
        //通用-表格表体-第1行
        String desc = "通用-表格表体-action-第";
        return get$D(num, desc);
    }


    public String get$XInput(String label) {
        //label[1=1 and text()='客户柜台代码']/../following-sibling::*[1]//input
        String xpath = "//label[1=1 and text()='";
        xpath = xpath + label;
        xpath = xpath + "']/../following-sibling::*[1]//input";
        return xpath;
    }


    public String get$XTextarea(String label) {
        //label[1=1 and text()='客户柜台代码']/../following-sibling::*[1]//input
        String xpath = "//label[1=1 and text()='";
        xpath = xpath + label;
        xpath = xpath + "']/../following-sibling::*[1]//textarea";
        return xpath;
    }


    public String get$XIframe(String label) {
        //label[1=1 and text()='内容']/../following-sibling::*[1]//iframe
        String xpath = "//label[1=1 and text()='";
        xpath = xpath + label;
        xpath = xpath + "']/../following-sibling::*[1]//iframe";
        return xpath;

    }


    public String get$DInput(String label) {
        //通用-OA账号-查询框
        String description = "通用-";
        description = description + label;
        description = description + "-查询框";

        return description;
    }


    public String get$XDiv(String label) {
        //label[1=1 and contains(text(),"开发类型")]/../following-sibling::div[1]
        String xpath = "//label[1=1 and contains(text(),\"";
        xpath = xpath + label;
        xpath = xpath + "\")]/../following-sibling::div[1]";
        return xpath;
    }

    public String get$XCheckBox(String lable1, String label2) {
        return get$XRadio(lable1, label2);
    }


    public String get$XRadio(String label1, String label2) {
        String xpath = "//label[1=1 and contains(@title,\"";
        xpath = xpath + label1 + "\")]/../following-sibling::*[1]//span[text()='";
        xpath = xpath + label2 + "']";
        return xpath;
    }


    public String get$DQuerySelectDiv(String label) {
        //通用-表格表体-第1行
        String description = "通用-";
        description = description + label;
        description = description + "-选择";

        return description;
    }


    public String get$XCheckbox(String num) {
        //table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][1]//input[1=1 and contains(@type,'checkbox') and contains(@class,'ant-checkbox-input')]
        String xpath = "//table[1=1 and contains(@class,'ant-table-fixed')]//tr[@data-row-key][";
        xpath = xpath + num;
        xpath = xpath + "]//input[1=1 and contains(@type,'checkbox') and contains(@class,'ant-checkbox-input')]";
        return xpath;
    }

    public String get$DCheckbox(String num) {
        //通用-表格表体-第1行-选择框
        String description = "通用-表格表体第";
        description = description + num;
        description = description + "行-选择框(选中有钩子的那个)";

        return description;
    }

    public String get$XLi(String label) {
        //li[1=1 and contains(text(),"个人")]
        String xpath = "//li[1=1 and contains(text(),\"";
        xpath = xpath + label;
        xpath = xpath + "\")]";
        return xpath;
    }


    public String get$XLiSpan(String label) {
        //li/span[1=1 and @title='专项战略合作协议' ]
        String xpath = "//li/span[1=1 and @title='";
        xpath = xpath + label;
        xpath = xpath + "']";
        return xpath;
    }


    public String get$DLi(String label) {
        //通用-OA账号-li
        String description = "通用-";
        description = description + label;
        description = description + "-li";

        return description;
    }


    public String get$XSpan(String text) {
        //span[1=1 and text()='重置']
        String xpath = "//span[1=1 and text()='";
        xpath = xpath + text;
        xpath = xpath + "']";
        return xpath;
    }


    public String get$XSpanByTitle(String text) {
        //span[1=1 and @title='今日必读']
        String xpath = xClassificationDiv + "//li/span[1=1 and @title='";
        xpath = xpath + text;
        xpath = xpath + "']";
        return xpath;
    }


    public String get$DSpan(String text) {
        //通用-表格表体-第1行-选择框
        String description = "通用-text是";
        description = description + text;
        description = description + "-span)";

        return description;
    }

    public String get$DClassificationDivSpan(int num) {
        //通用-分类下拉候选项-第num行
        String desc = "//通用-分类框-下拉候选项";
        return get$D(num, desc);

    }

    public String get$XClassificationDivSpan(int num) {
        //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//span[num+2]
        String xpath = xClassificationDiv;
        if (num > 0) {
            int n = num + 2;
            xpath = xpath + "//span[" + n + "]";
        } else if (num == 0) {
            xpath = xpath + "//span";
        } else if (num == -1) {
            xpath = xpath + "//span[last()]";
        } else {
            xpath = "error worng num input for xpath";
        }
        return xpath;
    }

    public String get$D(int num, String desc) {
        String description = desc;
        if (num > 0) {
            description = description + num;
        } else if (num == -1) {
            description = description + "最后一";
        } else if (num == 0) {
            description = description + " all";
        } else {
            return "error, the num must be positive or equals -1";
        }
        description = description + "行";

        return description;

    }


    public String getArrow(String xpath) {
        return xpath + getArrow();
    }

    public String getCross(String xpath) {
        return xpath + getCross();
    }

    public String getSearch(String xpath) {
        return xpath + getSearch();
    }

    public String getRadio(String xpath) {
        return xpath + getRadio();
    }

    public String getCheckBox(String xpath) {
        return getRadio(xpath);
    }


    public String get$XQueryInput(String label) {
        //div[@tabindex]//label[1=1 and contains(text(),"客户柜台代码")]/../following-sibling::*[1]//input
        String xpath = "";
        xpath = xpath + get$XInput(label);
        return xpath;
    }


    public String get$DQueryInput(String label) {
        //通用-first popped-OA账号-查询框
        String description = get$DInput(label);
        description = description.replaceFirst("通用-", "通用-first popped");
        return description;
    }


//    public String getXpath(String description) {
//        String str = "";
//        switch (description) {
//            case d1:
//                str = x1;
//                break;
//            case d2:
//                str = x2;
//                break;
//            case d3:
//                str = x3;
//                break;
//            case d4:
//                str = x4;
//                break;
//            case d5:
//                str = x5;
//                break;
//            case d6:
//                str = x6;
//                break;
//            case d7:
//                str = x7;
//                break;
//            case d8:
//                str = x8;
//                break;
//            case d9:
//                str = x9;
//                break;
//            case d10:
//                str = x10;
//                break;
//            case d11:
//                str = x11;
//                break;
//            case d12:
//                str = x12;
//                break;
//            case d13:
//                str = x13;
//                break;
//            case d14:
//                str = x14;
//                break;
//            case d15:
//                str = x15;
//                break;
//            case d16:
//                str = x16;
//                break;
//            case d17:
//                str = x17;
//                break;
//            case d18:
//                str = x18;
//                break;
//            case d19:
//                str = x19;
//                break;
//            case d20:
//                str = x20;
//                break;
//            case d21:
//                str = x21;
//                break;
//            case d22:
//                str = x22;
//                break;
//            case d23:
//                str = x23;
//                break;
//            case d24:
//                str = x24;
//                break;
//            case d25:
//                str = x25;
//                break;
//            case d26:
//                str = x26;
//                break;
//            case d27:
//                str = x27;
//                break;
//            case d28:
//                str = x28;
//                break;
//            case d29:
//                str = x29;
//                break;
//            case d30:
//                str = x30;
//                break;
//            case d18l5:
//                str = x18l5;
//                break;
//            case d18l10:
//                str = x18l10;
//                break;
//            case d18l20:
//                str = x18l20;
//                break;
//            case d18l30:
//                str = x18l30;
//                break;
//            case d10Selected:
//                str = x10Selected;
//                break;
//            case d10NotSelected:
//                str = x10NotSelected;
//                break;
//            case d31:
//                str = x31;
//                break;
//            case d32:
//                str = x32;
//                break;
//            case d33:
//                str = x33;
//                break;
//            case d34:
//                str = x34;
//                break;
//            case d35:
//                str = x35;
//                break;
//            case d36:
//                str = x36;
//                break;
//            case d37:
//                str = x37;
//                break;
//            case d38:
//                str = x38;
//                break;
//            case d39:
//                str = x39;
//                break;
//            case d40:
//                str = x40;
//                break;
//            case d41:
//                str = x41;
//                break;
//            case d42:
//                str = x42;
//                break;
//            case d43:
//                str = x43;
//                break;
//            case d44:
//                str = x44;
//                break;
//            case d45:
//                str = x45;
//                break;
//            case d46:
//                str = x46;
//                break;
//            case d47:
//                str = x47;
//                break;
//            case d48:
//                str = x48;
//                break;
//            case d10Action:
//                str = x10Action;
//                break;
//            case d49:
//                str = x49;
//                break;
//            case d50:
//                str = x50;
//                break;
//            case d51:
//                str = x51;
//                break;
//            case d52:
//                str = x52;
//                break;
//            case d53:
//                str = x53;
//                break;
//            case d54:
//                str = x54;
//                break;
//            case d55:
//                str = x55;
//                break;
//            case d56:
//                str = x56;
//                break;
//            case d57:
//                str = x57;
//                break;
//            case d58:
//                str = x58;
//                break;
//            case d58Span01:
//                str = x58Span01;
//                break;
//            case d58Span02:
//                str = x58Span02;
//                break;
//            case d58Span03:
//                str = x58Span03;
//                break;
//            case d58Span04:
//                str = x58Span04;
//                break;
//            case d58Span05:
//                str = x58Span05;
//                break;
//            case d58Span06:
//                str = x58Span06;
//                break;
//            case d58Span07:
//                str = x58Span07;
//                break;
//            case d58Span08:
//                str = x58Span08;
//                break;
//            case d58Span09:
//                str = x58Span09;
//                break;
//            case d58Span10:
//                str = x58Span10;
//                break;
//            case d58Span11:
//                str = x58Span11;
//                break;
//            case d58Span12:
//                str = x58Span12;
//                break;
//            case d58Span13:
//                str = x58Span13;
//                break;
//        }
//        return str;
//
//    }


}
