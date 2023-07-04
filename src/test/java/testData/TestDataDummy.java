package testData;

import org.json.JSONObject;

import java.util.HashMap;

public class TestDataDummy {

    public int basariliStatusCode = 200;
    public String contentType = "application/json";

    public JSONObject innerBodyOlusturJSON(){

        JSONObject innerBody = new JSONObject();

        innerBody.put("id",3);
        innerBody.put("employee_name","Ashton Cox");
        innerBody.put("employee_salary",86000);
        innerBody.put("employee_age",66);
        innerBody.put("profile_image","");

        return innerBody;
    }

    public JSONObject expectedBodyOlusturJSON(){

        JSONObject expBody = new JSONObject();

        expBody.put("status","success");
        expBody.put("data",innerBodyOlusturJSON());
        expBody.put("message","Successfully! Record has been fetched.");

        return expBody;
    }

    public HashMap dataBodyOlusturMap(){

        HashMap <String,Object> data = new HashMap<>();

        data.put("id",3.0);
        data.put("employee_name","Ashton Cox");
        data.put("employee_salary",86000.0);
        data.put("employee_age",66.0);
        data.put("profile_image","");

        return data;
    }


    public HashMap expectedBodyOlusturMap(){

        HashMap <String,Object> expBody = new HashMap<>();

        expBody.put("status","success");
        expBody.put("data",dataBodyOlusturMap());
        expBody.put("message","Successfully! Record has been fetched.");

        return expBody;
    }



}
