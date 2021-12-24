package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String  s = "Oleg Akulov, Russia, Lipetsk, Uritskogo street, 51, Flat 48,"+
                "email: akulov.oleg@mail.ru, Postcode: AA02, Phone number: +799999999;"+
        "Petr Ivanov, Ukraine, New village, Vesennya street, 61, Flat 51,"+
                "email: petr_Ivanov@mail.ua, Postcode: ZZ03, Phone number: +388888888;"+
        "Chuck Norris, USA, Hollywood, Stars street, 87, Flat 21,"+
                "email: chuckNorris@gmail.com, Postcode: USA23, Phone number: +123456789;";
//        Pattern pattern1 = Pattern.compile("\\w+");

//        Pattern pattern1 = Pattern.compile("\\b\\d{2}\\b");

//        Pattern pattern1 = Pattern.compile("\\+\\d{9}");

        Pattern pattern1 = Pattern.compile("\\w+\\S\\w+@\\w+\\.\\w+");  //(ru|com)

        Matcher matcher = pattern1.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }

}
