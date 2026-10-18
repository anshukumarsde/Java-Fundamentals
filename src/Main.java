import java.util.Scanner;

public class Main {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Java Fundamentals");

        while (true) {
            printMenu();
            String choice = INPUT.nextLine().trim();

            switch (choice) {
                case "1" -> HashMapDemo.run();
                case "2" -> EqualsAndHashCodeDemo.run();
                case "3" -> CollectionsDemo.run();
                case "4" -> SynchronizationDemo.run();
                case "0" -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Choose 0, 1, 2, 3, or 4.");
            }

            System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println("""

                Choose a topic:
                1. HashMap
                2. equals() and hashCode()
                3. Collections
                4. Synchronization
                0. Exit
                """);
        System.out.print("> ");
    }
}
