/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi2;

import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chucNang = 0;
        do {
            System.out.println("1.nhap thong tin cua sinh vien");
            System.out.println("2.nhap so nguyen a kiem tra so do la so nguyen hay so duong");
            System.out.println("0.thoat");
            System.out.print("moi ban nhap chuc nang: ");
            chucNang = Integer.valueOf(sc.nextLine());

            switch (chucNang) {
                case 1:
                    System.out.print("nhap ten: ");
                    String ten = sc.nextLine();
                    System.out.print("nhap tuoi: ");
                    int tuoi = Integer.valueOf(sc.nextLine());
                    System.out.print("nhap gioi tinh: ");
                    String gioiTinh = sc.nextLine();
                    System.out.print("nhap que quan: ");
                    String queQuan = sc.nextLine();
                    System.out.print("nhap nganh hoc: ");
                    String nganhHoc = sc.nextLine();

                    System.out.println("ten: " + ten + " | tuoi: " + tuoi + " | gioi tinh: " + gioiTinh
                            + " | que quan: " + queQuan + " | nganh hoc: " + nganhHoc);
                    break;
                case 2:
                    System.out.print("nhap a: ");
                    double a = Double.valueOf(sc.nextLine());

                    check(a);
                    break;
                default:
                    System.out.println("chuc nang khong ton tai");
            }
        } while (chucNang != 0);
    }

    public static boolean isCheck(double a) {
        return a == Math.floor(a);
    }

    public static void check(double a) {
        if (isCheck(a)) {
            System.out.println("day so nguyen");
            if (a > 0) {
                System.out.println("day la so duong");
            } else {
                System.out.println("day ko phai so duong");
            }
        } else {
            System.out.println("day ko pai la so nguyen");
        }
    }
}
