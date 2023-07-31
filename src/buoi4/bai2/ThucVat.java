/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi4.bai2;

/**
 *
 * @author asus_vinh
 */
public class ThucVat {

    private String ma;

    private String ten;

    private String loaiCay;

    private String khuVucSong;

    public ThucVat() {
    }

    public ThucVat(String ma, String ten, String loaiCay, String khuVucSong) {
        this.ma = ma;
        this.ten = ten;
        this.loaiCay = loaiCay;
        this.khuVucSong = khuVucSong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoaiCay() {
        return loaiCay;
    }

    public void setLoaiCay(String loaiCay) {
        this.loaiCay = loaiCay;
    }

    public String getKhuVucSong() {
        return khuVucSong;
    }

    public void setKhuVucSong(String khuVucSong) {
        this.khuVucSong = khuVucSong;
    }

    public void inThongTin() {
        System.out.println("ma: " + ma);
        System.out.println("ten: " + ten);
        System.out.println("loaiCay: " + loaiCay);
        System.out.println("khuVucSong: " + khuVucSong);
    }
}
