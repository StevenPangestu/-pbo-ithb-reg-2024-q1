package Controller;

import Model.Classes.*;
import Model.Enumeration.*;
import Model.Classes.Bisnis;
import Model.*;

public class Controller {

    public int beratBagasi(Tiket tiket) {
        if (tiket.getBeratBagasi() < 5) {
            return 0;
        }
        return tiket.getBeratBagasi();
    }

    public double hitungBiayaTiket(Tiket tiket) {
        // harga kg + harga km = harga total
        int harga = 0;

        if (tiket instanceof Ekonomi) {
            int biayaParasut = 5000;

            Ekonomi ekonomi = (Ekonomi) tiket;
            harga = tiket.getJarakTempuh() * 7500;
            harga += beratBagasi(tiket) * 1500;

        } else if (tiket instanceof Bisnis) {
            Bisnis bisnis = (Bisnis) tiket;
            double biayaMakanan = 0.1;

            harga = tiket.getJarakTempuh() * 10000;
            harga += beratBagasi(tiket) * 2500;

            if (bisnis.getMakan().equals(Makan.PESANMAKAN)) {
                harga += harga * biayaMakanan;
            }

        } else {
            FirstClass firstClass = (FirstClass) tiket;
            double biayaAsuransi = 0.1;

            harga = firstClass.getJarakTempuh() * 15000;

            if (firstClass.getAsuransi().equals(tiket)) {
                harga += harga * biayaAsuransi;
            }
        }
        return harga;
    }

}
