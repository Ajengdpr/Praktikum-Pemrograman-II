package PRAK1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class PRAK101_2210817220001_AjengDiahPramesti {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int angkaBulan = input.nextInt();

        String[] namaBulan = {
                "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        double tinggiBadan = input.nextDouble();

        System.out.print("Masukkan Berat Badan: ");
        double beratBadan = input.nextDouble();

        // Mengonversi angka bulan menjadi teks
        String bulanLahir = "";
        if (angkaBulan >= 1 && angkaBulan <= 12) {
            bulanLahir = namaBulan[angkaBulan - 1];
        } else {
            System.out.println("Angka bulan tidak valid.");
            System.exit(1);
        }

        DecimalFormat df = new DecimalFormat("#.##");
        String tinggiBadanFormatted = df.format(tinggiBadan);

        System.out.println("\nNama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir +
                " pada Tanggal " + tanggalLahir + " " + bulanLahir + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tinggiBadanFormatted + " cm dan Berat Badan " + beratBadan + " kilogram");

        input.close();
        }
    }
