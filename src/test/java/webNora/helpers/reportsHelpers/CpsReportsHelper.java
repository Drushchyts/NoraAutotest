package webNora.helpers.reportsHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.reportsPages.CpsReportsPage;

public class CpsReportsHelper extends AbstractHelper {

    CpsReportsPage cpsReportsPage = new CpsReportsPage();

    public CpsReportsHelper cpsReports() {
        cpsReportsPage.clickCpsReportsButton()
                .checkCpsReportsReports();
        return this;
    }
}
