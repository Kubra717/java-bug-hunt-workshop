class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Example3 {
    public static void main(String[] args) {
        Student s = null;
        System.out.println(s.getName());

        // Student s1 = new Student("Arup");
        // Student s2 = s1;
        // s2.setName("Rahul");
        // System.out.println(s1.getName());

    
    }
}
