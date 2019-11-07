/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan50.energikinetik;
import java.text.DecimalFormat;
/**
 *
 * @author user
 */
public class PBOUlang10117185Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Bola masuk = new Bola();
    DecimalFormat dapat = new DecimalFormat("#.#");
        masuk.setMassa(0.145);
        masuk.setKecepatan(25);
        masuk.setSpeedAwal(0);
        masuk.setSpeedAkhir(25);

    System.out.println("Diketahui :");
        System.out.println("Massa     : 145 g");
        System.out.println("Kecepatan : 25 m/s");
    
    System.out.println("\nDitanya   :");
        System.out.println("T : ?");
        System.out.println("W  : ?");
        
    System.out.println("\nJawab     :");
        System.out.println("a. Energi Kinetik : " + dapat.format(masuk.hitungKinetik
        (masuk.getMassa(), masuk.getKecepatan())));
        System.out.println("b. Usaha          : " + dapat.format (masuk.hitungUsaha
        (masuk.getSpeedAwal(),masuk.getSpeedAkhir())));
    }
    
}
