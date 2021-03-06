package webNora.helpers.noraGoHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.noraGoPages.MoviesNoraPage;

public class MoviesNoraHelper extends AbstractHelper {

    MoviesNoraPage moviesNoraPage = new MoviesNoraPage();

    public MoviesNoraHelper checkMoviesNora() throws InterruptedException {
        moviesNoraPage.clickMoviesButton()
                .enterSearchMovie()
                .checkMovies();
        return this;
    }
}
