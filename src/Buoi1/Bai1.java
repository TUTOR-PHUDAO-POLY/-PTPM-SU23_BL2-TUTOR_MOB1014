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
public class Bai1 {
    //Nhập thông tin gồm tên ,
    //tuổi, địa chỉ, điểm, trường học của bản thân và in ra .

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("nhap tuoi: ");
        int tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap dia chi: ");
        String diaChi = sc.nextLine();
        System.out.println("nhap diem: ");
        int diem = Integer.valueOf(sc.nextLine());
        System.out.println("nhap truong hoc: ");
        String truongHoc = sc.nextLine();

        // in thong tin
        System.out.println("ten vua nhap la: " + ten);
        System.out.println("tuoi vua nhap la: " + tuoi);
        System.out.println("dia chi vua nhap la: " + diaChi);
        System.out.println("diem vua nhap la: " + diem);
        System.out.println("truong hoc vua nhap la: " + truongHoc);
    }
}
