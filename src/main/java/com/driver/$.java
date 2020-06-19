package com.driver;

import com.alibaba.fastjson.JSONObject;
import com.utils.convert.CharSequenceToString;
import com.utils.json.JsonObject;
import com.utils.log.LoggerController;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 对原生Driver等进行扩展,以支持显示等待
 *
 * @author wenqzhan
 * @date 2020/03/17
 * @Modifydate 2020/04/02
 */
public class $ extends Driver {

//    public static String description; //一般用在描述xpath具体是什么上
//    public static By by;

//    public static boolean recordFlag = true;

    private final static LoggerController log = LoggerController.getLogger($.class);


    /**
     * 获取标签内文本
     */
    public static String getText(WebElement element) {
        String str = "";

        try {
            str = element.getText();
            log.info("标签内文本是:" + str);
        } catch (Exception e) {
            log.error("获取标签内文本失败");
            //hasException = true;
            throw e;
        }

        //text = str;

        return str;
    }

    /**
     * 获取标签内某个属性值
     */


    public static WebElement findIframe(JSONObject jsonObject) {
        List<WebElement> elements = new ArrayList<>();
        WebElement element;
        WebDriver driver = getDriver();
        element = findElement(jsonObject);
        String id = getAttribute(element, "id");
//        System.out.println("{{{{}}}}}");
//        System.out.println(id);
//        System.out.println("{{{{}}}}}");
//        element = driver.findElement(By.tagName("iframe"));
//        System.out.println("$$%^#$#@!@#");
//        System.out.println(element);
//        System.out.println("$$%^#$#@!@#");
        elements = driver.findElements(By.tagName("iframe"));
        for (WebElement e : elements) {
//            System.out.println("!@#!@#SDFFFFFFFFF");
//            System.out.println(e.getAttribute("id"));
//            System.out.println("!@#!@#SDFFFFFFFFF");
            if (e.getAttribute("id").contains(id))
                element = e;
            break;
        }
//        System.out.println("$$%^#$#@!@#");
//        System.out.println(element);
//        System.out.println("$$%^#$#@!@#");
        return element;
    }


    public static WebElement findIframe() {
        WebDriver driver = getDriver();
        WebElement iframe = driver.findElement(By.tagName("iframe"));
        return iframe;
    }

    public static String getAttribute(WebElement element, String attribute) {
        String str = "";

        try {
            str = element.getAttribute(attribute);
            log.info("标签内的attribute:" + attribute + "是" + str);
        } catch (Exception e) {
            log.error("获取标签属性失败");
            //hasException = true;
            throw e;
        }

        //attributeValue = str;

        return str;
    }

    public static boolean isElementAppeared(JSONObject jsonObject) {
        boolean flag = true;
        try {
            findElement(jsonObject);
        } catch (Exception e) {
            flag = false;
        } finally {
            //$.jsonObject = null;
        }
        log.info("isElementAppeared:" + flag);
        return flag;
    }


    public static boolean isNotDisplayed(JSONObject jsonObject) {
        return isNotDisplayed(jsonObject, 60);
    }


    /**
     * 如果某元素找得到,那么就继续找,一直找到找不到为止
     */
    public static boolean isNotDisplayed(JSONObject jsonObject, int timeInSeconds) {
        boolean b = false;
        long startTime = System.currentTimeMillis();   //获取开始时间
        while (true) {//一直找,找到超时为止
            try {
                findElement(jsonObject, 2, false);
                long endTime = System.currentTimeMillis(); //获取结束时间
                long dif = endTime - startTime;
                if (dif > timeInSeconds * 1000) {//1分钟超时
                    log.info("已超过设定的时间:" + timeInSeconds + "秒,不再继续查找.元素一直找得到");
                    break;
                }
            } catch (Exception e) {
                b = true;//如果找不到了,那么找不到为真
                break;
            }

        }

        return b;
    }

