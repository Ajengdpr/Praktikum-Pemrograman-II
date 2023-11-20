package Soal1;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama hewan peliharaan: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan ras hewan peliharaan: ");
        String ras = scanner.nextLine();

        HewanPeliharaan hewanPeliharaan = new HewanPeliharaan(ras, nama);

        hewanPeliharaan.display();

        scanner.close();
    }
}