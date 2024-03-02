package TugasTambahan.SoalTambahan2.org.main;

import TugasTambahan.SoalTambahan2.org.mahasiswa.Mahasiswa;
import TugasTambahan.SoalTambahan2.org.walimahasiswa.Walimahasiswa;

public class Main {
    public static void main(String[] args) {
        Walimahasiswa wali = new Walimahasiswa("Budi Waluyo", "2919029129291092", "08123456789", "Sultan Agung");
        Mahasiswa mahasiswa = new Mahasiswa("Arya Ajisadda", "189879218918921", "24060122140118", "Teknik Informatika", wali);
        mahasiswa.cetak();
    }
}
