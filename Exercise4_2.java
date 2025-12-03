öğrenci no :250541029
  ad-soyad: şule nur bayğut 
  /**
 * Exercise4_2.java
 * Calisma sirasini gosterir.
 */
public class Exercise4_2 {
    public static void baffle(String blimp) { // 3, 9, 13
        System.out.println(blimp);           // 4, 10, 14
        zippo("ping", -5);                   // 5, 11
    }

    public static void zippo(String quux, int flag) { // 6, 12
        if (flag < 0) {                      // 7, 13
            System.out.println(quux + " zoop"); // 8
        } else {
            System.out.println("ik");
            baffle(quux);
            System.out.println("boo-wa-ha");
        }
    }

    public static void main(String[] args) { // 1
        baffle("woof");                      // 2
        System.out.println("rick");          // 16
    }
}
