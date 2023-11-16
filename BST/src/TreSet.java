import java.util.Iterator;
import java.util.TreeSet;

public class TreSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(50);
        ts.add(30);
        ts.add(70);
        ts.add(10);
        ts.add(40);
        System.out.println(ts);
        System.out.println(ts.contains(50));
        ts.remove(30);

        Iterator<Integer> i = ts.iterator();
        while(i.hasNext())
            System.out.println(i.next());

        // Extra methods in TreeSet.

        System.out.println(ts.lower(40)); // Returns value (just) lower than the given value
        System.out.println(ts.higher(40)); // Returns value (just) higher than the given value
        System.out.println(ts.floor(40)); // Returns value lower or equal to the given value
        System.out.println(ts.ceiling(40)); // Returns value higher or equal to the given value
    }
}
