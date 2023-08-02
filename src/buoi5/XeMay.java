/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi5;

/**
 *
 * @author asus_vinh
 */
public class XeMay {
      private String ma;
      
      private String hang;
      
      private double  gia;

    public XeMay() {
    }

    public XeMay(String ma, String hang, double gia) {
        this.ma = ma;
        this.hang = hang;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
      
      public void inThongTin(){
          System.out.println("ma: "+ma+" | hang: "+hang+" | gia: "+gia);
      }
}
