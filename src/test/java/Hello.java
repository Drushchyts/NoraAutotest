package webNora;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.automation.core.utils.IOUtils;
import webNora.helpers.AbstractHelper;
import webNora.helpers.packageHelpers.AddPackageHelper;


public class Hello {

    AddPackageHelper addPackageHelper = new AddPackageHelper();
    AbstractHelper abstractHelper = new AbstractHelper();
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


}
