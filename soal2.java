public class soal2 {

    public static void main(String[] args) {
        int i = 42;
        String s = (i < 40) ? "life" : (i > 50) ? "universe" : "everything";
        System.out.println(s);

    }
}
Berikut adalah penjelasan ringkas dalam bentuk daftar:



// 1. Kondisi pada Skrip:
//    - **Kondisi pertama:** `(i < 40)` → Jika `true`, `s = "life"`.
//    - **Kondisi kedua:** `(i > 50)` → Jika `true`, `s = "universe"`.
//    - Jika kedua kondisi `false`, maka `s = "everything"`.

// 2. Alasan Hasil "everything":
//    - Nilai `i` adalah 42.
//    - Kondisi pertama (`i < 40`) adalah `false` (42 tidak kurang dari 40).
//    - Kondisi kedua (`i > 50`) juga `false` (42 tidak lebih dari 50).
//    - Karena kedua kondisi salah, hasil akhirnya adalah "everything".
