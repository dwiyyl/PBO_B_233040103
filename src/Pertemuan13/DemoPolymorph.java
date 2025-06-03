package Pertemuan13;

public class DemoPolymorph {
	public static void main(String[] args) {
        Bentuk b1 = new Lingkaran(); // objek Lingkaran dianggap sebagai Bentuk
        Bentuk b2 = new Tabung();    // objek Tabung dianggap sebagai Bentuk

        b1.gambar(); // Output: Menggambar Lingkaran
        b2.gambar(); // Output: Menggambar Tabung
    }
}
