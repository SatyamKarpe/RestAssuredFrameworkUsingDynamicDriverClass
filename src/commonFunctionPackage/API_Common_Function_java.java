package commonFunctionPackage;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;


public class API_Common_Function_java {
	
	public static int statusCode(String baseURI, String resource, String requestbody) {
	
	RestAssured.baseURI=baseURI;
	
	int statusCode=given().header("Content-type","application/json").body(requestbody).when().post(resource).then().extract().response().statusCode();
	System.out.println(statusCode);
	return statusCode;
	}
	
	
	
	public static String response_body(String baseURI,String resource, String requestbody) {
	
	RestAssured.baseURI=baseURI;
	
	String responsebody=given().header("Content-type","application/json").body(requestbody).when().post(resource).then().extract().response().asString();
	return responsebody;
    }
}
