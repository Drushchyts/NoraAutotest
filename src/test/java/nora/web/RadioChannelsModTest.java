package nora.web;

import nora.web.helpers.radioHelpers.AddRadioHelper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RadioChannelsModTest {

    AddRadioHelper addRadioHelper = new AddRadioHelper();

    @BeforeClass
    public void startUp() {
        System.out.println("TEST-----RadioChannelsModTest-----START");
    }


    @Test
    public void radioTest() throws InterruptedException {
        addRadioHelper.clickRadioButton();
        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST-----RadioChannelsModTest-----FINISH");
//        addRadioHelper.close();
    }
}
