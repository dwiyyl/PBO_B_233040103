package Pertemuan13;

//Interface atau kelas abstrak
public abstract class Bentuk {
	abstract void gambar();
}

class Lingkaran extends Bentuk {
 @Override
 void gambar() {
     System.out.println("Menggambar Lingkaran");
 }
}

class Tabung extends Bentuk {
 @Override
 void gambar() {
     System.out.println("Menggambar Tabung");
 }
}


//MODIFIER
//objek = artibut, 
//kelas = method
//inheritance = extends
//protected = kaitannya dengan hak akses san berhubungna juga dengan inheritance
//public
//private
//default
//abstrack & interface = template/blue print: ketika membicarakan rancangan harus jadi. tujuan abstrak 
//polymorph = sifatnya berubah-ubah meneyesuaikan objek yang dipakainya. contoh hitung luas
//static = bisa diakses dari mana-mana. contoh; int x. x nya pasti terpanggil
//final = konstanta. mau bikin sesuatu nilainya tidak bisa diubah-ubah, harus ditentukan nilainya
