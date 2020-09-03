/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_14.lec8.jtree;

/**
 *
 * @author apple
 */
public class Sinhvien {
    private String msSV;
    private String hoTen;
    private String email;
    private String diaChi;
    private String msLop;
    public Sinhvien() {
    super();
    }
    public Sinhvien(String msSV, String hoTen, String email, String diaChi,
    String msLop) {
    super();
    this.msSV = msSV;
    this.hoTen = hoTen;
    this.email = email;
    this.diaChi = diaChi;
    this.msLop = msLop;
    }
    public String getMsSV() {
    return msSV;
    }
    public void setMsSV(String msSV) {
    this.msSV = msSV;
    }
    public String getHoTen() {
    return hoTen;
    }
    public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
    }
    public String getEmail() {
    return email;
    }
    public void setEmail(String email) {
    this.email = email;
    }
    public String getDiaChi() {
    return diaChi;
    }
    public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
    }
    public String getMsLop() {
    return msLop;
    }
    public void setMsLop(String msLop) {
    this.msLop = msLop;
    }
    @Override
    public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((msSV == null) ? 0 : msSV.hashCode());
    return result;
    }
    @Override
    public boolean equals(Object obj) {
    if (this == obj)
    return true;
    if (obj == null)
    return false;
    if (getClass() != obj.getClass())
    return false;
    Sinhvien other = (Sinhvien) obj;
    if (msSV == null) {
    if (other.msSV != null)
    return false;
    } else if (!msSV.equals(other.msSV))
    return false;
    return true;
    }
    @Override
    public String toString() {
    return hoTen;
    }
}