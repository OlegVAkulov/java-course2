package Collection.set_interface;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(1);
        hashSet1.add(8);
        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(5);
        hashSet2.add(4);
        hashSet2.add(7);
        hashSet2.add(3);
        hashSet2.add(8);

        HashSet<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println(union);

        HashSet<Integer> intersrct = new HashSet<>(hashSet1);
        intersrct.retainAll(hashSet2);
        System.out.println(intersrct);

        HashSet<Integer> intersrc1 = new HashSet<>(hashSet1);
        intersrc1.removeAll(hashSet2);
        System.out.println(intersrc1);


    }
}
