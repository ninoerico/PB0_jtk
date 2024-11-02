package org.example; // Mendeklarasikan bahwa kelas ini termasuk dalam paket org.example

public class Passenger {
    private String name;                                // Field privat untuk menyimpan nama penumpang
    private boolean vip;                                // Field privat untuk menyimpan status VIP penumpang

    // Konstruktor yang menginisialisasi field name dan vip
    public Passenger(String name, boolean vip) {
        this.name = name;                           // Menetapkan field name dengan argumen name yang diberikan
        this.vip = vip;                             // Menetapkan field vip dengan argumen vip yang diberikan
    }

    // Metode getter untuk mendapatkan nama penumpang
    public String getName() {
        return name;                                // Mengembalikan nilai dari field name
    }

    // Metode getter untuk memeriksa apakah penumpang adalah VIP
    public boolean isVip() {
        return vip;                                 // Mengembalikan nilai dari field vip
    }
}
