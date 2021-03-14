class Matematika{
	int a=0;
	int b=0;
	int c=0;
	int d=0;
	
	//method
	void tambah(int newValue){
		a = a + newValue;
		System.out.println("Pertambahan: " + a);
	}
	void kurang(int newValue){
		b = b - newValue;
		System.out.println("Pengurangan: " + b);
	}
	void kali(int newValue){
		c = c * newValue;
		System.out.println("Perkalian: " + c);
	}
	void bagi(int newValue){
		d = d / newValue;
		System.out.println("Pembagian: " + d);
	}
}

public class MatematikaDemo{
	public static void main(String[] args){
		Matematika mat = new Matematika();
		
		mat.a=20;
		mat.tambah(20);
		
		mat.b=10;
		mat.kurang(5);
		
		mat.c=10;
		mat.kali(20);
		
		mat.d=20;
		mat.bagi(2);
	}
}