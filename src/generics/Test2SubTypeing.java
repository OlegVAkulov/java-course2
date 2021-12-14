package generics;

import java.util.ArrayList;
import java.util.List;

public class Test2SubTypeing {
    public static void main(String[] args){
        X x = new Y();
        List<X> list1 = new ArrayList<X>();
        //List<Number> list = new ArrayList<Integer>();
        List<Number> list = new ArrayList<>();

    }
}


class X{}
class Y extends X{}