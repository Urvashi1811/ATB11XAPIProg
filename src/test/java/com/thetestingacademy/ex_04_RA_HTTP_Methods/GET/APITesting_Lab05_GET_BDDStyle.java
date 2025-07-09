package com.thetestingacademy.ex_04_RA_HTTP_Methods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab05_GET_BDDStyle {
    @Test
    public void test_GET_Positive(){
        String pincode = "389151";
        RestAssured
                .given()
                    .baseUri("https://api.postalpincode.in")
                    .basePath("/pincode/" + pincode)
                .when()
                    .log()
                    .all()
                    .get()
                .then()
                    .log().all().statusCode(200);

    }
    @Test
    public void test_GET_Negative_TC2() {
        String pincode = "";
        RestAssured
                .given()
                     .baseUri("https://api.postalpincode.in")
                    .basePath("/pincode/" + pincode)
                .when()
                    .log()
                    .all()
                    .get()
                .then()
                    .log().all().statusCode(200);

    }
    @Test
    public void test_GET_Neg_TC3(){
        String pincode = "!@!#";
        RestAssured
                .given()
                     .baseUri("https://api.postalpincode.in")
                        .basePath("/pincode/" + pincode)
                .when()
                    .log()
                    .all()
                    .get()
                .then()
                    .log().all().statusCode(200);
    }
    }


