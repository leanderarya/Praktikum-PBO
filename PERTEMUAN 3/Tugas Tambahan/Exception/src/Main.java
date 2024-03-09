/*Nama  : Arya Ajisadda Haryanto
 * NIM   : 24060122140118*/

public class Main {
    public static void main(String[] args) {
        Anggota anggota = new Anggota("Arya Ajisadda");
        Buku buku1 = new Buku("Matematika");
        Buku buku2 = new Buku("Fisika");
        Buku buku3 = new Buku("Kimia");
        Buku buku4 = new Buku("Biologi");

        try {
            anggota.pinjamBuku(buku1);
            anggota.pinjamBuku(buku2);
            anggota.pinjamBuku(buku3);
            anggota.pinjamBuku(buku4);
        } catch (MaksimumBukuTerpinjamException e) {
            System.out.println(e.getMessage());
        } catch (BukuTidakTersediaException e) {
            System.out.println(e.getMessage());
        }
    }
}