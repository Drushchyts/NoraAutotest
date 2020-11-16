package api.authorization;

import api.AbstractApi;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class AuthNoraGoFastTv extends AbstractApi {

    private static final Logger LOG = Logger.getLogger(AuthNoraGoFastTv.class);
    private static long startTime;
    private static long startTimeClass;
    private static RequestSpecification httpRequest;


    @BeforeClass
    public void starClass() {
        System.out.println("START FLOW");
        startTimeClass = System.currentTimeMillis();

    }

    @BeforeMethod
    public void startMethod() {
        RestAssured.baseURI = baseUrlNoraTv;
        httpRequest = RestAssured.given()
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("X-XSRF-TOKEN", "ed200cbe-e1a6-4c26-8f5f-ab18bc1139e0")
                .header("cookie", "XSRF-TOKEN=ed200cbe-e1a6-4c26-8f5f-ab18bc1139e0;JSESSIONID=B667FF43F31FB9859D55167B68ADDE6B")
                .header("accept", "application/json, text/plain, */*")
                .formParam("username", "evgenyz@setplex.com")
                .formParam("password", "Ny070809ev");
        startTime = System.currentTimeMillis();
    }

    @Test(priority = 1)
    public void authNoraGoTvTest() {
        io.restassured.response.Response response = httpRequest.request(Method.POST);
        Assert.assertEquals(200, response.statusCode());
        System.out.println("Time for request authNoraGoTvTest: " + (System.currentTimeMillis() - startTime) + " ms");
    }


}
