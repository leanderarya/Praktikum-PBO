public class Pegawai {
    private String nama;
    private int gajiPokok;
    public Pegawai(String nama){
        this.nama = nama;
        this.gajiPokok = 5000000;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void tampilData(){
        System.out.println("Nama : " + nama + ", Gaji Pokok : " + gajiPokok);
    }
}