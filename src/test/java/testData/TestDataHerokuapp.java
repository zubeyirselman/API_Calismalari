package testData;

import org.json.JSONObject;

import java.util.HashMap;

public class TestDataHerokuapp {

    public int basariliStatusCode = 200;

    public JSONObject bookingDatesOlusturJSON(){

        JSONObject bookingdates = new JSONObject();

        bookingdates.put("checkin" , "2021-06-01");
        bookingdates.put("checkout" , "2021-06-10");

        return bookingdates;
    }

    public JSONObject bookingOlusturJSON(){

        JSONObject booking = new JSONObject();

        booking.put("firstname" , "Ali");
        booking.put("lastname" , "Bak");
        booking.put("totalprice" , 500);
        booking.put("depositpaid" , false);
        booking.put("additionalneeds" , "wi-fi");
        booking.put("bookingdates" , bookingDatesOlusturJSON());

        return booking;
    }

    public JSONObject expectedBodyOlusturJSON(){

        JSONObject expData = new JSONObject();

        expData.put("bookingid" , 24);
        expData.put("booking" , bookingOlusturJSON());

        return expData;
    }

    public HashMap bookingDatesMap(){

        HashMap<String,Object> bookingDates = new HashMap<>();
        bookingDates.put("checkin" , "2021-06-01");
        bookingDates.put("checkout" , "2021-06-10");
        return bookingDates;
    }

    public HashMap reqBodyMap(){

        HashMap<String,Object> bookingMap = new HashMap<>();
        bookingMap.put("firstname" , "Ali");
        bookingMap.put("lastname" , "Bak");
        bookingMap.put("totalprice" , 500.0);
        bookingMap.put("depositpaid" , false);
        bookingMap.put("bookingdates" , bookingDatesMap());
        bookingMap.put("additionalneeds" , "wi-fi");

        return bookingMap;
    }


    public HashMap<String,Object> expBodyMap (){

        HashMap<String,Object> expBodyMap = new HashMap<>();

        expBodyMap.put("bookingid" , 24.0);
        expBodyMap.put("booking" , reqBodyMap());

        return expBodyMap;
    }

}
