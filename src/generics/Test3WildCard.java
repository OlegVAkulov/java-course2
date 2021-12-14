package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3WildCard {
    public static void main(String[] args){
//        List<Number> list = new ArrayList<Integer>();
//        List<Object> list = new ArrayList<Integer>();
        List<?> list = new ArrayList<Integer>();
//        list.add("hello");

        List<? extends Number> list30 = new ArrayList<Integer>();
        List<? super Number> list31 = new ArrayList<Object>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);
        System.out.println(summ(list1));


        List<String> list2 = new ArrayList<>();
        list2.add("ok");
        list2.add("poka");
        list2.add("privet");
        showListInfo(list2);
        //summ(list2);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.15);
        ald.add(3.16);
        System.out.println(summ(ald));

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(3);
        ali.add(35);
        ali.add(30);
        System.out.println(summ(ali));



    }
    static void showListInfo(List<?> list){
        System.out.println("Moy list soderjit sleduyshie elementy: " + list);
    }

    public static double summ(List<? extends Number> al){
        double summ = 0;
        for (Number n:al){
            summ+=n.doubleValue();
        }
        return summ;
    }

}
