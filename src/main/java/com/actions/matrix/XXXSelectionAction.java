package com.actions.matrix;

import com.driver.$;
import com.pageObject.matrix.XXXSelection;
import org.openqa.selenium.WebElement;

import java.awt.event.KeyEvent;
import java.util.List;

public class XXXSelectionAction extends $ {

    public static void selectXXX(String labelLabel, String xxx){
        XXXSelection xxxSelection = new XXXSelection(labelLabel);
        xxxSelection = (XXXSelection) xxxSelection.getObjAttr(labelLabel);
        WebElement element = findElement(xxxSelection.getJsonObject(xxxSelection.getDXXXSearchInput()));
        sendKeys(element,xxx);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pressAndRelease(KeyEvent.VK_ENTER);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement element1 = null;
        List<WebElement> elements = findElements(xxxSelection.get$XXXResultSpan(xxx));
        for(WebElement e:elements){
            String text = getText(e).split("-")[0];
            if(xxx.equals(text)){
                element1 = e;
                break;
            }

        }


        click(element1);
        element = findElement(xxxSelection.getJsonObject(xxxSelection.getDXXXConfirmSpan()));
        click(element);

    }

}
