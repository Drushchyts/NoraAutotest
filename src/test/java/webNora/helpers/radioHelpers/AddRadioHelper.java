package webNora.helpers.radioHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.radioPages.AddRadioPage;

public class AddRadioHelper extends AbstractHelper {

    AddRadioPage addRadioPage = new AddRadioPage();

    public void clickRadioButton() {
        addRadioPage.clickRadioMod();
    }
}
