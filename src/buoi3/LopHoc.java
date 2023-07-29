/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi3;

/**
 *
 * @author asus_vinh
 */
public class LopHoc {
    //  maLop - String , tenLop - String , dienTich - int, diaDiemLopHoc - String

    private String maLop;

    private String tenLop;

    private int dienTich;

    private String diaDiemLopHoc;

    public LopHoc() {
    }

    public LopHoc(String maLop, String tenLop, int dienTich, String diaDiemLopHoc) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.dienTich = dienTich;
        this.diaDiemLopHoc = diaDiemLopHoc;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public String getDiaDiemLopHoc() {
        return diaDiemLopHoc;
    }

    public void setDiaDiemLopHoc(String diaDiemLopHoc) {
        this.diaDiemLopHoc = diaDiemLopHoc;
    }

    public void inThongTin() {
        System.out.println("ma lop: " + maLop + " | ten lop: " + tenLop
                + " | dien tich: " + dienTich + " | dia diem lop: " + diaDiemLopHoc);
    }

}
