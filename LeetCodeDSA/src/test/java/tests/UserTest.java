package tests;

import base.BaseTest;
import com.fasterxml.jackson.databind.util.JSONPObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import payloads.UserPayload;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class UserTest extends BaseTest {

    private static String generatedId = null;

    @Test(priority = 1)
    public void createUserTest() {
        UserPayload payload = new UserPayload("Chethan", "QA");
        Response response = given()
                .body(payload)
                .when()
                .post("/api/users")
                .then()
                .log().all()
                .statusCode(201)
                .extract().response();
        //using jsonPath
        generatedId =response.jsonPath().get("id");
//        JSONObject jsonObject = new JSONObject(response.asString());
//        generatedId = jsonObject.get("id").toString();
        System.out.println(response.asString());
    }

    @Test(dependsOnMethods = "createUserTest")
    public void updateUser(){
        HashMap<String,String> map = new HashMap<>();
        map.put("name","Chethan");
        map.put("job","SDET 2");
        Response response = given()
                .body(map)
                .pathParam("id", UserTest.generatedId)
                .when()
                .put("/api/users/{id}")
                .then()
                .log().all().extract().response();

        Assert.assertEquals(response.getStatusCode(),200,"user updated failed");
    }

    @Test(priority = 2)
    public void deleteUser(){
        Response response = given()
                .pathParam("id",generatedId)
                .when()
                .delete("/api/users/{id}")
                .then()
                .log().all()
                .statusCode(204)
                .extract().response();
        Assert.assertEquals(response.getStatusCode(),204,"Deletion of user failed!");
    }

    @Test(priority=2)
    public void getUsers(){
        Response response = given()
                .when()
                .get("api/users")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        System.out.println(response.getStatusCode());

//      iterate and validate response using JSON object
        JSONObject jsonObject = new JSONObject(response.asString());
        JSONArray jsonArray = jsonObject.getJSONArray("data");

        for(Object obj: jsonArray){
            System.out.println(obj);
        }
    }

}
