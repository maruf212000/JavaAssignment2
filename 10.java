import java.util.LinkedList;
import java.util.Scanner;

class linkedlistdemo
{
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:- ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            l1.add(sc.nextInt());
        }
        System.out.println(l1);
    }
}