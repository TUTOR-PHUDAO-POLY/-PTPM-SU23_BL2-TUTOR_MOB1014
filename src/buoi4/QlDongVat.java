/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
public class QlDongVat {

    private Scanner sc = new Scanner(System.in);

    public void nhapTT(ArrayList<DongVat> list) {
        while (true) {
            // b1: nhập thông tin từ bàn phím
            System.out.print("nhap ma: ");
            String ma = sc.nextLine();
            System.out.print("nhap ten: ");
            String ten = sc.nextLine();
            System.out.print("nhap gioi tinh: ");
            int gioiTinh = Integer.valueOf(sc.nextLine());
            System.out.print("nhap can nang: ");
            int canNang = Integer.valueOf(sc.nextLine());

            // b2: khởi tạo và gán giá trị vào đối tượng
            DongVat dv = new DongVat(ma, ten, gioiTinh, canNang);
            list.add(dv);

            // b3
            System.out.print("ban co muon nhap tiep khong(y/n): ");
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void inTT(ArrayList<DongVat> list) {
        for (DongVat o : list) {
            o.inThongTin();
        }
    }

    public void search(ArrayList<DongVat> list) {
        for (DongVat o : list) {
            if (o.getTen().contains("h")) {
                o.inThongTin();
            }
        }
    }

    public void nhapTTMeo(ArrayList<Meo> list) {
        System.out.print("nhap ma: ");
        String ma = sc.nextLine();
        System.out.print("nhap ten: ");
        String ten = sc.nextLine();
        System.out.print("nhap gioi tinh: ");
        int gioiTinh = Integer.valueOf(sc.nextLine());
        System.out.print("nhap can nang: ");
        int canNang = Integer.valueOf(sc.nextLine());
        System.out.print("tieng keu la: ");
        String tiengKeu = sc.nextLine();

        list.add(new Meo(tiengKeu, ma, ten, gioiTinh, canNang));

        for (Meo o : list) {
            o.inThongTin();
        }
    }

    public void fakeData(ArrayList<DongVat> list) {
        list.add(new DongVat("s1", "cho", 1, 20));
        list.add(new DongVat("s2", "khi", 1, 20));
        list.add(new DongVat("s3", "meo", 1, 20));
        list.add(new DongVat("s4", "chuot", 1, 20));
        list.add(new DongVat("s5", "iot", 1, 20));
    }
}
