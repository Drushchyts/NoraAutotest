package apiNora.packages;

import apiNora.AbstractApi;
import apiNora.RequestBody;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CreateAndDeletePackageApi extends AbstractApi {

    private static final org.apache.log4j.Logger LOG = Logger.getLogger(CreateAndDeletePackageApi.class);
    RequestBody requestBody = new RequestBody();
    private String idPackage;
    private static RequestSpecification httpRequest;

    @BeforeClass
    public void starUp() {
        LOG.info("TEST=====CreateAndDeletePackageApi=====START");
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
        Headers headers = response.headers();
        String urlForDelete = headers.getValue("Location");
        String[] parts = urlForDelete.split("/");
        idPackage = parts[parts .length-1];
        Assert.assertEquals(201, response.getStatusCode());
    }

    @Test(dependsOnMethods = "createPackageApi")
    public void deletePackageApi() {
        RestAssured.baseURI = baseUrlNoraDeletePackage + idPackage;
        httpRequest = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("X-XSRF-TOKEN", "ed200cbe-e1a6-4c26-8f5f-ab18bc1139e0")
                .header("accept", "application/json, text/plain, */*")
                .header("cookie", "XSRF-TOKEN=ed200cbe-e1a6-4c26-8f5f-ab18bc1139e0;JSESSIONID=" + authNora());
        io.restassured.response.Response response = httpRequest.request(Method.DELETE);
//        String responseBody = response.body().asString();
//        bodyInfo(responseBody);
        Assert.assertEquals(200, response.getStatusCode());
    }


    @AfterClass
    public void tearDown() {
        LOG.info("Time for request CreateAndDeletePackageApi: " + (System.currentTimeMillis() - startTime) + " ms");
        LOG.info("TEST=====CreateAndDeletePackageApi=====FINISH\n");
    }

}
