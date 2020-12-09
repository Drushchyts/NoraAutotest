package webNora.helpers.subscribersHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.subscribersPages.NotesPage;

public class NotesHelper extends AbstractHelper {

    NotesPage notesPage = new NotesPage();

    public NotesHelper checkNotesPage() throws InterruptedException {
        notesPage.clickNotesButton()
                .checkNotesPage();
        return this;
    }
}
