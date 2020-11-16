package nora.web;

import nora.web.helpers.subscribersHelpers.AddSubscriberHelper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SubscribersModTest {

    AddSubscriberHelper addSubscriberHelper = new AddSubscriberHelper();

    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====SubscribersModTest=====START");
    }


    @Test
    public void subscribersTest() throws InterruptedException {
        addSubscriberHelper.clickSubscriberButton().createSubscriber();
        Thread.sleep(2000);

    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====SubscribersModTest=====FINISH");
//        addSubscriberHelper.close();
    }

}
