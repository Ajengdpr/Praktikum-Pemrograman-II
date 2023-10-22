package soal1;

public class PRAK201_2210817220001_AjengDiahPramesti {
    public static void main(String[] args) {
        Buah apel = new Buah("Apel", 0.4, 7000.0);
        Buah mangga = new Buah("Mangga", 0.2, 3500.0);
        Buah alpukat = new Buah("Alpukat", 0.25, 10000.0);

        apel.setJumlahBeli(40.0);
        mangga.setJumlahBeli(15.0);
        alpukat.setJumlahBeli(12.0);

        apel.tampilkanInfoBuah();
        mangga.tampilkanInfoBuah();
        alpukat.tampilkanInfoBuah();
    }
}