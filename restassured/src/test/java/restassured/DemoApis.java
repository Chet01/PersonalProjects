package restassured;



import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import junit.framework.Assert;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import javax.xml.crypto.Data;

public class DemoApis {

	@Test
	public void getDetails() {
		
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		int statusCode = res.getStatusCode();
		System.out.println(statusCode);
		System.out.println(res.getBody());
		System.out.println(res.asString());
		System.out.println(res.getTime());
		Assert.assertEquals(statusCode, 200);
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).
		body("data[0].first_name", equalTo("Michael")).log().all();
	}
	
	@Test
	public void postRequest() {
		JSONObject js = new JSONObject();
		js.put("email", "kevinSanjaya@bpl.com");
		js.put("first_name", "kevin");
		js.put("last_name", "Sanjaya");
		given().body(js)
		.when().post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.log().all();
		
		
		
	}
	
	@Test
	public void putRequest() {
		JSONObject js = new JSONObject();
		js.put("name", "morpheus");
		js.put("job", "SDET");
		given().body(js)
		.when().put("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.log().all();	
	}
	
	@Test
	public void deleteRequest() {
		given()
		.when().delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204)
		.log().all();	
	}
	
}
