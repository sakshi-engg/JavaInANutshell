import org.w3c.dom.css.Counter;

public class CounterTest {
    public static int count;

    public CounterTest(){
        count++;
    }

    public static void main(String[] args) {
    //     CounterTest o1 = new CounterTest("Count of Objects: "+CounterTest.count);
    //     CounterTest o2 = new CounterTest("Count of Objects: "+o2.count);

        // Runtime r = Runtime.getRuntime();
        // o1 = null;
        // o2 = null;
        // r.gc();
    }

    protected void finalize(){
        System.out.println("Program to terminate");
        CounterTest.count--;
        System.out.println("Number of objects: "+CounterTest.count);
    }

}
