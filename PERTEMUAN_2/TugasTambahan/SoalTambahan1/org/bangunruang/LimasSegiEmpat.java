package TugasTambahan.SoalTambahan1.org.bangunruang;
import TugasTambahan.SoalTambahan1.org.bangundatar.SegitigaSamaSisi;
import TugasTambahan.SoalTambahan1.org.bangundatar.BujurSangkar;
public class LimasSegiEmpat {
    private SegitigaSamaSisi sisiTegak;
    private BujurSangkar alas;

    public LimasSegiEmpat(BujurSangkar alas, SegitigaSamaSisi tinggiLimas){
        this.alas = alas;
        this.sisiTegak = tinggiLimas;
    }
    public double VolumeLimas(){
        double luasAlas = alas.hitungLuas();
        double tinggi = sisiTegak.getTinggiSegitiga();
        return (1.0/3.0) * luasAlas * tinggi;
    }

}