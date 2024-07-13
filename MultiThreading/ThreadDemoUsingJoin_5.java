package MultiThreading;

class MyThread1 extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
public class ThreadDemoUsingJoin_5 {
    public static void main(String[] args) throws InterruptedException{
        MyThread1 obj = new MyThread1();
        obj.start();
        obj.join(); //current thread will sleep & allow another thread 
        for(int i=0; i<3; i++){
            System.out.println("Executing another thread in between");
            System.out.println(i);
        }
    }
}
