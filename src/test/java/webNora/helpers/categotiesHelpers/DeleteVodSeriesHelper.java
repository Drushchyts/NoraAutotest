package webNora.helpers.categotiesHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.categoriesPages.DeleteVodSeriesPage;

public class DeleteVodSeriesHelper extends AbstractHelper {

    DeleteVodSeriesPage deleteVodSeriesPage = new DeleteVodSeriesPage();

    public DeleteVodSeriesHelper deleteVodSeries() {
        deleteVodSeriesPage.clickDeleteVodSeriesButton()
                .clickAgreeVodSeriesButton();
        return this;
    }
}
