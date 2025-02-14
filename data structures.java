// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
       
        HashMap<String,String> map = new HashMap<>();
        map.put("A","Athulya");
        map.put("K","Kaviya");
        map.put("H","Harini");
        
        
        System.out.println(map.get("A"));
        System.out.println(map.get("K"));
        System.out.println(map.getOrDefault("AP" , "Not Found"));
        
        for(String key: map.keySet()){
            System.out.println(key+ " " + map.get(key));
        }
        map.remove("H");
    }
    
}