    /**
     * 清除内容
     * eg: 输入框中有内容,调用此方法后清除
     */
    public static boolean clear(WebElement element) {
        boolean flag = false;
        WebDriver driver = getDriver();
        if (!getInputValue(element).equals("")) {
            flag = true;
            log.info("开始clear");
            try {
                element.clear();
                String a = getInputValue(element);
                if (!a.equals("")) {
                    log.info("selenium原生的clear没用,尝试用javascript来clear");
                    ((JavascriptExecutor) driver).executeScript("arguments[0].value=''", element);
                }
                if (!a.equals("")) {
                    log.info("selenium原生的clear没用,Javascript也没用,尝试用另一种方法");
                    element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
                    element.sendKeys(Keys.DELETE);
                }
                log.info("clear 可能成功了");
                click(element);
            } catch (Exception e) {
                log.error("clear 失败");
                //hasException = true;
                throw e;
            }
        }
        return flag;
    }

    /**
     * 输入内容
     * eg: 找到某个element,这个element是个输入框,在输入框里输入文字
     * nt: 是否支持上传文件,需要验证
     *
     * @param keysToSend 需要输入的内容
     */
    public static void sendKeys(WebElement element, CharSequence... keysToSend) {
        String kts = CharSequenceToString.toString(keysToSend);
        WebDriver driver = getDriver();
        boolean flag;
        try {
            String a;
            click(element);
//            element.sendKeys("");

            flag = clear(element);
            element.sendKeys(kts);
            log.info("第一次尝试输入:" + kts);
            if (flag) {
                log.info("输入框中原来有值,已清空");
            }
            a = getInputValue(element);
            log.info("输入框里现有的文字是:" + a);
//            if (a.equals("")) {
//                log.info("selenium原生的sendkeys没用,尝试用javascript来sendkeys");
//                String tmp = "arguments[0].value='"+kts+"'";
//                ((JavascriptExecutor) driver).executeScript(tmp, element);
//            }
//            a = getInputValue(element);

//            System.out.println("!@#!@#!@#1");
            if ((!a.equals(kts)) && driver.toString().toLowerCase().contains("firefox")) {
                log.info("似乎触发了firefox sendkeys的bug,尝试重新sendkeys");
                clear(element);
//                String ktsTemp;
//                ktsTemp = kts + kts.substring(kts.length()-1);
                element.sendKeys(kts);
            }
            log.info("输入了:" + CharSequenceToString.toString(kts));
        } catch (Exception e) {
            //hasException = true;
            log.error("输入 失败");
            throw e;
        }
    }

    public static void upload(WebElement element, CharSequence... keysToSend) {
        try {
//            click(element);
//            clear(element);
            element.sendKeys(keysToSend);
            log.info("上传了:" + CharSequenceToString.toString(keysToSend));
        } catch (Exception e) {
            //hasException = true;
            log.error("上传 失败");
            throw e;
        }
    }


    public static String getUrl() {
        WebDriver driver = getDriver();
        return driver.getCurrentUrl();
    }


    /**
     * 定位单个element,并返回一个网页元素.如果发生指定异常,会抛出,但不会记录.其他异常会记录并抛出
     *
     * @param jsonObject       json,包含元素的描述和定位方式
     * @param timeOutInSeconds 超时时间,以秒为单位
     *                         //     * @param flag             是否需要记录NoSuchElementException | TimeoutException | StaleElementReferenceException
     * @return WebElement
     */
    public static WebElement findElement(JSONObject jsonObject, int timeOutInSeconds) {
        return findElement(jsonObject, timeOutInSeconds, true);
    }


    public static WebElement findElement(JSONObject jsonObject1, JSONObject jsonObject2, int timeOutInSeconds, boolean flag) {
        WebElement element = null;
        long startTime = System.currentTimeMillis();   //获取开始时间
        while (true) {
            try {
                //System.out.println("!111");
                element = findElement(jsonObject1, 1, flag);
                break;
            } catch (NoSuchElementException | TimeoutException | StaleElementReferenceException e1) {
                try {
                    element = findElement(jsonObject2, 1, flag);
                    break;
                } catch (NoSuchElementException | TimeoutException | StaleElementReferenceException e2) {

                    long endTime = System.currentTimeMillis(); //获取结束时间
                    long dif = endTime - startTime;
                    if (dif > timeOutInSeconds * 1000) {//10s超时
                        log.info("两个元素在" + timeOutInSeconds + "秒里都找不到");
                        throw e2;
                    }
                    continue;
                }
            }
        }


        return element;
    }


