öğrenci no: 250541029
    ad soyad:şule nur bayğut
    /**
 * Exercise4_4.java
 * Derleyici deneyleri.
 */
public class Exercise4_4 {

    // Bir deger donduren ornek metot
    public static int dondurenMetot() {
        return 42;
    }

    // Bir deger dondurmeyen (void) ornek metot
    public static void voidMetot() {
        System.out.println("boo!");
    }

    public static void main(String[] args) {
        // 1. Bir değer döndüren metodu çağırıp sonucunu kullanmazsanız ne olur?
        // Cevap: Hiçbir şey olmaz. Derleyici bir hata vermez. Metot calisir, degeri hesaplar
        // ancak bu deger atanmadigi veya bir ifadede kullanilmadigi icin görmezden gelinir.
        // Bu durum, örnegin System.out.println'a deger yollarken bir metodu cagirirsaniz
        // ve degeri bastirmadan sadece metodu cagirirsaniz da gecerlidir (sonucu kullanilmadigi surece).
        dondurenMetot(); // Metot calisir ancak dondurdugu 42 degeri atil (discarded) olur.

        // System.out.println("Test: " + dondurenMetot()); // Bu sekilde kullanilirsa: Test: 42

        // 2. Bir void metodu bir ifadenin içinde kullanırsanız (ör: System.out.println("boo!") + 7) ne olur?
        // Cevap: Derleme hatasi (Compile-time Error) olusur.
        // void metotlar bir deger dondurmez, dolayisiyla bir ifade icinde
        // (örnegin String birlestirme, matematiksel islem veya degisken atama)
        // bir degerin beklendigi yerde kullanilamazlar.

        // Hata ornegi (Yorum satirindan cikartilirsa derleme hatasi verir):
        // int x = voidMetot() + 7;
        // String s = "Sonuc: " + voidMetot();

        // System.out.println("Sonuc: " + voidMetot()); // Hata: 'void' cannot be converted to 'java.lang.String'

        System.out.println("Deney tamamlandi.");
    }
}
