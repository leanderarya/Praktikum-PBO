package org.main;
import org.kendaraan.Kendaraan;
import org.mobil.Mobil;
import org.motor.Motor;
import org.truk.Truk;

public class MKendaraan {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("Kendaraan Nathan");
        Mobil mobil = new Mobil("Bugatti Chiron", 2);
        Motor motor = new Motor("Ducati Panigale V4 R", 998);
        Truk truk = new Truk("Mercedes-Benz Actros", 20);

        kendaraan.cetakInfo();
        kendaraan.gas(50, 3);
        kendaraan.klakson();
        System.out.println();

        mobil.cetakInfo();
        mobil.bukaPintu(1);
        mobil.gas(100, 5);
        mobil.klakson();
        System.out.println();

        motor.cetakInfo();
        motor.hitungHorsepower(15);
        motor.gas(80, 4);
        motor.klakson();
        System.out.println();

        truk.cetakInfo();
        truk.muatBarang(2000);
        truk.gas(60, 6);
        truk.klakson();
    }
}

