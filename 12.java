import java.util.HashSet;
import java.util.Set;

class interdemo
{
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<Integer>();
        h1.add(10);
        h1.add(9);
        h1.add(11);
        h1.add(1);
        HashSet<Integer> h2 = new HashSet<Integer>();
        h2.add(20);
        h2.add(7);
        h2.add(41);
        h2.add(10);
        Set<Integer> h3 = new HashSet<Integer>(h1);
        h3.retainAll(h2);
        System.out.println(h3);
    }
}