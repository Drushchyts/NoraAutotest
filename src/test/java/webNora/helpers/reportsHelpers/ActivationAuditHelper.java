package webNora.helpers.reportsHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.reportsPages.ActivationAuditPage;

public class ActivationAuditHelper extends AbstractHelper {

    ActivationAuditPage activationAuditPage = new ActivationAuditPage();

    public ActivationAuditHelper streamReports() {
        activationAuditPage.clickActivationAuditButton()
                .checkActivationAudit();
        return this;
    }
}
