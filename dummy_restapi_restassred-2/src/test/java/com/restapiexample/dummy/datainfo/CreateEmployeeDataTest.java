package com.restapiexample.dummy.datainfo;

import com.restapiexample.dummy.Model.DummyRestApiPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreateEmployeeDataTest extends TestBase {

    @Test
    public void createEmployeeData(){

    DummyRestApiPojo dummyRestApiPojo=new DummyRestApiPojo();
    dummyRestApiPojo.setName("shilpa");
    dummyRestApiPojo.setSalary("26000");
    dummyRestApiPojo.setAge("27");
    dummyRestApiPojo.setId("09");

        Response response = given()
                .header("Connection", "keep-alive")

                .body(dummyRestApiPojo)
                .when()
                .post("/create");
        response.then().statusCode(200);
        response.prettyPrint();


}}
