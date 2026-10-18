import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class CollectionsDemo {
    private CollectionsDemo() {
    }

    public static void run() {
        List<String> names = new ArrayList<>(List.of("Zoe", "Ari", "Mina"));
        Collections.sort(names);

        Set<String> uniqueNames = new HashSet<>(names);
        uniqueNames.add("Ari");

        System.out.println("List keeps its elements in order and allows duplicates: " + names);
        System.out.println("Set contains unique elements: " + uniqueNames);
        System.out.println("Adding Ari again leaves the set size at " + uniqueNames.size() + ".");
    }
}
