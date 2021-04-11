import Transportasi.Mobil;
import Transportasi.Bicycle;

public class TransportasiDemo{
	void Status(boolean isHidup){
		if (isHidup == true)
			System.out.println("Hidupkan Mobil");
		else {
			System.out.println("Matikan Mobil");
		}
	}
	public static void main(String[] args){
		System.out.println("\nTest Mobil");
		Mobil mobilku = new Mobil();
		TransportasiDemo mobil = new TransportasiDemo();
		mobilku.warna="Hitam";
		mobilku.tahunProduksi=2006;
		mobil.Status(true);
		mobilku.ubahGigi(2);
		System.out.println("Warna: " + mobilku.warna);
		System.out.println("Tahun: " + mobilku.tahunProduksi);
		System.out.println("ubahGigi: " + mobilku.gigi);
		mobil.Status(false);
		
		System.out.println("\n-------------------------------------");
		
		System.out.println("\nTest Sepeda");
		Bicycle bike=new Bicycle();
		bike.speed=5;
		bike.gear=2;
		
		bike.speedUp(10);
		bike.changeGear(3);
	}
}