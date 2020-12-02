package webNora.helpers.reportsHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.reportsPages.StreamReportsPage;

public class StreamReportsHelper extends AbstractHelper {

    StreamReportsPage streamReportsPage = new StreamReportsPage();

    public StreamReportsHelper streamReports() {
        streamReportsPage.clickStreamReportsButton()
                .checkStreamReports();
        return this;
    }
}
