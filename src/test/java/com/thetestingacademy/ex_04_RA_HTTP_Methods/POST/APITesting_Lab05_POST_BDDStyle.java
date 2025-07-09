package com.thetestingacademy.ex_04_RA_HTTP_Methods.POST;

import io.restassured.RestAssured;
import org.testng.annotations.Test;


public class APITesting_Lab05_POST_BDDStyle {


        @Test
    public void POST_Auth(){

            String payload = " {\n" +
                    "    \"username\" : \"admin\",\n" +
                    "    \"password\" : \"password123\"\n" +
                    "}";

            RestAssured
                    .given().baseUri("https://restful-booker.herokuapp.com")
                    .basePath("/auth")
                    .contentType("application/json")
                    .log().all().body(payload)
                    .when()
                    .log().all().post()
                    .then()
                    .log().all().statusCode(200);
        }

}
