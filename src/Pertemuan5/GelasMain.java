package Pertemuan5;

public class GelasMain {
	
	public static void main(String[] args) {
		Gelas g1 = new Gelas("Hitam");
		Gelas g2 = new Gelas("Biru");
		System.out.println("Warna sebelumnya: "+ g1.getWarna());
		System.out.println("Warna sebelumnya: "+ g2.getWarna());
		
		tukarWarnaGelas(g1, g2);
		System.out.println("Warna g1: "+ g1.getWarna());
		System.out.println("Warna g2: "+ g2.getWarna());
	}
	
	static void tukarWarnaGelas (Gelas g1, Gelas g2) {
		Gelas gTemp = new Gelas("Temp");
		gTemp.setWarna(g1.getWarna());
		g1.setWarna(g2.getWarna());
		g2.setWarna(gTemp.getWarna());
	}	
}