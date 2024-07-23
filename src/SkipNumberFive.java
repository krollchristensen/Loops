public class SkipNumberFive {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Spring iterationen over, når i er 5
            }
            System.out.println(i);
        }
    }
}
