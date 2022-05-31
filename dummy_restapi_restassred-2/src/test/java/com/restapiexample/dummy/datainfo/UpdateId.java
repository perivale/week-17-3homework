package com.restapiexample.dummy.datainfo;

import com.restapiexample.dummy.Model.DummyRestApiPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UpdateId extends TestBase {

    @Test
    public void UpdateEmployeeId(){
        DummyRestApiPojo dummyRestApiPojo=new DummyRestApiPojo();
        dummyRestApiPojo.setName("divya1");
        dummyRestApiPojo.setSalary("26000");
        dummyRestApiPojo.setAge("27");
        dummyRestApiPojo.setId("21");



        Response response = given()
                .body(dummyRestApiPojo)
                .pathParam("id",21)
                .when()
                .patch("/update/{id}");
        response.then().statusCode(200);
        response.prettyPrint();




    }
}
