public class Universitas {
    protected String nama;
    protected String alamat;

    public Universitas(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
    }
}
