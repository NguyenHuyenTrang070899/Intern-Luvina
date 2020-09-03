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
public class Lophoc {
    private String msLop;
    private String tenLop;
    private String giavienCN;
    public Lophoc() {
    super();
    }
    public Lophoc(String msLop, String tenLop, String giavienCN) {
    super();
    this.msLop = msLop;
    this.tenLop = tenLop;
    this.giavienCN = giavienCN;
    }
    public String getMsLop() {
    return msLop;
    }
    public void setMsLop(String msLop) {
    this.msLop = msLop;
    }
    public String getTenLop() {
    return tenLop;
    }
    public void setTenLop(String tenLop) {
    this.tenLop = tenLop;
    }
    public String getGiavienCN() {
    return giavienCN;
    }
    public void setGiavienCN(String giavienCN) {
    this.giavienCN = giavienCN;
    }
    @Override
    public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((msLop == null) ? 0 : msLop.hashCode());
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
    Lophoc other = (Lophoc) obj;
    if (msLop == null) {
    if (other.msLop != null)
    return false;
    } else if (!msLop.equals(other.msLop))
    return false;
    return true;
    }
    @Override
    public String toString() {
    return tenLop;
    }

}
