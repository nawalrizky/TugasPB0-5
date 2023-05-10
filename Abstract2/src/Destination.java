public abstract class Destination {
    protected String nama;
    protected int jarak;
    protected int biayaTransportasi;
    protected int biayaAkomodasi;

    public Destination(String nama, int jarak, int biayaTransportasi, int biayaAkomodasi) {
        this.nama = nama;
        this.jarak = jarak;
        this.biayaTransportasi = biayaTransportasi;
        this.biayaAkomodasi = biayaAkomodasi;
    }

    public abstract int hitungTotalBiaya();

    public int hitungBiayaTransportasi() {
        int biaya = biayaTransportasi;
        if (jarak > 1000) {
            biaya *= 0.9;
        }
        if (this instanceof Beach && biayaTransportasi > 500000) {
            biaya *= 0.95;
        }
        return biaya;
    }

    public int hitungBiayaAkomodasi() {
        int biaya = biayaAkomodasi;
        if (this instanceof Mountain && biayaAkomodasi > 500000) {
            biaya *= 0.95;
        }
        return biaya;
    }
}