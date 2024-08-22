public class soall
{
    public static void main(String[] args) {
        byte angka1 = 125;
        byte angka2 = 6;
        byte hasil = (byte)(angka1 + angka2);
        System.out.println("hasil1" + hasil);
    }
}
// 1. Output "hasil1-125":
//    - Tanda kutip dua dalam Java digunakan untuk menampilkan teks.

// 2. Overflow pada Tipe Data `byte`:
//    - Tipe data `byte` memiliki rentang -128 hingga 127.
//    - Hasil penjumlahan 131 melebihi batas maksimum tipe data `byte`, menyebabkan overflow.
//    - Java mengubah hasil menjadi -125 karena `byte` menggunakan 8 bit dan two's complement.

// 3. Two's Complement:
//    - 127 = nilai positif terbesar (`01111111` dalam biner).
//    - -128 = nilai negatif terkecil (`10000000` dalam biner).
//    - 131 di luar jangkauan `byte`, sehingga dikurangi 256 untuk mengembalikan nilai ke dalam rentang `byte`.

// 4. Perhitungan Biner:
//    - 131 dalam `int`: `00000000 00000000 00000000 10000011`.
//    - Hanya 8 bit terakhir yang diambil: `10000011` (merepresentasikan -125 dalam two's complement).
