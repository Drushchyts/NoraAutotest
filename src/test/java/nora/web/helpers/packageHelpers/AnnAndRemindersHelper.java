package nora.web.helpers.packageHelpers;

import nora.web.helpers.AbstractHelper;
import nora.web.pages.packagePages.AnnAndRemindersPage;

public class AnnAndRemindersHelper extends AbstractHelper {

    AnnAndRemindersPage annAndRemindersPage = new AnnAndRemindersPage();

    public AnnAndRemindersHelper addAnnouncement() throws InterruptedException {
        annAndRemindersPage.clickActivationSettingsButton()
                .enterSubject()
                .enterMessage();
        Thread.sleep(1000);
        annAndRemindersPage.clickSaveButton();
        return this;
    }

    public AnnAndRemindersHelper addReminder() {
        annAndRemindersPage.clickRemindersButton()
                .clickAddReminderButton()
                .enterSubjectReminder()
                .enterMessageReminder()
                .enterDaysReminder()
                .clickCreateReminderButton();
        return this;
    }

    public AnnAndRemindersHelper activationTOA() {
        annAndRemindersPage.clickActivationTOAButton()
                .clickSaveActivationTOAButton();
        return this;
    }


}
