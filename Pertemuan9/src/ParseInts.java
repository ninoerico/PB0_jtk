// ****************************************************************
// ParseInts.java
// Reads a line of text and prints the integers in the line.
// ****************************************************************
import java.util.Scanner;
public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);
        String line;

        // Meminta input dari pengguna
        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());

        // Menangkap pengecualian di seluruh loop (akan berhenti saat ada karakter bukan angka)
       try { // saat di luar while atau loop
            while (scanLine.hasNext()) {
                //try { // posisi try berada di dalam loop yang akan menghasilkan output yang berbeda
                val = Integer.parseInt(scanLine.next());
                sum += val;
            }
        } catch (NumberFormatException e) {
            // Pengecualian ini akan dipicu jika ada input bukan integer
        }
        // Menampilkan hasil penjumlahan
        System.out.println("The sum of the integers on this line is " + sum);
    }
}
//}


