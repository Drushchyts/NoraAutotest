package webNora.pages.subscribersPages;

import webNora.pages.AbstractPage;

public class AddSubscriberPage extends AbstractPage {

    private String subscriberButton = "//span[contains(text(),'Subscribers')]";
    private String addButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/a[1]/i[1]";
    private String packageField = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[3]/b[1]";
    private String checkPackage = "//span[contains(text(),'1 (copy)')]";
    private String pinCodeField = "//input[@id='ppincode']";
    private String usernameField = "//input[@id='pusername']";
    private String passwordField = "//input[@id='password']";
    private String password2Field = "//input[@id='password2']";
    private String firstNameField = "//input[@id='pfirstname']";
    private String lastNameDield = "//input[@id='plastname']";
    private String emailField = "//input[@id='pemail']";
    private String phoneField = "//input[@id='pphone']";
    private String addressField = "//textarea[@id='paddress']";
    private String cityField = "//input[@id='pcity']";
    private String zipCodeField = "//input[@id='pzipcode']";
    private String countryField = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/form[1]/fieldset[1]/div[14]/div[1]/div[1]/div[1]/a[1]/span[3]/b[1]";
    private String selectCountry = "//span[contains(text(),'United States')]";
    private String stateField = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/form[1]/fieldset[1]/div[15]/div[1]/div[1]/div[1]/a[1]/span[3]/b[1]";
    private String selectState = "//span[contains(text(),'Alabama')]";
    private String languageField = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/form[1]/fieldset[1]/div[16]/div[1]/div[1]/div[1]/a[1]/span[3]/b[1]";
    private String selectLanguage = "//span[contains(text(),'English')]";
    private String dateOfBirthField = "//input[@id='pdob']";
    private String timeZoneField = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/form[1]/fieldset[1]/div[18]/div[1]/div[1]/div[1]/a[1]/span[2]/span[1]";
    private String selectTimeZone = "//span[contains(text(),'Europe/Oslo')]";
    private String saveButton = "//button[@id='p-save1']";

    public AddSubscriberPage clickSubscriberMod() {
        waitForElementClickable(getElementBy(subscriberButton));
        getElement(subscriberButton).click();
        return this;
    }

    public AddSubscriberPage clickAddButton() {
        waitForElementClickable(getElementBy(addButton));
        getElement(addButton).click();
        return this;

    }

    public AddSubscriberPage selectPackage() {
        waitForElementClickable(getElementBy(packageField));
        getElement(packageField).click();
        waitForElementClickable(getElementBy(checkPackage));
        getElement(checkPackage).click();
        return this;
    }

    public AddSubscriberPage enterPinCode() {
        getElement(pinCodeField).sendKeys("1234");
        return this;
    }

    public AddSubscriberPage enterUsername() {
        getElement(usernameField).sendKeys("AleksandrTest" + (int) (Math.random() * 999));
        return this;
    }

    public AddSubscriberPage enterPassword() {
        getElement(passwordField).sendKeys("Aleksandr123");
        waitForElementClickable(getElementBy(password2Field));
        getElement(password2Field).sendKeys("Aleksandr123");
        return this;
    }

    public AddSubscriberPage enterFirstName() {
        getElement(firstNameField).sendKeys("Dru123");
        return this;
    }

    public AddSubscriberPage enterLastName() {
        getElement(lastNameDield).sendKeys("Victories123");
        return this;
    }

    public AddSubscriberPage enterEmail() {
        getElement(emailField).sendKeys("sector@mail.ru");
        return this;
    }

    public AddSubscriberPage enterPhone() {
        getElement(phoneField).sendKeys("80295556677");
        return this;
    }

    public AddSubscriberPage enterAddress() {
        getElement(addressField).sendKeys("pr.Robotises 30-39");
        return this;
    }

    public AddSubscriberPage enterCity() {
        getElement(cityField).sendKeys("Minsk street");
        return this;
    }

    public AddSubscriberPage enterZipCode() {
        jsScroll();
        getElement(zipCodeField).sendKeys("123123");
        return this;
    }

    public AddSubscriberPage selectCountry() {
        getElement(countryField).click();
        waitForElementClickable(getElementBy(selectCountry));
        getElement(selectCountry).click();
        return this;
    }

    public AddSubscriberPage enterState() {
        getElement(stateField).click();
        waitForElementVisible(getElementBy(selectState));
        getElement(selectState).click();

        return this;
    }

    public AddSubscriberPage selectLanguage() {
        getElement(languageField).click();
        waitForElementClickable(getElementBy(selectLanguage));
        getElement(selectLanguage).click();
        return this;
    }

    public AddSubscriberPage enterDateOfBirth() {
        getElement(dateOfBirthField).sendKeys("19.08.1986");
        return this;
    }

    public AddSubscriberPage selectTimeZone() {
        getElement(timeZoneField).click();
        waitForElementClickable(getElementBy(selectTimeZone));
        getElement(selectTimeZone).click();
        return this;
    }

    public AddSubscriberPage clickSaveButton() {
        getElement(saveButton).click();
        return this;
    }

}
