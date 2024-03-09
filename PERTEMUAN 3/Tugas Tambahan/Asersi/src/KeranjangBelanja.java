/*Nama  : Arya Ajisadda Haryanto
 * NIM   : 24060122140118*/

public class KeranjangBelanja {
    private String[] keranjang;
    private int count;

    public KeranjangBelanja() {
        keranjang = new String[5];
        count = 0;
    }

    public void addItem(String item) {
        assert count < keranjang.length : "Keranjang sudah penuh!";
        keranjang[count] = item;
        count++;
    }

    public void printItems() {
        for (int i = 0; i < count; i++) {
            System.out.println(keranjang[i]);
        }
    }
}
