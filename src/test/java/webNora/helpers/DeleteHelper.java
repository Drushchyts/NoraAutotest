package webNora.helpers;

import webNora.pages.DeletePAge;

public class DeleteHelper extends AbstractHelper {

    DeletePAge deletePAge = new DeletePAge();

    public DeleteHelper deletePackage() throws InterruptedException {
        deletePAge.delete();
        return this;
    }
}
