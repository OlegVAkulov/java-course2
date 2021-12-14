package generics;

public class ParameterizedClass {
    public static void main(String[] args){
        /*Info<String> info1 = new Info<>("privet");
        System.out.println(info1);
        String s = info1.getValue();
        System.out.println(s);*/

        Info<Integer> info2 = new Info<>(18);
        System.out.println(info2);
        Integer i1 = info2.getValue();
        System.out.println(i1);

        Info<Double> info21 = new Info<>(3.14);
        System.out.println(info21);
        Double d = info21.getValue();
        System.out.println(d);

        /*Info<Bus> info3 = new Info<>(new Bus());
        System.out.println(info3);
        Bus b = info3.getValue();
        System.out.println(b);*/
    }
   /* public void abc(Info<String> info){
        String s = info.getValue();
    }

    public void abc(Info<Integer> info){
        Integer i = info.getValue();
    }
        // abc(Info info)*/
}
class Info<T /*extends Number&I1&I2*/>{
    private T value;
    public Info(T value){
        this.value = value;
    }
    public String toString(){
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}
interface I1{}
interface I2{}
/*class Parent{
    public void abc(Info<String> info){
        String s = info.getValue();
    }
}

class Child extends Parent{
    public void abc(Info<Integer> info){
        Integer i = info.getValue();

}*/

class Bus{}