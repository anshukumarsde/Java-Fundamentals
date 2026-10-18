# Java Fundamentals

A small interactive console tutorial for core Java concepts. Each topic lives
in its own class, while `Main` provides the menu and `Student` is a shared
model used by the object-equality examples.

## Run

Requires JDK 17 or later. From the project root:

```powershell
javac -d out src\*.java
java -cp out Main
```

Choose a topic from the menu to see a short runnable example. The
synchronization example starts two threads that safely update a shared counter.

## Classes and topics

- **`Main`** is the application entry point. Its `main` method prints the menu,
  reads the user's selection, and dispatches to the corresponding demo's
  `run()` method. It repeats until the user enters `0`; invalid choices display
  a prompt to choose again.
- **`HashMapDemo`** creates two separate `Student` objects with the same name
  and ID. It stores a score in a `HashMap` using one object as a key, then
  retrieves it using the other. This shows how a map uses `equals()` and
  `hashCode()` to match keys.
- **`EqualsAndHashCodeDemo`** compares two separate `Student` instances with
  the same data. It prints the result of `==` (reference identity),
  `equals()` (logical equality), and whether their hash codes match.
- **`CollectionsDemo`** creates a mutable `List` of names, sorts it
  alphabetically, and copies the names into a `HashSet`. Adding a duplicate
  name demonstrates that a set keeps only unique elements.
- **`SynchronizationDemo`** creates one shared `Counter` and starts two
  worker threads, each incrementing it 10,000 times. `Counter.increment()` is
  synchronized so updates are protected from races; `join()` waits for both
  workers before the final count is printed. The counter is private to this
  demonstration because it illustrates synchronization rather than serving as
  a shared application model.
- **`Student`** is an immutable model with `name` and `id` fields. Its
  `equals()` and `hashCode()` methods use both fields, providing consistent
  logical equality for the HashMap and equality demonstrations.

The demo classes are small, non-instantiable classes with static `run()` entry
points. This keeps topic logic separate from menu/input handling and makes it
straightforward to add another topic: create a demo class and add a menu
dispatch case in `Main`.
