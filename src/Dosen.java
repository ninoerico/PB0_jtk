public class Dosen extends Universitas {
    private String NIDN;
    private String mataKuliah;

    public Dosen(String nama, String alamat, String NIDN, String mataKuliah) {
        super(nama, alamat);
        this.NIDN = NIDN;
        this.mataKuliah = mataKuliah;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIDN: " + NIDN);
        System.out.println("Mata Kuliah: " + mataKuliah);
    }
}
