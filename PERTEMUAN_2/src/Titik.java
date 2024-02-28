// Nama = Arya Ajisadda Haryanto
// NIM = 24060122140118

public class Titik{
    private double absis, ordinat;
    private static double counterTitik;

    //Konstruktor
    public Titik()
    {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(double abs, double ord)
    {
        absis = abs;
        ordinat = ord;
        counterTitik++;
    }
    public void setAbsis(double abs)
    {
        absis = abs;
    }
    public double getAbsis()
    {
        return absis;
    }

    public void setOrdinat(double ord)
    {
        ordinat = ord;
    }
    public double getOrdinat()
    {
        return ordinat;
    }

    public double getCounterTitik()
    {
        return counterTitik;
    }

    public double getJarakPusat()
    {
        return Math.sqrt(Math.pow(absis, 2)+ Math.pow(ordinat,2));
    }

    public void refleksiX(Titik titik)
    {
        double ordinat = titik.getOrdinat();
        ordinat *= -1;
        titik.setOrdinat(ordinat);
    }

    public void refleksiY(Titik titik){
        double absis = titik.getAbsis();
        absis *= -1;
        titik.setAbsis(absis);
    }

    public void getRefleksiX(Titik t){
        refleksiX(t);
    }

    public void getRefleksiY(Titik t){
        refleksiY(t);
    }
}