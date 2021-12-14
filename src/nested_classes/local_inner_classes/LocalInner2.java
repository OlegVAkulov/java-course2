package nested_classes.local_inner_classes;

public class LocalInner2 {
    public static void main(String[] args) {
        class Summa implements Math2{
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }
        Summa s = new Summa();
        System.out.println(s.doOperation(5,3));
    }
}


interface Math2{
    int doOperation(int a, int b);

    }
