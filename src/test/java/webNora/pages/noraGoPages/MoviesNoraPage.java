package webNora.pages.noraGoPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webNora.pages.AbstractPage;

public class MoviesNoraPage extends AbstractPage {

    private String moviesButton = "//a[contains(text(),'movies')]";
    private String searchMovie = "//input[@id='search']";
    private String movieField = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/img[1]";

    public MoviesNoraPage clickMoviesButton() {
        waitForElementClickable(getElementBy(moviesButton));
        getElement(moviesButton).click();
        return this;
    }

    public MoviesNoraPage enterSearchMovie() {
        getElement(searchMovie).sendKeys("AWS" + Keys.ENTER);
        return this;
    }

    public MoviesNoraPage checkMovies() {
        waitForElementVisible(getElementBy(movieField));
        WebElement element = getElement(movieField);
        Assert.assertTrue(element.isDisplayed(), "Movies not search");
        return this;
    }
}
