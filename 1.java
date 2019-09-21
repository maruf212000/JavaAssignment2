import java.util.HashSet;

class Hashset1
{
    public static void main(String[] args) {
        HashSet<String> h1 = new HashSet<String>();
        h1.add("GLS");
        h1.add("University");
        h1.add("is");
        h1.add("Located");
        System.out.println(h1);

        System.out.println("Search for is:- " + h1.contains("is"));
    }
}