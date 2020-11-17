package webNora.helpers.categotiesHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.categoriesPages.VodSeriesPage;

public class VodSeriesHelper extends AbstractHelper {

    VodSeriesPage vodSeriesPage = new VodSeriesPage();

    public VodSeriesHelper addVodSeries() throws InterruptedException {
        vodSeriesPage.clickVodSeriesButton();
        return this;
    }
}
