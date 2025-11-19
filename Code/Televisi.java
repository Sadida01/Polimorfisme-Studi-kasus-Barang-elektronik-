package barangElektronik;

public class Televisi extends BarangElektronik {
    private int ukuranInch;
    private String resolusi;

    public Televisi(String nama, String merek, double harga, int ukuranInch, String resolusi) {
        super(nama, merek, harga);
        this.ukuranInch = ukuranInch;
        this.resolusi = resolusi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ukuran: " + ukuranInch + " inch");
        System.out.println("Resolusi: " + resolusi);
    }
}