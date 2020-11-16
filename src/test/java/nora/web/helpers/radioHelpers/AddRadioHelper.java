package nora.web.helpers.radioHelpers;

import nora.web.helpers.AbstractHelper;
import nora.web.pages.packagePages.AddPackagePage;
import nora.web.pages.radioPages.AddRadioPage;

public class AddRadioHelper extends AbstractHelper {

    AddRadioPage addRadioPage = new AddRadioPage();

    public void clickRadioButton() {
        addRadioPage.clickRadioMod();
    }
}
