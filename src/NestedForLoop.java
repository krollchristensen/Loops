public class NestedForLoop {
    //Opgave: Skriv en indlejret for-løkke,
    // der udskriver en tabel med 5 rækker og 5 kolonner.
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print(row * col + "\t");
            }
            System.out.println();
        }
    }
}
