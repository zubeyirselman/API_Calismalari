package test;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C01_Get_ApiSorgulama {

    /*
        https://restful-booker.herokuapp.com/booking/10 url’ine bir GET request
        gonderdigimizde donen Response’ in;

        status code’ unun: 200,
        content type’ inin: application/json; charset=utf-8,
        Server isimli Header’in degerinin: Cowboy,
        status Line’ in: HTTP/1.1 200 OK
        response suresinin: 5 sn’ den kisa oldugunu manuel olarak test ediniz.
     */

    // 1- Gonderecegim Request icin gerekli olan URL ve ihtiyacim varsa Request Body hazirlamaliyim
    // 2- Eger soruda bize verilmisse Expected Data hazirlamaliyim
    // 3- Donen Response' i Actual Data olarak kaydetmeliyim
    // 4- Expected Data ile Actual Data' yi karsilastirmali, yani Assertion yapmaliyim

    @Test
    public void get01(){

        // 1- Gonderecegim Request icin gerekli olan URL ve ihtiyacim varsa Request Body hazirlamaliyim

        String url = "https://restful-booker.herokuapp.com/booking/10";

        // 2- Eger soruda bize verilmisse Expected Data hazirlamaliyim (bu ornekte yok)

        // 3- Donen Response' i Actual Data olarak kaydetmeliyim

        Response response = given().when().get(url);

        response.prettyPrint();

        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Content Type: " + response.getContentType());
        System.out.println("Server Header Degeri: " + response.getHeader("Server"));
        System.out.println("Status Line: " + response.getStatusLine());
        System.out.println("Response Suresi: " + response.getTime());


    }
}
