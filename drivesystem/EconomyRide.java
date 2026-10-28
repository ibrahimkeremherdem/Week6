
package drivesystem;


public class EconomyRide extends Ride{
    
private double dakikaBasiUcret;    
    
    
   public EconomyRide(String yolcuAdi, String kalkisNoktasi, String varisNoktasi, double mesafeKm, int sureDakika, double kmBasiUcret, double dakikaBasiUcret) {
        super(yolcuAdi, kalkisNoktasi, varisNoktasi, mesafeKm, sureDakika, kmBasiUcret);
        if (dakikaBasiUcret <= 0) {
            System.out.println("Uyarı: Dakika başı ücret pozitif olmalıdır! Varsayılan olarak 1.0 atandı.");
            this.dakikaBasiUcret = 1.0;
        } else {
            this.dakikaBasiUcret = dakikaBasiUcret;
        }
    } 

    public double getDakikaBasiUcret() {
        return dakikaBasiUcret;
    }
   
 @Override
    public double ucretHesapla() {
        double toplamUcret = super.ucretHesapla() + (getSureDakika() * dakikaBasiUcret);
        return Math.max(toplamUcret, 50.0);
    }

    @Override
    public String toString() {
        return super.toString() + " | Dakika Başı Ücret: " + dakikaBasiUcret + " TL";
    }  
   
   
   
   
}

   

