package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args)

    {

        List<String> list = new ArrayList<>();
        list.add("ptivet");
        list.add("poka");
        list.add("OK");
        list.add("afdkfs");


        for (Object o : list) {
            System.out.println(o + " dlina: " + ((String)o).length());



        }

    }
}

