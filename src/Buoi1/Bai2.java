/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi1;

import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
public class Bai2 {
    //Nhập 2 số dương a,b tính tổng,
    // hiệu tích thương và in các kết quả ra màn hình.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // nhap 2 so
        System.out.print("nhap so duong a: ");
        double a = Double.valueOf(sc.nextLine());
        System.out.print("nhap so duong b: ");
        double b = Double.valueOf(sc.nextLine());
        
        // tinh toan
        double tong = a + b;
        double hieu = a -b;
        double tich = a * b;
        double thuong = a/b;
        
        // in ra 
        System.out.println("tong: "+ tong+" | hieu: "+hieu+" | tich: "+tich+" | thuong: "+thuong );
        
    }
}
