package in.restassured.RestAssuredDemo;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
public class GetUsersDemo {
@Test
public void getServerResponse() {
	RestAssured
	.when()
	      .get("http://localhost:9010/get-users")
	           .then()
	                 .assertThat()
	                             .statusCode(200)
	                                             .log().all();
}
}
