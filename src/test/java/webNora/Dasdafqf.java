package webNora;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Dasdafqf {
    private static WebDriver driver = null;

    @BeforeMethod
    public void startUp() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--no-sandbox");
        //options.addArguments("--headless"); //!!!should be enabled for Jenkins
        options.addArguments("--disable-dev-shm-usage"); //!!!should be enabled for Jenkins
        options.addArguments("--window-size=1920x1080"); //!!!should be enabled for Jenkins
        driver = new ChromeDriver(options);

    }

    @Test
    public void dasdasdasd() {
        driver.get("https://google.com");
        driver.close();
    }

}
