package trelloApiAutomation;

import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import junit.framework.Assert;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class ApiRequests {
	
	 public static String baseurl = "https://api.trello.com";
	 String id;
	
	@Test(priority=0)
	public void createBoard() {
		Response response  = given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.queryParam("name", "Chethan Kumar")
		.queryParam("key", "3019e5237917af239b2fe2384fe877ce")
		.queryParam("token", "ATTAe0408255feb4f09c4f78bd004eae05d75a003b36df73ef8e8a4e836919797d01A067749A")
		.when()
		.post(baseurl+"/1/boards/").then().statusCode(200).extract().response();
		 System.out.println(response);
		 JsonPath req = new JsonPath(response.asString());
		 id = req.get("id");
		 System.out.println(id);
		 
		 //to delete the above board 
		 //we need this id : 658026dda9034b6c3cc3bca9 generated
		 //the response i got
		
	}
	
	@Test(priority=1)
	public void getRequest() {
		Response response = given()
	    .header("Accept", "application/json")
		.contentType(ContentType.JSON)
		.queryParam("key", "3019e5237917af239b2fe2384fe877ce")
		.queryParam("token", "ATTAe0408255feb4f09c4f78bd004eae05d75a003b36df73ef8e8a4e836919797d01A067749A")
		.when()
		.get("https://api.trello.com/1/boards/"+id)
		.then().statusCode(200).extract().response();
		
	}
	
	@Test(priority=2)
	public void putRequest() {
		Response response = given()
		.header("Accept","application/json")
		.contentType(ContentType.JSON)
		.queryParam("name", "Chethan N")
		.queryParam("key", "3019e5237917af239b2fe2384fe877ce")
		.queryParam("token", "ATTAe0408255feb4f09c4f78bd004eae05d75a003b36df73ef8e8a4e836919797d01A067749A")
		.when()
		.put("https://api.trello.com/1/boards/"+id)
		.then().statusCode(200).extract().response();
		
	}
	
	@Test(priority=3)
	public void deleteRequest() {
		Response response = given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.queryParam("name", "Chethan N")
		.queryParam("key", "3019e5237917af239b2fe2384fe877ce")
		.queryParam("token", "ATTAe0408255feb4f09c4f78bd004eae05d75a003b36df73ef8e8a4e836919797d01A067749A")
		.when()
		.delete("https://api.trello.com/1/boards/"+id)
		.then().statusCode(200).extract().response();
		
	}

}
