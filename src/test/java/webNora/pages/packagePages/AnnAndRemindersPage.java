package webNora.pages.packagePages;

import webNora.pages.AbstractPage;

public class AnnAndRemindersPage extends AbstractPage {

    private String annAndReminderButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[2]/a[7]";
    private String subjectFiled = "//input[@id='subject']";
    private String messageField = "//textarea[@id='message']";
    private String saveButton = "//button[@id='in-save1']";
    private String remindersButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[2]/a[1]";
    private String addReminderBUtton = "//a[contains(text(),'Add New')]";
    private String subjectReminderField = "//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]";
    private String messageReminderField = "//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/textarea[1]";
    private String daysReminderField = "//input[@id='daysleft']";
    private String createReminderButton = "//button[contains(text(),'Create')]";
    private String activationTOAButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[3]/a[1]";
    private String saveActivationTOAButton = "//button[@id='in-save3']";


    public AnnAndRemindersPage clickActivationSettingsButton() {
        waitForElementClickable(getElementBy(annAndReminderButton));
        getElement(annAndReminderButton).click();
        return this;
    }

    public AnnAndRemindersPage enterSubject() throws InterruptedException {
        Thread.sleep(2000);
        waitForElementVisible(getElementBy(subjectFiled));
        getElement(subjectFiled).sendKeys("Test Subject");
        return this;
    }

    public AnnAndRemindersPage enterMessage() {
        waitForElementVisible(getElementBy(messageField));
        getElement(messageField).sendKeys("Test Message");
        return this;
    }

    public AnnAndRemindersPage clickSaveButton() {
        waitForElementClickable(getElementBy(saveButton));
        getElement(saveButton).click();
        return this;
    }

    public AnnAndRemindersPage clickRemindersButton() {
        waitForElementClickable(getElementBy(remindersButton));
        getElement(remindersButton).click();
        return this;

    }

    public AnnAndRemindersPage clickAddReminderButton() {
        waitForElementClickable(getElementBy(addReminderBUtton));
        getElement(addReminderBUtton).click();
        return this;

    }

    public AnnAndRemindersPage enterSubjectReminder() {
        waitForElementClickable(getElementBy(subjectReminderField));
        getElement(subjectReminderField).sendKeys("Test Reminder Subject");
        return this;
    }

    public AnnAndRemindersPage enterMessageReminder() {
        waitForElementVisible(getElementBy(messageReminderField));
        getElement(messageReminderField).sendKeys("Test Reminder Message");
        return this;
    }

    public AnnAndRemindersPage enterDaysReminder() {
        waitForElementVisible(getElementBy(daysReminderField));
        getElement(daysReminderField).sendKeys("234");
        return this;
    }

    public AnnAndRemindersPage clickCreateReminderButton() {
        waitForElementClickable(getElementBy(createReminderButton));
        getElement(createReminderButton).click();
        return this;
    }

    public AnnAndRemindersPage clickActivationTOAButton() {
        waitForElementClickable(getElementBy(activationTOAButton));
        getElement(activationTOAButton).click();
        return this;
    }

    public AnnAndRemindersPage clickSaveActivationTOAButton() {
        waitForElementClickable(getElementBy(saveActivationTOAButton));
        getElement(saveActivationTOAButton).click();
        return this;
    }
}
