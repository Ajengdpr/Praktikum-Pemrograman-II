package Soal2;
class Kucing extends HewanPeliharaan {
    private String warnaBulu;

    // Konstruktor untuk Kucing
    public Kucing(String r, String n, String w) {
        super(r, n);
        warnaBulu = w;
    }

    // Implementasi metode abstrak display
    @Override
    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
        System.out.println("Memiliki warna bulu: " + warnaBulu);
    }
}