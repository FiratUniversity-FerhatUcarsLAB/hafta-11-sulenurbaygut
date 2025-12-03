öğrenci no : 250541029
    ad-soyad: şule nur bayğut
    /**
 * Exercise4_3.java
 * Stack diyagrami ve cikti analizi.
 */
public class Exercise4_3 {
    public static void ping(String bob) {
        System.out.println(bob);
        baffle("pong");
    }

    public static void baffle(String blimp) {
        System.out.println(blimp);
        zippo("ping", -5);
    }

    public static void zippo(String quux, int flag) {
        if (flag < 0) {
            System.out.println(quux + " zoop");
        }
    }

    public static void main(String[] args) {
        String alice = "hello";
        ping(alice);
    }
}
