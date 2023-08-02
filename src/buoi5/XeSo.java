/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi5;

/**
 *
 * @author asus_vinh
 */
public class XeSo extends XeMay{
     private String nhienLieu;
     
     private String dongCo;

    public XeSo(String nhienLieu, String dongCo) {
        this.nhienLieu = nhienLieu;
        this.dongCo = dongCo;
    }

    public XeSo(String nhienLieu, String dongCo, String ma, String hang, double gia) {
        super(ma, hang, gia);
        this.nhienLieu = nhienLieu;
        this.dongCo = dongCo;
    }

    public XeSo() {
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("nhieu lieu: "+nhienLieu);
        System.out.println("dong co: "+dongCo);
    }
     
     
}
