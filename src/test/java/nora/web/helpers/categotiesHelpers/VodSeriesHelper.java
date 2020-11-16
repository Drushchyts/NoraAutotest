package nora.web.helpers.categotiesHelpers;

import nora.web.helpers.AbstractHelper;
import nora.web.pages.categoriesPages.VodSeriesPage;

public class VodSeriesHelper extends AbstractHelper {

    VodSeriesPage vodSeriesPage = new VodSeriesPage();

    public VodSeriesHelper addVodSeries() throws InterruptedException {
        vodSeriesPage.clickVodSeriesButton();
        return this;
    }
}
