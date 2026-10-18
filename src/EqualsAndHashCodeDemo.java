public final class EqualsAndHashCodeDemo {
    private EqualsAndHashCodeDemo() {
    }

    public static void run() {
        Student first = new Student("Mina", 101);
        Student second = new Student("Mina", 101);

        System.out.println("Two separate Student objects with the same data:");
        System.out.println("first == second: " + (first == second));
        System.out.println("first.equals(second): " + first.equals(second));
        System.out.println("first.hashCode() == second.hashCode(): "
                + (first.hashCode() == second.hashCode()));
        System.out.println("Equal objects must have the same hash code, which lets hash-based "
                + "collections find and group them correctly.");
    }
}
