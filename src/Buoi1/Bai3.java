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
public class Bai3 {

    // Nhập số nguyên dương n (0<n<20) tính tổng các số chẵn từ 1-n.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nhap n
        System.out.print("nhap n: ");
        int n = Integer.valueOf(sc.nextLine());

        // xu ly (0<n<20)
        if (n <= 0 || n >= 20) {
            System.out.println("nhap sai n pai lon hon 0 hoac nho hon 20");
        } else {
            // tinhs toan
            int tong = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    tong += i;
                }
            }
            System.out.println("tong: " + tong);
        }
    }
}
