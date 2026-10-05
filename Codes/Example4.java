
public class Example4 {
    static void zeroOut(int[] arr) {
        arr[0] = 0;
    }
    public static void main(String[] args) {
        

    int[] numbers = {1, 2, 3};

    zeroOut(numbers);
        System.out.println(numbers[0]);   // 0, not 1!
    }
    
}
