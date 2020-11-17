package webNora.helpers.vodHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.vodPages.AddVodPage;

public class AddVodHelper extends AbstractHelper {

    AddVodPage addVodPage = new AddVodPage();

    public void clickVodButton() {
        addVodPage.clickVodMod();
    }

    public AddVodHelper addVod() throws InterruptedException {
        addVodPage.clickAddVodButton()
                .enterTitle()
                .enterDescription()
                .enterDirectors()
                .enterStars()
                .enterYear()
                .selectPackage()
                .enterLength()
                .enterSTB()
                .clickSaveCouponsButton()
                .enterSearchVod()
                .checkCreateVod();
        return this;
    }
}
