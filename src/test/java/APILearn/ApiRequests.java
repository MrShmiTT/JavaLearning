package APILearn;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class ApiRequests {

    @Test
    public void getWithoutExtractData() {
        RestAssured.baseURI = "https://postman-echo.com";

        given()
            .param("foo1", "bar1")
            .param("foo2", "bar2").
            when()
            .get("/get").
            then()
            .statusCode(200)
            .contentType(ContentType.JSON)
            .body("args.foo1", equalTo("bar1"))
            .body("headers.x-forwarded-proto", equalTo("https"));
    }

    @Test
    public void getWithExtractData() {
        RestAssured.baseURI = "https://postman-echo.com";

        Response response = given()
            .param("foo1", "bar1")
            .param("foo2", "bar2").
            when()
            .get("/get").
            then()
            .statusCode(200)
            .contentType(ContentType.JSON)
            .body("args.foo1", equalTo("bar1"))
            .body("headers.x-forwarded-proto", equalTo("https"))
            .extract().response();

        System.out.println("GET REQUEST");
        String headersHost = response.path("headers.host");
        System.out.println("headersHost: " + headersHost);
        System.out.println("Response body from Get request:");
        response.prettyPrint();
    }

    @Test
    public void postWithJsonBody() {
        RestAssured.baseURI = "https://httpbin.org";

        JSONObject requestBody = new JSONObject()
            .put("name", "test name")
            .put("age", 18)
            .put("hobby", "sport");
        Response response = given()
            .body(requestBody.toString())
            .when()
            .post("/post")
            .then()
            .statusCode(200)
            .contentType(ContentType.JSON)
            .body("data", containsString("test name"))
            .body("headers.Content-Length", equalTo("45"))
            .extract().response();

        System.out.println("POST REQUEST");
        System.out.println("Response body from POST request:");
        response.prettyPrint();
        String origin = response.path("origin");
        System.out.println("origin: " + origin);
    }
}
