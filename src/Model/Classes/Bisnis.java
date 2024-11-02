package Model.Classes;

import Model.Enumeration.*;

public class Bisnis extends Tiket {
    Makan makan;

    public Bisnis(int jarakTempuh, int beratBagasi, Makan makan) {
        super(jarakTempuh, beratBagasi);
        this.makan = makan;
    }

    public Makan getMakan() {
        return makan;
    }

    public void setMakan(Makan makan) {
        this.makan = makan;
    }

}
