package webNora;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Collections;


public class Dasdafqf {
    private static WebDriver driver = null;


    @Test
    public void dasdasdasd() {

        //System.setProperty("webdriver.chrome.driver", "chromium-browser.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--headless"); //!!!should be enabled for Jenkins
        options.addArguments("--disable-dev-shm-usage"); //!!!should be enabled for Jenkins
        options.addArguments("--window-size=1920x1080"); //!!!should be enabled for Jenkins
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);
        driver = new ChromeDriver(options);
        driver.get("https://google.com");
        driver.close();
    }

}
