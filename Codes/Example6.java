public class Example6 {
    public static void main(String[] args) {
        int day = 2;
        switch (day) {
            case 1:
            case 2:
                System.out.println("Early week");
            case 3:
                System.out.println("Midweek");
                break;
            default:
                System.out.println("Other");
        }
        // prints BOTH "Early week" and "Midweek"
    }
    
}