    /**
     * 定位单个element,并返回一个网页元素
     *
     * @param jsonObject       json,包含元素的描述和定位方式
     * @param timeOutInSeconds 超时时间,以秒为单位
     * @return WebElement
     */
    public static WebElement findElement(JSONObject jsonObject, int timeOutInSeconds, boolean recordFlag) {
        By by = null;
        log.info("json是:" + jsonObject.toString());
        String description = jsonObject.getString("description");
        if (jsonObject.getString("xpath") != null) {//解析传入的json,如果有xpath,那么是xpath定位
            by = By.xpath(jsonObject.getString("xpath"));
        } else if (jsonObject.getString("id") != null) {//解析传入的json,如果有id,那么是id定位
            by = By.id(jsonObject.getString("id"));
        }

        log.info("即将定位元素:" + description);
        return findElement(by, timeOutInSeconds, recordFlag);
    }

    /**
     * 定位单个element,并返回一个element,默认超时时间为10秒
     *
     * @param jsonObject json,包含元素的描述和定位方式
     * @return WebElement
     */
    public static WebElement findElement(JSONObject jsonObject) {

        return findElement(jsonObject, 10);
    }

    /**
     * 定位多个elements,并返回一个elements的list
     *
     * @param jsonObject       json,包含元素的描述和定位方式
     * @param timeOutInSeconds 超时时间,以秒为单位
     * @return List<WebElement>
     */
    public static List<WebElement> findElements(JSONObject jsonObject, int timeOutInSeconds, boolean canBeZero) {
        By by = null;
        String description = jsonObject.getString("description");
        if (jsonObject.getString("xpath") != null) {//解析传入的json,如果有xpath,那么是xpath定位
            by = By.xpath(jsonObject.getString("xpath"));
        } else if (jsonObject.getString("id") != null) {//解析传入的json,如果有id,那么是id定位
            by = By.id(jsonObject.getString("id"));
        }
        log.info("即将定位元素:" + description);
        return findElements(by, timeOutInSeconds, canBeZero);
    }

    public static List<WebElement> findElements(JSONObject jsonObject, int timeOutInSeconds) {
        return findElements(jsonObject, timeOutInSeconds, false);
    }

    /**
     * 定位多个elements,并返回一个elements的list,默认超时时间为10秒
     *
     * @param jsonObject json,包含元素的描述和定位方式
     * @return List<WebElement>
     */
    public static List<WebElement> findElements(JSONObject jsonObject) {

        return findElements(jsonObject, 10);
    }

    /**
     * 获取当前所有窗口的handles,返回一个包含所有handles的set
     * 因为可能电脑会卡,所以需要加上一个等待时间,这里使用的是显示等待
     *
     * @param timeOutInSeconds 秒,超时时间
     * @return Set<String>
     */
    public static Set<String> getWindowHandles(int timeOutInSeconds) {
        Set<String> set = null;
        WebDriver driver = getDriver();
        try {
            set = new WebDriverWait(driver, timeOutInSeconds).until(new ExpectedCondition<Set<String>>() {
                public Set<String> apply(WebDriver driver) {
                    if (driver.getWindowHandles().size() == 1) {
                        throw new NoSuchElementException("句柄只有一个,没有多个");//在时间范围内,如果只找到一个句柄,那么继续找
                    } else {
                        return driver.getWindowHandles();//如果找到了多个句柄,那么返回set
                    }
                }
            });
        } catch (Exception e) {
            log.error("句柄只有一个,没有多个");//在时间范围内如果找不到,那么记录错误
        }
        return set;
    }

    /**
     * 查询到element后在该element的子节点中查找子element
     *
     * @param jsonObject       json,包含元素的描述和定位方式
     * @param timeOutInSeconds 秒,超时时间
     * @return WebElement
     */
    public static WebElement findChildElement(WebElement element, JSONObject jsonObject, int timeOutInSeconds) {
        By by = null;
        String description = jsonObject.getString("description");
        if (jsonObject.getString("xpath") != null) {
            by = By.xpath(jsonObject.getString("xpath"));
        } else if (jsonObject.getString("id") != null) {
            by = By.id(jsonObject.getString("id"));

        }
        log.info("即将定位元素:" + description);
        return findChildElement(element, by, timeOutInSeconds);
    }

    /**
     * 查询到element后在该element的子节点中查找子element,默认超时时间10秒
     *
     * @param jsonObject json,包含元素的描述和定位方式
     * @return WebElement
     */
    public static WebElement findChildElement(WebElement element, JSONObject jsonObject) {
        return findChildElement(element, jsonObject, 10);
    }

