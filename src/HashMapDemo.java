import java.util.HashMap;
import java.util.Map;

public final class HashMapDemo {
    private HashMapDemo() {
    }

    public static void run() {
        Student originalKey = new Student("Mina", 101);
        Student equivalentKey = new Student("Mina", 101);
        Map<Student, Integer> scores = new HashMap<>();

        scores.put(originalKey, 95);

        System.out.println("A HashMap stores key-value pairs:");
        System.out.println("scores.put(originalKey, 95)");
        System.out.println("scores.get(equivalentKey) = " + scores.get(equivalentKey));
        System.out.println("The equivalent key finds the value because Student implements "
                + "equals() and hashCode().");
    }
}
