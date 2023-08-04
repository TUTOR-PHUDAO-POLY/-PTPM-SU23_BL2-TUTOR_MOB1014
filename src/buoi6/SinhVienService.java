/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SinhVienService {

    private Scanner sc = new Scanner(System.in);

    public void nhapTT(ArrayList<SinhVien> list) {
        while (true) {
            System.out.print("nhap ten: ");
            String ten = sc.nextLine();
            System.out.print("nhap ma: ");
            String ma = sc.nextLine();
            System.out.print("nhap chuyenNganh: ");
            String chuyenNganh = sc.nextLine();

            list.add(new SinhVien(ma, ten, chuyenNganh));

            System.out.print("ban muon nhap tiep hay ko: ");
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void inTT(ArrayList<SinhVien> list) {
        for (SinhVien o : list) {
            o.inThongTin();
        }
    }

    public void search(String ma, ArrayList<SinhVien> list) {
        for (SinhVien o : list) {
            if (o.getMaSV().equalsIgnoreCase(ma)) {
                o.inThongTin();
            }
        }
    }

    public void sort(ArrayList<SinhVien> list) {
        list.sort((o1, o2) -> o1.getChuyenNganh().compareTo(o2.getChuyenNganh()));
        this.inTT(list);
    }

    public void nhapTTSinhVienPoly(ArrayList<SinhVienPoly> list) {
        System.out.print("nhap ten: ");
        String ten = sc.nextLine();
        System.out.print("nhap ma: ");
        String ma = sc.nextLine();
        System.out.print("nhap chuyenNganh: ");
        String chuyenNganh = sc.nextLine();
        System.out.print("nhap chuyenNganhhep: ");
        String chuyenNganhHep = sc.nextLine();
        list.add(new SinhVienPoly(chuyenNganhHep, ma, ten, chuyenNganh));

        for (SinhVienPoly o : list) {
            o.inThongTin();
        }
    }

    public void fakeData(ArrayList<SinhVien> list) {
        list.add(new SinhVien("s1", "sssss", "sssaaa"));
        list.add(new SinhVien("s2", "aaaa", "sssaaa"));
        list.add(new SinhVien("s3", "dddđ", "sssaaa"));
        list.add(new SinhVien("s4", "qqqqqq", "sssaaa"));
        list.add(new SinhVien("s5", "eeeeee", "sssaaa"));
    }
}
