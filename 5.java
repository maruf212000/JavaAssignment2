import java.util.Map;
import java.util.HashMap;

class hashmapdemo
{
    public static void main(String[] args) {
        HashMap<String,String> hm1 = new HashMap<String,String>();

        hm1.put("A","Ahmedabad");
        hm1.put("B","Baroda");
        hm1.put("C","Chennai");
        hm1.put("D","Dehradun");
        System.out.println(hm1);

        System.out.println("Modifying value:- " + hm1.put("D","Delhi"));
        System.out.println(hm1);

        System.out.println("Key in Hashmap");

        for(String s:hm1.keySet())
            System.out.println(s);

        System.out.println("Values in Hashmap");
        
        for(String s1:hm1.values())
            System.out.println(s1);
           
        System.out.println("Fetching value using keys:- " + hm1.get("A"));
        System.out.println("Size of Hashmap:- "+ hm1.size());
        System.out.println("Removing:- " + hm1.remove("B")); 
    }
}