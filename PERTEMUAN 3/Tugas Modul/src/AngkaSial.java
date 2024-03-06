public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }
    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
// 1. Angka 10 Tereksekusi oleh line 12 sehingga Jawaban yang dikeluarkan 10 bukan angka sial
// Angka 13 masuk ke file yang Angka Sial Exception jadi mengeluarkan output "Jangan memasukan angka 13 karena angka sial!!!
// Angka 12 Tereksekusi oleh line 12 sehingga jawaban yang diekluarkan 12 bukan angka sial

// 2. Karena angka 13 masuk angka exception, baris 21 dieksekusi dan mengeluarkan output hati hati memasukkan angka
