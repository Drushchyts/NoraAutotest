package webNora;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.close();
    }


}
