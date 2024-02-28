public class Garis {
    private Titik titikAwal;
    private Titik TitikAkhir;

    public Garis(Titik titikAwal, Titik titikAkhir){
        titikAwal = titikAwal;
        titikAkhir = titikAkhir;
    }

    public Titik getTitikAwal(){
        return titikAwal;
    }

    public void setTitikAwal(Titik titikAwal){
        titikAwal = titikAwal;
    }
    public TitikgetTitikAkhir(){
        return titikAkhir;
    }

    public void setTitikAkhir(Titik titikAkhir){
        titikAkhir = titikAkhir;
    }

    public double getPanjang(){
        double dx = titikAkhir.getAbsis()- titikAwal.getAbsis();
        double dy = titikAKhir.getOrdinat()-titikAwal.getOrdinat();
        return Math.sqrt(Math.pow(dx,2)+Math.pow(dy, 2));
    }

    public double getGradien(){
        double dx = titikAkhir.getAbsis()-titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat()-titikAwal.getOrdinat();
        return dy/dx;
    }

}
