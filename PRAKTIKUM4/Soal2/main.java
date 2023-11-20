package Soal2;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1) {
            System.out.print("Nama hewan peliharaan: ");
            String namaHewan = scanner.nextLine();
            System.out.print("Ras: ");
            String rasHewan = scanner.nextLine();
            System.out.print("Warna Bulu: ");
            String warnaBuluKucing = scanner.nextLine();

            Kucing kucing = new Kucing(rasHewan, namaHewan, warnaBuluKucing);
            kucing.display();
        } else if (pilihan == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String namaHewan = scanner.nextLine();
            System.out.print("Ras: ");
            String rasHewan = scanner.nextLine();
            System.out.print("Warna Bulu: ");
            String warnaBuluAnjing = scanner.nextLine();
            System.out.print("Masukkan kemampuan anjing: ");
            String[] kemampuanAnjing = scanner.nextLine().split(" ");

            Anjing anjing = new Anjing(namaHewan, rasHewan, warnaBuluAnjing, kemampuanAnjing);
            anjing.display();
        } else {
            System.out.println("Pilihan tidak valid");
        }
        scanner.close();
    }
}