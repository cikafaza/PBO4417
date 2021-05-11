package SistemAkademik;

import SistemAkademik.sistem.Dosen;
import SistemAkademik.sistem.Mahasiswa;
import SistemAkademik.sistem.MataKuliah;
import SistemAkademik.sistem.MataKuliahTambahan;
import SistemAkademik.sistem.NilaiMahasiswa;
import java.util.Scanner;

public abstract class Akademik implements SistemAkademik {
    @Override
    public abstract void setData();

    @Override
    public abstract void show();
    public static Scanner in = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);

    public static void main(String[] args) {
        int menu = 0, x = 0, y = 0, z = 0, m = 0, n = 0, dsn, mhss, nilaiMhs,matkul, cari, cariMhs;
        
        //Dosen
        Dosen[] data = new Dosen[1024];
        data[x] = new Dosen();
        data[x].setNoId();
        
        //Mhs
        Mahasiswa[] mhs = new Mahasiswa[1024];
        mhs[y] = new Mahasiswa();
        mhs[y].setNoId();
        
        //MK
        MataKuliah[] mk = new MataKuliah[1024];
        mk[z] = new MataKuliah();
        mk[z].setNoId();
        
        //select mk
        MataKuliahTambahan[] tm = new MataKuliahTambahan[1024];
        tm[m] = new MataKuliahTambahan();
        tm[m].setNoId();
        
        //input nilai
        NilaiMahasiswa[] nilai = new NilaiMahasiswa[1024];
        nilai[n] = new NilaiMahasiswa();
        nilai[n].setNoId();
        
        while (menu != 10) {
            System.out.println("========================================");
            System.out.print("Main Menu...\n1.Input Dosen\t\t2.Input Mahasiswa\n3.View Dosen\t\t4.View Mahasiswa\n5.Input Nilai\t\t6.Input Mata Kuliah\n7.Lihat Mata Kuliah\t8.Search Mahasiswa\n9.Pilih Mata Kuliah\t10.Exit\nMasukan Perintah :");
            menu = data[0].in.nextInt();
            if (menu == 1) {
                //input dosen
                x++;
                data[x] = new Dosen();
                data[x].setNoId(data[x - 1].getNoId());
                data[x].setData();
            } 
            else if (menu == 2) {
                //input mahasiswa
                y++;
                mhs[y] = new Mahasiswa();
                mhs[y].setNoId(mhs[y - 1].getNoId());
                mhs[y].setData();
            } 
            else if (menu == 3) {
                //lihat dosen
                if (x < 1) {
                    System.out.println("Data Kosong!");
                } 
                else {
                    dsn = 0;
//                    System.out.println("");
                    System.out.println("\nData Dosen");
                    while (dsn < x) {
                        dsn++;
                        System.out.println("---------" + dsn + "---------");
                        data[dsn].show();
                    }
                }
            } 
            else if (menu == 4) {
                if (y < 1) {
                    System.out.println("Data Kosong!");
                } 
                else {
                    int mhs1 = 0;
                    System.out.println("");
                    System.out.println("Data Mahasiswa");
                    while (mhs1 < y) {
                        mhs1++;
                        System.out.println("---------" + mhs1 + "---------");
                        mhs[mhs1].show();
                    }
                }
            } 
            else if (menu == 5) {
                n++;
                nilai[n] = new NilaiMahasiswa();
                nilai[n].setNoId(nilai[n - 1].getNoId());
                nilai[n].setData();
                if (n < 1) {
                    System.out.println("Data Kosong!");
                } 
                else {
                    nilaiMhs = 0;
                    System.out.println("");
                    System.out.println("Data Nilai");
                    while (nilaiMhs < n) {
                        nilaiMhs++;
                        System.out.println("---------" + nilaiMhs + "---------");
                        nilai[nilaiMhs].show();
                    }
                }
            } 
            else if (menu == 6) {
                z++;
                mk[z] = new MataKuliah();
                mk[z].setNoId(mk[z - 1].getNoId());
                mk[z].setData();
            } 
            else if (menu == 7) {
                if (z < 1) {
                    System.out.println("Data Kosong!");
                } else {
                    matkul = 0;
                    System.out.println("");
                    System.out.println("Data Mata Kuliah");
                    while (matkul < z) {
                        matkul++;
                        System.out.println("---------" + matkul + "---------");
                        mk[matkul].show();
                    }
                }
            } 
            else if (menu == 8) {
                System.out.print("Masukkan NIM : ");
                cari = mhs[0].in.nextInt();
                cariMhs = 1;
                while (cariMhs <= y) {
                    if (mhs[cariMhs].getNoId() == cari) {
                        break;
                    }
                    cariMhs++;
                }
                if (cariMhs <= y) {
                    if (menu == 8) {
                        mhs[cariMhs].show();
                    }
                } 
                else {
                    System.out.println("Data Tidak Ditemukan!");
                }

            } else if (menu == 9) {
                m++;
                tm[m] = new MataKuliahTambahan();
                tm[m].setNoId(tm[m - 1].getNoId());
                tm[m].setData();
                if (m < 1) {
                    System.out.println("Data Kosong!");
                } 
                else {
                    matkul = 0;
                    System.out.println("");
                    System.out.println("Data Mata Kuliah");
                    while (matkul < m) {
                        matkul++;
                        System.out.println("---------" + matkul + "---------");
                        tm[matkul].show();
                    }
                }
            } else if (menu == 10) {
                System.out.println("Terimakasih Telah Menggunakan Sistem Akademik ini");
            } else {
                System.out.println("Perintah yang Anda Masukkan Salah");
            }
        }
    }
}
