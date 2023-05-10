public class Beach extends Destination{
    public Beach(String nama, int jarak, int biayaTransportasi, int biayaAkomodasi) {
        super(nama, jarak, biayaTransportasi, biayaAkomodasi);
    }

    public int hitungTotalBiaya() {
        int biayaTotal = hitungBiayaAkomodasi() + hitungBiayaTransportasi();
        if (jarak > 1000) {
            biayaTotal *= 0.9;
        }
        if (biayaTransportasi > 500000) {
            biayaTotal *= 0.95;
        }
        return biayaTotal;
    }
}