public class DebuggingChallenge {

    public static void main(String[] args) {

        // Bug #1: Off-by-one error
        int[] arr = { 10, 20, 30, 40, 50 };

        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Bug #2: Incorrect boundary
        int marks = 40;

        if (marks > 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Bug #3: Infinite loop
        int i = 0;

        while (i < 10) {
            System.out.println(i);
        }

        // Bug #4: Operator precedence
        int age = 20;
        boolean registered = false;
        boolean admin = true;

        if (age > 18 && registered || admin) {
            System.out.println("Access granted");
        }
    }
}