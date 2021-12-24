package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("ABC");

//        String s1 = "OPABMNCD";
//        Pattern pattern1 = Pattern.compile("[ABC]");

//        String s1 = "ABCOPABDOP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[e-g4-7]");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc(e|5)");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc.");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("^abc");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("6abch$");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\d");
//        System.out.println("abc  \"  efg");
//        System.out.println("abc  \\  efg");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\D");

//        String s1 = "abcd ab_ce abc5abc_g6abch";
//        Pattern pattern1 = Pattern.compile("\\w");

//        String s1 = "abcd &ab_ce abc,5ab.%^&c_g6a!bc==h";
//        Pattern pattern1 = Pattern.compile("\\W+");

//        String s1 = "abcd ab_ce abc,5ab.c_g6abch";
//        Pattern pattern1 = Pattern.compile("\\w+");

//        String s1 = "poka abc Oleg dom kino potroshitel";
//        Pattern pattern1 = Pattern.compile("\\w{4}");

//        String s1 = "po_ka abc   Oleg do_m ki no potr shi tel";
//        Pattern pattern1 = Pattern.compile("\\w\\s+\\w");

//        String s1 = "po_ka abc   Oleg do_m ki no potr shi tel";
//        Pattern pattern1 = Pattern.compile("\\w\\S\\w");

//        String s1 = "abcd abce3 abcfa78abcg6a!!!!!!!!!!!!!!!!!!!!!69g";
//        Pattern pattern1 = Pattern.compile("\\D{2,6}");

//        String s1 = "abcd abce3 abcfa78abcg6a!!!!!!!!!!!!!!!!!!!!!69g";
//        Pattern pattern1 = Pattern.compile("\\D{2,}");

//        String s1 = "ABCABAABBDA";
//        Pattern pattern1 = Pattern.compile("AB{2,3}");

//        String s1 = "ABCABABBDA";
//        Pattern pattern1 = Pattern.compile("(AB){2,3}");

//        String s1 = "DABCDABDABABBDABDABABABABBB";
//        Pattern pattern1 = Pattern.compile("D(AB){2,}");

//        String s1 = "DABCDABDABABBDABDABABABABBDDB";
//        Pattern pattern1 = Pattern.compile("D(AB)?");

//        String s1 = "DACDABDABABBDABDABABABABBDDB";
//        Pattern pattern1 = Pattern.compile("D(AB)*");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\Aabcd");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("ch\\Z");

        String s1 = "abcd abce abc5abcg6abch";
        Pattern pattern1 = Pattern.compile("[abcd][efgh3-8]");



        Matcher matcher = pattern1.matcher(s1);

        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + " " + matcher.group());
        }
    }
}
