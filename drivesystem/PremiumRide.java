
package drivesystem;


public class PremiumRide extends Ride {

private double konforUcreti;
private double yogunlukCarpani; 

    public PremiumRide(String yolcuAdi, String kalkisNoktasi, String varisNoktasi, double mesafeKm, int sureDakika, double kmBasiUcret, double konforUcreti, double yogunlukCupani) {
        super(yolcuAdi, kalkisNoktasi, varisNoktasi, mesafeKm, sureDakika, kmBasiUcret);
        this.konforUcreti = Math.max(0, konforUcreti);

        if (yogunlukCupani < 1.0 || yogunlukCupani > 3.0) {
            System.out.println("Uyarı: Yoğunluk çarpanı 1.0 ile 3.0 arasında olmalıdır! Varsayılan olarak 1.0 atandı.");
            this.yogunlukCarpani = 1.0;
        } else {
            this.yogunlukCarpani = yogunlukCupani;
        }
    }

    public double getKonforUcreti() {
        return konforUcreti;
    }

    public double getYogunlukCarpani() {
        return yogunlukCarpani;
    }
    @Override
    public double ucretHesapla() {
        return (super.ucretHesapla() + konforUcreti) * yogunlukCarpani;
    }  
    @Override
    public String toString() {
        return super.toString() + " | Konfor Ücreti: " + konforUcreti + " TL | Yoğunluk Çarpanı: " + yogunlukCarpani;
    } 
    
    
    
    
    
}
