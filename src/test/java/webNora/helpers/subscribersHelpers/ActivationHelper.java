package webNora.helpers.subscribersHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.subscribersPages.ActivationPage;

public class ActivationHelper extends AbstractHelper {

    ActivationPage activationPage = new ActivationPage();

    public ActivationHelper activationSubscriber() throws InterruptedException {
        activationPage.clickActivationButton()
                .clickSelectType()
                .clickDaysCheckBox()
                .enterDays()
                .selectCashLocation()
                .enterTotal()
                .clickProcess();
        return this;
    }

}
