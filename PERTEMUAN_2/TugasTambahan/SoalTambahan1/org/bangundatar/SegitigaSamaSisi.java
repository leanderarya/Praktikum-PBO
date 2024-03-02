package TugasTambahan.SoalTambahan1.org.bangundatar;
import TugasTambahan.SoalTambahan1.org.poligon.Poligon;

public class SegitigaSamaSisi extends Poligon {
    private double SisiSegitiga;
    private double tinggiSegitiga;
    public int jumlahSisi;

    public SegitigaSamaSisi(double SisiSegitiga){
        this.jumlahSisi = 3;
        this.tinggiSegitiga = Math.sqrt(SisiSegitiga + SisiSegitiga - (0.5 * SisiSegitiga)*(0.5 * SisiSegitiga));
        this.SisiSegitiga = SisiSegitiga;
    }
    public double getSisiSegitiga(){
        return this.SisiSegitiga;
    }
    public double getTinggiSegitiga(){
        return this.tinggiSegitiga;
    }
    public double luasSegitiga(){
        double SisiSegitiga = getSisiSegitiga();
        double tinggiSegitiga = getTinggiSegitiga();
        return 0.5 * tinggiSegitiga * SisiSegitiga;
    }
}
