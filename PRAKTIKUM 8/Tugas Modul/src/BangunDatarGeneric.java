public class BangunDatarGeneric<T1 extends BangunDatar>{
    private T1 bangunDatar;
    public void set(T1 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    public T1 get(){
        return bangunDatar;
    }
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

// Perubahan T1 pada semua T di BangunDatarGeneric tidak merubah apapun dan code berjalan lancar
