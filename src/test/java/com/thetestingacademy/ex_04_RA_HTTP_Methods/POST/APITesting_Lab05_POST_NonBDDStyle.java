package com.thetestingacademy.ex_04_RA_HTTP_Methods.POST;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab05_POST_NonBDDStyle {


    RequestSpecification rs;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_nonBDD_Post(){

        String Payload= "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        System.out.println("---Part1---");
        rs = RestAssured.given();
    rs.baseUri("https://restful-booker.herokuapp.com");
    rs.basePath("/auth");
    rs.contentType("application/json");
    rs.body(Payload).log().all();

        System.out.println("----Part2--");

        response = rs.when().log().all().post();

        System.out.println("Part3");

        vr = response.then().log().all().statusCode(200);


    }
}
