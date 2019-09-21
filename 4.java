import java.util.Map;
import java.util.TreeMap;

class treemapdemo
{
    public static void main(String[] args) {
        TreeMap<String,String> tm1 = new TreeMap();
        tm1.put("A","Ahmedabad");
        tm1.put("B","Baroda");
        tm1.put("C","Chennai");
        tm1.put("D","Delhi");

        System.out.println(tm1);
        System.out.println(tm1.put("D","Dehradun"));
        System.out.println(tm1);

        System.out.println("Keys in TreeMap");
        for(String s:tm1.keySet())
            System.out.println(s);

        System.out.println("Values in TreeMap");
        for(String s1:tm1.values())
            System.out.println(s1);
    
        System.out.println("Fetching value using key:- " + tm1.get("C"));    
        System.out.println("Size of treeMap:- " + tm1.size());
        System.out.println("Removing :- " + tm1.remove("C"));    
    }
}