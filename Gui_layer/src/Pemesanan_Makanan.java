import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pemesanan_Makanan extends JFrame {
    private JCheckBox pizzaCheckBox;
    private JCheckBox burgerCheckBox;
    private JCheckBox spagethiCheckBox;
    private JCheckBox steakCheckBox;
    private JButton tambahPesananButton;
    private JButton pesanButton;
    private JPanel panel1;
    private JTextField namaTextField;
    private JTextField alamatTextField;
    private JTextField noTelponTextField;
    private JTextPane dataPenjualanTextPane;
    private JFormattedTextField totalBayarFormattedTextField;

    private int totalBayar = 0; // Variabel untuk menyimpan total pembayaran

    public Pemesanan_Makanan() {
        setContentPane(panel1);
        setTitle("Pemesanan Makanan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);

        // Harga menu
        final int hargaPizza = 50000;
        final int hargaBurger = 30000;
        final int hargaSpagethi = 20000;
        final int hargaSteak = 35000;

        // Listener untuk setiap checkbox
        pizzaCheckBox.addActionListener(e -> updateTotal(hargaPizza, pizzaCheckBox.isSelected()));
        burgerCheckBox.addActionListener(e -> updateTotal(hargaBurger, burgerCheckBox.isSelected()));
        spagethiCheckBox.addActionListener(e -> updateTotal(hargaSpagethi, spagethiCheckBox.isSelected()));
        steakCheckBox.addActionListener(e -> updateTotal(hargaSteak, steakCheckBox.isSelected()));

        // Listener untuk tombol Tambah Pesanan
        tambahPesananButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder pesanan = new StringBuilder();
                if (pizzaCheckBox.isSelected()) pesanan.append("Pizza, ");
                if (burgerCheckBox.isSelected()) pesanan.append("Burger, ");
                if (spagethiCheckBox.isSelected()) pesanan.append("Spagethi, ");
                if (steakCheckBox.isSelected()) pesanan.append("Steak, ");

                if (pesanan.length() > 0) {
                    // Menghapus koma terakhir
                    pesanan.setLength(pesanan.length() - 2);
                } else {
                    JOptionPane.showMessageDialog(null, "Pilih menu terlebih dahulu!");
                    return;
                }

                // Menampilkan pesanan di area text
                dataPenjualanTextPane.setText(
                        dataPenjualanTextPane.getText() + // Menambahkan data baru tanpa menghapus data lama
                                "Nama: " + namaTextField.getText() +
                                "\nAlamat: " + alamatTextField.getText() +
                                "\nNo. Telpon: " + noTelponTextField.getText() +
                                "\nPesanan: " + pesanan +
                                "\nTotal Bayar: Rp " + totalBayar +
                                "\n\n"
                );

                // Menghapus checkbox setelah menambah pesanan
                resetPesanan();
            }
        });

        // Listener untuk tombol Pesan
        pesanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Pesanan berhasil dikirim!\nTotal Bayar: Rp " + totalBayar);
                totalBayarFormattedTextField.setText(""); // Mengosongkan total bayar
                dataPenjualanTextPane.setText(""); // Menghapus semua data pesanan
                resetPesanan();
            }
        });
    }

    private void updateTotal(int harga, boolean isSelected) {
        if (isSelected) {
            totalBayar += harga;
        } else {
            totalBayar -= harga;
        }
        totalBayarFormattedTextField.setText(String.valueOf(totalBayar));
    }

    private void resetPesanan() {
        pizzaCheckBox.setSelected(false);
        burgerCheckBox.setSelected(false);
        spagethiCheckBox.setSelected(false);
        steakCheckBox.setSelected(false);
        totalBayar = 0; // Reset total bayar
        totalBayarFormattedTextField.setText(""); // Kosongkan field total bayar
    }

    public static void main(String[] args) {
        new Pemesanan_Makanan();
    }
}
