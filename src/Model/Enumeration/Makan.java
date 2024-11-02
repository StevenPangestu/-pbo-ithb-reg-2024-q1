package Model.Enumeration;

public enum Makan {

    PESANMAKAN(0),
    TIDAKPESANMAKAN(1);

    int pesan;

    Makan(int pesanMakan) {
        this.pesan = pesanMakan;
    }

    public Makan getMakan(int pesan) {
        if (pesan == 0) {
            return Makan.PESANMAKAN;
        }
        return Makan.TIDAKPESANMAKAN;
    }

}
