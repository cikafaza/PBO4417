class Buku{
	private String judul;
	private String pengarang;
	private String penerbit;
	private int tahun;
	
	public Buku(String judul,String pengarang,String penerbit,int tahun){
		this.judul=judul;
		this.pengarang=pengarang;
		this.penerbit=penerbit;
		this.tahun=tahun;
	}
	public void info(){
		System.out.println("Judul:"+this.judul);
		System.out.println("Pengarang:"+this.pengarang);
		System.out.println("Penerbit:"+this.penerbit);
		System.out.println("Tahun:"+this.tahun);
	}
}

public class BukuDemo{
	public static void main(String[] args){
		Buku buku1 = new Buku("Pemrograman Berbasis Objek dengan Java","Indrajani","Elexmedia Komputindo",2007);
		buku1.info();
		Buku buku2 = new Buku("Dasar Pemrograman Java","Abdul Kadir","Andi Offset",2004);
		buku2.info();
	}
}