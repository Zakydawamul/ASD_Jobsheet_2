import java.util.Scanner;
public class Mahasiswa07 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("kelas: " + kelas);
    }

    void ubahkelas (String kelasBaru) {
        kelas = kelasBaru;
    }
    void updateIpk(double ipkBaru){
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }
    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mahasiswa07 mahasiswa = new Mahasiswa07();

        System.out.print("Masukkan nama mahasiswa: ");
        mahasiswa.nama = scanner.nextLine();

        System.out.print("Masukkan NIM mahasiswa: ");
        mahasiswa.nim = scanner.nextLine();

        System.out.print("Masukkan kelas mahasiswa: ");
        mahasiswa.kelas = scanner.nextLine();

        System.out.print("Masukkan IPK mahasiswa: ");
        double ipkBaru = scanner.nextDouble();
        mahasiswa.updateIpk(ipkBaru);

        mahasiswa.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mahasiswa.nilaiKinerja());

        scanner.close();
    }
}