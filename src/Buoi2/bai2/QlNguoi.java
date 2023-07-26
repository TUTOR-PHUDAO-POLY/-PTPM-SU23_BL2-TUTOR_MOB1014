/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi2.bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
public class QlNguoi {

    private Scanner sc = new Scanner(System.in);

    public void nhapTT(ArrayList<Nguoi> list) {
        while (true) {
            //b1: nhập thông tin tu bàn phím
            System.out.print("nhap ten:");
            String ten = sc.nextLine();
            System.out.print("nhap tuoi:");
            int tuoi = Integer.valueOf(sc.nextLine());
            System.out.print("nhap gioi tinh:");
            String b = sc.nextLine();
            int gioiTinh = Integer.valueOf(b);
            System.out.print("nhap que quan:");
            String queQuan = sc.nextLine();
            System.out.print("nhap nghe nghiep:");
            String ngheNghiep = sc.nextLine();

            //b2: khởi tạo và gán giá trị vào đối tượng
            list.add(new Nguoi(ten, tuoi, gioiTinh, queQuan, ngheNghiep));

            System.out.println("ban muon nhap tiep hay khong: ");
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void inTT(ArrayList<Nguoi> list) {
        for (Nguoi o : list) {
            o.inThongTin();
        }
    }
    
    public void searchTuoiMax(ArrayList<Nguoi> list){
       // chúng ta cần sắp xếp lại theo thứ tự giảm dần
        list.sort((o1,o2)-> o1.getTuoi() - o2.getTuoi());
       
        // in phần tử đầu tiên của danh sách đã sắp xếp
        for (int i = 0; i < 1; i++) {
            System.out.println("ten tk co tuoi lon nhat la: "+list.get(i).getTen());
        }
    }
        

}
