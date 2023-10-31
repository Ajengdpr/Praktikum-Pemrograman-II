package PRAK302_2210817220001_AjengDiahPramesti;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" ");
        int jumlahNegara = input.nextInt();
        input.nextLine();

        LinkedList<Negara> negaraList = new LinkedList<>();

        for (int i = 0; i < jumlahNegara; i++) {
            System.out.print(" ");
            String nama = input.nextLine();
            System.out.print(" ");
            String jenisKepemimpinan = input.nextLine();
            System.out.print(" ");
            String namaPemimpin = input.nextLine();
            int tanggalKemerdekaan = 0;
            int bulanKemerdekaan = 0;
            int tahunKemerdekaan = 0;

            if (!jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                System.out.print(" ");
                tanggalKemerdekaan = input.nextInt();
                System.out.print(" ");
                bulanKemerdekaan = input.nextInt();
                System.out.print(" ");
                tahunKemerdekaan = input.nextInt();
            }

            Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            negaraList.add(negara);
            input.nextLine();
        }

        for (Negara negara : negaraList) {
            System.out.println("Negara " + negara.getNama() + " mempunyai " + (negara.getJenisKepemimpinan().equalsIgnoreCase("monarki") ? "Raja" : "Presiden") + " bernama " + negara.getNamaPemimpin());
            if (!negara.getJenisKepemimpinan().equalsIgnoreCase("monarki")) {
                System.out.println(negara.getTanggalKemerdekaan());
            }
            System.out.println();
        }
    }
}