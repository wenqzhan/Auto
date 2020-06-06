package com.pageObject.matrix.learn.xxfb;

import com.pageObject.commonObject.CommonObject;
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

    private String d60;
    //"信息发布-新增/编辑/查看-保存按钮-span";
    private String x60;
    //span[1=1 and contains(text(),"保存")]

    private String d61;
    //"信息发布-新增/编辑/查看-预览按钮-span";
    private String x61;
    //span[1=1 and contains(text(),"预览")]

    private String d62;
    //"信息发布-新增/编辑/查看-返回按钮-span";
    private String x62;
    //span[1=1 and contains(text(),"返回")]

    private String d63;
    //信息发布-新增/编辑/查看-附件权限-查看radio-span
    private String x63;
    //label[1=1 and contains(@title,"附件权限")]/../following-sibling::*[1]//span[text()='查看']


    private String d63RadioSpan;
    //信息发布-新增/编辑/查看-附件权限-查看radio-span-小圈圈
    private String x63RadioSpan;
    //label[1=1 and contains(@title,"附件权限")]/../following-sibling::*[1]//span[text()='查看']/preceding-sibling::span


    private String d64;
    //信息发布-新增/编辑/查看-附件权限-查看&下载radio-span
    private String x64;
    //label[1=1 and contains(@title,"附件权限")]/../following-sibling::*[1]//span[text()='查看&下载']

    private String d64RadioSpan;
    //信息发布-新增/编辑/查看-附件权限-看&下载radio-span-小圈圈
    private String x64RadioSpan;
    //label[1=1 and contains(@title,"附件权限")]/../following-sibling::*[1]//span[text()='看&下载']/preceding-sibling::span

    private String d65;
    //信息发布-新增/编辑/查看-水印-有水印radio-span
    private String x65;
    //label[1=1 and contains(@title,"水印")]/../following-sibling::*[1]//span[text()='有水印']

    private String d65RadioSpan;
    //信息发布-新增/编辑/查看-附件权限-有水印radio-span-小圈圈
    private String x65RadioSpan;
    //label[1=1 and contains(@title,"水印")]/../following-sibling::*[1]//span[text()='有水印']/preceding-sibling::span

    private String d66;
    //信息发布-新增/编辑/查看-水印-无水印radio-span
    private String x66;
    //label[1=1 and contains(@title,"水印")]/../following-sibling::*[1]//span[text()='无水印']

    private String d66RadioSpan;
    //信息发布-新增/编辑/查看-附件权限-无水印radio-span-小圈圈
    private String x66RadioSpan;
    //label[1=1 and contains(@title,"水印")]/../following-sibling::*[1]//span[text()='无水印']/preceding-sibling::span

    private String d67;
    //信息发布-新增/编辑/查看-标题输入框-input
    private String x67;
    //label[1=1 and text()='标题']/../following-sibling::*[1]//input

    private String d68;
    //信息发布-新增/编辑/查看-正文摘要框-input
    private String x68;
    //label[1=1 and text()='正文摘要']/../following-sibling::*[1]//input

    private String d69;
    //信息发布-新增/编辑/查看-标题图片框-input
    private String x69;
    //label[1=1 and text()='标题图片']/../following-sibling::*[1]//input

    private String d69UploadFileStatus;
    //信息发布-新增/编辑-标题图片框-input-上传status-div
    private String x69UploadFileStatus;
    //label[1=1 and text()='标题图片']/../following-sibling::*[1]//input/../../following-sibling::div

    private String d69UploadFile;
    //信息发布-新增/编辑-标题图片框-input-上传status-div-文件-span
    private String x69UploadFile;
    //label[1=1 and text()='标题图片']/../following-sibling::*[1]//input/../../following-sibling::div//span[@title]

    private String d69UploadFileCross;
    //信息发布-新增/编辑-标题图片框-input-上传-删除-i
    private String x69UploadFileCross;
    //label[1=1 and text()='标题图片']/../following-sibling::*[1]//input/../../following-sibling::div//i[1=1 and contains(@class,'close-circle') or contains(@class,'anticon-close')]

    private String d70;
    //信息发布-新增/编辑/查看-摘要框-input
    private String x70;
    //label[1=1 and text()='摘要']/../following-sibling::*[1]//textarea

    private String d71;
    //信息发布-新增/编辑/查看-发布人框-input
    private String x71;
    //label[1=1 and text()='发布人']/../following-sibling::*[1]//input

    private String d58;
    //"信息发布-新增/编辑/查看-分类框-div";////
    private String x58;
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]

    private String d58Rendered;
    //信息发布-新增/编辑/查看-分类框-div-rendered-span
    private String x58Rendered;
    //label[1=1 and contains(text(),"分类")]/../following-sibling::div[1]//div[contains(@class,"rendered")]//span

    private String d58Span01;
    // "信息发布-新增/编辑/查看-分类框-应用案例-span";////
    private String x58Span01;
    //span[1=1 and @title='应用案例']

    private String d58Span02;
    //"信息发布-新增/编辑/查看-分类框-制度公告-span";////
    private String x58Span02;
    //span[1=1 and @title='制度公告']

    private String d58Span03;
    //"信息发布-新增/编辑/查看-分类框-系统介绍-span";////
    private String x58Span03;
    //span[1=1 and @title='系统介绍']

    private String d58Span04;
    //"信息发布-新增/编辑/查看-分类框-业务学习-span";////
    private String x58Span04;
    //span[1=1 and @title='业务学习']

    private String d58Span05;
    //"信息发布-新增/编辑/查看-分类框-常见问答-span";////
    private String x58Span05;
    //span[1=1 and @title='常见问答']

    private String d58Span06;
    //"信息发布-新增/编辑/查看-分类框-今日必读-span";////-----------
    private String x58Span06;
    //span[1=1 and @title='今日必读']

    private String d58Span07;
    //"信息发布-新增/编辑/查看-分类框-服务产品-span";////
    private String x58Span07;
    //span[1=1 and @title='服务产品']

    private String d58Span08;
    //"信息发布-新增/编辑/查看-分类框-数据服务-span";////
    private String x58Span08;
    //span[1=1 and @title='数据服务']

    private String d58Span09;
    //"信息发布-新增/编辑/查看-分类框-行业分析-span";////
    private String x58Span09;
    //span[1=1 and @title='行业分析']

    private String d58Span10;
    //"信息发布-新增/编辑/查看-分类框-营销平台-span";////
    private String x58Span10;
    //span[1=1 and @title='营销平台']

    private String d58Span11;
    //"信息发布-新增/编辑/查看-分类框-企业机构-span";////----------
    private String x58Span11;
    //span[1=1 and @title='企业机构']

    private String d58Span12;
    //"信息发布-新增/编辑/查看-分类框-市场动态-span";////
    private String x58Span12;
    //span[1=1 and @title='市场动态']

    private String d58Span13;
    //"信息发布-新增/编辑/查看-分类框-研究分析-span";////
    private String x58Span13;
    //span[1=1 and @title='研究分析']


    //////////////////////////////////


    private String d72;
    //信息发布-新增/编辑/查看-显示设置-下线隐藏radio-span
    private String x72;
    //label[1=1 and contains(@title,"显示设置")]/../following-sibling::*[1]//span[text()='下线隐藏']

    private String d72RadioSpan;
    //信息发布-新增/编辑/查看-附件权限-下线隐藏radio-span-小圈圈
    private String x72RadioSpan;
    //label[1=1 and contains(@title,"显示设置")]/../following-sibling::*[1]//span[text()='下线隐藏']/preceding-sibling::span

    private String d73;
    //信息发布-新增/编辑/查看-显示设置-公开展示radio-span
    private String x73;
    //label[1=1 and contains(@title,"显示设置")]/../following-sibling::*[1]//span[text()='公开展示']

    private String d73RadioSpan;
    //信息发布-新增/编辑/查看-附件权限-下线隐藏radio-span-小圈圈
    private String x73RadioSpan;
    //label[1=1 and contains(@title,"显示设置")]/../following-sibling::*[1]//span[text()='公开展示']/preceding-sibling::span

    private String d74;
    //信息发布-新增/编辑/查看-置顶顺序框-input
    private String x74;
    //label[1=1 and text()='置顶顺序']/../following-sibling::*[1]//input

    private String d75;
    //信息发布-新增/编辑/查看-推送今日必读-是radio-span
    private String x75;
    //label[1=1 and contains(@title,"推送今日必读")]/../following-sibling::*[1]//span[text()='是']

    private String d75RadioSpan;
    //信息发布-新增/编辑/查看"-附件权限-下是radio-span-小圈圈
    private String x75RadioSpan;
    //label[1=1 and contains(@title,"推送今日必读")]/../following-sibling::*[1]//span[text()='是']/preceding-sibling::span


    private String d76;
    //信息发布-新增/编辑/查看-推送今日必读-否radio-span
    private String x76;
    //label[1=1 and contains(@title,"推送今日必读")]/../following-sibling::*[1]//span[text()='否']

    private String d76RadioSpan;
    //信息发布-新增/编辑/查看-附件权限-下线隐藏radio-span-小圈圈
    private String x76RadioSpan;
    //label[1=1 and contains(@title,"推送今日必读")]/../following-sibling::*[1]//span[text()='否']/preceding-sibling::span

    private String d77;
    //信息发布-新增/编辑/查看-外部链接框-input
    private String x77;
    //label[1=1 and text()='外部链接']/../following-sibling::*[1]//input

    private String d78;
    //信息发布-新增/编辑/查看-内容框-iframe
    private String x78;
    //label[1=1 and text()='内容']/../following-sibling::*[1]//iframe

    private String d78IframeBody;

    private String x78IframeBody;

    ////////////////////////

    private String d48Final;
    //"通用-XXXX-添加/修改-成功系统提示信息";
    private String x48Final;
    //div[@class='ant-message-notice-content']

    private String d79Final;
    //"通用-XXXX-添加/修改-警告系统提示信息";
    private String x79Final;
    //div[@class='ant-message-notice-warning']

    private String d80Final;
    //通用-XXXX-添加/修改-XX系统提示信息
    private String x80Final;
    //div[@class='ant-message-notice-content']/div
    ////////////////////////////


}
