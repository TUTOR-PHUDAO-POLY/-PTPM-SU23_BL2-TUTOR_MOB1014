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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> list = new ArrayList<>();
        ArrayList<SinhVienPoly> lists = new ArrayList<>();
        int chucNang = 0;
        new SinhVienService().fakeData(list);
        do {
            System.out.println("1.nhap TT");
            System.out.println("2.in TT");
            System.out.println("3.tim kiem theo ma");
            System.out.println("4.sort theo chuyenNganh");
            System.out.println("moi ban nhap chuc nang: ");
            chucNang = Integer.valueOf(sc.nextLine());

            switch (chucNang) {
                case 1:
                    new SinhVienService().nhapTT(list);
                    break;
                case 2:
                    new SinhVienService().inTT(list);
                    break;
                case 3:
                    System.out.println("nhap ma can tim: ");
                    String ma = sc.nextLine();
                    new SinhVienService().search(ma, list);
                    break;
                case 4:
                    new SinhVienService().sort(list);
                    break;
                case 5:
                    new SinhVienService().nhapTTSinhVienPoly(lists);
                    break;
                default:
                    System.out.println("chuc nang khong ton tai");
            }

        } while (chucNang != 0);
    }
}
