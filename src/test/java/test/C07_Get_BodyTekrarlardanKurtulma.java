package test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class C07_Get_BodyTekrarlardanKurtulma {

    /*
                https://restful-booker.herokuapp.com/booking/10 url’ ine
                bir GET request gonderdigimizde donen Response’ in,

                status code’ unun: 200,
                ve content type’ inin: application/json; charset=utf-8,
                ve response body’  sindeki
                    "firstname“ in:"Susan",
                    ve "lastname“ in: "Brown",
                    ve "totalprice“ in: 689,
                    ve "depositpaid“ in: false
                oldugunu test edin
         */

    @Test
    public void get01(){

        // 1 - Url hazirla

        String url = "https://restful-booker.herokuapp.com/booking/10";

        // 2 - Expected Data hazirla

        // 3 - Response'i kaydet

        Response response = given().when().get(url);

        response.prettyPrint();

        // 4 - Assertion

        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .body( "firstname", equalTo("Susan"),
                        "lastname",equalTo("Brown"),
                        "totalprice",equalTo(689),
                        "depositpaid",equalTo(false));

    }

}
