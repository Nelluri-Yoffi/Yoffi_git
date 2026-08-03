interface A{
    default void test(){
        System.out.println("Just a test method from A");
    }
}
interface B extends A{
    default void test(){
    System.out.println("Just a test method from B");
    }
}
interface C extends A{
    default void test(){
    System.out.println("Just a test method from C ");
    }
}
public class DiamondProblem implements B,C{
    public static void main(String[] args) {
        DiamondProblem obj= new DiamondProblem();
        obj.test();
    }
    @Override
    public void test() {
        C.super.test();
    }

}