package apiNora.packages;

import apiNora.AbstractApi;
import apiNora.RequestBody;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CreatePackageApi extends AbstractApi {

    RequestBody requestBody = new RequestBody();

    private static RequestSpecification httpRequest;

    @BeforeClass
    public void starUp() {
        System.out.println("TEST=====CreatePackageApi=====START");
        startTimeClass = System.currentTimeMillis();

    }

    @Test
    public void createPackageApi() {
        RestAssured.baseURI = baseUrlNoraCreatePackage;
        httpRequest = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("X-XSRF-TOKEN", "ed200cbe-e1a6-4c26-8f5f-ab18bc1139e0")
                .header("accept", "application/json, text/plain, */*")
                .header("cookie", "XSRF-TOKEN=ed200cbe-e1a6-4c26-8f5f-ab18bc1139e0;JSESSIONID=" + authNora());
        httpRequest.body(requestBody.createPackageBody);
        io.restassured.response.Response response = httpRequest.request(Method.POST);
        Assert.assertEquals(201, response.getStatusCode());
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Time for request createPackageApi: " + (System.currentTimeMillis() - startTime) + " ms");
        System.out.println("TEST=====CreatePackageApi=====FINISH");
    }

}
