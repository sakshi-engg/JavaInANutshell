package Java8_Features;
interface I{
    static void m1(){
        System.out.println("m1-A");
    }

    static void m2(){
        System.out.println("m2-A");
    }

    void swap(int x, int y);
}
/**
 * Test
 */
// class A implements I{

// }
public class Test {
 public static void main(String[] args) {
    I.m1();
    I.m2();

        I i = (int x, int y) -> {
            x = x^y;
            y = x^y;
            x = x^y;
            System.out.println("Swapped Value of \n X: " +x + "\n Y: "+y);
    };
    i.swap(2,30);
 }
    
}

