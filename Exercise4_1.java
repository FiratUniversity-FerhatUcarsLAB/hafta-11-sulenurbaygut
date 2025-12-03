öğrenci no: 250541029
    ad-soyad: şule nur bayğut
    /**
 * Exercise4_1.java
 * Tarih yazdırma metotlarını icerir.
 */
public class Exercise4_1 {

    // Amerika formatinda tarihi yazdirir: Pazar, Ocak 1, 2025
    public static void printAmerican(String day, int date, String month, int year) {
        // 
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    // Avrupa formatinda tarihi yazdirir: Pazar 1 Ocak 2025
    public static void printEuropean(String day, int date, String month, int year) {
        // 
        System.out.println(day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {
        // Ornek veriler
        String gun = "Pazartesi";
        int ayinGunu = 3;
        String ay = "Aralik";
        int yil = 2025;

        System.out.println("--- Tarih Yazdirma Testi ---");
        
        // Amerika formatini test etme
        System.out.print("Amerika Formati: ");
        printAmerican(gun, ayinGunu, ay, yil);

        // Avrupa formatini test etme
        System.out.print("Avrupa Formati: ");
        printEuropean(gun, ayinGunu, ay, yil);
    }
}
