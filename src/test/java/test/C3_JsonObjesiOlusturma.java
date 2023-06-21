package test;

import org.json.JSONObject;
import org.junit.Test;

public class C3_JsonObjesiOlusturma {

    /*
        Asagidaki JSON Objesini olusturup
        konsolda yazdirin.
        {
        "title":"Ahmet",
        "body":"Merhaba",
        "userId":1
        }
     */

    @Test
    public void jsonObje01(){

        JSONObject ilkJsonObje = new JSONObject();

        ilkJsonObje.put("title","Ahmet");
        ilkJsonObje.put("body","Merhaba");
        ilkJsonObje.put("userId",1);

        System.out.println("Ilk Json Objemiz: " + ilkJsonObje);
        // Ilk Json Objemiz: {"title":"Ahmet","body":"Merhaba","userId":1}


    }

    @Test
    public void jsonObje02(){
        /*
            {
            "firstname":"Jim",
            "additionalneeds":"Breakfast",
            "bookingdates":{
            "checkin":"2018-01-01",
            "checkout":"2019-01-01"
            },
            "totalprice":111,
            "depositpaid":true,
            "lastname":"Brown"
            }
         */

        JSONObject innerJason = new JSONObject();

        innerJason.put("checkin","2018-01-01");
        innerJason.put("checkout","2019-01-01");

        JSONObject outerJason = new JSONObject();

        outerJason.put("firstname","Jim");
        outerJason.put("additionalneeds","Breakfast");
        outerJason.put("totalprice",111);
        outerJason.put("depositpaid",true);
        outerJason.put("lastname","Brown");
        outerJason.put("bookingdates",innerJason);

        System.out.println("Nested JSON Objemiz: " + outerJason);
        /*
            Nested JSON Objemiz:
            {
            "firstname":"Jim",
            "additionalneeds":"Breakfast",
            "bookingdates":{
                            "checkin":"2018-01-01",
                            "checkout":"2019-01-01"
                            },
            "totalprice":111,
            "depositpaid":true,
            "lastname":"Brown"
            }
         */
    }

}
