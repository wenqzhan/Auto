package com.pageObject.matrix;

import com.alibaba.fastjson.JSONObject;
import com.pageObject.commonObject.CommonObject;
import com.pageObject.commonObject.CommonObjectPopped;
import com.utils.json.JsonObject;
import lombok.Data;

@Data
public class AttachmentUpload extends JsonObject {
    CommonObjectPopped commonObjectPopped = new CommonObjectPopped();
    CommonObject commonObject = new CommonObject();

    public AttachmentUpload() {
        this.prefix = "//label[1=1 and text()='附件']/../following-sibling::*[1]";
        super.setPrefix(this.prefix);
        setConVal("附件");
    }


    public AttachmentUpload(String label) {
        String prefix;
        boolean popped = label.endsWith("Popped");
        if (popped) {
            prefix = this.prefix;
            label = label.replace("Popped", "");
        } else {
            prefix = "";
        }
        //label[1=1 and text()='附件']/../following-sibling::*[1]
//        System.out.println("!@#!@#!@#!@#");
        prefix = prefix + "//label[1=1 and text()='" + label + "']/../following-sibling::*[1]";
        this.prefix = prefix;
//        System.out.println(prefix);
//        System.out.println("!@#!@#!@#!@#");
        if (popped) {
            label = "popped:" + label;
        }
        super.setPrefix(this.prefix);
        setConVal(label);
    }

    private String prefix = commonObjectPopped.getPrefix();

    private String dUpload = "通用-点击或将文件拖拽到这里上传";
    private String xUpload = "//p[text()='点击或将文件拖拽到这里上传']";

    private String dUploadInput = "通用-点击或将文件拖拽到这里上传-input";
    private String xUploadInput = xUpload + "/../../input";
    //p[text()='点击或将文件拖拽到这里上传']/../../input

    private String dUploadPUploading = "通用-上传文件-上传中-span";
    private String xUploadPUploading = "//div[contains(@class,\"item-uploading\")]";


    private String dUploadPUploadingCross = "通用-上传文件-上传中-删除-i";
    private String xUploadPUploadingCross = commonObject.getCross(xUploadPUploading);
    //div[contains(@class,"item-uploading")]//i[1=1 and contains(@class,'close-circle') or contains(@class,'anticon-close')]


    private String dUploadPUploadDone = "通用-上传文件-上传成功-span";
    private String xUploadPUploadDone = "//div[contains(@class,\"item-done\")]";


    private String dUploadPUploadDoneCross = "通用-上传文件-上传成功-删除-i";
    private String xUploadPUploadDoneCross = commonObject.getCross(xUploadPUploadDone);
    //div[contains(@class,"item-done")]//i[1=1 and contains(@class,'close-circle') or contains(@class,'anticon-close')]

    private String dUploadPUploadDoneFile = "通用-上传文件-上传成功的文件-span";
    private String xUploadPUploadDoneFile = "//div[contains(@class,\"item-done\")]";


    private String dUploadPUploadError = "通用-上传文件-上传失败-span";
    private String xUploadPUploadError = "//div[contains(@class,\"item-error\")]";

    private String dUploadUploadErrorCross = "通用-上传文件-上传失败-删除-i";
    private String xUploadUploadErrorCross = commonObject.getCross(xUploadPUploadError);
    //div[contains(@class,"item-error")]//i[1=1 and contains(@class,'close-circle') or contains(@class,'anticon-close')]

    private String dUploadUpload = "通用-上传文件-上传**-span";
    private String xUploadUpload = "//div[contains(@class,\"item-done\") or contains(@class,\"item-uploading\") or contains(@class,\"item-error\")]";

    private String dUploadUploadCross = "通用-上传文件-上传**-删除-i";
    private String xUploadUploadCross = commonObject.getCross(xUploadUpload);;
//label[1=1 and text()='附件']/../following-sibling::*[1] //div[contains(@class,"item-done") or contains(@class,"item-uploading") or contains(@class,"item-error")  ]//i[1=1 and contains(@class,'close-circle') or contains(@class,'anticon-close')]

    private String d48Final = "通用-成功系统提示信息";
    private String x48Final = commonObject.getX48Final();


    private String get$DUploadedFile(int num) {
        String description = "通用-上传文件后显示的第";
        if (num > 0) {

            description = description + num + "个";
        } else if (num == 0) {
            description = description + "所有" + "个";
            ;
        } else if (num == -1) {
            description = description + "最后" + "个";
            ;
        } else {
            description = "error, the num input must be [-1,∞)";
        }
        return description;
    }


    private String get$XUploadedFile(int num) {
        String xpath = super.getPrefix() + "//div[contains(@class,\"upload-drag\")]/following-sibling::div[contains(@class,\"upload-list-text\")]/div[contains(@class,\"\")]";
        if (num > 0) {
            //div[contains(@class,"upload-drag")]/following-sibling::div[contains(@class,"upload-list-text")]/div[contains(@class,"")][1]//span[@title]
            xpath = xpath + "[" + num + "]//a[@title]";
        } else if (num == 0) {
            xpath = xpath;
        } else if (num == -1) {
            xpath = xpath + "[" + "last()" + "]//a[@title]";
        } else {
            xpath = "error, the num input must be [-1,∞)";
        }

        return xpath;
    }

    public JSONObject get$UploadedFile(int num) {
        JsonObject.setJsonObject(get$DUploadedFile(num), get$XUploadedFile(num));

        return JsonObject.getJsonObject();
    }


    private String get$DUploadedFileStatus(int num, String status) {
        String description = "通用-上传文件后显示的第";
        if (num > 0) {

            description = description + num + "个";
        } else if (num == 0) {
            description = description + "所有" + "个";
            ;
        } else if (num == -1) {
            description = description + "最后" + "个";
            ;
        } else {
            description = "error, the num input must be [-1,∞)";
        }
        if (description.contains("个")) {
            description = description + status;
        }

        return description;
    }


    private String get$XUploadedFileStatus(int num, String status) {
        String s = "";
        if (status.equals("上传成功")) {
            s = "\"item-done\"";
        } else if (status.equals("上传中")) {
            s = "\"item-uploading\"";
        } else if (status.equals("上传失败")) {
            s = "\"item-error\"";
        } else {
            s = "\"\"";
        }


        String xpath = super.getPrefix() + "//div[contains(@class,\"upload-drag\")]/following-sibling::div[contains(@class,\"upload-list-text\")]/div[contains(@class,";
        xpath = xpath + s + ")]";
        if (num > 0) {
            //div[contains(@class,"upload-drag")]/following-sibling::div[contains(@class,"upload-list-text")]/div[contains(@class,"")][1]//span[@title]
            xpath = xpath + "[" + num + "]";
        } else if (num == 0) {
            xpath = xpath;
        } else if (num == -1) {
            xpath = xpath + "[" + "last()" + "]";
        } else {
            xpath = "error, the num input must be [-1,∞)";
        }


        return xpath;
    }


    public JSONObject get$UploadedFileStatus(int num) {
        JsonObject.setJsonObject(get$DUploadedFileStatus(num, "status"), get$XUploadedFileStatus(num, "status"));

        return JsonObject.getJsonObject();
    }


    public JSONObject get$UploadedFileStatus(int num, String status) {
        JsonObject.setJsonObject(get$DUploadedFileStatus(num, status), get$XUploadedFileStatus(num, status));

        return JsonObject.getJsonObject();
    }


}
