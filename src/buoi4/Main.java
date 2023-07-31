/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi4;

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
           ArrayList<DongVat> listDongVat = new ArrayList<>();
             ArrayList<Meo> listMeo = new ArrayList<>();
           new QlDongVat().fakeData(listDongVat);
          do {              
              System.out.println("1.nhap tt dong vat");
              System.out.println("2.in tt");
              System.out.println("3.tim dong vat co ten bat dau la chu t");
              System.out.println("4.nhap tt meo ");
              System.out.print("moi ban nhap chuc nang: ");
              chucNang = Integer.valueOf(sc.nextLine());
              
              switch (chucNang) {
                  case 1:
                      new QlDongVat().nhapTT(listDongVat);
                      break;
                      case 2:
                      new QlDongVat().inTT(listDongVat);
                      break;
                      case 3:
                      new QlDongVat().search(listDongVat);
                      break;
                      case 4:
                       new QlDongVat().nhapTTMeo(listMeo);
                      break;
                  default:
                      System.out.println("chuc khong ton tai");
              }
          } while (chucNang != 0);
    }
}
