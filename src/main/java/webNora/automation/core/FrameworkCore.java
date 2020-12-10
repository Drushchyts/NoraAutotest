package webNora.automation.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import webNora.automation.core.utils.BrowserConstants;
import webNora.automation.core.utils.IOUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FrameworkCore {

    public static WebDriver webDriver;

    private static String browser = IOUtils.loadGenericProperties("browser", "configuration");

    public static String baseUrl = IOUtils.loadGenericProperties("noraUrl", "configuration");
    public static String baseUrlNoraGo = IOUtils.loadGenericProperties("noraGoUrl", "configuration");


    public static WebDriver getInstance() {
        if (browser.equals(BrowserConstants.CHROMIUM)) {
            ChromeOptions options = new ChromeOptions();
            options.setBinary("/snap/chromium/1411/usr/lib/chromium-browser/chrome");  //chrome binary location specified here
            HashMap<String, Object> chromeLocalStatePrefs = new HashMap<>();
            List<String> experimentalFlags = new ArrayList<>();
            experimentalFlags.add("same-site-by-default-cookies@2");
            experimentalFlags.add("cookies-without-same-site-must-be-secure@2");
            chromeLocalStatePrefs.put("browser.enabled_labs_experiments", experimentalFlags);
            options.setExperimentalOption("localState", chromeLocalStatePrefs);
//            options.addArguments("--no-sandbox");
//            options.addArguments("--headless"); //!!!should be enabled for Jenkins
//            options.addArguments("--disable-dev-shm-usage"); //!!!should be enabled for Jenkins
//            options.addArguments("--window-size=1920x1080"); //!!!should be enabled for Jenkins
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

