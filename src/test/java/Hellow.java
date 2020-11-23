package webNora;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Hellow {

    WebDriver driver = new ChromeDriver();

    @Test
    public void createPackage() {
        driver.get("https://google.com");
        driver.close();
    }

}
