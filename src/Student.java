import java.util.Objects;

public final class Student {
    private final String name;
    private final int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Student student)) {
            return false;
        }
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
