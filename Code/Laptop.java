package barangElektronik;

public class Laptop extends BarangElektronik {
    private String prosesor;
    private int ramGB;

    public Laptop(String nama, String merek, double harga, String prosesor, int ramGB) {
        super(nama, merek, harga);
        this.prosesor = prosesor;
        this.ramGB = ramGB;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Prosesor: " + prosesor);
        System.out.println("RAM: " + ramGB + " GB");
    }

    // Getter RAM dimasukkan di class Laptop
    public int getRamGB() {
        return ramGB;
    }
}