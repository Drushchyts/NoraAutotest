package webNora.pages.distributorsPages;

import org.openqa.selenium.By;
import webNora.pages.AbstractPage;

public class AddDistributorPage extends AbstractPage {

    private String distributorsButton = "//span[contains(text(),'Distributors')]";
    private String addDistributorButton = ".btn.btn-primary.btn-add";
    private String packageField = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[3]/b[1]";
    private String selectPackage = "//span[contains(text(),'\"November2020\"')]";
    private String firstNameField = "//input[@id='firstname']";
    private String lastNameField = "//input[@id='lastname']";
    private String passwordOneFiled = "//input[@id='password']";
    private String passwordTwoFiled = "//input[@id='password2']";
    private String emailField = "//input[@id='email']";
    private String companyFiled = "//input[@id='company']";
    private String createDistributorButton = "//button[@id='p-save1']";
    private String cancelButton = "//a[@id='p-cancel']";

    public AddDistributorPage clickDistributorsModButton() {
        waitForElementClickable(getElementBy(distributorsButton));
        getElementByCss(distributorsButton).click();
        return this;
    }

    public AddDistributorPage clickAddDistributorButton() throws InterruptedException {
        waitForElementClickable(By.cssSelector(addDistributorButton));
        getElementByCss(addDistributorButton).click();
        return this;
    }

    public AddDistributorPage selectPackageDistributor() {
        getElement(packageField).click();
        waitForElementClickable(getElementBy(selectPackage));
        getElement(selectPackage).click();
        return this;
    }

    public AddDistributorPage enterFirsName() {
        getElement(firstNameField).sendKeys("FirsTestName");
        return this;
    }

    public AddDistributorPage enterLastName() {
        getElement(lastNameField).sendKeys("LastTestName");
        return this;
    }

    public AddDistributorPage enterPassword() {
        getElement(passwordOneFiled).sendKeys("Terrorist123");
        getElement(passwordTwoFiled).sendKeys("Terrorist123");
        return this;
    }

    public AddDistributorPage enterEmail() {
        getElement(emailField).sendKeys("sectant@mail.ru");
        return this;
    }

    public AddDistributorPage enterCompany() {
        getElement(companyFiled).sendKeys("MyCompany");
        return this;
    }

    public AddDistributorPage clickCreateDistributorButton() {
        getElement(createDistributorButton).click();
        return this;
    }

    public AddDistributorPage clickCancelDistributorButton() throws InterruptedException {
        Thread.sleep(2000);
        getElement(cancelButton).click();
        return this;
    }
}
