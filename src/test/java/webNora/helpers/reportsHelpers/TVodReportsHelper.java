package webNora.helpers.reportsHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.reportsPages.TVodReportsPage;

public class TVodReportsHelper extends AbstractHelper {

    TVodReportsPage tVodReportsPage = new TVodReportsPage();

    public TVodReportsHelper tVodReports() {
        tVodReportsPage.clickTVodReportsButton();
        return this;
    }

}
