package MultiThreading;
 class ThreadRunnable implements Runnable{
    public void run(){
        for(int i = 0; i<2; i++)
        System.out.println(i);
    }
 }
public class RunnableExample {
    public static void main(String[] args) {
        ThreadRunnable tr = new ThreadRunnable();
        Thread t = new Thread(tr);
        t.start();
    }
}
