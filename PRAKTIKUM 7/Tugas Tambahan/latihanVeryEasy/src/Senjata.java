public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi){
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        if(peluru < 0){
            peluru = 0;
        }
        this.peluru = peluru;
    }

    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }

    public void menembak(int jumlah){
        for(int i = 0; i < jumlah; i++){
            if(getPeluru() > 0){
                System.out.println(getBunyi() + " ");
                setPeluru(getPeluru()-1);
            }
        }
        System.out.println("Sisa Peluru: " + getPeluru());
    }

    public String getBunyi(){
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }
}