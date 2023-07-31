/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi4.bai2;

/**
 *
 * @author asus_vinh
 */
public class CayAnQua  extends ThucVat{
     private int soNamTuoi;

    public CayAnQua(int soNamTuoi) {
        this.soNamTuoi = soNamTuoi;
    }

    public CayAnQua(int soNamTuoi, String ma, String ten, String loaiCay, String khuVucSong) {
        super(ma, ten, loaiCay, khuVucSong);
        this.soNamTuoi = soNamTuoi;
    }

    public CayAnQua() {
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("so nam tuoi: "+ soNamTuoi);
    }
     
     
}
