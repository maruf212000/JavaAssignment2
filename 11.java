import java.util.TreeSet;
import java.util.Set;

class uniondemo
{
    public static void main(String[] args) {
        TreeSet<Integer> s1 = new TreeSet<Integer>();
        s1.add(10);
        s1.add(9);
        s1.add(11);
        s1.add(1);
        TreeSet<Integer> s2 = new TreeSet<Integer>();
        s2.add(20);
        s2.add(7);
        s2.add(41);
        s2.add(10);
        Set<Integer> s3 = new TreeSet<Integer>(s1);
        s3.addAll(s2);
        System.out.println(s3);
    }
}