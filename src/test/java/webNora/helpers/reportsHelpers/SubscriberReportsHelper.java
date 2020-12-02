package webNora.helpers.reportsHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.reportsPages.SubscriberReportsPage;

public class SubscriberReportsHelper extends AbstractHelper {

    SubscriberReportsPage subscriberReportsPage = new SubscriberReportsPage();

    public SubscriberReportsHelper subscriberReports() {
        subscriberReportsPage.clickSubscriberReportsButton()
                .checkSubscriberReports();
        return this;
    }
}
