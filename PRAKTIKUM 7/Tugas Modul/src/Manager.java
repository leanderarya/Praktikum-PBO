public class Manager extends Pegawai{
    private int tunjangan;
    public Manager(String nama){
        super(nama);
        this.tunjangan = 700000;
    }
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
