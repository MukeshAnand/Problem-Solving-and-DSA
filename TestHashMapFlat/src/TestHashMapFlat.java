import java.util.*;

class HashMapTest{
    
    public static void main(String[] args){
        
        HashMapTest hashmapTest= new HashMapTest();
        
        
        HashMap<String, HashMap<String, HashMap<String,String>>> nestedHashMap = new HashMap<String, HashMap<String, HashMap<String,String>>>();
        
        HashMap<String, HashMap<String,String>> innerMap = new HashMap<String, HashMap<String,String>>();
        
        HashMap<String, String> mukeshMap = new HashMap<String, String>();
        
        mukeshMap.put("Hello","Test1");
        
        HashMap<String, String> sivaMap = new HashMap<String, String>();
        
        sivaMap.put("Hi", "Test2");
        
        
        innerMap.put("Mukesh",mukeshMap);
        innerMap.put("Siva", sivaMap);
       
        
        nestedHashMap.put("emp",innerMap);
        
        hashmapTest.printNestedMap(nestedHashMap);
        
    }
    
    void printNestedMap(HashMap<String,HashMap<String,HashMap<String,String>>> nMap){
        
        
        
        for(Map.Entry<String, HashMap<String, HashMap<String,String>>> out : nMap.entrySet()){
        
        HashMap<String, HashMap<String,String>> innerMap = out.getValue();
        
        
        for(Map.Entry<String, HashMap<String,String>> e:innerMap.entrySet()){
            
            HashMap<String, String> innerMost= e.getValue();
            
            for(Map.Entry<String, String> in: innerMost.entrySet()){
            
            System.out.println("InnerMost Map Key "+in.getKey()+"InnerMost Map Value"+in.getValue());
            }
            
        }
        
        }
        
    }
}