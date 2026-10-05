import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
class Student1{
    private int id;
    private String name;

    public Student1(int id) {
        this.id = id;
    }

    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id;  // hashCode() based on mutable field 'id'
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student1 student = (Student1) obj;
        return id == student.id;  // equals() based on mutable field 'id'
    }
}
public class Example9 {
    public static void main(String[] args) {
        //1.
        // Map<Student1, Integer> marks = new HashMap<>();
        // Student1 student = new Student1(100, "Alice");
        // marks.put(student, 90);

        // student.setId(200);   // id used in hashCode()
        // marks.get(student);   // returns null!

        //2.
        // Set<Student1> students = new HashSet<>();
        // students.add(new Student1(101));
        // students.add(new Student1(101));
        // System.out.println(students.size());   // 2, not 1!
        //3.
        // List list = new ArrayList();
        // list.add("Java"); list.add(100);
        // String s = (String) list.get(1); // 

        //4.
        List<String> names = Arrays.asList("Alice", "Bob");
        names.add("Carol");   // UnsupportedOperationException
    }
}
