package barangElektronik;

import java.util.ArrayList;

public class Main {
    
    // Polymorphic Argument
    public static void cetakInfo(BarangElektronik b) {
        b.tampilkanInfo(); // VMI terjadi di sini
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        // Deklarasi instansiasi polimorfisme
        BarangElektronik tv = new Televisi("TV LED", "Samsung", 4500000, 43, "4K");
        BarangElektronik kulkas = new Kulkas("Kulkas Besar", "LG", 3200000, 250, 2);
        BarangElektronik laptop = new Laptop("Laptop Gaming", "Asus", 9500000, "Intel i7", 16);

        // Heterogeneous Collection
        ArrayList<BarangElektronik> daftar = new ArrayList<>();
        daftar.add(tv);
        daftar.add(kulkas);
        daftar.add(laptop);

        // Loop dan tampilkan (VMI)
        for (BarangElektronik b : daftar) {
            cetakInfo(b);

            // Instanceof + Object Casting
            if (b instanceof Laptop) {
                Laptop l = (Laptop) b; // casting
                System.out.println("Akses spesifik laptop → RAM: " + l.getRamGB() + " GB");
            }
        }
    }
}