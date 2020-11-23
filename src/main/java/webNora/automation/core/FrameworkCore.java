package webNora.automation.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import webNora.automation.core.utils.IOUtils;

public class FrameworkCore {

    public static WebDriver webDriver;

    private static String browser = IOUtils.loadGenericProperties("browser", "configuration");

    public static String baseUrl = IOUtils.loadGenericProperties("noraUrl", "configuration");


    public static WebDriver getInstance() {
//        if (browser.equals(BrowserConstants.CHROMIUM)) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("window-size=1936,1080");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--dns-prefetch-disable");
        chromeOptions.addArguments("--always-authorize-plugins");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--no-sandbox");
//            chromeOptions.addArguments("--headless");
        webDriver = new ChromeDriver(chromeOptions);
//
//        } else {
//            if (browser.equals(BrowserConstants.FIREFOX)) {
//                webDriver = new FirefoxDriver();
//            } else {
//                throw new IllegalArgumentException("Browser value from property file is incorrect!");
//            }
//        }
        return webDriver;
    }
}

