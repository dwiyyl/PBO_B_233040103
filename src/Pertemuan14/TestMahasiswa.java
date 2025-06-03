package Pertemuan14;
// Tugas 5
public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("23040103", "Dwi Yulianti");
        Mahasiswa m2 = new Mahasiswa("23040082", "Amaliyah Nur Haida");
        Mahasiswa m3 = new Mahasiswa("23040164", "Maelani Ningrum");

        m1.displayInfo();
        m2.displayInfo();
        m3.displayInfo();

        System.out.println("Total Mahasiswa Terdaftar: " + Mahasiswa.getTotalMahasiswa());
    }
}
