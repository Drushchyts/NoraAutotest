package webNora.automation.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import webNora.automation.core.utils.BrowserConstants;
import webNora.automation.core.utils.IOUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FrameworkCore {

    public static WebDriver webDriver;
    private static String browser = IOUtils.loadGenericProperties("browser", "configuration");
    public static String baseUrl = IOUtils.loadGenericProperties("noraUrl", "configuration");
    public static String baseUrlNoraGo = IOUtils.loadGenericProperties("noraGoUrl", "configuration");
    public static String baseUrlShoppingCard = IOUtils.loadGenericProperties("shoppingCardUrl", "configuration");


    public static WebDriver getInstance() throws MalformedURLException {
        if (browser.equals(BrowserConstants.CHROMIUM)) {
            URL url = new URL("http://localhost:4444/wd/hub");
            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--start-maximized");
//            options.addArguments("--no-sandbox");
            HashMap<String, Object> chromeLocalStatePrefs = new HashMap<>();
            List<String> experimentalFlags = new ArrayList<>();
            experimentalFlags.add("same-site-by-default-cookies@2");
            experimentalFlags.add("cookies-without-same-site-must-be-secure@2");
            chromeLocalStatePrefs.put("browser.enabled_labs_experiments", experimentalFlags);
            options.setExperimentalOption("localState", chromeLocalStatePrefs);
            options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            options.setExperimentalOption("useAutomationExtension", false);
            try {
                webDriver = new RemoteWebDriver(url, options);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (browser.equals(BrowserConstants.FIREFOX)) {
            URL url = new URL("http://localhost:4444/wd/hub");
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--window-size=1920x1080");
            options.setCapability("browserName", "firefox");
            options.setCapability("acceptSslCerts", "true");
            options.setCapability("javascriptEnabled", "true");
            DesiredCapabilities dc = DesiredCapabilities.firefox();
            options.merge(dc);
            try {
                webDriver = new RemoteWebDriver(url, options);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (browser.equals(BrowserConstants.LOCAL)) {
            ChromeOptions options = new ChromeOptions();
            System.setProperty("webdriver.chrome.driver", "/home/adrushchyts/IdeaProjects/WorkProjectNora/chromedriver");
            options.setBinary("/snap/chromium/1424/usr/lib/chromium-browser/chrome");  //chrome binary location specified here
            options.addArguments("--start-maximized");
            HashMap<String, Object> chromeLocalStatePrefs = new HashMap<>();
            List<String> experimentalFlags = new ArrayList<>();
            experimentalFlags.add("same-site-by-default-cookies@2");
            experimentalFlags.add("cookies-without-same-site-must-be-secure@2");
            chromeLocalStatePrefs.put("browser.enabled_labs_experiments", experimentalFlags);
            options.setExperimentalOption("localState", chromeLocalStatePrefs);
            options.addArguments("--no-sandbox");
            options.setExperimentalOption("useAutomationExtension", false);
            try {
                webDriver = new ChromeDriver(options);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (browser.equals(BrowserConstants.JENKINS)) {
            ChromeOptions options = new ChromeOptions();
            URL url = new URL("http://172.17.0.2:4444/wd/hub");
//            options.setBinary("/snap/chromium/1411/usr/lib/chromium-browser/chrome");  //chrome binary location specified here
//            options.setBinary("/usr/lib/chromium-browser/chromedriver");  //chrome binary location specified here
            options.addArguments("--no-sandbox");
            options.addArguments("--headless"); //!!!should be enabled for Jenkins
            options.addArguments("--disable-dev-shm-usage"); //!!!should be enabled for Jenkins
            options.addArguments("--window-size=1920x1080"); //!!!should be enabled for Jenkins
            options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            options.setExperimentalOption("useAutomationExtension", false);
            try {
                webDriver = new RemoteWebDriver(url, options);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return webDriver;
    }
}


