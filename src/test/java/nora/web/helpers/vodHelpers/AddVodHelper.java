package nora.web.helpers.vodHelpers;

import nora.web.helpers.AbstractHelper;
import nora.web.helpers.tvChannelsHelpers.AddTvChannelsHelper;
import nora.web.pages.vodPages.AddVodPage;

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
