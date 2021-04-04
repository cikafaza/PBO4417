import java.util.List;

public class ArrayListDemo{
	public static void main(String args[]){ 
		ArrayListManual data = new ArrayListManual(); 
		Object object=data.cekKosong();
		System.out.println("Apakah data kosong? "+object);
		
		int cekJumlah=data.cekJumlah();
		System.out.println("Jumlah data sekarang : "+cekJumlah);
		
		data.tambah("Nama"); 
		data.tambah("NIM"); 
		data.tambah("Kelompok"); 
		
		cekJumlah=data.cekJumlah();
		System.out.println("Jumlah data sekarang : "+cekJumlah);
		
		object=data.kurang();
		System.out.println("Objek yang dikeluarkan : "+object);
		
		cekJumlah=data.cekJumlah();
		System.out.println("Jumlah Data setelah dikurangi: "+cekJumlah);
	}
}