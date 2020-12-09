package webNora.pages.subscribersPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webNora.pages.AbstractPage;

public class NotesPage extends AbstractPage {

    private String notesButton = "//*[@id=\"app-content\"]/div/ui-view/ui-view/ui-view/div/div[1]/div[2]/a[5]";
    private String nameField = "Notes";
    private String checkField = "//span[contains(text(),'Notes')]";
    private String addNotesButton = "//button[contains(text(),'Add Note')]";
    private String NoteSubjectField = "//input[@id='subject']";

    public NotesPage clickNotesButton() {
        waitForElementClickable(getElementBy(notesButton));
        getElement(notesButton).click();
        return this;
    }

    public NotesPage checkNotesPage() {
        waitForElementVisible(getElementBy(checkField));
        WebElement element = getElement(checkField);
        Assert.assertEquals(nameField, element.getText(), "Not start Notes page");
        return this;
    }

}
