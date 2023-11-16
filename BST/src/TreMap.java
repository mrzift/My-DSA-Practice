import java.util.Map;
import java.util.TreeMap;

public class TreMap {
    public static void main(String[] args) {
        TreeMap<Integer , String> tm = new TreeMap<>();
        tm.put(20, "Course");
        tm.put(10, "GFG");
        tm.put(30, "Ide");
        tm.put(40,"smth");

        System.out.println(tm);

        System.out.println(tm.containsKey(10));

        for(Map.Entry<Integer, String>e : tm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

        tm.remove(40);

        System.out.println(tm.size());

        System.out.println(tm.higherKey(10));
        System.out.println(tm.lowerKey(10));
        System.out.println(tm.floorKey(10));
        System.out.println(tm.ceilingKey(10));
    }
}

