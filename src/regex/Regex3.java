package regex;

import java.util.Arrays;

public class Regex3 {
    public static void main(String[] args) {
        String  s = "Oleg Akulov, Russia, Lipetsk, Uritskogo street, 51, Flat 48,"+
                "email: akulov.oleg@mail.ru, Postcode: AA02, Phone number: +799999999;"+
                "Petr Ivanov, Ukraine, New village, Vesennya street, 61, Flat 51,"+
                "email: petr_Ivanov@mail.ua, Postcode: ZZ03, Phone number: +388888888;"+
                "Chuck Norris, USA, Hollywood, Stars street, 87, Flat 21,"+
                "email: chuckNorris@gmail.com, Postcode: USA23, Phone number: +123456789;";
        String s2 = "chuckNorris@gmail.com";
        boolean result = s2.matches("\\w+@\\w+\\.(com|ru)");
        System.out.println(result);
        String[] array = s.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
