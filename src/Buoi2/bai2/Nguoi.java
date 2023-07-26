/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi2.bai2;

/**
 *
 * @author asus_vinh
 */
public class Nguoi {

    private String ten;

    private int tuoi;

    private int gioiTinh;

    private String queQuan;

    private String ngheNghiep;

    public Nguoi() {
    }

    public Nguoi(String ten, int tuoi, int gioiTinh, String queQuan, String ngheNghiep) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.ngheNghiep = ngheNghiep;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public void inThongTin() {
        System.out.println("ten: " + ten + " | tuoi: " + tuoi + " | gioi tinh: " + gioiTinh
                + " | que quan: " + queQuan + " | nghe nghiep: " + ngheNghiep);
    }

}
