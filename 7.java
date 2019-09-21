import java.util.ArrayList;

class arraylistdemo
{
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);

        System.out.println("Size of arraylist:- " + arr1.size());

        System.out.println("Searching 5 in arraylist:- " + arr1.contains(5));
    }
}