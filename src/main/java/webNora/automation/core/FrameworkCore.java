package webNora.automation.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import webNora.automation.core.utils.BrowserConstants;
import webNora.automation.core.utils.IOUtils;

public class FrameworkCore {
    private static WebDriver webDriver;

    private static String browser = IOUtils.loadGenericProperties("browser", "configuration");

    public static String baseUrl = IOUtils.loadGenericProperties("noraUrl", "configuration");


    public static WebDriver getInstance() {
        if (browser.equals(BrowserConstants.CHROMIUM)) {
            webDriver = new ChromeDriver();
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
