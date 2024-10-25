// ****************************************************************
// CountLetters.java
// Reads a words from the standard input and prints the number of
// occurrences of each letter in that word.
// ****************************************************************
import java.util.Scanner;
public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26]; // Array untuk menyimpan jumlah dari tiap huruf
        Scanner scan = new Scanner(System.in);

        // Meminta kata dari pengguna  untuk memasukkan huruf
        System.out.print("Masukkan sebuah kata (hanya huruf, ya): ");
        String word = scan.nextLine();

        // Mengubah semua huruf menjadi huruf besar
        word = word.toUpperCase();

        // Menghitung frekuensi tiap huruf dalam string
        for (int i = 0; i < word.length(); i++) {

            try {// try
                // Mencoba memperbarui jumlah untuk huruf tersebut
                counts[word.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {// catch
                // Menangani karakter yang bukan huruf
                System.out.println("Bukan huruf: '" + word.charAt(i) + "'");
            }
        }
        // Menampilkan frekuensi tiap huruf
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }
    }
}
// penempatan yg benar dari try catch
//di sini akan membuat kondisi saat terjadi error bisa diatasi dan dan program tetap berjalan