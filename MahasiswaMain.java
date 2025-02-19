public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa07 mhs1 = new Mahasiswa07();

        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi(); 
        mhs1.ubahkelas("SI 2K");   
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi(); 

        Mahasiswa07 mhs2 = new Mahasiswa07("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa07 mhs3 = new Mahasiswa07("Zaky Dawamul", "244107060092", 3.71, "SIB 1E");
        mhs3.updateIpk(3.80);
        mhs3.tampilkanInformasi();
    }
}