import java.util.Scanner;
public class ConvertType {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Membaca dua string A dan B dari input pengguna
        String A = scanner.next();
        String B = scanner.next();

        // 1. Menghitung panjang dari A dan B, lalu menjumlahkannya
        int lengthSum = A.length() + B.length();
        // Mencetak hasil penjumlahan panjang A dan B
        System.out.println(lengthSum);

        // 2. Membandingkan A dan B secara leksikografis
        if (A.compareTo(B) > 0) {
            // Jika A lebih besar dari B secara leksikografis, cetak "Yes"
            System.out.println("Yes");
        } else {
            // Jika A tidak lebih besar dari B, cetak "No"
            System.out.println("No");
        }

        // 3. Mengkapitalisasi huruf pertama dari A dan B
        // Mengambil huruf pertama dari A, mengubahnya menjadi huruf kapital,
        // dan menggabungkannya dengan sisa huruf A
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);

        // Melakukan hal yang sama untuk B
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);

        // Mencetak A dan B yang sudah dikapitalisasi, dipisahkan dengan spasi
        System.out.println(capitalizedA + " " + capitalizedB);
    }
}
