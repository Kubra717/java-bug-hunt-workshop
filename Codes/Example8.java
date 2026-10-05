import java.util.*;

public class Example8 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        for (String name : names) {
            if (name.startsWith("A")) {
                names.remove(name); // ConcurrentModificationException
            }
        }
    }
    
}
