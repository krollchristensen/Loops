import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Opgave: Skriv en while-løkke,
        // der beregner summen af alle lige tal op til en given værdi.
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast en værdi: ");
        int max = input.nextInt();
        int sum = 0;
        int i = 2; // Start med det første lige tal

        while (i <= max) {
            sum += i; // Tilføj det nuværende lige tal til summen
            i += 2; // Gå til det næste lige tal
        }

        System.out.println("Summen af alle lige tal op til " + max + " er " + sum);
        input.close();


        /*
        Opgave: Konverter følgende while-løkke til en for-løkke.

        int i = 0;
        while (i < 10) {
            System.out.println("i er " + i);
             i++;
         }

         for (int i = 0; i < 10; i++) {
               System.out.println("i er " + i);
          }
         */


    }
}