import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class APIMain {

    public static void main(String[] args) {

        try {
            //Public API:
            //https://www.metaweather.com/api/location/search/?query=<CITY>
            //https://www.metaweather.com/api/location/44418/
        	//https://www.metaweather.com/api/location/search/?query=Bangalore
        	//https://www.metaweather.com/api/location/2295420,

            URL url = new URL("https://www.metaweather.com/api/location/search/?query=Bangalore");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCode = conn.getResponseCode();
            if (responseCode != 200) 
            {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } 
            else 
            {
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) 
                {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();
                System.out.println(informationString);
                JSONParser parse = new JSONParser();
                JSONArray dataObject = (JSONArray) parse.parse(String.valueOf(informationString));
                System.out.println(dataObject.get(0));
                JSONObject countryData = (JSONObject) dataObject.get(0);
               System.out.println(countryData.get("title"));
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}