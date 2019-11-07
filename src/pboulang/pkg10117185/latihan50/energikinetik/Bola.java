/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan50.energikinetik;

/**
 *
 * @author user
 */
public class Bola {
    //Atribute  
     double massa, kecepatan, speedAwal, speedAkhir;

    //Function

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getSpeedAwal() {
        return speedAwal;
    }

    public void setSpeedAwal(double speedAwal) {
        this.speedAwal = speedAwal;
    }

    public double getSpeedAkhir() {
        return speedAkhir;
    }

    public void setSpeedAkhir(double speedAkhir) {
        this.speedAkhir = speedAkhir;
    }
    
    double hitungKinetik(double massa, double kecepatan){
        return 0.5*massa*kecepatan*kecepatan;
    }
    double hitungUsaha(double speedAwal, double speedAkhir){
        double energiAwal, energiAkhir, hasil;
            energiAwal = 0.5 * massa * speedAwal * speedAwal;
            energiAkhir = 0.5 * massa * speedAkhir * speedAkhir;
                hasil = energiAwal - energiAkhir;
                    return hasil;
    }
    
}
