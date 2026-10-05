public class Example5 {
    public static void main(String[] args) {
        //1.
        // String a = new String("Java");
        // String b = new String("Java");
        // System.out.println(a == b); // ?
        // System.out.println(a.equals(b)); // ?
        //2. 
        // String a = "Java";
        // String b = "Java";
        // System.out.println(a == b); // ?
        //3.
        String s = "Hello";
        s.concat(" Java");
        System.out.println(s); // still "Hello" ?
    }

    
}
