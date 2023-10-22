package soal3;

public class PRAK203_2210817220001_AjengDiahPramesti {
        public static void main(String[] args) {
            Pegawai p1 = new Pegawai();
            //p1.nama = "Roi" // Tambahkan tanda titik koma ; di akhir pernyataan.
            p1.nama = "Roi";
            p1.asal = "Kingdom of Orvel";
            p1.setJabatan("Assasin");
            p1.umur = 17; //  Mengatur umur pegawai langsung

            System.out.println("Nama Pegawai: " + p1.getNama());
            System.out.println("Asal: " + p1.getAsal());
            System.out.println("Jabatan: " + p1.jabatan);
            System.out.println("Umur: " + p1.umur);
        }
    }
