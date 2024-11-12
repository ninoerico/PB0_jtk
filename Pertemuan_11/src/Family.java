import java.util.*;                                          // Mengimpor semua kelas dalam paket java.util

public class Family {
    // Menyimpan daftar paman dalam keluarga, dimana setiap elemen adalah objek Uncle
    private List<Uncle> uncles;
    // Menyimpan daftar keponakan dalam keluarga, setiap elemen adalah objek Niece
    private List<Niece> nieces;

    // di sini terdapat Konstruktor yng digunakan untuk inisialisasi keluarga tanpa paman, keponakan,
    public Family() {
        // Menginisialisasi uncles sebagai ArrayList kosong
        uncles = new ArrayList<>();
        // Menginisialisasi nieces sebagai ArrayList kosong
        nieces = new ArrayList<>();
    }

    public boolean addNiece(String name, int day, int month) {
        // Mengecek jika keponakan dengan nama yang sama sudah ada
        if (findNiece(name) != null) {
            return false;
        }
        // Jika tidak ada langsung tambahkan keponakan baru ke daftar
        nieces.add(new Niece(name, day, month));
        return true;
    }

    public boolean addUncle(String name) {
        // Mengecek jika paman dengan nama yang sama sudah ada
        if (findUncle(name) != null) {
            // find =
            return false;
        }
        // Jika tidak ada, tambahkan paman baru ke daftar
        uncles.add(new Uncle(name));
        return true;
    }

    public Niece findNiece(String name) {
        // Melakukan iterasi pada setiap Niece dalam daftar nieces
        for (Niece niece : nieces) {
            // Membandingkan nama yang diberikan dengan nama setiap Niece
            if (niece.getName().equalsIgnoreCase(name)) {
                return niece; // Mengembalikan objek Niece jika cocok
            }
        }
        return null; // Mengembalikan null jika tidak ditemukan
    }

    public Uncle findUncle(String name) {
        // Melakukan iterasi pada setiap Uncle dalam daftar uncles
        for (Uncle uncle : uncles) {
            // Membandingkan nama yang diberikan dengan nama setiap Uncle
            if (uncle.getName().equalsIgnoreCase(name)) {
                return uncle; // Mengembalikan objek Uncle jika cocok
            }
        }
        return null; // Mengembalikan null jika tidak ditemukan
    }

    public void listNieces() {
        // Mengurutkan daftar keponakan berdasarkan tanggal ulang tahun
        nieces.sort(Comparator.comparing(Niece::getBirthday));
        System.out.println("List of Nieces:");
        // Mencetak nama setiap keponakan setelah pengurutan
        for (Niece niece : nieces) {
            System.out.println(niece);
        }
    }

    public void listUncles() {
        // Mengurutkan daftar paman berdasarkan nama
        uncles.sort(Comparator.comparing(Uncle::getName));
        System.out.println("List of Uncles:");
        // Mencetak nama setiap paman setelah pengurutan
        for (Uncle uncle : uncles) {
            System.out.println(uncle.getName());
        }
    }
}

