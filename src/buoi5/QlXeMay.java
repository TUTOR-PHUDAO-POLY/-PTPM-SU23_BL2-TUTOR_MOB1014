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
public class QlXeMay {

    private Scanner sc = new Scanner(System.in);

    public void nhapTT(ArrayList<XeMay> list) {
        while (true) {
            System.out.print("nhap ma: ");
            String ma = sc.nextLine();
            System.out.print("nhap hang: ");
            String hang = sc.nextLine();
            System.out.print("nhap gia: ");
            double gia = Double.valueOf(sc.nextLine());

            list.add(new XeMay(ma, hang, gia));

            System.out.println("ban muon nhap tiep hay khong(y/n): ");
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void inTT(ArrayList<XeMay> list) {
        for (XeMay o : list) {
            o.inThongTin();
        }
    }
    
    public void timKiem(ArrayList<XeMay> list,int min, int max){
         for (XeMay o : list) {
            if(o.getGia() >= min && o.getGia()<= max){
                o.inThongTin();
            }
        }
    }
    
    public void sort(ArrayList<XeMay> list){
         list.sort((o1, o2) 
   -> Double.compare(o1.getGia(), o2.getGia()));
         this.inTT(list);
    }
    
    public void xoa(ArrayList<XeMay> list,String ma){
        for (XeMay o : list) {
            if(o.getMa().equalsIgnoreCase(ma)){
               list.remove(o);
               break;
            }
        }
    }
    
    public void nhapTTXeSo(ArrayList<XeSo> list){
        System.out.print("nhap ma: ");
            String ma = sc.nextLine();
            System.out.print("nhap hang: ");
            String hang = sc.nextLine();
            System.out.print("nhap gia: ");
            double gia = Double.valueOf(sc.nextLine());
            System.out.println("nhien lieu : ");
            String nhienLieu = sc.nextLine();
             System.out.println("Dong co : ");
            String dongCo = sc.nextLine();
            
            list.add(new XeSo(nhienLieu, dongCo, ma, hang, gia));
            
            for (XeSo o : list) {
            o.inThongTin();
        }
            
    }
    
    public void fakeData(ArrayList<XeMay> list){
        list.add(new XeMay("ma 1", "hang 1",2000000));
        list.add(new XeMay("ma 2", "hang 1",1000000));
        list.add(new XeMay("ma 3", "hang 1",4000000));
        list.add(new XeMay("ma 4", "hang 1",5000000));
        list.add(new XeMay("ma 5", "hang 1",6000000));
    }
        
}
