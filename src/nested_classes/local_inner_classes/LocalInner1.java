package nested_classes.local_inner_classes;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(21, 4);
    }
}

class Math{
    //private int a = 10;
    //int delimoe = 21;

    public void getResult(final int delimoe, final int delitel){
        class Delenie{
            //private int delimoe;
            //private int delitel;

            /*public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }*/

            /*public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }*/
            public int getChastnoe(){
                return delimoe/delitel;
            }
            public int getOstatok(){
                //System.out.println(a);
                return delimoe%delitel;
            }
        }
        Delenie delenie = new Delenie();
        //delenie.setDelimoe(delimoe);
        //delenie.setDelitel(4);
        System.out.println("Delimoe= " + delimoe/*delenie.getDelimoe()*/);
        System.out.println("Delitel= " + delitel/*delenie.getDelitel()*/);
        System.out.println("Chastnoe= " + delenie.getChastnoe());
        System.out.println("Ostatoc= " + delenie.getOstatok());
    }
}