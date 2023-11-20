package Soal2;
class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private String[] kemampuan;

    // Konstruktor untuk Anjing
    public Anjing(String n, String r, String w, String[] k) {
        super(r, n);
        warnaBulu = w;
        kemampuan = k;
    }
    @Override
    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
        System.out.println("Memiliki warna bulu: " + warnaBulu);
        System.out.print("Memiliki kemampuan: ");
        for (String kemampuanItem : kemampuan) {
            System.out.print(kemampuanItem + " ");
        }
        System.out.println();
    }
}