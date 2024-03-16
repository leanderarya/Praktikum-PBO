package org.mobil;
import org.kendaraan.Kendaraan;
public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private org.kendaraan.Kendaraan Kendaraan;
    public Mobil(String nama, int jumlahPintu) {
        super(nama);
        this.jumlahPintu = jumlahPintu;
    }
    public int getJumlahPintu() {
        return jumlahPintu;
    }
    public org.kendaraan.Kendaraan getKendaraan()
    {
        return Kendaraan;
    }
    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
    public void bukaPintu(int nomorPintu) {
        System.out.println("Pintu " + nomorPintu + " mobil terbuka.");
    }
    public void klakson() {
        System.out.println(getNama() + " berbunyi, Vroom Vroom!");
    }
}