    /**
     * 查询到element后在该element的子节点中查找子element,默认超时时间10秒
     *
     * @param by 定位方式
     * @return WebElement
     */
    public static WebElement findChildElement(WebElement element, final By by) {
        return findChildElement(element, by, 10);
    }


    /**
     * 查询到element后在该element的子节点中查找子element
     *
     * @param by               定位方式
     * @param timeOutInSeconds 秒,超时时间
     * @return WebElement
     */
    public static WebElement findChildElement(WebElement element, final By by, int timeOutInSeconds) {
        WebElement webElement = null;
        WebDriver driver = getDriver();
        try {
            webElement = new WebDriverWait(driver, timeOutInSeconds).until(new ExpectedCondition<WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return element.findElement(by);
                }
            });
        } catch (NoSuchElementException e) {
            log.error("子元素：" + by + "不存在");
            //driver.quit();
            //log.info("webDriver驱动已退出");
            ////hasException = true;
            throw new NoSuchElementException("元素：" + by + "不存在");
        } catch (TimeoutException e) {
            log.error("子元素：" + by + "在" + timeOutInSeconds + "秒内找不到,超时");
            //driver.quit();
            //log.info("webDriver驱动已退出");
            ////hasException = true;
            throw new TimeoutException("子元素：" + by + "在" + timeOutInSeconds + "秒内找不到,超时");
        } catch (Exception e) {
            log.error("子元素：" + by + "找不到,发生了其他错误");
            //river.quit();
            //log.info("webDriver驱动已退出");
            ////hasException = true;
            throw new NoSuchElementException("子元素：" + by + "找不到,发生了其他错误");
        }
        log.info("子元素：" + by + "已定位");
        //element = webElement;
        scrollIntoView(webElement);
        //页面可能没有显示元素,将元素滚动到可见的位置

        return webElement;
    }


    public static WebElement findElement(final By by, int timeOutInSeconds) {
        return findElement(by, timeOutInSeconds, true);
    }


    /**
     * 定位单个element,并返回一个element
     *
     * @param by               定位方式
     * @param timeOutInSeconds 超时时间,以秒为单位
     * @return WebElement
     */
    public static WebElement findElement(final By by, int timeOutInSeconds, boolean recordFlag) {
        WebElement webElement = null;
        WebDriver driver = getDriver();
        try {
            webElement = new WebDriverWait(driver, timeOutInSeconds).until(new ExpectedCondition<WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return driver.findElement(by);
                }
            });
        } catch (NoSuchElementException e) {
            if (recordFlag) {
                log.error("元素：" + by + "不存在");
            } else if (!recordFlag) {
                log.info("元素：" + by + "不存在");
            }
            //driver.quit();
            //log.info("webDriver驱动已退出");
            //hasException = true;
            throw new NoSuchElementException("元素：" + by + "不存在");
        } catch (TimeoutException e) {
            if (recordFlag) {
                log.error("元素：" + by + "在" + timeOutInSeconds + "秒内找不到,超时");
            } else if (!recordFlag) {
                log.info("元素：" + by + "在" + timeOutInSeconds + "秒内找不到,超时");
            }
            //driver.quit();
            //log.info("webDriver驱动已退出");
            //hasException = true;
            throw new TimeoutException("元素：" + by + "在" + timeOutInSeconds + "秒内找不到,超时");
        } catch (Exception e) {
            if (recordFlag) {
                log.error("元素：" + by + "找不到,发生了其他错误");
            } else if (!recordFlag) {
                log.info("元素：" + by + "找不到,发生了其他错误");
            }
            //river.quit();
            //log.info("webDriver驱动已退出");
            //hasException = true;
            throw new NoSuchElementException("元素：" + by + "找不到,发生了其他错误");
        }
        log.info("元素：" + by + "已定位");
        //element = webElement;
        scrollIntoView(webElement);
        //页面可能没有显示元素,将元素滚动到可见的位置

        return webElement;

    }

    /**
     * 定位单个element,并返回一个element,默认超时时间为10秒
     *
     * @param by 定位方式
     * @return WebElement
     */
    public static WebElement findElement(final By by) {
        return findElement(by, 10);
    }

    /**
     * 定位多个elements,并返回一个elements的list
     *
     * @param by               定位方式
     * @param timeOutInSeconds 超时时间,以秒为单位
     * @return List<WebElement>
     */
    public static List<WebElement> findElements(final By by, int timeOutInSeconds, boolean canBeZero) {
        try {
            findElement(by, 1, false);
        } catch (Exception e) {
            //do nothing
        }
        List<WebElement> webElements = null;
        WebDriver driver = getDriver();
        try {
            webElements = new WebDriverWait(driver, timeOutInSeconds).until(new ExpectedCondition<List<WebElement>>() {
                public List<WebElement> apply(WebDriver driver) {
                    return driver.findElements(by);
                }
            });
        } catch (NoSuchElementException e) {
            log.error("元素(复数)：" + by + "不存在");
            //driver.quit();
            //log.info("webDriver驱动已退出");
            //hasException = true;
            throw new NoSuchElementException("元素(复数)：" + by + "不存在");
        } catch (TimeoutException e) {
            log.error("元素(复数)：" + by + "在" + timeOutInSeconds + "秒内找不到,超时");
            //driver.quit();
            //log.info("webDriver驱动已退出");
            //hasException = true;
            throw new TimeoutException("元素(复数)：" + by + "在" + timeOutInSeconds + "秒内找不到,超时");
        } catch (Exception e) {
            log.error("元素(复数)：" + by + "找不到,发生了其他错误");
            //river.quit();
            //log.info("webDriver驱动已退出");
            //hasException = true;
            throw new NoSuchElementException("元素(复数)：" + by + "找不到,发生了其他错误");
        }
        log.info("元素(复数)：" + by + "已定位");
        //elements = webElements;
        if (webElements.size() == 0 && !canBeZero) {
            throw new NoSuchElementException("元素(复数)：" + by + "不存在,找不到");
        }


        return webElements;

    }

    public static List<WebElement> findElements(final By by, int timeOutInSeconds) {
        return findElements(by, timeOutInSeconds, false);
    }


    /**
     * 定位多个elements,并返回一个elements的list,默认超时时间为10秒
     *
     * @param by 定位方式
     * @return List<WebElement>
     */
    public static List<WebElement> findElements(final By by) {
        return findElements(by, 10);
    }

    /**
     * 驱动(浏览器)跳转网页或者访问文件
     *
     * @param s 一般为网页地址(包含协议文字http://......),或者文件地址(file:///......)
     */
    public static void get(String s) {
        WebDriver driver = getDriver();
        try {
            driver.get(s);
            log.info("已跳转" + s);
        } catch (Exception e) {
            log.error("无法跳转" + s);
            //hasException = true;
            log.error("get error");
            throw e;
        }
    }

    /**
     * 关闭驱动(关闭浏览器,并杀死驱动进程)
     */
    public static void quit() {
        WebDriver driver = getDriver();
        log.info("关闭浏览器驱动");
        driver.quit();
        //driver = null;
    }

    /**
     * 点击元素,如果失败,尝试强制点击
     */
    public static void click(WebElement element) {
        try {
            element.click();
            log.info("点击成功");
        } catch (WebDriverException e) {
            log.info("点击失败,尝试强制点击");
            forceClick(element);

        } catch (Exception e) {
            //hasException = true;
            log.error("click error");
            throw e;
        }
    }


    /**
     * 强制点击(某些情况下会报StaleElementReferenceException)
     */
    public static void forceClick(WebElement element) {
        WebDriver driver = getDriver();
        String xpath = "";
        int i = 1;
        // WebElement e = element;
        for (; ; i++) {
            try {
                //System.out.println(element);
                String str = element.toString();
                //element.findElement()
                int strLength = str.length();
                //String xpath = "";
                for (int h = 0; h < strLength - 7; h++) {
                    if (str.substring(h, h + 7).equals("xpath: ")) {
                        xpath = str.substring(h + 7, strLength - 1).trim();
                        break;
                    }
                }
                ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
                break;
            } catch (StaleElementReferenceException e1) {
                log.info("尝试强制点击,第" + i + "次失败了");
                element = findElement(By.xpath(xpath));
//                    Thread.sleep(500);
                if (i > 3) {
                    log.error("尝试强制点击第" + i + "次失败了");
                    //hasException = true;
                    throw new StaleElementReferenceException(element + ";element is not attached to the page document");
                }
            } catch (Exception e) {
                //hasException = true;
                log.error("forceClick error");
                throw e;
            }
        }
        log.info("尝试强制点击第" + i + "次成功了");
        //        try{
//            ((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
//        }catch(org.openqa.selenium.StaleElementReferenceException ex){
//            ((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
//        }

    }

    /**
     * 使用Javascript将元素滚动到可见的位置
     */
    public static void scrollIntoView(WebElement element) {
        WebDriver driver = getDriver();
        try {
            moveMouseToView(element);
        } catch (Exception e) {
            try {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
            } catch (StaleElementReferenceException e1) {
                log.info("报了StaleElementReferenceException,应该是元素已经消失");
            } catch (Exception e2) {
                //hasException = true;
                log.error("scrollIntoView error");
                throw e2;
            }
        }
    }

    /**
     * 模拟悬停鼠标
     */
    public static void moveMouseToView(WebElement element) {
        Actions action = getAction();
        try {
            action.moveToElement(element).perform();
        } catch (Exception e) {
            ////hasException = true;
            log.info("moveMouseToView error");
            throw e;
        }
        //log.info("鼠标悬停");
    }

    /**
     * 查找显示的element
     *
     * @return WebElement
     */
    public static WebElement findDisplayedElement(List<WebElement> elements) {
        WebElement element = null;
        try {
            for (WebElement e : elements
            ) {
                if (e.isDisplayed()) {
                    element = e;
                    scrollIntoView(element);
                    break;
                }
            }
        } catch (Exception e) {
            //hasException = true;
            log.error("findDisplayedElement error");
            throw e;

        }

        return element;
    }


    /**
     * 定位倒数第一个element
     *
     * @return WebElement
     */
    public static WebElement findLastElement(List<WebElement> elements) {
        WebElement element;
        try {
            if (elements.size() > 0) {
                element = elements.get(elements.size() - 1);
            } else {
                element = null;
            }
        } catch (Exception e) {
            //hasException = true;
            log.error("findLastElement error");
            throw e;
        }
        scrollIntoView(element);
        return element;
    }

    /**
     * 定位倒数第二个element
     *
     * @return WebElement
     */
    public static WebElement findSecondLastElement(List<WebElement> elements) {
        WebElement element;
        try {
            if (elements.size() > 1) {
                element = elements.get(elements.size() - 2);
            } else {
                element = null;
            }
        } catch (Exception e) {
            //hasException = true;
            log.error("findSecondLastElement error");
            throw e;
        }
        scrollIntoView(element);
        return element;
    }

    /**
     * 模拟按下键盘某一个键并放开
     *
     * @param key 按键对应的数值
     */
    public static void pressAndRelease(int... key) {
        try {
            Thread.sleep(1000);
            Robot robot = new Robot();

            for (int k : key) {
                robot.keyPress(k);
                log.info(k + " pressed");

            }
            for (int k : key) {
                robot.keyRelease(k);
                log.info(k + " released");

            }

        } catch (Exception e) {
            //hasException = true;
            log.error("pressAndRelease error");
            //throw e;
        }
        //KeyEvent.VK_ESCAPE


    }


    /**
     * 双击
     */
    public static void doubleClick(WebElement element) {
        Actions action = getAction();
        action.doubleClick(element).perform();
        log.info("进行了双击");
    }

    /**
     * 用已获得的网页元素集合通过标签中的文字定位单个网页元素,并返回一个网页元素
     *
     * @param textInTag 标签中的文字
     * @return WebElement
     */
    public static WebElement locateElement(List<WebElement> elements, String textInTag) {
        WebElement element = null;
        if (elements.size() > 1) {
            for (WebElement e : elements
            ) {
                if (e.getText().equals(textInTag)) {
                    element = e;
                    scrollIntoView(element);
                    break;
                }
            }
        } else {
            element = null;
        }

        return element;
    }


    /**
     * 获取当前窗口的handle
     */
    public static String getWindowHandle() {
        WebDriver driver = getDriver();
        return driver.getWindowHandle();

    }
    //getWindowHandle

    /**
     * 根据handle,使driver从一个窗口切换到另一个
     */
    public static void switchToWindow(String handle) {
        WebDriver driver = getDriver();
        driver.switchTo().window(handle);
    }


    public static void switchToFrame(WebElement iframe) {
        log.info("切换到iframe");
        WebDriver driver = getDriver();
        driver.switchTo().frame(iframe);

    }

    public static void switchToDefaultContent() {
        WebDriver driver = getDriver();
        driver.switchTo().defaultContent();
    }


    /**
     * 关闭当前页面(仅关闭当前页面,而非关闭整个驱动)
     */
    public static void close() {
        WebDriver driver = getDriver();
        driver.close();
        log.info("关闭页面");
    }

    /**
     * 先找到表头的elements,然后获取表头里的文字,放到strsInTable中
     */
    public static List<String> getTableHeader(List<WebElement> elements) {
        List<String> strsInHeader = new ArrayList<>();
//        List<String> strings = new ArrayList<>();
//        WebElement tableHeaderRow= element;
//        ListMisc<WebElement> rows = tableHeaderRow.findElements(By.tagName("tr"));
//        for(WebElement row:rows){
//            ListMisc<WebElement> col = row.findElements(By.tagName("th"));
//            for(WebElement cell:col){
//
//                String a = cell.getText();
//                //a = (a=="")?cell.findElement(By.tagName("a")).getText():a;
//                System.out.print(a + "\t");
//                strsInTable.add(a);
//            }
//            System.out.print("\n\t");
//        }
        StringBuilder temp = new StringBuilder();
        for (WebElement cell : elements) {
            String colspan = getAttribute(cell, "colspan");
            if (colspan == null || colspan.length() == 0) {
                String a = cell.getText();
                temp.append(a).append("\t");
                //System.out.print(a + "\t");
                strsInHeader.add(a);
            } else {
                int num = Integer.parseInt(colspan);
                String a = cell.getText()+"@多表头处理";
                for (int i = 0; i < num ; i++) {
                    temp.append(a).append("\t");
                    //System.out.print(a + "\t");
                    strsInHeader.add(a);
                }

            }
        }
//        log.info("%%%%%%%%%%%%");
        log.info(temp.toString());
//        log.info("%%%%%%%%%%%%");
        System.out.println();
//        strings.addAll(strsInHeader);
        //tableContent.add(strings);
        //tableContent.add(0,strings);

        return strsInHeader;

    }

    public static List<String> handelMultiHeader(List<String> strsInHeader1,List<String> strsInHeader2){
        List<String> strsInHeader = new ArrayList<>();
        String indicator = "@多表头处理";
        int length = strsInHeader1.size();
        int j = 0;
        for (int i = 0; i < length; i++) {
            String tmp = strsInHeader1.get(i);
            if(tmp.contains(indicator)){
                tmp = tmp.replace(indicator,strsInHeader2.get(j));
                j++;
            }
            strsInHeader.add(tmp);
        }

        return strsInHeader;
    }


    public static List<String> getTableHeader(JSONObject tableHeaderJson) {
        log.info("开始获取表头");
        List<String> strsInHeader = new ArrayList<>();
        List<WebElement> elements = findElements(tableHeaderJson);
        String append = "//th[not(@key='selection-column') and not(@key='action')]";
        String xpath = tableHeaderJson.getString("xpath");
        String colsXpath1 = xpath + "/../tr[1]" + append;
        String colsXpath2 = xpath + "/../tr[2]" + append;
        List<WebElement> cols1 = findElements(By.xpath(colsXpath1),10,true);
        List<WebElement> cols2 = findElements(By.xpath(colsXpath2),10,true);
        if (elements.size() == 1) {
            strsInHeader = getTableHeader(cols1);
        } else if(elements.size() == 2){
            strsInHeader = handelMultiHeader(getTableHeader(cols1),getTableHeader(cols2));
        }
        log.info("获取表头结束");
        StringBuilder temp = new StringBuilder();
        for(String str : strsInHeader){
            temp.append(str).append("\t");
//            System.out.print(str + "\t");

        }
        System.out.println();
        log.info("表格表头是"+"\n"+temp.toString());
        return strsInHeader;
    }


