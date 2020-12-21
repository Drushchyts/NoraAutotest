package webNora.helpers.dashboardHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.dashboardPages.CheckMetricsPage;

public class CheckMetricsHelper extends AbstractHelper {

    CheckMetricsPage checkMetricsPage = new CheckMetricsPage();

    public CheckMetricsHelper verifyMetrics() {
        checkMetricsPage.checkTotalSubscriber()
                .checkActiveSubscriber()
                .checkExpiredSubscriber()
                .checkOnHoldSubscriber()
                .checkNewSubscriber();
        return this;
    }
}
