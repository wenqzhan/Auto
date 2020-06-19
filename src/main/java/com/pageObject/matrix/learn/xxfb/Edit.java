package com.pageObject.matrix.learn.xxfb;

import com.utils.json.JsonObject;
import lombok.Data;

@Data
public class Edit extends JsonObject {
//    private CommonObject commonObject = new CommonObject();

    public Edit() {
        setDesPrefix("信息发布-新增/编辑/查看");
        setPrefix("");
        setConVal("");
    }

    private String edit = "http://10.187.144.60:8080/learn/xxfb/edit";

    private String dSaveButtonSpan;
    //"信息发布-新增/编辑/查看-保存按钮-span";
    private String xSaveButtonSpan;
    //span[1=1 and contains(text(),"保存")]

    private String dPreviewButton;
    //"信息发布-新增/编辑/查看-预览按钮-span";
    private String xPreviewButton;
    //span[1=1 and contains(text(),"预览")]

    private String dBackButtonSpan;
    //"信息发布-新增/编辑/查看-返回按钮-span";
    private String xBackButtonSpan;
    //span[1=1 and contains(text(),"返回")]

    private String dAttachmentAccessViewOnlySpan;
    //信息发布-新增/编辑/查看-附件权限-查看radio-span
    private String xAttachmentAccessViewOnlySpan;
    //label[1=1 and contains(@title,"附件权限")]/../following-sibling::*[1]//span[text()='查看']


    private String dAttachmentAccessViewOnlySpanRadioSpan;
    //信息发布-新增/编辑/查看-附件权限-查看radio-span-小圈圈
    private String xAttachmentAccessViewOnlySpanRadioSpan;
    //label[1=1 and contains(@title,"附件权限")]/../following-sibling::*[1]//span[text()='查看']/preceding-sibling::span


    private String dAttachmentAccessViewAndDownloadSpan;
    //信息发布-新增/编辑/查看-附件权限-查看&下载radio-span
    private String xAttachmentAccessViewAndDownloadSpan;
    //label[1=1 and contains(@title,"附件权限")]/../following-sibling::*[1]//span[text()='查看&下载']

    private String dAttachmentAccessViewAndDownloadSpanRadioSpan;
    //信息发布-新增/编辑/查看-附件权限-看&下载radio-span-小圈圈
    private String xAttachmentAccessViewAndDownloadSpanRadioSpan;
    //label[1=1 and contains(@title,"附件权限")]/../following-sibling::*[1]//span[text()='看&下载']/preceding-sibling::span

    private String dIsWaterMarkedYesSpan;
    //信息发布-新增/编辑/查看-水印-有水印radio-span
    private String xIsWaterMarkedYesSpan;
    //label[1=1 and contains(@title,"水印")]/../following-sibling::*[1]//span[text()='有水印']

    private String dIsWaterMarkedYesSpanRadioSpan;
    //信息发布-新增/编辑/查看-附件权限-有水印radio-span-小圈圈
    private String xIsWaterMarkedYesSpanRadioSpan;
    //label[1=1 and contains(@title,"水印")]/../following-sibling::*[1]//span[text()='有水印']/preceding-sibling::span

    private String dIsWaterMarkedNoSpan;
    //信息发布-新增/编辑/查看-水印-无水印radio-span
    private String xIsWaterMarkedNoSpan;
    //label[1=1 and contains(@title,"水印")]/../following-sibling::*[1]//span[text()='无水印']

    private String dIsWaterMarkedNoSpanRadioSpan;
    //信息发布-新增/编辑/查看-附件权限-无水印radio-span-小圈圈
    private String xIsWaterMarkedNoSpanRadioSpan;
    //label[1=1 and contains(@title,"水印")]/../following-sibling::*[1]//span[text()='无水印']/preceding-sibling::span

    private String dTitleInput;
    //信息发布-新增/编辑/查看-标题输入框-input
    private String xTitleInput;
    //label[1=1 and text()='标题']/../following-sibling::*[1]//input

    private String dMainBodyInput;
    //信息发布-新增/编辑/查看-正文摘要框-input
    private String xMainBodyInput;
    //label[1=1 and text()='正文摘要']/../following-sibling::*[1]//input

    private String dTitleImageInput;
    //信息发布-新增/编辑/查看-标题图片框-input
    private String xTitleImageInput;
    //label[1=1 and text()='标题图片']/../following-sibling::*[1]//input

