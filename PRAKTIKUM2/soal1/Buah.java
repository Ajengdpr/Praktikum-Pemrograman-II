package soal1;

public class Buah {
    String namaBuah;
    double berat;
    double hargaPerKg;
    double jumlahBeli;

    public Buah(String namaBuah, double berat, double hargaPerKg) {
        this.namaBuah = namaBuah;
        this.berat = berat;
        this.hargaPerKg = hargaPerKg;
    }

    public double hitungHargaSebelumDiskon(double jumlahBeli) {
        return hargaPerKg * (jumlahBeli / berat);
    }

    public double hitungDiskon(double jumlahBeli) {
        double kelipatan4Kg = Math.floor(jumlahBeli / 4.0);
        double totalDiskon = 0.02 * (kelipatan4Kg * hargaPerKg * 4.0);
        return totalDiskon;
    }

    public double hitungHargaSetelahDiskon(double jumlahBeli) {
        double totalHargaSebelumDiskon = hitungHargaSebelumDiskon(jumlahBeli);
        double diskon = hitungDiskon(jumlahBeli);
        return totalHargaSebelumDiskon - diskon;
    }
    public void setJumlahBeli(double jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public void tampilkanInfoBuah() {
        System.out.println("Nama Buah: " + namaBuah);
        System.out.println("Berat: " + berat);
        System.out.printf("Harga: Rp%.2f%n", hargaPerKg);
        System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f%n", hitungHargaSebelumDiskon(jumlahBeli));
        System.out.printf("Total Diskon: Rp%.2f%n", hitungDiskon(jumlahBeli));
        System.out.printf("Harga Setelah Diskon: Rp%.2f%n", hitungHargaSetelahDiskon(jumlahBeli));
        System.out.println();
    }
}