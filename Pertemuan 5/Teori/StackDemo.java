import java.util.List;

public class StackDemo{
	public static void main(String args[]){
		Stack stack=new Stack();
		Object object=stack.cekKosong();
		System.out.println("Apakah data kosong? "+object);
		
		int cekJumlah=stack.cekJumlah();
		System.out.println("Jumlah data sekarang : "+cekJumlah);
		
        stack.tambah("kelas 1");
        stack.tambah("kelas 2");
		stack.tambah("kelas 3");
        
		cekJumlah=stack.cekJumlah();
        System.out.println("Jumlah Data pada Stack : "+cekJumlah);
		object=stack.peek();
        System.out.println("Data Teratas pada Stack : "+object);
        
        object=stack.kurang();
        System.out.println("Objek yang dikeluarkan (Pop) : "+object);
        cekJumlah=stack.cekJumlah();
        System.out.println("Jumlah Data pada Stack setelah Pop: "+cekJumlah);
        object=stack.peek();
        System.out.println("Data Teratas pada Stack setelah Pop: "+object);
	}
}