    private String dTitleImageInputUploadFileStatus;
    //信息发布-新增/编辑-标题图片框-input-上传status-div
    private String xTitleImageInputUploadFileStatus;
    //label[1=1 and text()='标题图片']/../following-sibling::*[1]//input/../../following-sibling::div

    private String dTitleImageInputUploadFile;
    //信息发布-新增/编辑-标题图片框-input-上传status-div-文件-span
    private String xTitleImageInputUploadFile;
    //label[1=1 and text()='标题图片']/../following-sibling::*[1]//input/../../following-sibling::div//span[@title]

    private String dTitleImageInputUploadFileCross;
    //信息发布-新增/编辑-标题图片框-input-上传-删除-i
    private String xTitleImageInputUploadFileCross;
    //label[1=1 and text()='标题图片']/../following-sibling::*[1]//input/../../following-sibling::div//i[1=1 and contains(@class,'close-circle') or contains(@class,'anticon-close')]

    private String dSummaryTextarea;
    //信息发布-新增/编辑/查看-摘要框-input
    private String xSummaryTextarea;
    //label[1=1 and text()='摘要']/../following-sibling::*[1]//textarea

    private String dPublisherIpnt;
    //信息发布-新增/编辑/查看-发布人框-input
    private String xPublisherIpnt;
    //label[1=1 and text()='发布人']/../following-sibling::*[1]//input

