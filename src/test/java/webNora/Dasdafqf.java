package webNora;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Dasdafqf {
    private static WebDriver driver;

    @BeforeMethod
    public void startUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void dasdasdasd() {
        driver.get("https://google.com");
        driver.close();
    }

}
