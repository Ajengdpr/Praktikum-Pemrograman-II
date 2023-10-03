package PRAK1;
import java.util.Scanner;
public class PRAK104_2210817220001_AjengDiahPramesti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String inputTanganAbu = scanner.nextLine();
        System.out.print("Tangan Bagas: ");
        String inputTanganBagas = scanner.nextLine();

        String[] tanganAbu = inputTanganAbu.split(" ");
        String[] tanganBagas = inputTanganBagas.split(" ");

        int poinAbu = 0;
        int poinBagas = 0;

        for (int i = 0; i < 3; i++) {
            String tanganAbuRonde = tanganAbu[i];
            String tanganBagasRonde = tanganBagas[i];

            if (tanganAbuRonde.equals(tanganBagasRonde)) {
                continue; // Seri, lanjut ke ronde berikutnya
            }

            if ((tanganAbuRonde.equals("B") && tanganBagasRonde.equals("G")) ||
                    (tanganAbuRonde.equals("G") && tanganBagasRonde.equals("K")) ||
                    (tanganAbuRonde.equals("K") && tanganBagasRonde.equals("B"))) {
                poinAbu++;
            } else {
                poinBagas++;
            }
        }

        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

        scanner.close();
    }
}