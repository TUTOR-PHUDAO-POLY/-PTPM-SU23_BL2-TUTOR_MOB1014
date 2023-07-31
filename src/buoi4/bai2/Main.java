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
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chucNang = 0;
        ArrayList<ThucVat> list = new ArrayList<>();
        do {
            System.out.println("1.nhap tt");
            System.out.println("2.in tt");
            System.out.println("3.tim kiem ");
            System.out.println("4.hien thi danh sach thuc vat o vi tri chan");
            System.out.println("5.ke thua");
            System.out.print("moi ban nhap chuc nag: ");
            chucNang = Integer.valueOf(sc.nextLine());
            
            switch (chucNang) {
                case 1:
                    new QlThucVat().nhapTT(list);
                    break;
                case 2:
                    new QlThucVat().inTT(list);
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                default:
                    System.out.println("chuc nang ko ton tai");
            }
        } while (chucNang != 0);
    }
}
