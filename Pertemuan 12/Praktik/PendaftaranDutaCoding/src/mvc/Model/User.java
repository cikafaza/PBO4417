/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;

/**
 *
 * @author bertinfajri
 */
public class User {

    /**
     * @return the no
     */
    public Integer getNo() {
        return no;
    }

    /**
     * @param no the no to set
     */
    public void setNo(Integer no) {
        this.no = no;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the jk
     */
    public String getJk() {
        return jk;
    }

    /**
     * @param jk the jk to set
     */
    public void setJk(String jk) {
        this.jk = jk;
    }

    /**
     * @return the tempattinggal
     */
    public String getTempattinggal() {
        return tempattinggal;
    }

    /**
     * @param tempattinggal the tempattinggal to set
     */
    public void setTempattinggal(String tempattinggal) {
        this.tempattinggal = tempattinggal;
    }

    /**
     * @return the usia
     */
    public Integer getUsia() {
        return usia;
    }

    /**
     * @param usia the usia to set
     */
    public void setUsia(Integer usia) {
        this.usia = usia;
    }

    /**
     * @return the alasan
     */
    public String getAlasan() {
        return alasan;
    }

    /**
     * @param alasan the alasan to set
     */
    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }
    private Integer no;
    private String nama;
    private String jk;
    private String tempattinggal;
    private Integer usia;
    private String alasan;
}
