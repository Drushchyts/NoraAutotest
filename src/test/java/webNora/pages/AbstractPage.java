package webNora.pages;

import org.aspectj.util.FileUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webNora.automation.core.FrameworkCore;
import webNora.automation.core.utils.PauseLenght;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class AbstractPage extends FrameworkCore {

    private String usernameField = "//input[@id='inputUsername']";
    private String passwordField = "//input[@id='inputPassword']";
    private String submit = "//button[contains(text(),'Sign in')]";
    private String checker = "//div[@class='alert alert-success alert-dismissable']";

    protected static WebDriver driver;

    static {
        try {
            driver = getInstance();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }


    public void navigateAdmin() {
        driver.manage().window().maximize();
        openUrl(baseUrl);

    }

    public void navigateNoraGo() {
        driver.manage().window().maximize();
        openUrl(baseUrlNoraGo);

    }

    public void navigateShoppingCardPage() {
        driver.manage().window().maximize();
        openUrl(baseUrlShoppingCard);

    }

    public void sleep(int time) throws InterruptedException {
        Thread.sleep(time);
    }

    public void sleep1000() throws InterruptedException {
        Thread.sleep(1000);
    }

    public AbstractPage fillUsernameField(String username) {
        getElement(usernameField).sendKeys(username);
        return this;
    }


    public AbstractPage fillPasswordField(String password) {
        getElement(passwordField).sendKeys(password);
        return this;
    }

    public AbstractPage openNewTab() {
        getTabs();
        navigateToTab(1, getTabs());
        return this;
    }

    public AbstractPage backTab() {
        getTabs();
        navigateToTab(0, getTabs());
        return this;
    }

    public AbstractPage clickButton() {
        getElement(submit).click();
        return this;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void openUrl(String url) {
        driver.get(url);
    }


    public static void waitForElementVisible(By by) {
        try {
            WebDriverWait waiter = new WebDriverWait(driver, 30);
            waiter.until(ExpectedConditions.presenceOfElementLocated(by));
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }

    public static void waitForElementClickable(By by) {
        try {
            WebDriverWait waiter = new WebDriverWait(driver, PauseLenght.MAX.value());
            waiter.until(ExpectedConditions.elementToBeClickable(by));
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }

    public static By getElementBy(String element) {
        return By.xpath(element);
    }

    public static By getElementByClass(String element) {
        return By.className(element);
    }

    public static WebElement getElement(String element) {
        return driver.findElement(By.xpath(element));
    }

    public WebElement getElementById(String element) {
        return driver.findElement(By.id(element));
    }

    public WebElement getElementByCss(String element) {
        return driver.findElement(By.cssSelector(element));
    }

    public WebElement getElementLinkText(String element) {
        return driver.findElement(By.linkText(element));
    }

    public WebElement getElementC(String element) {
        return driver.findElement(By.className(element));
    }

    public List<WebElement> getElements(String element) {
        return driver.findElements(By.cssSelector(element));
    }

    public List<String> getTabs() {
        Set<String> wh = driver.getWindowHandles();
        List<String> list = new ArrayList<>(wh);
        return list;
    }

    public void moveElement(WebElement elementOne, WebElement elementTwo) {

        Actions action = new Actions(driver);
        action.clickAndHold(elementOne)
                .pause(Duration.ofSeconds(2))
                .moveToElement(elementTwo)
                .pause(Duration.ofSeconds(2))
                .release(elementOne)
                .pause(Duration.ofSeconds(2))
                .build()
                .perform();
    }

    public void navigateToTab(int num, List<String> webHendlers) {
        driver.switchTo().window(webHendlers.get(num));
    }

    public int getResultsNumber(String element) {
        String str = getElement(element).getText();
        String[] transfer = str.split(" ");
        return Integer.valueOf(transfer[0]);
    }

    public void jsExe(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void executorWait(String element){
        WebElement ele = getElement(element);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", ele);
    }

    public void jsScroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)", " ");
    }

    public void jsScrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-400)", " ");
    }

    /* public int getResolusionNumber(String element) {
         String str = getElement(element).getText();
         String[] transfer = str.split(".|\"");
         return Integer.valueOf(transfer[0]);
     }*/

    public static String getRandom() {
        String s = "123456789";
        StringBuffer number = new StringBuffer();
        for (int i = 0; i < 5; i++) {
            number.append(s.charAt(new Random().nextInt(s.length())));
        }
        return number.toString();
    }


    public void openNewWindow() {
        ((JavascriptExecutor) driver).executeScript("window.open()");

    }

    public void getScreen() {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtil.copyFile(file, new File("screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void dragDrop(String ByFrom, String ByTo) {
        Actions action = new Actions(driver);
        WebElement LocatorFrom = getElement(ByFrom);
        WebElement LocatorTo = getElement(ByTo);
        int xto = (LocatorTo.getLocation().x);
        int yto = (LocatorTo.getLocation().y);
        action.pause(Duration.ofSeconds(2))
                .clickAndHold(LocatorFrom)
                .pause(Duration.ofSeconds(2));
//                .moveToElement(LocatorTo, xto, yto)
//                .pause(Duration.ofSeconds(2))
//                .release(LocatorTo)
//                .build()
//                .perform();
//        ((JavascriptExecutor) driver).executeScript("function simulate(f,c,d,e){var b,a=null;for(b in eventMatchers)if(eventMatchers[b].test(c)){a=b;break}if(!a)return!1;document.createEvent?(b=document.createEvent(a),a==\"HTMLEvents\"?b.initEvent(c,!0,!0):b.initMouseEvent(c,!0,!0,document.defaultView,0,d,e,d,e,!1,!1,!1,!1,0,null),f.dispatchEvent(b)):(a=document.createEventObject(),a.detail=0,a.screenX=d,a.screenY=e,a.clientX=d,a.clientY=e,a.ctrlKey=!1,a.altKey=!1,a.shiftKey=!1,a.metaKey=!1,a.button=1,f.fireEvent(\"on\"+c,a));return!0} var eventMatchers={HTMLEvents:/^(?:load|unload|abort|error|select|change|submit|reset|focus|blur|resize|scroll)$/,MouseEvents:/^(?:click|dblclick|mouse(?:down|up|over|move|out))$/}; " +
//                        "simulate(arguments[0],\"mousedown\",0,0); simulate(arguments[0],\"mousemove\",arguments[1],arguments[2]); simulate(arguments[0],\"mouseup\",arguments[1],arguments[2]); ",
//                LocatorFrom, xto, yto);
//    }
    }

}
