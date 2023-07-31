/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi4.bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
public class QlThucVat {

    private Scanner sc = new Scanner(System.in);

    public void nhapTT(ArrayList<ThucVat> list) {
        while (true) {
            System.out.print("ma: ");
            String ma = sc.nextLine();
            System.out.print("ten: ");
            String ten = sc.nextLine();
            System.out.print("loai: ");
            String loai = sc.nextLine();
            System.out.print("khu vuc sog: ");
            String khuVucSong = sc.nextLine();

            list.add(new ThucVat(ma, ten, loai, khuVucSong));

            System.out.println("ban muon nhap tiep hay khong: ");
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void inTT(ArrayList<ThucVat> list) {
        for (ThucVat o : list) {
            o.inThongTin();
        }
    }

    public void keThua(ArrayList<CayAnQua> list) {
        System.out.print("ma: ");
        String ma = sc.nextLine();
        System.out.print("ten: ");
        String ten = sc.nextLine();
        System.out.print("loai: ");
        String loai = sc.nextLine();
        System.out.print("khu vuc sog: ");
        String khuVucSong = sc.nextLine();
        System.out.print("so nam tuoi: ");
        int soNam = Integer.valueOf(sc.nextLine());

        list.add(new CayAnQua(soNam, ma, ten, loai, khuVucSong));

        for (CayAnQua o : list) {
            o.inThongTin();
        }
    }
}
