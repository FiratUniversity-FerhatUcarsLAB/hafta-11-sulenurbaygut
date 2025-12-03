öğrenci no :250541029
    ad-soyad:şule nur bayğut
    /**
 * Multadd.java
 * multadd ve expSum metotlarini icerir.
 */
public class Multadd {

    /**
     * Uclu islem: a * b + c sonucunu dondurur.
     */
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    /**
     * Matematiksel ifadeyi hesaplar: x * Math.exp(-x) + (1 - Math.exp(-x))
     */
    public static double expSum(double x) {
        double a = x;
        double b = Math.exp(-x);
        double c = 1.0;
        
        // Formül: x * e^(-x) + (1 - e^(-x))
        // Bunu multadd(a, b, c) kullanarak hesaplayabiliriz:
        // a = x
        // b = Math.exp(-x)
        // c = 1.0 - Math.exp(-x)
        
        // Ancak daha temiz bir yol:
        // x * Math.exp(-x) + 1.0 - Math.exp(-x)
        
        // Ya da multadd'i kullanarak:
        double term1 = multadd(x, Math.exp(-x), 0.0); // x * e^(-x)
        double term2 = multadd(-1.0, Math.exp(-x), 1.0); // 1 - e^(-x)
        
        return term1 + term2; 
        
        // VEYA direkt formül:
        // return x * Math.exp(-x) + (1.0 - Math.exp(-x));
    }

    public static void main(String[] args) {
        // 
        System.out.println("--- Exercise 4.6 Testleri ---");

        // 1. multadd(1.0, 2.0, 3.0)
        double sonuc1 = multadd(1.0, 2.0, 3.0);
        System.out.println("1 * 2 + 3 = " + sonuc1); // Cikti: 5.0

        // 2. sin(pi/4) + cos(pi/4) / 2
        double a2 = Math.sin(Math.PI / 4.0);
        double b2 = 1.0; // multadd'in b'si yerine bolme islemi var.
        double c2 = Math.cos(Math.PI / 4.0) / 2.0;

        // multadd(sin(pi/4), 1.0, cos(pi/4) / 2.0)
        double sonuc2 = multadd(a2, b2, c2); 
        System.out.println("sin(pi/4) + cos(pi/4) / 2 = " + sonuc2); 
        // Yaklasik Cikti: 0.7071067811865476 + 0.3535533905932738 = 1.0606601717798214

        // 3. log(10) + log(20)
        // Math.log() dogal logaritmayi (ln) kullanir.
        double a3 = Math.log(10.0);
        double b3 = 1.0;
        double c3 = Math.log(20.0);
        
        // multadd(log(10), 1.0, log(20))
        double sonuc3 = multadd(a3, b3, c3);
        System.out.println("log(10) + log(20) = " + sonuc3); 
        // Yaklasik Cikti: 2.302585 + 2.995732 = 5.298317

        // 4. expSum(3.0) testi
        double x_test = 3.0;
        double sonucExp = expSum(x_test);
        System.out.println("expSum(" + x_test + ") = " + sonucExp); 
        // Cikti: 3 * e^(-3) + (1 - e^(-3)) = 3 * 0.049787 + (1 - 0.049787)
        // Yaklasik Cikti: 0.149361 + 0.950213 = 1.099574
    }
}
