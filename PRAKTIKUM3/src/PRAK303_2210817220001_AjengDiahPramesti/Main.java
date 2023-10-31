package PRAK303_2210817220001_AjengDiahPramesti;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = input.nextLine();

                    boolean isNIMUnique = true;
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        if (mhs.getNIM().equals(nim)) {
                            isNIMUnique = false;
                            break;
                        }
                    }

                    if (isNIMUnique) {
                        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                        daftarMahasiswa.add(mahasiswa);
                        System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    } else {
                        System.out.println("NIM sudah digunakan. Masukkan NIM unik.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimHapus = input.nextLine();
                    Mahasiswa mahasiswaHapus = null;
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        if (mhs.getNIM().equals(nimHapus)) {
                            mahasiswaHapus = mhs;
                            break;
                        }
                    }
                    if (mahasiswaHapus != null) {
                        daftarMahasiswa.remove(mahasiswaHapus);
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                    String nimCari = input.nextLine();
                    boolean found = false;
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        if (mhs.getNIM().equals(nimCari)) {
                            System.out.println("NIM: " + mhs.getNIM() + ", Nama: " + mhs.getNama());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        System.out.println("NIM: " + mhs.getNIM() + ", Nama: " + mhs.getNama());
                    }
                    break;
            }
        } while (pilihan != 0);

        System.out.println("Terima kasih!");
    }
}
