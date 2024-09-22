public class Jadwal {
    private String hari;
    private String waktu;
    private Dosen dosen;
    private String ruang;

    public Jadwal(String hari, String waktu, Dosen dosen, String ruang) {
        this.hari = hari;
        this.waktu = waktu;
        this.dosen = dosen;
        this.ruang = ruang;
    }

    public void displayInfo() {
        System.out.println("Hari: " + hari);
        System.out.println("Waktu: " + waktu);
        System.out.println("Dosen: " + dosen.nama);
        System.out.println("Ruang: " + ruang);
    }
}
