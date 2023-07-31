/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi4;

/**
 *
 * @author asus_vinh
 */
public class Meo  extends DongVat{
    private String tiengKeu;

    public Meo(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    public Meo(String tiengKeu, String ma, String ten, int gioiTinh, int canNang) {
        super(ma, ten, gioiTinh, canNang);
        this.tiengKeu = tiengKeu;
    }

    public Meo() {
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("tieng keu: "+tiengKeu);
    }
    
    
}
