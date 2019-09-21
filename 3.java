import java.util.*;

class hashset
{
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet<String>();

        hs1.add("India");
        hs1.add("Australia");
        hs1.add("South Africa");
        hs1.add("India");
        
        System.out.println(hs1);
        System.out.println("HashSet contains India or not:- " + hs1.contains("India"));

        System.out.println("Removing Australia from HashSet:- " + hs1.remove("Australia"));

        Iterator<String> i = hs1.iterator();
        while(i.hasNext())
            System.out.println(i.next());
    }
}