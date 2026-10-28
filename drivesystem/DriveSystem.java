
package drivesystem;
import java.util.*;

public class DriveSystem {

    
    public static void main(String[] args) {
     
    ArrayList<Ride> yolculukListesi = new ArrayList<>();    
      
        yolculukListesi.add(new Ride("Ahmet Yılmaz", "Kadıköy", "Beşiktaş", 12.5, 30, 15.0));
        yolculukListesi.add(new EconomyRide("Ayşe Kaya", "Üsküdar", "Ümraniye", 8.0, 20, 15.0, 2.5));
        yolculukListesi.add(new PremiumRide("Mehmet Demir", "Havalimanı", "Taksim", 40.0, 50, 25.0, 100.0, 1.5));
        yolculukListesi.add(new SharedRide("Zeynep Çelik", "Levent", "Sarıyer", 15.0, 25, 15.0, 2.0, 3));
    
        System.out.println("=== YOLCULUK DETAYLARI VE ÜCRETLERİ ===\n");
        for (Ride y : yolculukListesi) {
            System.out.println(y.toString());
            System.out.printf("Hesaplanan Toplam Tutar: %.2f TL\n", y.ucretHesapla());
            System.out.println("--------------------------------------------------------------------------------");
        }
    
    }
    
}
