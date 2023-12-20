package PRAK1;
import java.util.Scanner;
public class PRAK103_2210817220001_AjengDiahPramesti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" ");
        int N = scanner.nextInt();
        int bilanganAwal = scanner.nextInt();

        int i = 0;
        do {
            if (bilanganAwal % 2 != 0) {
                System.out.print(bilanganAwal + " ");
                i++;
            }
            bilanganAwal++;
        } while (i < N);

        scanner.close();
    }
}
