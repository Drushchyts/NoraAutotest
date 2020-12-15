package apiNora.authorization;

import apiNora.AbstractApi;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class AuthNoraGoTv extends AbstractApi {

    private static final Logger LOG = Logger.getLogger(AuthNoraGoTv.class);
    private static RequestSpecification httpRequest;


    @BeforeClass
    public void starClass() {
        LOG.info("TEST=====AuthNoraGoTv=====START");
        startTimeClass = System.currentTimeMillis();

    }

    @BeforeMethod
    public void startMethod() {
        RestAssured.baseURI = baseUrlNoraGo;
        httpRequest = RestAssured.given()
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("X-XSRF-TOKEN", "ed200cbe-e1a6-4c26-8f5f-ab18bc1139e0")
                .header("cookie", "XSRF-TOKEN=ed200cbe-e1a6-4c26-8f5f-ab18bc1139e0;JSESSIONID=B667FF43F31FB9859D55167B68ADDE6B")
                .header("accept", "application/json, text/plain, */*")
                .formParam("username", "a.drushchyts@setplex.com")
                .formParam("password", "BwUea7PTnUN8Zd8");
        startTime = System.currentTimeMillis();
    }

    @Test
    public void authNoraGoTvTest() {
        io.restassured.response.Response response = httpRequest.request(Method.POST);
        Assert.assertEquals(200, response.statusCode());
    }

    @AfterClass
    public void tearDown() {
        LOG.info("Time for request AuthNoraGoTv: " + (System.currentTimeMillis() - startTime) + " ms");
        LOG.info("TEST=====AuthNoraGoTv=====FINISH");
    }

}
