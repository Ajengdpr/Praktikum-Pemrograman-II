package PRAK301_2210817220001_AjengDiahPramesti;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print(" ");
            int jumlahDadu = input.nextInt();

            LinkedList<Dadu> daduList = new LinkedList<>();

            for (int i = 1; i <= jumlahDadu; i++) {
                Dadu dadu = new Dadu();
                daduList.add(dadu);
            }

            for (int i = 0; i < daduList.size(); i++) {
                Dadu dadu = daduList.get(i);
                System.out.println("Dadu ke-" + (i + 1) + " bernilai " + dadu.getNilai());
            }

            int totalNilai = 0;
            for (Dadu dadu : daduList) {
                totalNilai += dadu.getNilai();
            }

            System.out.println("Total nilai dadu keseluruhan " + totalNilai);
        }
    }