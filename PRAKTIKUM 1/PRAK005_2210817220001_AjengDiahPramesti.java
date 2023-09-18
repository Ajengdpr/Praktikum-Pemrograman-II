import java.util.Scanner;
public class PRAK005_2210817220001_AjengDiahPramesti {
    public static void main(String[] args) {

        String makanan, hobi;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan Makanan Favorit: ");
        makanan = keyboard.nextLine();
        System.out.print("Masukkan Hobi: ");
        hobi = keyboard.nextLine();

        System.out.println("Aku Suka Makan "  +makanan+  ", dan Hobiku "  +hobi);

    }
}