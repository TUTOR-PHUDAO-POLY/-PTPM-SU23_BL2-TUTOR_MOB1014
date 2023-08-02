/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<XeMay> list = new ArrayList<>();
         ArrayList<XeSo> lists = new ArrayList<>();
        int chucNang = 0;
        new QlXeMay().fakeData(list);
        do {
            System.out.println("1.nhapTT");
            System.out.println("2.inTT");
            System.out.println("3.tim kiem");
            System.out.println("4.xap sep");
            System.out.println("5.xoa");
            System.out.println("6.ke thua");
            System.out.print("moi ban nhap chuc nang: ");
            chucNang = Integer.valueOf(sc.nextLine());

            switch (chucNang) {
                case 1:
                    new QlXeMay().nhapTT(list);
                    break;
                case 2:
                    new QlXeMay().inTT(list);
                    break;
                case 3:
                    System.out.print("nhap min: ");
                    int min = Integer.valueOf(sc.nextLine());
                    System.out.print("nhap max: ");
                    int max = Integer.valueOf(sc.nextLine());
                    new QlXeMay().timKiem(list, min, max);
                    break;
                case 4:
                    new QlXeMay().sort(list);
                    break;
                case 5:
                    System.out.print("nhap ma: ");
                    String ma = sc.nextLine();
                    new QlXeMay().xoa(list, ma);
                    break;
                case 6:
                   new QlXeMay().nhapTTXeSo(lists);
                    break;
                default:
                    System.out.println("chuc nang khong ton tai");
            }
        } while (chucNang != 0);
    }
}
