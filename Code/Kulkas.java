package barangElektronik;

public class Kulkas extends BarangElektronik {
    private int kapasitasLiter;
    private int jumlahPintu;

    public Kulkas(String nama, String merek, double harga, int kapasitasLiter, int jumlahPintu) {
        super(nama, merek, harga);
        this.kapasitasLiter = kapasitasLiter;
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kapasitas: " + kapasitasLiter + " L");
        System.out.println("Jumlah pintu: " + jumlahPintu);
    }
}