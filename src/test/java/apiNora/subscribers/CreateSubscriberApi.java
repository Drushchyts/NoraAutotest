package apiNora.subscribers;

import apiNora.AbstractApi;
import apiNora.RequestBody;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateSubscriberApi extends AbstractApi {

    private static RequestSpecification httpRequest;
    RequestBody requestBody = new RequestBody();

    @BeforeClass
    public void starUp() {
        System.out.println("TEST=====CreateSubscriberApi=====START");
        startTimeClass = System.currentTimeMillis();

    }

    @Test
    public void createSubscriberApi() {
        RestAssured.baseURI = baseUrlNoraCreateSubscriber;
        httpRequest = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("x-xsrf-token", "3952bfdc-1e95-4a1d-9fb0-46f38d49438a")
                .header("cookie", "XSRF-TOKEN=3952bfdc-1e95-4a1d-9fb0-46f38d49438a;JSESSIONID=" + authNora());
        httpRequest.body(requestBody.createSubscriberBody);
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

