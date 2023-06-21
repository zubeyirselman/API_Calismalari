package test;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C02_Get_ResponseBilgileriAsseriton {

        /*
        https://restful-booker.herokuapp.com/booking/10 url’ine bir GET request
        gonderdigimizde donen Response’ in;

        status code’ unun: 200,
        content type’ inin: application/json; charset=utf-8,
        Server isimli Header’in degerinin: Cowboy,
        status Line’ in: HTTP/1.1 200 OK
        response suresinin: 5 sn’ den kisa oldugunu

        test edin.
     */


    @Test
    public void get01(){

        // 1- URL Hazirla

        String url = "https://restful-booker.herokuapp.com/booking/10";

        // 2- Expected Data Hazirla (bu ornekte yok)

        // 3- Response Kaydet

        Response response = given().when().get(url);

        response.prettyPrint(); // API Testing' de konsolda birsey gormemize gerek yoktur.
                                // Ogrenme asamasinda somutlastirmak icin yazdirilabilir.

        // 4- Assertion
        response
                .then()
                    .assertThat()
                    .statusCode(200)
                    .contentType("application/json; charset=utf-8")
                    .header("Server","Cowboy")
                    .statusLine("HTTP/1.1 200 OK");


    }
}
