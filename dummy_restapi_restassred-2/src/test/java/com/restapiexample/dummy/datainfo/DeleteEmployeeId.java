package com.restapiexample.dummy.datainfo;

import com.restapiexample.dummy.Model.DummyRestApiPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteEmployeeId extends TestBase {

    @Test
    public void deleteEmployeeId(){
        DummyRestApiPojo dummyRestApiPojo=new DummyRestApiPojo();
        dummyRestApiPojo.setName("dharti");
        dummyRestApiPojo.setSalary("26000");
        dummyRestApiPojo.setAge("27");
        dummyRestApiPojo.setId("09");

        Response response = given()
                .body(dummyRestApiPojo)
                .pathParam("id",2)
                .when()
                .delete("/delete/{id}");
        response.then().statusCode(200);
        response.prettyPrint();





    }
}
