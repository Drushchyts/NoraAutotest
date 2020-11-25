package apiNora.subscribers;

import apiNora.AbstractApi;
import apiNora.RequestBody;
import io.restassured.RestAssured;
import io.restassured.http.Cookie;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateSubscriberApi extends AbstractApi {

    private static RequestSpecification httpRequest;
    private Cookie cookies;

    @BeforeClass
    public void starUp() {
        System.out.println("TEST=====CreateSubscriberApi=====START");
        startTimeClass = System.currentTimeMillis();

    }

    @Test
    public void authNoraSubscribers() {
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
        Assert.assertEquals(200, response.statusCode());
    }

    @Test(dependsOnMethods = "authNoraSubscribers")
    public void createSubscriberApi() {
        RestAssured.baseURI = baseUrlNoraCreateSubscriber;
        httpRequest = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("x-xsrf-token", "3952bfdc-1e95-4a1d-9fb0-46f38d49438a")
                .header("cookie", "XSRF-TOKEN=3952bfdc-1e95-4a1d-9fb0-46f38d49438a;JSESSIONID=" + cookies.getValue());
        String createSubscriberBody = "{\n" +
                "    \"id\": null,\n" +
                "    \"name\": \"User278\",\n" +
                "    \"accountNumber\": null,\n" +
                "    \"address\": \" \"600 Spencer Mission\",\n" +
                "    \"city\": \"East Edgardo\",\n" +
                "    \"country\": \"MP\",\n" +
                "    \"creditCards\": [],\n" +
                "    \"currentPaymentStatement\": null,\n" +
                "    \"customChannels\": [],\n" +
                "    \"customVods\": [],\n" +
                "    \"dateOfBirth\": \"1986-08-18T20:00\",\n" +
                "    \"devices\": [],\n" +
                "    \"deviceSlots\": [],\n" +
                "    \"email\": \"Augustine.Aufderhar57@example.com\",\n" +
                "    \"enabled\": null,\n" +
                "    \"expirationTime\": null,\n" +
                "    \"firstname\": \"Willie\",\n" +
                "    \"language\": \"Akan\",\n" +
                "    \"lastAccess\": null,\n" +
                "    \"lastname\": \"Anderson\",\n" +
                "    \"network\": {\n" +
                "        \"id\": 286,\n" +
                "        \"name\": \"Yauhen_Activations\",\n" +
                "        \"backgroundColor\": null,\n" +
                "        \"categorySets\": [],\n" +
                "        \"customVideoUrl\": null,\n" +
                "        \"deviceCount\": 0,\n" +
                "        \"listingType\": \"Sequence\",\n" +
                "        \"networkCatchupLinks\": [],\n" +
                "        \"networkChannelLinks\": [],\n" +
                "        \"networkThemeLinks\": [],\n" +
                "        \"overlays\": [],\n" +
                "        \"pincode\": null,\n" +
                "        \"platforms\": null,\n" +
                "        \"prefix\": \"CY\",\n" +
                "        \"startPageType\": null,\n" +
                "        \"staticChannel\": null,\n" +
                "        \"screenSaver\": null,\n" +
                "        \"subscriberCount\": null,\n" +
                "        \"subscribers\": [],\n" +
                "        \"timezone\": null,\n" +
                "        \"voucherSubscribersAllowed\": false,\n" +
                "        \"logoUrl\": null\n" +
                "    },\n" +
                "    \"notes\": [],\n" +
                "    \"password\": \"Password\",\n" +
                "    \"paymentStatements\": [],\n" +
                "    \"phone\": \"+1 (184) 129-3680\", \n" +
                "    \"pincode\": \"4584\",\n" +
                "    \"registered\": null,\n" +
                "    \"state\": \"State\",\n" +
                "    \"timeZone\": \"Iran\",\n" +
                "    \"user\": null,\n" +
                "    \"zipcode\": \"565\",\n" +
                "    \"type\": null\n" +
                "}";
        httpRequest.body(createSubscriberBody);
        io.restassured.response.Response response = httpRequest.request(Method.POST);
        String responseBody = response.body().asString();
        bodyInfo(responseBody);
        //Assert.assertEquals(201, response.getStatusCode());
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Time for request createSubscriberApi: " + (System.currentTimeMillis() - startTime) + " ms");
        System.out.println("TEST=====CreateSubscriberApi=====FINISH");
    }

}

