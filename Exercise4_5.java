öğrenci no : 250541029
    ad-soyad:şule nur bayğut
    /**
 * Exercise4_5.java
 * Akis ve Stack Diyagrami.
 */
public class Exercise4_5 {
    public static void zoop() {
        baffle();
        System.out.print("You won't get a zoop!");
    }

    public static void baffle() {
        System.out.print("No ");
        zoop();
    }

    public static void main(String[] args) {
        System.out.print("Ready ");
        zoop();
        System.out.println(" Go!");
    }
}
