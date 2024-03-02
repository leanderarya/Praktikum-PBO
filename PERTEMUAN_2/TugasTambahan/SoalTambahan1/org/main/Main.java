package TugasTambahan.SoalTambahan1.org.main;
import TugasTambahan.SoalTambahan1.org.bangundatar.BujurSangkar;
import TugasTambahan.SoalTambahan1.org.bangundatar.SegitigaSamaSisi;
import TugasTambahan.SoalTambahan1.org.bangunruang.LimasSegiEmpat;
import TugasTambahan.SoalTambahan1.org.bangunruang.Kubus;

/*public class MKubus {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);
        System.out.println("Luas permukaan kubus dengan panjang sisi 4 satuan: " + kubus.hitungLuas());
        System.out.println("Volume kubus dengan panjang sisi 4 satuan: " + kubus.hitungVolume());
    }
}*/

public class Main {
    public static void main(String[] args) {
        SegitigaSamaSisi segitiga = new SegitigaSamaSisi(4);
        System.out.println("Luas segitiga sama sisi: " + segitiga.luasSegitiga());
        BujurSangkar persegi = new BujurSangkar(4);
        Kubus kubus = new Kubus(persegi);
        System.out.println("Luas bujur sangkar : " + persegi.hitungLuas());
        System.out.println("Volume kubus : " + kubus.hitungVolume());
        System.out.println("Luas alas : " + kubus.hitungLuasAlas());
        LimasSegiEmpat limas = new LimasSegiEmpat(persegi,segitiga);
        System.out.println("Volume Limas : " + limas.VolumeLimas());
    }
}