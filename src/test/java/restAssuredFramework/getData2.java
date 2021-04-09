package restAssuredFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class getData2 {
	
	@Test
	public void testResponseCode() {
		
		//Response resp=get("http://restcountries.eu/rest/v1/name/norway").getStatusCode();
		int code=get("http://restcountries.eu/rest/v1/name/norway").getStatusCode();
		System.out.println("Status Code is " + code);
		Assert.assertEquals(code, 200);
		
	}
	
	@Test
	public void testbody() {
		
		Response resp=get("http://restcountries.eu/rest/v1/name/norway");
		String body=resp.asString();
		System.out.println("Data is " + body);
		System.out.println("Response time is " +resp.getTime());
		//Assert.assertEquals(, 400);
		
	}

}
