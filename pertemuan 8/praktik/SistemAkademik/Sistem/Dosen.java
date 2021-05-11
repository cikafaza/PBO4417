package SistemAkademik.sistem;
import SistemAkademik.Akademik;

public class Dosen extends Akademik {
    private int noId;
    private String nip;
    private String nama;
    private String jenisKelamin;
    private String role;
//    String text="Masukkan ";

    @Override
    public void setData() {
        System.out.println("");
        System.out.println("Input Data Dosen");
        System.out.print("Masukkan NIP \t: ");
        this.nip = str.nextLine();
        System.out.print("Masukkan Nama \t: ");
        this.nama = str.nextLine();
        System.out.print("Masukkan Jenis Kelamin : ");
        this.jenisKelamin = str.nextLine();
        this.role = "Dosen";
    }

    @Override
    public void show() {
        System.out.println("ID \t\t: " + this.noId);
        System.out.println("NIP \t\t: " + this.nip);
        System.out.println("Nama \t\t: " + this.nama);
        System.out.println("Jenis Kelamin \t: " + this.jenisKelamin);
        System.out.println("Role \t\t: " + this.role);
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