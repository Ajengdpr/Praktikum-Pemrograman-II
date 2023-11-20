package Soal2;
abstract class HewanPeliharaan {
    protected String nama;
    protected String ras;

    public HewanPeliharaan(String r, String n) {
        ras = r;
        nama = n;
    }

    public abstract void display();
}