package com.restapiexample.dummy.extractingresponsedata;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class SearchEmployeeDataJsonPathExample {
    static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://dummy.restapiexample.com/";
        RestAssured.basePath = "api/v1";
        response = given()
                .when()
                .get("/employees")
                .then().statusCode(200);

    }


    // 1. total records are 24
    @Test
    public void test001() {
        List<String> employeedata = response.extract().path("data");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The all emplooyee data : " + employeedata);
        System.out.println("------------------End of Test---------------------------");

    }

    // 2.total data[23].id
    @Test
    public void test002() {
        int id = response.extract().path("data[23].id");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("List of id are : " + id);
        System.out.println("------------------End of Test---------------------------");

    }

    // 3)data[23].employee_name
    @Test
    public void test003() {
        String employeename = response.extract().path("data[23].employee_name");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The data of 23 employeename is : " + employeename);
        System.out.println("------------------End of Test---------------------------");
    }

    // 4) extract the  message = “Successfully! All records has been fetched."
    @Test
    public void test004() {
        String message = response.extract().path("message");


        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The message are : " + message.equals("Successfully! All records has been fetched."));
        System.out.println("------------------End of Test---------------------------");

    }

    // 5) status = success
    @Test
    public void test005() {
        String statusmessage = response.extract().path("status");


        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The status message is : " + statusmessage);
        System.out.println("------------------End of Test---------------------------");
    }

    // 6) id = 3 has employee_salary=86000
    @Test
    public void test006() {
        List<String> salary = response.extract().path("data.findAll{it.id==3}.employee_salary");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The salary of the all the id num 3 employee are : " + salary);
        System.out.println("------------------End of Test---------------------------");
    }

    // 7) id = 6 has employee_age=61
    @Test
    public void test007() {
        List<String> employeeage = response.extract().path("data.findAll{it.id==6}.employee_age");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The list of employee has age is 61: " + employeeage);
        System.out.println("------------------End of Test---------------------------");
    }

    // 8) id = 11 has employee_name = Jena Gaines
    @Test
    public void test008() {
        List<String> employeename = response.extract().path("data.findAll{it.id==11}.employee_name");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The id 11 has employee name is : " + employeename);
        System.out.println("------------------End of Test---------------------------");
    }

}
