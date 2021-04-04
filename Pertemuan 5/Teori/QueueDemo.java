import java.util.List;

public class QueueDemo{
	public static void main(String args[]){ 
		Queue queue = new Queue(); 
		Object object=queue.cekKosong();
		System.out.println("Apakah data kosong? "+object);
		
		int cekJumlah=queue.cekJumlah();
		System.out.println("Jumlah data sekarang : "+cekJumlah);
		
		queue.tambah("Merah"); 
		queue.tambah("Kuning"); 
		queue.tambah("Biru"); 
		
		cekJumlah=queue.cekJumlah();
		System.out.println("Jumlah data sekarang : "+cekJumlah);
		
		object=queue.peek();
        System.out.println("Data head pada Queue : "+object);
		
		object=queue.kurang();
		System.out.println("Objek yang dikeluarkan : "+object);
		
		cekJumlah=queue.cekJumlah();
		System.out.println("Jumlah Data setelah dikurangi: "+cekJumlah);
	}
}