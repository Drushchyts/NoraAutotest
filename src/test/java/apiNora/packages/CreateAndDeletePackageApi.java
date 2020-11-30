package apiNora.packages;

import apiNora.AbstractApi;
import apiNora.RequestBody;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CreateAndDeletePackageApi extends AbstractApi {

    RequestBody requestBody = new RequestBody();
    private String idPackage;
    private String lastOne;
    private static RequestSpecification httpRequest;

    @BeforeClass
    public void starUp() {
        System.out.println("TEST=====CreateAndDeletePackageApi=====START");
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
        System.out.println("Package create id: " + idPackage);
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
        String responseBody = response.body().asString();
        bodyInfo(responseBody);
        System.out.println("Package delete id: " + idPackage);
        Assert.assertEquals(200, response.getStatusCode());
    }


    @AfterClass
    public void tearDown() {
        System.out.println("Time for request CreateAndDeletePackageApi: " + (System.currentTimeMillis() - startTime) + " ms");
        System.out.println("TEST=====CreateAndDeletePackageApi=====FINISH");
    }

}
