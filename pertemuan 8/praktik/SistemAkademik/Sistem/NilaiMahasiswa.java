package SistemAkademik.sistem;
import SistemAkademik.Akademik;

public class NilaiMahasiswa extends Akademik {
    private int noId;
    private int nPokok;
    private int nTambahan;
    private int nAkhir;
    private String nama;

    @Override
    public void setData() {
        System.out.println("");
        System.out.println("");
        System.out.println("Input Nilai Mahasiswa");
        System.out.print("Masukan Nama          :");
        this.nama = str.nextLine();
        System.out.print("Masukan Nilai Mata Kuliah Pokok \t: ");
        this.nPokok = str.nextInt();
        System.out.print("Masukan Nilai Mata Kuliah Tambahan \t: ");
        this.nTambahan = str.nextInt();
        this.nAkhir = ((int)(this.nPokok*60/100) + (this.nTambahan*40/100));
    }

    @Override
    public void show() {
        System.out.println("Nama       : " + this.nama);
        System.out.println("Nilai Pokok  : " + this.nPokok);
        System.out.println("Nilai Tambah: " + this.nTambahan);
        System.out.println("Nilai Akhir: " + this.nAkhir);
    }
    @Override
    public int getNoId() {
        return this.noId;
    }

    @Override
    public void setNoId() {
        this.noId = 12143;
    }

    @Override
    public void setNoId(int noId) {
        this.noId = noId + 1;
    }
}
