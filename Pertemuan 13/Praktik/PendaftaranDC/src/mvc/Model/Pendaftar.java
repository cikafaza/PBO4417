/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;

public class Pendaftar {
   public Integer getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getNo() {
        return no;
    }

    public String getJk() {
        return jk;
    }

    public String getTempattinggal() {
        return tempattinggal;
    }

    public String getUsia() {
        return usia;
    }

    public String getAlasan() {
        return alasan;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public void setTempattinggal(String tempattinggal) {
        this.tempattinggal = tempattinggal;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }
    private Integer id;
    private String nama;
    private String no;
    private String jk;
    private String tempattinggal;
    private String usia;
    private String alasan;
}
