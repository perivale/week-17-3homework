package com.restapiexample.dummy.datainfo;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetEmployeeIdTest extends TestBase {
    @Test
    public void getemployeddid(){
        Response response= given()
                .pathParam("id",1)
                .when()
                .get("/employee/{id}");
        response.then().statusCode(200);
        response.prettyPrint();


    }
}
