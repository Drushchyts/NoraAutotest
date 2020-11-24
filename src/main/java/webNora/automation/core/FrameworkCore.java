package webNora.automation.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import webNora.automation.core.utils.BrowserConstants;
import webNora.automation.core.utils.IOUtils;

import java.util.Collections;

public class FrameworkCore {

    public static WebDriver webDriver;

    private static String browser = IOUtils.loadGenericProperties("browser", "configuration");

    public static String baseUrl = IOUtils.loadGenericProperties("noraUrl", "configuration");


    public static WebDriver getInstance() {
        if (browser.equals(BrowserConstants.CHROMIUM)) {
            ChromeOptions options = new ChromeOptions();
            options.setBinary("/snap/chromium/1411/usr/lib/chromium-browser/chrome");  //chrome binary location specified here
            options.addArguments("--no-sandbox");
            options.addArguments("--headless"); //!!!should be enabled for Jenkins
            options.addArguments("--disable-dev-shm-usage"); //!!!should be enabled for Jenkins
            options.addArguments("--window-size=1920x1080"); //!!!should be enabled for Jenkins
//            options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//            options.setExperimentalOption("useAutomationExtension", false);
            webDriver = new ChromeDriver(options);

        } else {
            if (browser.equals(BrowserConstants.FIREFOX)) {
                webDriver = new FirefoxDriver();
            } else {
                throw new IllegalArgumentException("Browser value from property file is incorrect!");
            }
        }
        return webDriver;
    }
}

