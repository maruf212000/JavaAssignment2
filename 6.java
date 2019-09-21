import java.util.Vector;
import java.util.Enumeration;
import java.util.Collections;

class vectordemo
{
    public static void main(String[] args) {
        Vector v = new Vector();

        v.add("Sunday");
        v.add("Monday");
        v.add("Tuesday");
        v.add("Thursday");
        v.add("Friday");
        v.add("Saturday");
        Enumeration days = v.elements();
        Collections.sort(v);
        while(days.hasMoreElements())
        {
            System.out.println(days.nextElement());
        }
    }
}