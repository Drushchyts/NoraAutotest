package webNora.helpers.drmServiceHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.drmServicePages.DeleteDrmServicePage;

public class DeleteDrmServiceHelper extends AbstractHelper {

    DeleteDrmServicePage deleteDrmServicePage = new DeleteDrmServicePage();

    public DeleteDrmServiceHelper deleteDrmService() {
        deleteDrmServicePage.clickDeleteButton()
                .clickAgreeButton();
        return this;
    }
}
