package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LiistIteratorExample {
    public static void main(String[] args) {
        String s = "arozaupalanalapuazora";
        List<Character> list = new LinkedList<>();
        for (char ch:s.toCharArray()){
            list.add(ch);
        }
        //System.out.println(list);
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reversIterator = list.listIterator(list.size());
        boolean isPalidrom = true;
        while(iterator.hasNext() && reversIterator.hasPrevious()){
            if (iterator.next() != reversIterator.previous()){
                isPalidrom = false;
                break;
            }
        }
        if (isPalidrom){
            System.out.println(s + "-Palindrome");
        }
        else {System.out.println(s + "-NOT Palindrome");}
    }
}
