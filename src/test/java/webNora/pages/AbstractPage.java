package webNora.pages;

import org.openqa.selenium.chrome.ChromeDriver;
import webNora.automation.core.FrameworkCore;
import webNora.automation.core.utils.PauseLenght;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AbstractPage extends FrameworkCore {

    private String usernameField = "//input[@id='inputUsername']";
    private String passwordField = "//input[@id='inputPassword']";
    private String submit = "//button[contains(text(),'Sign in')]";
    private String checker = "//div[@class='alert alert-success alert-dismissable']";

    private static WebDriver driver = getInstance();


    public void navigateAdmin() {
        openUrl(baseUrl);

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

    public AbstractPage clickButton() {
        getElement(submit).click();
        return this;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void openUrl(String url) {
        driver.manage().window().maximize();
        driver.get(url);
    }


    public static void waitForElementVisible(By by) {
        try {
            WebDriverWait waiter = new WebDriverWait(driver, 3);
            waiter.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
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

    public WebElement getElement(String element) {
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

    public void jsScroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)", " ");
    }

   /* public int getResolusionNumber(String element) {
        String str = getElement(element).getText();
        String[] transfer = str.split(".|\"");
        return Integer.valueOf(transfer[0]);
    }*/

}
