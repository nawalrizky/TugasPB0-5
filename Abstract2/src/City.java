public class City extends Destination {
    public City(String nama, int jarak, int biayaTransportasi, int biayaAkomodasi) {
        super(nama, jarak, biayaTransportasi, biayaAkomodasi);
    }

    public int hitungTotalBiaya() {
        int biayaTotal = hitungBiayaTransportasi() + hitungBiayaAkomodasi();
        if (biayaTotal > 50000) {
            biayaTotal *= 0.97;
        } return biayaTotal;
    }
}