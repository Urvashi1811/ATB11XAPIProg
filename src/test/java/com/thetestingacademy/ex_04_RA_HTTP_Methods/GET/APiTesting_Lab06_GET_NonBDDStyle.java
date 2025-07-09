package com.thetestingacademy.ex_04_RA_HTTP_Methods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APiTesting_Lab06_GET_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    public void test_GETNONBDD(){
    String pincode =  "389151";
    // GIVEN
    r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);

    // WHEN
    response = r.when().log().all().get();

        System.out.println(response.asString());

    // THEN
    vr = response.then().log().all();
        vr.statusCode(200);


}

@Test
public void test_GET_NonBDD_Neagtive(){

    String pincode =  "@";
    // GIVEN
    r = RestAssured.given();
    r.baseUri("https://api.zippopotam.us");
    r.basePath("/IN/" + pincode);

    // WHEN
    response = r.when().log().all().get();

    System.out.println(response.asString());

    // THEN
    vr = response.then().log().all();
    vr.statusCode(404);


}

}
