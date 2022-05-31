package com.restapiexample.dummy.testbase;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;

import static io.restassured.RestAssured.given;

/**
 * Created by Jay Vaghani
 */
public class TestBase {
    static ValidatableResponse response;


    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI="http://dummy.restapiexample.com/";
        RestAssured.basePath="api/v1";





    }
}
