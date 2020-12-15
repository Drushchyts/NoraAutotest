package webNora;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class Hello {

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = DesiredCapabilities.chrome();

        URL url = new URL("http://localhost:4444/wd/hub");

        RemoteWebDriver driver = new RemoteWebDriver(url, dc);

        driver.get("https://google.com");

        System.out.println("Title od the page: " + driver.getTitle());

        driver.quit();
    }

}
