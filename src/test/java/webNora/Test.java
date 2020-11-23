package webNora;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private static WebDriver driver = new ChromeDriver();


    @org.testng.annotations.Test
    public void startTest(){
        driver.get("https://google.com");
        driver.close();
    }


}