    private String dClassificationDiv;
    //"信息发布-新增/编辑/查看-分类框-div";////
    private String xClassificationDiv;
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]

    private String dClassificationDivRendered;
    //信息发布-新增/编辑/查看-分类框-div-rendered-span
    private String xClassificationDivRendered;
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//div[contains(@class,"rendered")]//span

    private String dClassificationDivApplicationCasesSpan;
    // "信息发布-新增/编辑/查看-分类框-应用案例-span";////
    private String xClassificationDivApplicationCasesSpan;
    //span[1=1 and @title='应用案例']

    private String dClassificationDivInstitutionsAnnouncementSpan;
    //"信息发布-新增/编辑/查看-分类框-制度公告-span";////
    private String xClassificationDivInstitutionsAnnouncementSpan;
    //span[1=1 and @title='制度公告']

    private String dClassificationDivSystemIntroductionSpan;
    //"信息发布-新增/编辑/查看-分类框-系统介绍-span";////
    private String xClassificationDivSystemIntroductionSpan;
    //span[1=1 and @title='系统介绍']

    private String dClassificationDivVocationalStudySpan;
    //"信息发布-新增/编辑/查看-分类框-业务学习-span";////
    private String xClassificationDivVocationalStudySpan;
    //span[1=1 and @title='业务学习']

    private String dClassificationDivFAQSpan;
    //"信息发布-新增/编辑/查看-分类框-常见问答-span";////
    private String xClassificationDivFAQSpan;
    //span[1=1 and @title='常见问答']

    private String dClassificationDivMustReadTodaySpan;
    //"信息发布-新增/编辑/查看-分类框-今日必读-span";////-----------
    private String xClassificationDivMustReadTodaySpan;
    //span[1=1 and @title='今日必读']

    private String dClassificationDivServiceProductsSpan;
    //"信息发布-新增/编辑/查看-分类框-服务产品-span";////
    private String xClassificationDivServiceProductsSpan;
    //span[1=1 and @title='服务产品']

    private String dClassificationDivDataServiceSpan;
    //"信息发布-新增/编辑/查看-分类框-数据服务-span";////
    private String xClassificationDivDataServiceSpan;
    //span[1=1 and @title='数据服务']

    private String dClassificationDivIndustryAnalysisSpan;
    //"信息发布-新增/编辑/查看-分类框-行业分析-span";////
    private String xClassificationDivIndustryAnalysisSpan;
    //span[1=1 and @title='行业分析']

    private String dClassificationDivMarketingPlatformSpan;
    //"信息发布-新增/编辑/查看-分类框-营销平台-span";////
    private String xClassificationDivMarketingPlatformSpan;
    //span[1=1 and @title='营销平台']

    private String dClassificationDivBizOrgSpan;
    //"信息发布-新增/编辑/查看-分类框-企业机构-span";////----------
    private String xClassificationDivBizOrgSpan;
    //span[1=1 and @title='企业机构']

    private String dClassificationDivMarketDynamicsSpan;
    //"信息发布-新增/编辑/查看-分类框-市场动态-span";////
    private String xClassificationDivMarketDynamicsSpan;
    //span[1=1 and @title='市场动态']

    private String dClassificationDivResearchAnalysisSpan;
    //"信息发布-新增/编辑/查看-分类框-研究分析-span";////
    private String xClassificationDivResearchAnalysisSpan;
    //span[1=1 and @title='研究分析']


    //////////////////////////////////


    private String dDisplaySetupOfflineSpan;
    //信息发布-新增/编辑/查看-显示设置-下线隐藏radio-span
    private String xDisplaySetupOfflineSpan;
    //label[1=1 and contains(@title,"显示设置")]/../following-sibling::*[1]//span[text()='下线隐藏']

    private String dDisplaySetupOfflineSpanRadioSpan;
    //信息发布-新增/编辑/查看-附件权限-下线隐藏radio-span-小圈圈
    private String xDisplaySetupOfflineSpanRadioSpan;
    //label[1=1 and contains(@title,"显示设置")]/../following-sibling::*[1]//span[text()='下线隐藏']/preceding-sibling::span

    private String dDisplaySetupOnlineSpan;
    //信息发布-新增/编辑/查看-显示设置-公开展示radio-span
    private String xDisplaySetupOnlineSpan;
    //label[1=1 and contains(@title,"显示设置")]/../following-sibling::*[1]//span[text()='公开展示']

    private String dDisplaySetupOnlineSpanRadioSpan;
    //信息发布-新增/编辑/查看-附件权限-下线隐藏radio-span-小圈圈
    private String xDisplaySetupOnlineSpanRadioSpan;
    //label[1=1 and contains(@title,"显示设置")]/../following-sibling::*[1]//span[text()='公开展示']/preceding-sibling::span

    private String dTopOrderInput;
    //信息发布-新增/编辑/查看-置顶顺序框-input
    private String xTopOrderInput;
    //label[1=1 and text()='置顶顺序']/../following-sibling::*[1]//input

    private String dPushTodayMustReadYesSpan;
    //信息发布-新增/编辑/查看-推送今日必读-是radio-span
    private String xPushTodayMustReadYesSpan;
    //label[1=1 and contains(@title,"推送今日必读")]/../following-sibling::*[1]//span[text()='是']

    private String dPushTodayMustReadYesSpanRadioSpan;
    //信息发布-新增/编辑/查看"-附件权限-下是radio-span-小圈圈
    private String xPushTodayMustReadYesSpanRadioSpan;
    //label[1=1 and contains(@title,"推送今日必读")]/../following-sibling::*[1]//span[text()='是']/preceding-sibling::span


    private String dPushTodayMustReadNoSpan;
    //信息发布-新增/编辑/查看-推送今日必读-否radio-span
    private String xPushTodayMustReadNoSpan;
    //label[1=1 and contains(@title,"推送今日必读")]/../following-sibling::*[1]//span[text()='否']

    private String dPushTodayMustReadNoSpanRadioSpan;
    //信息发布-新增/编辑/查看-附件权限-下线隐藏radio-span-小圈圈
    private String xPushTodayMustReadNoSpanRadioSpan;
    //label[1=1 and contains(@title,"推送今日必读")]/../following-sibling::*[1]//span[text()='否']/preceding-sibling::span

    private String dExternalLinkInput;
    //信息发布-新增/编辑/查看-外部链接框-input
    private String xExternalLinkInput;
    //label[1=1 and text()='外部链接']/../following-sibling::*[1]//input

    private String dMainBodyTextIframe;
    //信息发布-新增/编辑/查看-内容框-iframe
    private String xMainBodyTextIframe;
    //label[1=1 and text()='内容']/../following-sibling::*[1]//iframe

    private String dMainBodyTextIframeIframeBody;

    private String xMainBodyTextIframeIframeBody;

    ////////////////////////

    private String dSuccessPromptDivFinal;
    //"通用-XXXX-添加/修改-成功系统提示信息";
    private String xSuccessPromptDivFinal;
    //div[@class='ant-message-notice-content']

    private String dWarningPromptDivFinal;
    //"通用-XXXX-添加/修改-警告系统提示信息";
    private String xWarningPromptDivFinal;
    //div[@class='ant-message-notice-warning']

    private String dNoticePromptDivFinal;
    //通用-XXXX-添加/修改-XX系统提示信息
    private String xNoticePromptDivFinal;
    //div[@class='ant-message-notice-content']/div
    ////////////////////////////


}
