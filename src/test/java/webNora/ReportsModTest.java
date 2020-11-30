package webNora;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.reportsHelpers.AddReportsHelper;

public class ReportsModTest {

    AddReportsHelper addReportsHelper = new AddReportsHelper();

    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====ReportsModTest=====START");
    }

    @Test
    public void reportsModTest() throws InterruptedException {
        addReportsHelper.clickReports();
        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====ReportsModTest=====FINISH");
        addReportsHelper.close();
    }
}
