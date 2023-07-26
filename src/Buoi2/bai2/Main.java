/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi2.bai2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chucNang = 0;
        ArrayList<Nguoi> list = new ArrayList<>();
        do {
            System.out.println("1. nhap thong tin");
            System.out.println("2. in thong tin");
            System.out.println("0. thoat");
            System.out.print("moi ban nhap chuc nang: ");
            chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1:
                    new QlNguoi().nhapTT(list);
                    break;
                case 2:
                    new QlNguoi().inTT(list);
                    break;
                case 3:
                    new QlNguoi().searchTuoiMax(list);
                    break;
                default:
                    System.out.println("chuc nang ko ton tai");
            }
        } while (chucNang != 0);
    }
}
