public class Staff extends Universitas {
    private String kodeStaff;
    private String departemen;

    public Staff(String nama, String alamat, String kodeStaff, String departemen) {
        super(nama, alamat);
        this.kodeStaff = kodeStaff;
        this.departemen = departemen;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kode Staff: " + kodeStaff);
        System.out.println("Departemen: " + departemen);
    }
}
