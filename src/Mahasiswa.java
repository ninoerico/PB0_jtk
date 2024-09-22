public class Mahasiswa extends Universitas {
    private String NIM;
    private String jurusan;
    private int semester;

    public Mahasiswa(String nama, String alamat, String NIM, String jurusan, int semester) {
        super(nama, alamat);
        this.NIM = NIM;
        this.jurusan = jurusan;
        this.semester = semester;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIM: " + NIM);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Semester: " + semester);
    }
}
