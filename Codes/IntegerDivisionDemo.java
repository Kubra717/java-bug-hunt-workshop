public class IntegerDivisionDemo {

    public static void main(String[] args) {

        int total = 7;
        int count = 2;

        // BUG: Both operands are integers
        double average = total / count;

        System.out.println("Average: " + average);
    }
}