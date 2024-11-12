import java.util.Scanner;

public class FamilyApp {
    public static void main(String[] args) {
        Family family = new Family();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Family App Menu =====");
            System.out.println("1. Tambah Uncle");
            System.out.println("2. Tambah Niece");
            System.out.println("3. Tambah Hadiah dari Uncle ke Niece");
            System.out.println("4. Lihat Daftar Uncles");
            System.out.println("5. Lihat Daftar Nieces");
            System.out.println("6. Lihat Hadiah dari Seorang Uncle");
            System.out.println("7. Lihat Hadiah yang Diterima Seorang Niece");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline setelah input integer

            switch (choice) {
                case 1:
                    // Tambah Uncle
                    System.out.print("Masukkan nama Uncle: ");
                    String uncleName = scanner.nextLine();
                    if (family.addUncle(uncleName)) {
                        System.out.println("Uncle " + uncleName + " berhasil ditambahkan.");
                    } else {
                        System.out.println("Uncle dengan nama " + uncleName + " sudah ada.");
                    }
                    break;

                case 2:
                    // Tambah Niece
                    System.out.print("Masukkan nama Niece: ");
                    String nieceName = scanner.nextLine();
                    System.out.print("Masukkan hari ulang tahun (1-31): ");
                    int day = scanner.nextInt();
                    System.out.print("Masukkan bulan ulang tahun (1-12): ");
                    int month = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan newline setelah input integer
                    if (family.addNiece(nieceName, day, month)) {
                        System.out.println("Niece " + nieceName + " berhasil ditambahkan.");
                    } else {
                        System.out.println("Niece dengan nama " + nieceName + " sudah ada.");
                    }
                    break;

                case 3:
                    // Tambah Hadiah dari Uncle ke Niece
                    System.out.print("Masukkan nama Uncle: ");
                    String giverName = scanner.nextLine();
                    System.out.print("Masukkan nama Niece: ");
                    String recipientName = scanner.nextLine();
                    System.out.print("Masukkan deskripsi hadiah: ");
                    String presentDescription = scanner.nextLine();

                    Uncle uncle = family.findUncle(giverName);
                    Niece niece = family.findNiece(recipientName);

                    if (uncle != null && niece != null) {
                        if (uncle.addPresent(niece, presentDescription)) {
                            System.out.println("Hadiah berhasil ditambahkan dari " + giverName + " ke " + recipientName);
                        } else {
                            System.out.println("Hadiah ini sudah diberikan atau keponakan sudah menerima hadiah dari " + giverName);
                        }
                    } else {
                        System.out.println("Uncle atau Niece tidak ditemukan.");
                    }
                    break;

                case 4:
                    // Lihat Daftar Uncles
                    family.listUncles();
                    break;

                case 5:
                    // Lihat Daftar Nieces
                    family.listNieces();
                    break;

                case 6:
                    // Lihat Hadiah dari Seorang Uncle
                    System.out.print("Masukkan nama Uncle: ");
                    String uncleToView = scanner.nextLine();
                    Uncle uncleObj = family.findUncle(uncleToView);

                    if (uncleObj != null) {
                        uncleObj.listPresents();
                    } else {
                        System.out.println("Uncle dengan nama " + uncleToView + " tidak ditemukan.");
                    }
                    break;

                case 7:
                    // Lihat Hadiah yang Diterima Seorang Niece
                    System.out.print("Masukkan nama Niece: ");
                    String nieceToView = scanner.nextLine();
                    Niece nieceObj = family.findNiece(nieceToView);

                    if (nieceObj != null) {
                        nieceObj.listPresents();
                    } else {
                        System.out.println("Niece dengan nama " + nieceToView + " tidak ditemukan.");
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
