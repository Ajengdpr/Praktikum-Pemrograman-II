package soal3;

public class Pegawai {
    //public class Employee { // Seharusnya file bernama pegawai bukan Employee perlu mendefinisikan kelas Pegawai terlebih dahulu. Kesalahan ini terjadi karena kelas Pegawai belum didefinisikan, sehingga objek tidak dapat dibuat.
  public String nama;
    //public char asal;// // Mengubah tipe data atribut asal menjadi String karena kesalahan tipe data
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

   // public void setJabatan() { //  Menambahkan parameter j untuk mengatur nilai atribut jabatan. Selain itu, tambahkan inisialisasi atribut jabatan dengan nilai yang diberikan.
    public void setJabatan(String j){
        this.jabatan = j;
    }
}