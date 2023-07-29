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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<LopHoc> list = new ArrayList<>();
        QlLopHoc ql = new QlLopHoc();
        int chucNang = 0;
        ql.fakedata(list);
        do {
            System.out.println("1.nhap tt lop ");
            System.out.println("2.in tt lop ");
            System.out.println("3.search ");
            System.out.println("4.delete ");
            System.out.print("moi ban chon chuc nang:  ");
            chucNang = Integer.valueOf(sc.nextLine());

            switch (chucNang) {
                case 1:
                    ql.nhapTT(list);
                    break;

                case 2:
                    ql.inTT(list);
                    break;
                case 3:
                    System.out.print("moi ban nhap min: ");
                    int min = Integer.valueOf(sc.nextLine());
                    System.out.print("moi ban nhap max: ");
                    int max = Integer.valueOf(sc.nextLine());
                    ql.search(list, min, max);
                    break;

                case 4:
                    System.out.print("moi ban nhap ma: ");
                    String ma = sc.nextLine();
                    ql.delete(list,ma);
                    break;
                default:
                    System.out.println("chuc nang ko ton tai");
            }
        } while (chucNang != 0);
    }
}
