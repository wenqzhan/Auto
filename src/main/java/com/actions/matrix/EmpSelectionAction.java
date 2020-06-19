package com.actions.matrix;

import com.driver.$;
import com.pageObject.matrix.EmpSelection;
import com.utils.log.LoggerController;
import org.openqa.selenium.WebElement;

public class EmpSelectionAction extends $ {
    private final static LoggerController log = LoggerController.getLogger(EmpSelectionAction.class);
    public static boolean selectEmp(String empName) {
        EmpSelection empSelection = new EmpSelection();
        empSelection = (EmpSelection) empSelection.getObjAttr();
        return selectEmp(empSelection, empName);
    }

    public static boolean selectEmp(String label, String empName) {
        EmpSelection empSelection = new EmpSelection(label);
        empSelection = (EmpSelection) empSelection.getObjAttr(label);
        return selectEmp(empSelection, empName);
    }

    private static boolean selectEmp(EmpSelection empSelection, String empName) {
        boolean flag = true;
        WebElement element = findElement(empSelection.getJsonObject(empSelection.getDUserQueryInput()));
        sendKeys(element,empName);
        element = findElement(empSelection.getJsonObject(empSelection.getDUserQueryInputSearchSpan()));
        click(element);
        flag = isElementAppeared(empSelection.getJsonObject(empSelection.getDTableTrs()));
        if(!flag){
            log.error("查询用户名或者工号,超时. 或者查不到数据");
            return flag;
        }
        try{
            element = findElement(empSelection.get$JsonTableTrsSiblingByUserName(empName),2);
        }catch (Exception e){
            //不知道为什么,有可能前面点击搜索没反应
            element = findElement(empSelection.getJsonObject(empSelection.getDUserQueryInputSearchSpan()));
            click(element);
            element = findElement(empSelection.get$JsonTableTrsSiblingByUserName(empName));
        }
        click(element);
        element = findElement(empSelection.get$JsonTableTrsSiblingByUserName(empName));
        flag = isSelected(element);
        if(!flag){
            log.error("可能是选错了用户???点击了没选中???");
            return flag;
        }
        element = findElement(empSelection.getJsonObject(empSelection.getDConfirmButtonSpan()));
        click(element);

        return flag;
    }



//    private static boolean isSelected(WebElement element) {
//        boolean flag = true;
//        String attributeValue = getAttribute(element, "class");
//        flag = (attributeValue.contains("selected") || attributeValue.contains("checked"));
//        attributeValue = "";
//        log.info("isSelected:" + flag);
//        return flag;
//    }



}
