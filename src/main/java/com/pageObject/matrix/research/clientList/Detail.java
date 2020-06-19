package com.pageObject.matrix.research.clientList;

import com.pageObject.matrix.CommonObject;
import com.utils.json.JsonObject;
import lombok.Data;

@Data
public class Detail extends JsonObject {
    private CommonObject commonObject = new CommonObject();

    public Detail() {
        setDesPrefix("研究服务客户-新增/编辑/详情");
        setPrefix("");
        setConVal("");
    }

    private String clientlist =
            "http://10.187.144.60:8080/research/clientList/detail";

    private String dExportButtonSpan;
    private String xExportButtonSpan;

    private String dCustNameInput;
    private String xCustNameInput;
    //客户名称

    private String dCustNameInputSearch;
    private String xCustNameInputSearch;
    //客户名称-search

    private String dUnifiedSocialCreditCodeInput;
    private String xUnifiedSocialCreditCodeInput;
    //统一社会信用代码

    private String dOAAccountInput;
    private String xOAAccountInput;
    //OA账号

    private String dCustLevelInput;
    private String xCustLevelInput;
    //客户级别

    private String dCustTypeInput;
    private String xCustTypeInput;
    //客户类型

    private String dCreditDispatchTypeIncomeCreditDispatchSpan;
    private String xCreditDispatchTypeIncomeCreditDispatchSpan;
    //派点类型-收入派点

    private String dCreditDispatchTypeIncomeCreditDispatchRadioSpan;
    private String xCreditDispatchTypeIncomeCreditDispatchRadioSpan;
    //派点类型-收入派点-小圆点

    private String dCreditDispatchTypeStrategicCreditDispatchSpan;
    private String xCreditDispatchTypeStrategicCreditDispatchSpan;
    //派点类型-战略派点

    private String dCreditDispatchTypeStrategicCreditDispatchRadioSpan;
    private String xCreditDispatchTypeStrategicCreditDispatchRadioSpan;
    //派点类型-战略派点-小圆点

    private String dCreditDispatchWeightsInput;
    private String xCreditDispatchWeightsInput;
    //派点权重

    private String dResearchCustTypeResearchCustSpan;
    private String xResearchCustTypeResearchCustSpan;
    //研究服务客户类型-研究服务客户

    private String dResearchCustTypeResearchCustRadioSpan;
    private String xResearchCustTypeResearchCustRadioSpan;
    //研究服务客户类型-研究服务客户-小圆点

    private String dResearchCustTypeNonResearchCustSpan;
    private String xResearchCustTypeNonResearchCustSpan;
    //研究服务客户类型-非研究服务客户

    private String dResearchCustTypeNonResearchCustRadioSpan;
    private String xResearchCustTypeNonResearchCustRadioSpan;
    //研究服务客户类型-非研究服务客户-小圆点

    private String dResearchCustTypeServiceSuspendedSpan;
    private String xResearchCustTypeServiceSuspendedSpan;
    //研究服务客户类型-暂停服务

    private String dResearchCustTypeServiceSuspendedRadioSpan;
    private String xResearchCustTypeServiceSuspendedRadioSpan;
    //研究服务客户类型-暂停服务-小圆点

    private String dContractPreliminaryReviewAccessYesSpan;
    private String xContractPreliminaryReviewAccessYesSpan;
    //签约初审准入-是

    private String dContractPreliminaryReviewAccessYesRadioSpan;
    private String xContractPreliminaryReviewAccessYesRadioSpan;
    //签约初审准入-是-小圆点

    private String dContractPreliminaryReviewAccessNoSpan;
    private String xContractPreliminaryReviewAccessNoSpan;
    //签约初审准入-否

    private String dContractPreliminaryReviewAccessNoRadioSpan;
    private String xContractPreliminaryReviewAccessNoRadioSpan;
    //签约初审准入-否-小圆点

    private String dResearchLevelDiv;
    private String xResearchLevelDiv;
    //研究服务等级

    private String dResearchLevelRenderedSpan;
    private String xResearchLevelRenderedSpan;

    private String dResearchLevelSpanA;
    private String xResearchLevelSpanA;
    //研究服务等级-A

    private String dResearchLevelSpanB;
    private String xResearchLevelSpanB;
    //研究服务等级-B

    private String dResearchLevelSpanC;
    private String xResearchLevelSpanC;
    //研究服务等级-C

    private String dResearchLevelSpanD;
    private String xResearchLevelSpanD;
    //研究服务等级-D

    private String dResearchLevelSpanE;
    private String xResearchLevelSpanE;
    //研究服务等级-E

    private String dResearchDueDateInput;
    private String xResearchDueDateInput;
    //研究服务到期日

    private String dResearchContractStateDiv;
    private String xResearchContractStateDiv;
    //研究服务签约状态

    private String dResearchSignedDateInput;
    private String xResearchSignedDateInput;
    //签约时间

