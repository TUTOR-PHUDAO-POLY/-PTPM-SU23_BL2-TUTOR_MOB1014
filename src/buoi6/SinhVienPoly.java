/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6;

/**
 *
 * @author admin
 */
public class SinhVienPoly extends SinhVien {

    private String chuyenNganhHep;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }

    public SinhVienPoly(String chuyenNganhHep, String maSV, String hoTen, String chuyenNganh) {
        super(maSV, hoTen, chuyenNganh);
        this.chuyenNganhHep = chuyenNganhHep;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("chuyen nganh hep: " + chuyenNganhHep);
    }

}
