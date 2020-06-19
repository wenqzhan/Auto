package com.pageObject.matrix.research.client;

import com.pageObject.matrix.CommonObject;
//import com.pageObject.matrix.commonObject.CommonObjectPopped;
import com.utils.json.JsonObject;
import lombok.Data;

@Data
public class ClientList extends JsonObject {
    //    private CommonObjectPopped commonObjectPopped = new CommonObjectPopped();
    private CommonObject commonObject = new CommonObject();

    public ClientList() {
        setDesPrefix("研究服务客户");
        setPrefix("");
        setConVal("");
    }

    private String clientlist =
            "http://10.187.144.60:8080/research/client/clientList";


    private String dCustNameInput;
    //研究服务客户-客户名称框-input
    private String xCustNameInput;
    //label[1=1 and contains(text(),"客户名称")]/../following-sibling::*[1]//input

    private String dCustNameInputSearch;
    //"通用-客户名称框-input-search按钮-i";
    private String xCustNameInputSearch;
    //label[1=1 and contains(text(),"客户名称")]/../following-sibling::*[1]//input/following-sibling::*//i[1=1 and contains(@class,'')]

    private String dIsCoreCustYesSpan;
    //研究服务客户-是否核心客户-是radio-span
    private String xIsCoreCustYesSpan;
    //label[1=1 and contains(@title,"是否核心客户")]/../following-sibling::*[1]//span[text()='是']

    private String dIsCoreCustYesSpanRadioSpan;
    //研究服务客户-附件权限-下线隐藏radio-span-小圈圈
    private String xIsCoreCustYesSpanRadioSpan;
    //label[1=1 and contains(@title,"是否核心客户")]/../following-sibling::*[1]//span[text()='是']/preceding-sibling::span

    private String dIsCoreCustNoSpan;
    //研究服务客户-是否核心客户-否radio-span
    private String xIsCoreCustNoSpan;
    //label[1=1 and contains(@title,"推送今日必读")]/../following-sibling::*[1]//span[text()='否']

    private String dIsCoreCustNoSpanRadioSpan;
    //研究服务客户-附件权限-下线隐藏radio-span-小圈圈
    private String xIsCoreCustNoSpanRadioSpan;
    //label[1=1 and contains(@title,"是否核心客户")]/../following-sibling::*[1]//span[text()='否']/preceding-sibling::span

    private String dResearchLevelDiv;
    //研究服务客户-研究服务等级-div";/////
    private String xResearchLevelDiv;/////,,,,,,,
    //label[1=1 and contains(text(),"研究服务等级")]/../following-sibling::div[1]

    private String dResearchLevelSpanA;
    private String xResearchLevelSpanA;

    private String dResearchLevelSpanB;
    private String xResearchLevelSpanB;

    private String dResearchLevelSpanC;
    private String xResearchLevelSpanC;

    private String dResearchLevelSpanD;
    private String xResearchLevelSpanD;

    private String dResearchLevelSpanE;
    private String xResearchLevelSpanE;


    private String dResearchContractStateDiv;
    //研究服务客户-研究服务签约状态-div";/////
    private String xResearchContractStateDiv;/////
    //label[1=1 and contains(text(),"研究服务签约状态")]/../following-sibling::div[1]

    private String dResearchContractStateSpanNil;
    private String xResearchContractStateSpanNil;

    private String dResearchContractStateSpanSigning;
    private String xResearchContractStateSpanSigning;

    private String dResearchContractStateSpanSigned;
    private String xResearchContractStateSpanSigned;

    private String dResearchContractStateSpanPostponed;
    private String xResearchContractStateSpanPostponed;

    private String dResearchDueDateInput;
    //研究服务客户-研究服务到期日-input";
    private String xResearchDueDateInput;
    //label[1=1 and contains(text(),"研究服务到期日")]/../following-sibling::*[1]//input

    private String dCustManagerInput;
    //研究服务客户-客户经理框-input
    private String xCustManagerInput;
    //label[1=1 and contains(text(),"客户经理")]/../following-sibling::*[1]//input

    private String dTeamBelongedInput;
    //研究服务客户-所属团队-input";
    private String xTeamBelongedInput;
    //label[1=1 and contains(text(),"所属团队")]/../following-sibling::*[1]//input

    private String dTeamBelongedInputSearchI;
    //研究服务客户-所属团队-input-serach-i";
    private String xTeamBelongedInputSearchI;
    //label[1=1 and contains(text(),"所属团队")]/../following-sibling::*[1]//input/following-sibling::*//i[1=1 and contains(@class,'')]

    private String dUnifiedSocialCreditCodeInput;
    //研究服务客户-所属团队-input";
    private String xUnifiedSocialCreditCodeInput;
    //label[1=1 and contains(text(),"统一社会信用代码")]/../following-sibling::*[1]//input

    private String dCustLevel;
    //研究服务客户-客户级别-div";/////
    private String xCustLevel;/////
    //label[1=1 and contains(text(),"客户级别")]/../following-sibling::div[1]

    private String dCustLevelSpanGroup;
    private String xCustLevelSpanGroup;

    private String dCustLevelSpanDistrict;
    private String xCustLevelSpanDistrict;

    private String dCustLevelSpanDepart;
    private String xCustLevelSpanDepart;

    private String dCustLevelSpanOrdinary;
    private String xCustLevelSpanOrdinary;

    private String dCustTypeInput;
    //研究服务客户-客户类型-input";
    private String xCustTypeInput;
    //label[1=1 and contains(text(),"客户类型")]/../following-sibling::*[1]//input

    private String dCustTypeInputSearch;
    //研究服务客户-客户类型-input-serach-i";
    private String xCustTypeInputSearch;
    //label[1=1 and contains(text(),"客户类型")]/../following-sibling::*[1]//input/following-sibling::*//i[1=1 and contains(@class,'')]

    private String dNewButtonSpan;
    private String xNewButtonSpan;
    //新增按钮

}
