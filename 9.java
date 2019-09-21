import java.util.ArrayList;
import java.util.Collections;

class collectiondemo
{
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(5);
        a1.add(10);
        a1.add(9);
        a1.add(8);
        a1.add(4);
        a1.add(1);
        System.out.println("Normal ArrayList:- " + a1);

        Collections.addAll(a1,5,6,7);
        System.out.println("Adding Elements using collections :- " + a1);

        Collections.sort(a1);
        System.out.println("Sorted ArrayList:- " + a1);

        int i = Collections.min(a1);
        System.out.println("Minimum:- " + i);

        i = Collections.max(a1);
        System.out.println("Maximum:- " + i);

        Collections.reverse(a1);
        System.out.println("Reverse:- " + a1);

        Collections.replaceAll(a1,1,2);
        System.out.println("replace all:- " + a1);

        Collections.swap(a1,2,9);
        System.out.println("Swap:- "+ a1);

        Collections.fill(a1,1);
        System.out.println("Fill method :- " + a1);

        /*Collections.removeAll(a1);
        System.out.println("remove all:- " + a1);*/
    }
}