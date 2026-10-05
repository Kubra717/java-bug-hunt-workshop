class Parent {
    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent { 
    void show() { 
        System.out.println("Child");
    } 
}
//2.
// class Parent {
//     Parent() {
//         show();
//     }

//     void show() {
//         System.out.println("Parent");
//     }
// }

// class Child extends Parent {
//     int level = 5;

//     void show() {
//         System.out.println("Level: " + level);
//     }
// }
//3.
// class Parent {
//     String label = "parent";
// }

// class Child extends Parent {
//     String label = "child";

//     void printBoth() {
//         System.out.println(this.label); // "child"
//         System.out.println(super.label); // "parent"
//     }
// }

public class Example11 {
    public static void main(String[] args) {
        // Parent p = new Child();
        // p.show(); // which one runs?
        //2.
        Parent p = new Parent();
        Child c = (Child) p; // compiles... then

    }
    
}
