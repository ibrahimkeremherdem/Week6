
package drivesystem;


public class SharedRide extends EconomyRide {
 
private int yolcuSayisi;   
  
    public SharedRide(String yolcuAdi, String kalkisNoktasi, String varisNoktasi, double mesafeKm, int sureDakika, double kmBasiUcret, double dakikaBasiUcret, int yolcuSayisi) {
        super(yolcuAdi, kalkisNoktasi, varisNoktasi, mesafeKm, sureDakika, kmBasiUcret, dakikaBasiUcret);
        if (yolcuSayisi < 1 || yolcuSayisi > 4) {
            System.out.println("Uyarı: Yolcu sayısı 1 ile 4 arasında olmalıdır! Varsayılan olarak 1 atandı.");
            this.yolcuSayisi = 1;
        } else {
            this.yolcuSayisi = yolcuSayisi;
        }
    }

    public int getYolcuSayisi() {
        return yolcuSayisi;
    }
    
    @Override
    public double ucretHesapla() {
        double ekonomiToplamUcreti = super.ucretHesapla();
        double kisiBasiPay = ekonomiToplamUcreti / yolcuSayisi;
        return kisiBasiPay * 1.10; 
    }   
    @Override
    public String toString() {
        return super.toString() + " | Yolcu Sayısı: " + yolcuSayisi;
    }
    
    
}
