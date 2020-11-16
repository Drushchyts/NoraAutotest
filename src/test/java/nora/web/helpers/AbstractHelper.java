package nora.web.helpers;

import nora.web.pages.AbstractPage;

import java.util.Random;

public class AbstractHelper {

    AbstractPage abstractPage = new AbstractPage();

    public void loginAdmin(String username, String password) {
        abstractPage.fillUsernameField(username)
                .fillPasswordField(password)
                .clickButton();
    }

    public static String getRandom() {
        String s = "123456789";
        StringBuffer number = new StringBuffer();
        for (int i = 0; i < 3; i++) {
            number.append(s.charAt(new Random().nextInt(s.length())));
        }
        return number.toString();
    }

    public void openAdminPage() {
        abstractPage.navigateAdmin();
    }

    public void close() {
        abstractPage.getDriver().close();
    }
}
