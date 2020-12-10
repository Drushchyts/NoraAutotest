package webNora.helpers.geoBlockHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.geoBlockPages.AddGeoBlockPAge;

public class AddGeoBlockHelper extends AbstractHelper {

    AddGeoBlockPAge addGeoBlockPAge = new AddGeoBlockPAge();

    public AddGeoBlockHelper clickGeoMod() {
        addGeoBlockPAge.clickGeoBlockButton();
        return this;
    }
}
