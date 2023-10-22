package soal2;

public class Kopi {
        String namaKopi;
        String ukuran;
        double harga;
        String pembeli;

        public void setPembeli(String nama) {
            pembeli = nama;
        }

        public String getPembeli() {
            return pembeli;
        }

        public double getPajak() {
            return harga * 0.11;
        }

        public void info() {
            System.out.println("Nama Kopi: " + namaKopi);
            System.out.println("Ukuran: " + ukuran);
            System.out.printf("Harga: Rp%.2f%n", harga);
        }
    }