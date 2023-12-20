package PRAK1;
import java.util.Scanner;
public class PRAK102_2210817220001_AjengDiahPramesti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" ");
        int angkaAwal = scanner.nextInt();
        int jumlahBaris = 10;
        int i = 1;

        while (i <= jumlahBaris) {
            if (angkaAwal % 5 == 0) {
                System.out.print(angkaAwal / 5 - 1);
            } else {
                System.out.print(angkaAwal);
            }

            if (i < jumlahBaris) {
                System.out.print(",");
            }

            angkaAwal++;
            i++;
        }
        scanner.close();
    }
}
