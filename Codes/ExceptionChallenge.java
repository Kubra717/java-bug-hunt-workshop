// public class ExceptionChallenge {

//     public static void main(String[] args) {

//         try {
//             process();
//         } catch (Exception e) {
//             System.out.println("Something went wrong");
//         }
//     }

//     static void process() {
//         int a = 10;
//         int b = 0;

//         int result = a / b;

//         System.out.println("Result: " + result);
//     }
// }

//2.
public class ExceptionChallenge {

    public static void main(String[] args) {

        try {
            process();
        } catch (Exception e) {
            e.printStackTrace();
            // or:
            // logger.error("process() failed", e);
        }
    }

    static void process() {
        int a = 10;
        int b = 0;

        int result = a / b;

        System.out.println("Result: " + result);
    }
}