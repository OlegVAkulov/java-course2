package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Oleg");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");

        List<Integer> list1 = List.of(3, 8, 13);//static
        System.out.println(list1);
        //list1.add(100);//Exception

        List<String> list2 = List.copyOf(arrayList1);//static
        System.out.println(list2);



        /*System.out.println("ArrayList= "+arrayList1);
        Object[] array = arrayList1.toArray();
        String [] array2 = arrayList1.toArray(String[]::new);
        for (String s:array2){
            System.out.println(s);
        }*/

        /*List<String> myList = arrayList1.subList(1,4);
        System.out.println("SubList= "+myList);
        myList.add("Fedor");
        System.out.println("SubList= "+myList);
        System.out.println("ArrayList= "+arrayList1);
        arrayList1.add(2, "Semen");

        System.out.println("ArrayList= "+arrayList1);*/
        //System.out.println("SubList= "+myList);

        /*ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ivan");
        arrayList2.add("Mariya");
        //arrayList2.add("Igor");
        System.out.println(arrayList2);

        //arrayList1.removeAll(arrayList2);
        //arrayList1.retainAll(arrayList2);
        //System.out.println(arrayList1);
        boolean result = arrayList1.containsAll(arrayList2);
        System.out.println(result);*/


    }
}
