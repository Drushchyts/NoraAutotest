package webNora.helpers.reportsHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.reportsPages.AddReportsPage;

public class AddReportsHelper extends AbstractHelper {

    AddReportsPage addReportsPage = new AddReportsPage();

    public AddReportsHelper clickReports() {
        addReportsPage.clickReportsButton();
        return this;
    }
}
