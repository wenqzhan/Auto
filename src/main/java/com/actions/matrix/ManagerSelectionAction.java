package com.actions.matrix;

import com.driver.$;
import com.pageObject.matrix.EmpSelection;
import com.pageObject.matrix.ManagerSelection;
import com.utils.log.LoggerController;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ManagerSelectionAction extends $ {
    private final static LoggerController log = LoggerController.getLogger(ManagerSelectionAction.class);

    public static boolean selectManager(String empName) {
        ManagerSelection managerSelection = new ManagerSelection();
        managerSelection = (ManagerSelection) managerSelection.getObjAttr();
        return selectManager(managerSelection, empName);
    }

    public static boolean selectManager(String label, String managerName) {
        ManagerSelection managerSelection = new ManagerSelection(label);
        managerSelection = (ManagerSelection) managerSelection.getObjAttr(label);
        return selectManager(managerSelection, managerName);
    }

    public static boolean selectManager(List<String> managerNames) {
        ManagerSelection managerSelection = new ManagerSelection();
        managerSelection = (ManagerSelection) managerSelection.getObjAttr();
        return selectManager(managerSelection, managerNames);
    }

    public static boolean selectManager(String label, List<String> managerNames) {
        ManagerSelection managerSelection = new ManagerSelection(label);
        managerSelection = (ManagerSelection) managerSelection.getObjAttr(label);
        return selectManager(managerSelection, managerNames);
    }


    private static boolean selectManager(ManagerSelection managerSelection, String managerName) {
        boolean flag = true;
        WebElement element = findElement(managerSelection.getJsonObject(managerSelection.getDEmpNameInput()));
        sendKeys(element, managerName);
        element = findElement(managerSelection.getJsonObject(managerSelection.getDSearchButtonSpan()));
        click(element);
        flag = isElementAppeared(managerSelection.getJsonObject(managerSelection.getDTableTrs()));
        if (!flag) {
            log.error("查询用户名或者工号,超时. 或者查不到数据");
            return flag;
        }
        try {
            element = findElement(managerSelection.get$JsonTableTrsSiblingByUserName(managerName), 2);
        } catch (Exception e) {
            //不知道为什么,有可能前面点击搜索没反应
            element = findElement(managerSelection.getJsonObject(managerSelection.getDSearchButtonSpan()));
            click(element);
            element = findElement(managerSelection.get$JsonTableTrsSiblingByUserName(managerName));
        }
        click(element);
        element = findElement(managerSelection.get$JsonTableTrsSiblingByUserName(managerName));
        flag = isSelected(element);
        if (!flag) {
            log.error("可能是选错了用户???点击了没选中???");
            return flag;
        }
        element = findElement(managerSelection.getJsonObject(managerSelection.getDSelectedEmpNameTd()));
        String managerNameSelected = getText(element);
        flag = managerName.equals(managerNameSelected);
        if (!flag) {
            log.error("用户没选上????右上角没有???");
            return flag;
        }

        element = findElement(managerSelection.getJsonObject(managerSelection.getDConfirmButtonSpan()));
        click(element);

        return flag;
    }

    private static boolean selectManager(ManagerSelection managerSelection, List<String> managerNames) {
        boolean flag = true;
        WebElement element = null;
        for (String managerName : managerNames) {
            element = findElement(managerSelection.getJsonObject(managerSelection.getDEmpNameInput()));
            sendKeys(element, managerName);
            element = findElement(managerSelection.getJsonObject(managerSelection.getDSearchButtonSpan()));
            click(element);
            flag = isElementAppeared(managerSelection.getJsonObject(managerSelection.getDTableTrs()));
            if (!flag) {
                log.error("查询用户名或者工号,超时. 或者查不到数据");
                return flag;
            }
            try {
                element = findElement(managerSelection.get$JsonTableTrsSiblingByUserName(managerName), 2);
            } catch (Exception e) {
                //不知道为什么,有可能前面点击搜索没反应
                element = findElement(managerSelection.getJsonObject(managerSelection.getDSearchButtonSpan()));
                click(element);
                element = findElement(managerSelection.get$JsonTableTrsSiblingByUserName(managerName));
            }
            click(element);
            element = findElement(managerSelection.get$JsonTableTrsSiblingByUserName(managerName));
            flag = isSelected(element);
            if (!flag) {
                log.error("可能是选错了用户???点击了没选中???");
                return flag;
            }
            List<WebElement> elements = findElements(managerSelection.getJsonObject(managerSelection.getDSelectedEmpNameTd()));
            for (WebElement e : elements) {
                String managerNameSelected = getText(e);
                flag = managerName.equals(managerNameSelected);
                if(flag){
                    break;
                }
            }
            if (!flag) {
                log.error("用户没选上????右上角没有???");
                return flag;
            }
        }

        element = findElement(managerSelection.getJsonObject(managerSelection.getDConfirmButtonSpan()));
        click(element);

        return flag;
    }


}
