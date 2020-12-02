package webNora;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.automation.core.utils.IOUtils;
import webNora.helpers.AbstractHelper;
import webNora.helpers.DeleteHelper;
import webNora.helpers.packageHelpers.AddPackageHelper;


public class Hello {

    AddPackageHelper addPackageHelper = new AddPackageHelper();
    AbstractHelper abstractHelper = new AbstractHelper();
    DeleteHelper deleteHelper = new DeleteHelper();
    private String username;
    private String password;

    @BeforeClass
    public void setUp() {
        System.out.println("TEST=====PackagesModTest=====START");
        username = IOUtils.loadGenericProperties("username", "configuration");
        password = IOUtils.loadGenericProperties("password", "configuration");
        abstractHelper.openAdminPage();
        abstractHelper.loginAdmin(username, password);
    }

    @Test(invocationCount = 100)
    public void createPackage() throws InterruptedException {
        addPackageHelper.clickPackageButton();
        deleteHelper.deletePackage();
    }

}
