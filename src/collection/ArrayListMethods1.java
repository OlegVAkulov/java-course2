package Collection;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Oleg");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add(1, "Misha");
        for (String s:arrayList1){
            System.out.print(s + " ");
        }
        System.out.println();
        /*ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(6);
        System.out.println(arrayList1.get(2));
        for (int i=0; i<arrayList1.size();i++){
            System.out.println(arrayList1.get(i));
        }*/
        arrayList1.set(1, "Masha");
        System.out.println(arrayList1);
        arrayList1.remove(0);
        System.out.println(arrayList1);



    }
}