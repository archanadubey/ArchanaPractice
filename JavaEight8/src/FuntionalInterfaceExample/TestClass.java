package FuntionalInterfaceExample;

//@FunctionalInterface
interface FunctionalInterfaceDemo {

    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
        //System.out.println("Square of the formula" + sqr);


    }

}
public class TestClass {
    public static void main(String[] args) {


        FunctionalInterfaceDemo fi = new FunctionalInterfaceDemo() {

            @Override
            public double calculate(int a) {
                return a * a;
            }
//           @Override
//            public double sqrt(int a){
//                return
//
//           }


        };


        System.out.println( fi.calculate((int) 10));
        System.out.println( fi.sqrt(16));

    }
}