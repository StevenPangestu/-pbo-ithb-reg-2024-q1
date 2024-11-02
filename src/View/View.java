package View;

import Model.Classes.Ekonomi;
import Model.Classes.FirstClass;
import Model.Classes.MenuMakan;
import Model.Classes.Bisnis;
import Model.Classes.Tiket;
import Model.Enumeration.*;

import java.util.*;
import Controller.Controller;

public class View {

    Scanner scn = new Scanner(System.in);

    public void menuEkonomi(Tiket tiket) {

        System.out.println("Berat ");
        int berat = scn.nextInt();
        System.out.println("Jarak tempuh : ");
        int jarak = scn.nextInt();

        Ekonomi ekonomi = new Ekonomi(jarak, berat);
        ekonomi.setHarga(Controller.hitungBiayaTiket(ekonomi));

        return ekonomi;
    }

    public void menuBisnis(Tiket tiket) {

        System.out.println("Berat ");
        int berat = scn.nextInt();
        System.out.println("Jarak tempuh : ");
        int jarak = scn.nextInt();
        System.out.println("pesan makan? (0/1)");
        int pesan = scn.nextInt();
        Bisnis bisnis = new Bisnis(jarak, berat, makan.getMakan(pesan));

        bisnis.setHarga(Controller.hitungBiayaTiket(bisnis));
    }

    public void menuFirstClass(Tiket tiket) {
        List<MenuMakan> listPesan;

        System.out.println("Berat ");
        int berat = scn.nextInt();
        System.out.println("Jarak tempuh : ");
        int jarak = scn.nextInt();
        System.out.println("pesan makan?");
        boolean pesan = scn.nextBoolean();

        if (pesan) {
            System.out.println("Bbanyak pesan : (max 2)");
            int byk = scn.nextInt();

            for (int i = 0; i < byk; i++) {
                System.out.println("Makanan " + (i+1));
                int index = scn.nextInt();

                listPesan.add()
            }
        }
        
    }

    public void HitungTotalBeberapaTiket() {
        List<Tiket> hitung = new ArrayList<>();

        System.out.println("Banyak tiket : ");
        int byk = scn.nextInt();

        for (int i = 0; i < byk; i++) {
            System.out.println("pilih tiket ke " + (1 + i));
            int pilih = scn.nextInt();
            hitung.add(hitung.get(pilih));
        }
        System.out.println(Controller.totalBeberapaTiket(hitung));
    }

}