//    public static void getTableBody(int randomPageNum) {
//
//    }

    public static List<List<String>> getTableBody(JSONObject tableBodyJson){
        log.info("开始获取表格具体内容");
        List<WebElement> elements = findElements(tableBodyJson);
        List<List<String>> lists = getTableBody(elements);
        log.info("获取表格具体内容结束");
        return lists;
    }


    /**
     * 先找到表体的elements,然后获取表体里的文字,放到strsInTable中
     */
    public static List<List<String>> getTableBody(List<WebElement> elements) {

        List<List<String>> tableContent = new ArrayList<>();  //第0个是表头,第1个.....是表体
        //WebElement table= element;
        //System.out.println(element);
        //ListMisc<WebElement> rows = table.findElements(By.tagName("tr"));
        //System.out.println(elements2.size()+"element2的size");
        StringBuilder temp = new StringBuilder();
        for (WebElement row : elements) {
            List<String> strsInTable = new ArrayList<>();
            List<WebElement> col = row.findElements(By.tagName("td"));
            //System.out.println(col.size()+"col.size");
            for (WebElement cell : col) {
                //System.out.println(cell);
                String classAttribute = cell.getAttribute("class");

                if (!(classAttribute.equals("ant-table-selection-column") ||
                        classAttribute.equals("ant-table-fixed-columns-in-body"))) {//多选框不爬取,编辑/详情不爬取
                    String a = cell.getText();
                    String b = "";
                    String c = "";
                    if (a.equals("")) {
                        try {
                            b = cell.findElement(By.tagName("a")).getText();//尝试获取超链接中的文本
                            a = b;
                            System.out.println("!#!@#!@#!@#!@#!@#!@#!@#!@#!@#");
                            System.out.println(cell);
                            System.out.println(cell.findElement(By.tagName("a")));
                            System.out.println("!#!@#!@#!@#!@#!@#!@#!@#!@#!@#");
                        } catch (Exception e) {
                            //b = "";
                            try {
                                c = cell.findElement(By.tagName("span")).findElement(By.tagName("span")).getText();//尝试获取有样式的表格单元内的文本
                                a = c;
                                System.out.println("333333333333333333333333ppppppppppppp");
                            } catch (Exception e1) {
                                //c = "";
                            }
                        }
                    }
                    temp.append(a).append("\t");
                    strsInTable.add(a);
                    //System.out.print(a + "\t");
                }

            }

//            log.info("&&&&&&&&&&&&");
            temp.append("\n");
//            log.info("&&&&&&&&&&&&");
            List<String> strings = new ArrayList<>(strsInTable);
            tableContent.add(strings);
//            System.out.println();
        }
//        System.out.println(temp);
        log.info("表格内容是\n"+temp.toString());
        return tableContent;
    }


    public static String getInputValue(JSONObject jsonObject){
        WebElement element = findElement(jsonObject);
        String value = getInputValue(element);
        int count = 0;
        while(true){
            if(!value.equals("")){
                break;
            }else {
                element = findElement(jsonObject);
                value = getInputValue(element);
            }
            count++;
            if(count>3){
                log.info("尝试了多次,input里还是空的,可能就是空的");
                break;
            }
        }
        return value;
    }


    /**
     * 获取input中的字符串
     */
    public static String getInputValue(WebElement element) {
        boolean flag = false;
        String value = "";
        WebDriver driver = getDriver();
        JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;

        try {
            value = javaScriptExecutor.executeScript("return arguments[0].value", element).toString();
            log.info("input里的文本是:" + value);
        } catch (Exception e) {
            log.info("获取input中的string失败,应该不是input而是其他标签的元素");
            value = element.getText();
        }

        //text = value;
        return value;
    }


    /**
     * 获取textarea中的字符串
     */
    public static String getTextareaValue(WebElement element) {
        WebDriver driver = getDriver();
        JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
        String value = "";
        try {
            value = javaScriptExecutor.executeScript("return arguments[0].value", element).toString();

        } catch (Exception e) {
            log.error("获取textarea中的string失败");
            throw e;
        }
        return value;
    }

    public static boolean isSelected(WebElement element) {
        boolean flag = true;
        String attributeValue = getAttribute(element, "class");
        flag = (attributeValue.contains("selected") || attributeValue.contains("checked"));
        attributeValue = "";
        log.info("isSelected:" + flag);
        return flag;
    }



//    public static WebElement  findElement(String description){
//        jsonObject = OrgCustList.getJson(description);
//        return findElement(jsonObject);
//    }
//
//
//    public static ListMisc<WebElement>  findElements(String description){
//        jsonObject = OrgCustList.getJson(description);
//        return findElements(jsonObject);
//    }


}