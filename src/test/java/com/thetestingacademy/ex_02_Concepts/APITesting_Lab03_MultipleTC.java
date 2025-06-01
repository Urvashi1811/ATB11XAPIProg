package com.thetestingacademy.ex_02_Concepts;

import io.restassured.RestAssured;

public class APITesting_Lab03_MultipleTC {

    public static void main(String[] args) {
       String  pincode = "389151";
        RestAssured
                .given()
                .baseUri("https://api.postalpincode.in")
                .basePath("/pincode/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

        pincode = "";
        RestAssured
                .given()
                .baseUri("https://api.postalpincode.in")
                .basePath("/pincode/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

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
