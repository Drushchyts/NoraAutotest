package webNora.helpers.vodHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.vodPages.DeleteVodPage;

public class DeleteVodHelper extends AbstractHelper {

    DeleteVodPage deleteVodPage = new DeleteVodPage();

    public DeleteVodHelper deleteVod() {
        deleteVodPage.clickDeleteVodButton()
                .clickAgreeDeleteButton();
        return this;
    }
}
