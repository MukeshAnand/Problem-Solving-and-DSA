import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Test {
	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.out.println(Result.calculateNAV("20190101"));
		
	}

}



class Result {

    /*
     * Complete the 'calculateNAV' function below.
     *
     * The function is expected to return a DOUBLE.
     * The function accepts STRING date as parameter.
     */
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static double calculateNAV(String date) throws MalformedURLException, IOException {
      
		
        
        URL urlForGetRequest = new URL("https://raw.githubusercontent.com/arcjsonapi/HoldingValueCalculator/master/api/holding");
        
        String readLine = null;
        
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
        
        conection.setRequestMethod("GET");
        
        conection.setRequestProperty("date", date); 
        
        int responseCode = conection.getResponseCode();
       
        HashMap<String, Integer> holdings = new HashMap<String,Integer>();
        
        HashMap<String, HashMap<String,Integer>> holdDate = new HashMap<>();
        
        HashMap<String, Double> price = new HashMap<>();
        
        Gson gson = new Gson();
        
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader( new InputStreamReader(conection.getInputStream()));

            StringBuffer response = new StringBuffer();

            while ((readLine = in .readLine()) != null) {
            	
                response.append(readLine);

            } in .close();
            
            
            System.out.println(response);
            JsonParser parse = new JsonParser();
            
            JsonArray jarr = (JsonArray)parse.parse(response.toString()); 
        	
             System.out.println(jarr);
             
             for(int i=0;i<jarr.size();i++) {
            	 
            	 JsonObject obj = (JsonObject) jarr.get(i);
            	 System.out.println(date+" "+(String)(obj.get("date").getAsString()));
            	 
            	 if(date.equalsIgnoreCase((String)obj.get("date").getAsString())) {
            	 
                 holdings.put(obj.get("security").toString(), holdings.getOrDefault(obj.get("security"), 0)+ obj.get("quantity").getAsInt());
            	 }
                 
                 
            	 
            	
             }
             
             System.out.println(holdings);
             
             System.out.println(date);
             
             calculatePrice(date, price);
             
             double result =0;
             
             for(Entry<String, Integer> e:holdings.entrySet()) {
            	 
            	 double p = price.get(e.getKey());
            	 
            	 result+=p*e.getValue();
            	 
            	 
             }
             
             df2.setRoundingMode(RoundingMode.UP);
      
           
             
            return Double.valueOf(df2.format(result));

        } else {

            System.out.println("GET NOT WORKED");

        }
        return 0;

    }
    
    
    public static double calculatePrice(String date,HashMap<String,Double> price) throws MalformedURLException, IOException {
      
		
        
        URL urlForGetRequest = new URL("https://raw.githubusercontent.com/arcjsonapi/HoldingValueCalculator/master/api/pricing");
        
        String readLine = null;
        
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
        
        conection.setRequestMethod("GET");
        
        conection.setRequestProperty("date", date); 
        
        int responseCode = conection.getResponseCode();
       
       
        
 
        
        Gson gson = new Gson();
        
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader( new InputStreamReader(conection.getInputStream()));

            StringBuffer response = new StringBuffer();

            while ((readLine = in .readLine()) != null) {
            	
                response.append(readLine);

            } in .close();
            
            
            //System.out.println(response);
            JsonParser parse = new JsonParser();
            
            JsonArray jarr = (JsonArray)parse.parse(response.toString()); 
        	
             //System.out.println(jarr);
             
             for(int i=0;i<jarr.size();i++) {
            	 
            	 JsonObject obj = (JsonObject) jarr.get(i);
            	 
            	 //System.out.println(obj.get("date").toString());
            	 if(date.equalsIgnoreCase(obj.get("date").getAsString())) {
            	 price.put(obj.get("security").toString(), obj.get("price").getAsDouble());
            	 }
            	 
            	
             }
           
             
           //  System.out.println(price);

        } else {

            System.out.println("GET NOT WORKED");

        }
        return 0;
    }

}
