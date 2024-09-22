import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Daftar mahasiswa
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa("Ahmad", "Bandung", "12345", "Informatika", 5));
        mahasiswaList.add(new Mahasiswa("Siti", "Jakarta", "67890", "Informatikai", 3));
        mahasiswaList.add(new Mahasiswa("Budi", "Bogor", "11223", "informatika", 4));
        mahasiswaList.add(new Mahasiswa("Rina", "Depok", "44556", "Informatika", 2));
        mahasiswaList.add(new Mahasiswa("Dewi", "Surabaya", "77889", "Informatika", 1));
        mahasiswaList.add(new Mahasiswa("Andi", "Bandung", "33445", "Informatika", 6));
        mahasiswaList.add(new Mahasiswa("Tika", "Bekasi", "99887", "Informatika", 5));
        mahasiswaList.add(new Mahasiswa("Agus", "Malang", "66778", "Informatika", 3));
        mahasiswaList.add(new Mahasiswa("Cici", "Bandung", "55667", "Informatika", 7));
        mahasiswaList.add(new Mahasiswa("Putri", "Jakarta", "44556", "Informatika", 4));

        // Daftar dosen
        ArrayList<Dosen> dosenList = new ArrayList<>();
        dosenList.add(new Dosen("Bapak trisna", "Jakarta", "001", "Komputer Grafik"));
        dosenList.add(new Dosen("Ibu santi", "Surabaya", "002", "PRPL"));
        dosenList.add(new Dosen("Ibu ade", "Bandung", "003", "Basis Data"));
        dosenList.add(new Dosen("Bapak rizki", "Bogor", "004", "Aljabar Linier"));
        dosenList.add(new Dosen("Bapak bambang", "Depok", "005", "Proyek 3"));
        dosenList.add(new Dosen("Bapak zulkifli", "Jakarta", "006", "Pemrograman Berorientasi Objek"));
        dosenList.add(new Dosen("Bapak yadi ", "Bekasi", "007", "Pengantar Perangkat Lunak"));
        dosenList.add(new Dosen("Bapak zulkifli ", "Malang", "008", " Pemrograman berorientasi objek"));
        dosenList.add(new Dosen("Ibu siti ", "Surabaya", "009", "Matematika diskrit"));
        dosenList.add(new Dosen("Bapak ade", "Bandung", "010", "Basis data teori"));

        // Daftar jadwal
        ArrayList<Jadwal> jadwalList = new ArrayList<>();
        jadwalList.add(new Jadwal("Senin", "08:00 - 10:00", dosenList.get(0), "Lab 1"));
        jadwalList.add(new Jadwal("Senin", "10:00 - 12:00", dosenList.get(1), "Ruang 205"));
        jadwalList.add(new Jadwal("Selasa", "08:00 - 10:00", dosenList.get(2), "Lab basis data"));
        jadwalList.add(new Jadwal("Selasa", "10:00 - 12:00", dosenList.get(3), "Ruang 102"));
        jadwalList.add(new Jadwal("Rabu", "08:00 - 10:00", dosenList.get(4), "Lab 116"));
        jadwalList.add(new Jadwal("Kamis", "08:00 - 10:00", dosenList.get(5), "Ruang 108"));
        jadwalList.add(new Jadwal("Jumat", "08:00 - 10:00", dosenList.get(6), "Lab prpl"));

        // Tampilkan data mahasiswa
        System.out.println("Data Mahasiswa:");
        for (Mahasiswa mahasiswa : mahasiswaList) {
            mahasiswa.displayInfo();
            System.out.println();
        }

        // Tampilkan data dosen
        System.out.println("Data Dosen:");
        for (Dosen dosen : dosenList) {
            dosen.displayInfo();
            System.out.println();
        }

        // Tampilkan jadwal perkuliahan
        System.out.println("Jadwal Perkuliahan:");
        for (Jadwal jadwal : jadwalList) {
            jadwal.displayInfo();
            System.out.println();
        }
    }
}