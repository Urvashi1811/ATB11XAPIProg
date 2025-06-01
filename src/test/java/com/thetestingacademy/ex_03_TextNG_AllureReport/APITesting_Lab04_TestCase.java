package com.thetestingacademy.ex_03_TextNG_AllureReport;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab04_TestCase {
String pincode = "389151";
    @Test
    public void test_GET_Positive_TC1() {
        String  pincode = "389151";
        RestAssured
                .given()
                .baseUri("https://api.postalpincode.in")
                .basePath("/pincode/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }
    @Test
    public void test_GET_Negative_TC2() {
        pincode = "";
        RestAssured
                .given()
                .baseUri("https://api.postalpincode.in")
                .basePath("/pincode/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }
    @Test
    public void test_GET_Neg_TC3(){
        pincode = "!@!#";
        RestAssured
                .given()
                .baseUri("https://api.postalpincode.in")
                .basePath("/pincode/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
    }


