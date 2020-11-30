package apiNora;

import apiNora.authorization.AuthNoraGoFastTv;
import io.restassured.RestAssured;
import io.restassured.http.Cookie;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.log4testng.Logger;

import java.util.Random;

public class AbstractApi {

    private static RequestSpecification httpRequest;
    public static long startTimeClass;
    public static long startTime;
    private Cookie cookies;

    public String baseUrlNoraGo = "https://mkdev.setplex.net/nora/auth";
    public String baseUrlNoraTv = "https://test-rc.norago.tv/nora/auth";
    public String baseUrlNoraCreatePackage = "https://mkdev.setplex.net/nora/api/networks";
    public String baseUrlNoraDeletePackage = "https://mkdev.setplex.net/nora/api/networks/";
    public String baseUrlNoraCreateSubscriber = "https://mkdev.setplex.net/nora/api/subscribers";
    public String baseUrlTvShowOrganizer = "https://mkdev.setplex.net/nora/api/tvshows/extra/tvshows";


    public void bodyInfo(String responseBody) {
        //String responseBody = response.body().asString();
        System.out.println(responseBody);
    }

    public static String getRandom(int length) {
        String s = "123456789";
        StringBuffer number = new StringBuffer();
        for (int i = 0; i < length; i++) {
            number.append(s.charAt(new Random().nextInt(s.length())));
        }
        return number.toString();
    }


    public static String[] generateRandomWords(int numberOfWords) {
        String[] randomStrings = new String[numberOfWords];
        Random random = new Random();
        for (int i = 0; i < numberOfWords; i++) {
            char[] word = new char[random.nextInt(8) + 3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
            for (int j = 0; j < word.length; j++) {
                word[j] = (char) ('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }
        return randomStrings;
    }

    public String authNora() {
        RestAssured.baseURI = baseUrlNoraGo;
        httpRequest = RestAssured.given()
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("X-XSRF-TOKEN", "ed200cbe-e1a6-4c26-8f5f-ab18bc1139e0")
                .header("cookie", "XSRF-TOKEN=ed200cbe-e1a6-4c26-8f5f-ab18bc1139e0;JSESSIONID=B667FF43F31FB9859D55167B68ADDE6B")
                .header("accept", "application/json, text/plain, */*")
                .formParam("username", "a.drushchyts@setplex.com")
                .formParam("password", "BwUea7PTnUN8Zd8");
        io.restassured.response.Response response = httpRequest.request(Method.POST);
        cookies = response.getDetailedCookie("JSESSIONID");
        String cookie = cookies.getValue();
        return cookie;
    }


}
