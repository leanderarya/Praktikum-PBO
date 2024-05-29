import java.util.HashMap;
import java.util.Map;

/**
 * File: LambdaMap.java
 * Deskripsi: Menampilkan key dan value dari sebuah Map menggunakan ekspresi lambda.
 */
public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("40118", "Arya");
        mahasiswaMap.put("30088", "Dinal");
        mahasiswaMap.put("30073", "Baron");
        mahasiswaMap.put("30074", "David");

        // Menampilkan key dan value dari Map menggunakan ekspresi lambda
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + ", Nama: " + nama);
        });
    }
}
