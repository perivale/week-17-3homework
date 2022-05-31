package com.restapiexample.dummy.datainfo;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetAllEmployeeTest extends TestBase {


    @Test
    public void getAllListEmplyoInfo() {

        Response response=given()
                .headers("Connection","keep-alive")
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();


    }




}
