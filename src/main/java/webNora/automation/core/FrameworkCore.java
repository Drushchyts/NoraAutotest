package webNora.automation.core;

import webNora.automation.core.utils.BrowserConstants;
import webNora.automation.core.utils.IOUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameworkCore {
    public static WebDriver webDriver;
    private static String browser = IOUtils.loadGenericProperties("browser", "configuration");
    public static String baseUrl = IOUtils.loadGenericProperties("noraUrl", "configuration");
    public static String packageUrl = IOUtils.loadGenericProperties("packageUrl", "configuration");


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
