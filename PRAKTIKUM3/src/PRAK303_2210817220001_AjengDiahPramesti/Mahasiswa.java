package PRAK303_2210817220001_AjengDiahPramesti;
public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return nim;
    }
}