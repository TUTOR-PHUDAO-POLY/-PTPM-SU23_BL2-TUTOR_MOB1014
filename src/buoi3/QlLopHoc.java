/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
public class QlLopHoc {

    private Scanner sc = new Scanner(System.in);

    public void nhapTT(ArrayList<LopHoc> list) {
        while (true) {
            // b1: nhap thong tin từ bàn phím
            System.out.print("nhap ma lop: ");
            String ma = sc.nextLine();
            System.out.print("nhap ten lop: ");
            String ten = sc.nextLine();
            System.out.print("nhap dien tich lop: ");
            int dienTich = Integer.valueOf(sc.nextLine());
            System.out.print("nhap dia diem lop: ");
            String diaDiemLop = sc.nextLine();

            // b2: khởi tạo và gán giá trị vào đối tượng
            LopHoc lh = new LopHoc(ma, ten, dienTich, diaDiemLop);
            list.add(lh);

            System.out.print("ban co muon nhap tiep hay khong(n/y): ");
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("n")) {
                break;
            }
        }

    }

    public void inTT(ArrayList<LopHoc> list) {
        for (LopHoc o : list) {
            o.inThongTin();
        }
    }

    public void search(ArrayList<LopHoc> list, String ten) {
        for (LopHoc o : list) {
            if (o.getTenLop().contains(ten)) {
                o.inThongTin();
            }
        }
    }

    public void fakedata(ArrayList<LopHoc> list) {
        list.add(new LopHoc("s1", "vinh", 10, "aa"));
        list.add(new LopHoc("s2", "hoang", 1, "aa"));
        list.add(new LopHoc("s3", "anh", 100, "aa"));
        list.add(new LopHoc("s4", "trung", 20, "aa"));
        list.add(new LopHoc("s5", "thuan", 30, "aa"));
    }

    public void delete(ArrayList<LopHoc> list, String ma) {
        for (LopHoc o : list) {
             if(ma.equalsIgnoreCase(o.getMaLop())){
                 list.remove(o);
                 break;
             }
        }
    }

}
