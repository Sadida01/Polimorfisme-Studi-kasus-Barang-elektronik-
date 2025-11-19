package barangElektronik;

public class BarangElektronik {
    protected String nama;
    protected String merek;
    protected double harga;

    public BarangElektronik(String nama, String merek, double harga) {
        this.nama = nama;
        this.merek = merek;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Merek: " + merek);
        System.out.println("Harga: " + harga);
    }
}