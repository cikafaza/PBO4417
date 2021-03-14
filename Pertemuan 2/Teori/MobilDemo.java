class Mobil2{
	String warna;
	int tahunProduksi;
	int gigi;

	public void ubahGigi(int newGigi){
		gigi = newGigi;
	}
}

public class MobilDemo{
	void Status(boolean isHidup){
		if (isHidup == true)
			System.out.println("Hidupkan Mobil");
		else {
			System.out.println("Matikan Mobil");
		}
	}
		public static void main(String[] args){
			Mobil2 mobilku = new Mobil2();
			MobilDemo mobil = new MobilDemo();
			mobilku.warna="Hitam";
			mobilku.tahunProduksi=2006;
			mobil.Status(true);
			mobilku.ubahGigi(2);
			System.out.println("Warna: " + mobilku.warna);
			System.out.println("Tahun: " + mobilku.tahunProduksi);
			System.out.println("ubahGigi: " + mobilku.gigi);
			mobil.Status(false);
		}
}