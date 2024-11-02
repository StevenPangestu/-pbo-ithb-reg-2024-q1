package Model.Classes;

abstract public class Tiket {
    private int jarakTempuh;
    private int beratBagasi;
    private double harga;

    public Tiket(int jarakTempuh, int beratBagasi) {
        this.jarakTempuh = jarakTempuh;
        this.beratBagasi = beratBagasi;
    }

    public int getJarakTempuh() {
        return jarakTempuh;
    }

    public void setJarakTempuh(int jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }

    public int getBeratBagasi() {
        return beratBagasi;
    }

    public void setBeratBagasi(int beratBagasi) {
        this.beratBagasi = beratBagasi;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

}
