
package drivesystem;
 

public class Ride {
 
private String yolcuAdi;
private String kalkisNoktasi;
private String varisNoktasi;
private double mesafeKm;
private int sureDakika;
private double kmBasiUcret;   

    public Ride(String yolcuAdi, String kalkisNoktasi, String varisNoktasi, double mesafeKm, int sureDakika, double kmBasiUcret) {
        this.yolcuAdi = yolcuAdi;
        this.kalkisNoktasi = kalkisNoktasi;
        this.varisNoktasi = varisNoktasi;

        if (mesafeKm <= 0) {
            System.out.println("Uyarı: Mesafe (km) pozitif olmalıdır! Varsayılan olarak 1.0 atandı.");
            this.mesafeKm = 1.0;
        } else {
            this.mesafeKm = mesafeKm;
        }

        if (sureDakika <= 0) {
            System.out.println("Uyarı: Süre (dakika) pozitif olmalıdır! Varsayılan olarak 1 atandı.");
            this.sureDakika = 1;
        } else {
            this.sureDakika = sureDakika;
        }

        if (kmBasiUcret <= 0) {
            System.out.println("Uyarı: Km başı ücret pozitif olmalıdır! Varsayılan olarak 1.0 atandı.");
            this.kmBasiUcret = 1.0;
        } else {
            this.kmBasiUcret = kmBasiUcret;
        }
    }
    

    public String getYolcuAdi() {
        return yolcuAdi;
    }

    public String getKalkisNoktasi() {
        return kalkisNoktasi;
    }

    public String getVarisNoktasi() {
        return varisNoktasi;
    }

    public double getMesafeKm() {
        return mesafeKm;
    }

    public int getSureDakika() {
        return sureDakika;
    }

    public double getKmBasiUcret() {
        return kmBasiUcret;
    }
    
    public double ucretHesapla() {
        return mesafeKm * kmBasiUcret;
    }
    
    @Override
    public String toString() {
        return "Yolcu: " + yolcuAdi
                + " | Güzergah: " + kalkisNoktasi + " -> " + varisNoktasi
                + " | Mesafe: " + mesafeKm + " km"
                + " | Süre: " + sureDakika + " dk"
                + " | Km Ücreti: " + kmBasiUcret + " TL";
    }
    
    
}