    private String dCustChannelPublicOfferSpan;
    private String xCustChannelPublicOfferSpan;
    //客户渠道-公募

    private String dCustChannelPublicOfferRadioSpan;
    private String xCustChannelPublicOfferRadioSpan;
    //客户渠道-公募-小圆点

    private String dCustChannelNonPublicOfferSpan;
    private String xCustChannelNonPublicOfferSpan;
    //客户渠道-非公募

    private String dCustChannelNonPublicOfferRadioSpan;
    private String xCustChannelNonPublicOfferRadioSpan;
    //客户渠道-非公募-小圆点

    private String dCustChannelOtherSpan;
    private String xCustChannelOtherSpan;
    //客户渠道-其他

    private String dCustChannelOtherRadioSpan;
    private String xCustChannelOtherRadioSpan;
    //客户渠道-其他-小圆点

    private String dIsCoreCustYesSpan;
    private String xIsCoreCustYesSpan;
    //是否核心客户-是

    private String dIsCoreCustYesSpanRadioSpan;
    private String xIsCoreCustYesSpanRadioSpan;
    //是否核心客户-是-小圆点

    private String dIsCoreCustNoSpan;
    private String xIsCoreCustNoSpan;
    //是否核心客户-否

    private String dIsCoreCustNoSpanRadioSpan;
    private String xIsCoreCustNoSpanRadioSpan;
    //是否核心客户-否-小圆点

    private String dIsPotentialCustYesSpan;
    private String xIsPotentialCustYesSpan;
    //是否潜在客户-是

    private String dIsPotentialCustYesRadioSpan;
    private String xIsPotentialCustYesRadioSpan;
    //是否潜在客户-是-小圆点

    private String dIsPotentialCustNoSpan;
    private String xIsPotentialCustNoSpan;
    //是否潜在客户-否

    private String dIsPotentialCustNoRadioSpan;
    private String xIsPotentialCustNoRadioSpan;
    //是否潜在客户-否-小圆点

    private String dActivityLimitsResearchCustManagerSpan;
    private String xActivityLimitsResearchCustManagerSpan;
    //活动权限-研究服务客户经理

    private String dActivityLimitsResearchCustManagerCheckBoxSpan;
    private String xActivityLimitsResearchCustManagerCheckBoxSpan;
    //活动权限-研究服务客户经理-小框框


    private String dActivityLimitsJointResearchSpan;
    private String xActivityLimitsJointResearchSpan;
    //活动权限-联合调研

    private String dActivityLimitsJointResearchCheckBoxSpan;
    private String xActivityLimitsJointResearchCheckBoxSpan;
    //活动权限-联合调研-小框框

    private String dActivityLimitsConferenceSpan;
    private String xActivityLimitsConferenceSpan;
    //活动权限-大型会议

    private String dActivityLimitsConferenceCheckBoxSpan;
    private String xActivityLimitsConferenceCheckBoxSpan;
    //活动权限-大型会议-小框框

    private String dActivityLimitsSmallScaleCommunicationSpan;
    private String xActivityLimitsSmallScaleCommunicationSpan;
    //活动权限-小范围交流

    private String dActivityLimitsSmallScaleCommunicationCheckBoxSpan;
    private String xActivityLimitsSmallScaleCommunicationCheckBoxSpan;
    //活动权限-小范围交流-小框框

    private String dActivityLimitsTelephoneConferenceSpan;
    private String xActivityLimitsTelephoneConferenceSpan;
    //活动权限-电话会议

    private String dActivityLimitsTelephoneConferenceCheckBoxSpan;
    private String xActivityLimitsTelephoneConferenceCheckBoxSpan;
    //活动权限-电话会议-小框框

    private String dVintexPushDiv;
    private String xVintexPushDiv;
    //道合推送

    private String dOfficePostcodeInput;
    private String xOfficePostcodeInput;
    //办公邮编

    private String dOfficeCentralTelephoneExchangeNoInput;
    private String xOfficeCentralTelephoneExchangeNoInput;
    //公司总机

    private String dOfficeFaxNoInput;
    private String xOfficeFaxNoInput;
    //公司传真

    private String dOfficeProvinceCityDiv;
    private String xOfficeProvinceCityDiv;
    //办公省市

    private String dOfficeProvinceCityPickerSpan;
    private String xOfficeProvinceCityPickerSpan;

    private String dHostAccountManagerInput;
    private String xHostAccountManagerInput;
    //主办客户经理

    private String dCoOrganizingAccountManagerInput;
    private String xCoOrganizingAccountManagerInput;
    //协办客户经理

    private String dTeamBelongedInput;
    private String xTeamBelongedInput;
    //所属团队

    private String dSaveButtonSpan;
    private String xSaveButtonSpan;
    //保存按钮

    private String dBackButtonSpan;
    private String xBackButtonSpan;
    //返回按钮
}
