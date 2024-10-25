// ****************************************************************
// Factorials.java
// Reads integers from the user and prints the factorial of each.
// ****************************************************************
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);

        // Loop utama untuk meminta input pengguna
        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            System.out.print("Enter an integer: ");
            int val = scan.nextInt();

            // Blok try-catch untuk menangani pengecualian
            try {
                // Mencetak hasil faktorial
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
            } catch (IllegalArgumentException e) {
                // Menangkap pengecualian dan mencetak pesan error
                System.out.println("Error: " + e.getMessage());
            }

            // Menanyakan apakah pengguna ingin melanjutkan
            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }
    }
}