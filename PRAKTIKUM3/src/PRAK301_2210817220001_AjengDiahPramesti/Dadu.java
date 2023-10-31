package PRAK301_2210817220001_AjengDiahPramesti;
import java.util.Random;
public class Dadu {
    private int nilai;

    public Dadu() {
        acakNilai();
    }

    public void acakNilai() {
        Random rand = new Random();
        nilai = rand.nextInt(6) + 1;
    }

    public int getNilai() {
        return nilai;
    }
}