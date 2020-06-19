package com.actions.matrix;

import com.alibaba.fastjson.JSONObject;
import com.driver.$;
import com.pageObject.matrix.AttachmentUpload;
import com.utils.json.JsonObject;
import com.utils.log.LoggerController;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AttachmentUploadAction extends $ {
    private final static LoggerController log = LoggerController.getLogger(AttachmentUploadAction.class);


    public static boolean deleteAttachments() {
        AttachmentUpload attachmentUpload = new AttachmentUpload();
        attachmentUpload = (AttachmentUpload) attachmentUpload.getObjAttr();
        return deleteAttachments(attachmentUpload);
    }

    public static boolean deleteAttachments(String label) {
        AttachmentUpload attachmentUpload;
        if (label.toLowerCase().contains("popped")) {
            attachmentUpload = new AttachmentUpload(label);
            attachmentUpload = (AttachmentUpload) attachmentUpload.getObjAttr(label);
        } else {
            attachmentUpload = new AttachmentUpload();
            attachmentUpload = (AttachmentUpload) attachmentUpload.getObjAttr();
        }


        return deleteAttachments(attachmentUpload);
    }

    private static boolean deleteAttachments(AttachmentUpload attachmentUpload) {
        boolean flag = true;
        JSONObject jsonObject = attachmentUpload.getJsonObject(attachmentUpload.getDUploadUploadCross());
        List<WebElement> elements1 = findElements(jsonObject, 2, true);
        if (getDriver().toString().toLowerCase().contains("firefox")) {
            deleteAttachments(elements1);
        }else if(getDriver().toString().toLowerCase().contains("chrome")){
            deleteAttachments(jsonObject);
        }

        elements1 = findElements(attachmentUpload.getJsonObject(attachmentUpload.getDUploadUploadCross()), 2, true);
        flag = elements1.size() == 0;
        return flag;
    }


    private static void deleteAttachments(JSONObject jsonObject){
        int num =findElements(jsonObject,2,true).size();
        WebElement element;
        for (int i = 0; i < num; i++) {
            element = findElement(jsonObject);
            click(element);
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void deleteAttachments(List<WebElement> elements) {
        if (elements.size() > 0) {
            for (WebElement element : elements) {
                click(element);
            }
        }
    }


    public static boolean uploadAttachments(String... files) {
        AttachmentUpload attachmentUpload = new AttachmentUpload();
        attachmentUpload = (AttachmentUpload) attachmentUpload.getObjAttr();
        return deleteAttachments(attachmentUpload);

    }


    public static boolean uploadAttachments(String label, String... files) {
        AttachmentUpload attachmentUpload;
        if (label.toLowerCase().contains("popped")) {
            attachmentUpload = new AttachmentUpload(label);
            attachmentUpload = (AttachmentUpload) attachmentUpload.getObjAttr(label);
        } else {
            attachmentUpload = new AttachmentUpload();
            attachmentUpload = (AttachmentUpload) attachmentUpload.getObjAttr();
        }

        return uploadFiles(attachmentUpload, files);
    }


    private static boolean uploadFiles(AttachmentUpload attachmentUpload, String... files) {
        return uploadFiles(attachmentUpload, 120, files);
    }

    private static boolean uploadFiles(AttachmentUpload attachmentUpload, int timeOutInSeconds, String... files) {
        boolean flag = true;
        flag = deleteAttachments(attachmentUpload);
        if (!flag) {
            log.error("删除已上传/上传中/上传失败的文件失败");
            return flag;
        }
        for (String file : files) {
            WebElement element = findElement(attachmentUpload.getJsonObject(attachmentUpload.getDUploadInput()));
            upload(element, file);
        }

        int i = 1;
        for (String file : files) {
            file = file.replace("\\", "/");
            String[] tmp = file.split("/");
            String fileName = tmp[tmp.length - 1];
            log.info("======the uploaded file name should be=======");
            log.info(fileName);
            log.info("=============end=============================");
            WebElement element = findElement(attachmentUpload.get$UploadedFile(i));
            String fileNameActual = getText(element);
            log.info("======the actual name is=====================");
            log.info(fileNameActual);
            log.info("=============end=============================");

            flag = fileNameActual.equals(fileName);
            if (!flag) {
                log.error("上传的文件名和页面显示的文件名不一样");
                return flag;
            }
            i++;
        }
        long startTime = System.currentTimeMillis();   //获取开始时间
        while (true) {
            i = 1;
            int j = 0;
            long endTime = System.currentTimeMillis(); //获取结束时间
            long dif = endTime - startTime;
            if (dif > timeOutInSeconds * 1000) {//N分钟超时
                log.error("已超过设定的时间:" + timeOutInSeconds + "秒,不再继续查找.大概率是一直在上传中");
                flag = false;
                return flag;
            }

            for (String file : files) {
                String clazzAttribute = "";
                WebElement element;

                element = findElement(attachmentUpload.get$UploadedFileStatus(i));
                clazzAttribute = getAttribute(element, "class");
                if (clazzAttribute.contains("item-done")) {
                    i++;
                    j++;
                    log.info("文件应该上传成功了");
                    continue;

                } else if (clazzAttribute.contains("item-uploading")) {
                    i++;
                    log.error("文件还在上传中");
                    continue;
                } else if (clazzAttribute.contains("item-error")) {
                    flag = false;
                    log.error("文件应该上传失败了");
                    return flag;
                }


//                try {
//                    element = findElement(attachmentUpload.get$UploadedFileStatus(i, "上传成功"), 1, false);
//                    i++;
//                    j++;
//
//                } catch (Exception e) {
//                    try {
//                        element = findElement(attachmentUpload.get$UploadedFileStatus(i, "上传失败"), 1, false);
//                        flag = false;
//                        log.info("查到第" + i + "个附件貌似上传失败了");
//                        return flag;
//                    } catch (Exception e1) {
//                        //do nothing
//                    }
//                    i++;
//
//                }


            }


            if (j == files.length) {
                break;
            }
        }

        return flag;
    }


}
