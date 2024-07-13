package Java8_Features;

public class LambdaWithThread {
    public static void main(String[] args) {
        Runnable t1 = () -> {System.out.println("Creating thread using lambda expression");};
        Thread t2 = new Thread(t1);
        t2.start();

        Runnable tt2 = () -> {System.out.println("Creating another thread");};
        Thread tr2 = new Thread(tt2);
       tr2.start();
    }
}
