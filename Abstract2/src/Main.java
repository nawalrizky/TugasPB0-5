public class Main {
    public static void main(String[] args) {
        Destination city = new City("Jakarta", 200, 10000, 5000);
        Destination mountain = new Mountain("Bromo", 500, 750000, 500000);
        Destination beach = new Beach("Bali", 1000, 500000, 1000000);

        System.out.println("Jarak : ");
        System.out.println(beach.nama + " - " + beach.jarak + " km");
        System.out.println(mountain.nama + " - " + mountain.jarak + " km");
        System.out.println(city.nama + " - " + city.jarak + " km");

        System.out.println("Total Biaya : ");
        System.out.println(beach.nama + " : " + beach.hitungTotalBiaya());
        System.out.println(mountain.nama + " : " + mountain.hitungTotalBiaya());
        System.out.println(city.nama + " : " + city.hitungTotalBiaya());
    }
}