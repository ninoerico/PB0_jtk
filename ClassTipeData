import java.util.Scanner;

public class CekTipeData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        try {
            long angka = input.nextLong(); // Membaca input sebagai tipe data long karena

            System.out.println(angka + " can be fitted in:");

            // Memeriksa apakah bisa disimpan dalam tipe data byte
            if (angka >= Byte.MIN_VALUE && angka <= Byte.MAX_VALUE) {
                System.out.println("* byte");
            }
            // Memeriksa apakah bisa disimpan dalam tipe data short
            if (angka >= Short.MIN_VALUE && angka <= Short.MAX_VALUE) {
                System.out.println("* short");
            }
            // Memeriksa apakah bisa disimpan dalam tipe data int
            if (angka >= Integer.MIN_VALUE && angka <= Integer.MAX_VALUE) {
                System.out.println("* int");
            }
            // Tipe data long sudah otomatis sesuai karena input adalah long
            System.out.println("* long");

        } catch (Exception e) {
            // Jika bilangan melebihi rentang long, akan masuk ke sini
            System.out.println("Bilangan terlalu besar untuk disimpan dalam tipe data byte, short, int, atau long.");
        }
    }
}
