package Model.Classes;

import java.util.List;
import Model.Enumeration.*;

public class FirstClass extends Tiket {
    List<MenuMakan> pesanMakan;
    Asuransi asuransi;

    public FirstClass(int jarakTempuh, int beratBagasi, List<MenuMakan> pesanMakan, Asuransi asuransi) {
        super(jarakTempuh, beratBagasi);
        this.pesanMakan = pesanMakan;
        this.asuransi = asuransi;
    }

    public List<MenuMakan> getPesanMakan() {
        return pesanMakan;
    }

    public void setPesanMakan(List<MenuMakan> pesanMakan) {
        this.pesanMakan = pesanMakan;
    }

    public Asuransi getAsuransi() {
        return asuransi;
    }

    public void setAsuransi(Asuransi asuransi) {
        this.asuransi = asuransi;
    }

}
