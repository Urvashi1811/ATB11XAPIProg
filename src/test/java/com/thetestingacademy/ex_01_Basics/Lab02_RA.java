package com.thetestingacademy.ex_01_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class Lab02_RA {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Pincode!");
        String pincode = scanner.next();
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
