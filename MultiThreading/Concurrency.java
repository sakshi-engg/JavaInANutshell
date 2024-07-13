package MultiThreading;
import java.lang.Thread;

 class thread implements Runnable{
        public void run(){
            for(int i=0; i<3; i++){
                System.out.println(i);
            }
        }
}

class Thread1 extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(i);
            System.out.println(Thread.currentThread());

            try{
                Thread.sleep(2000);
            } catch(InterruptedException e){
            e.printStackTrace(); 
           }
        }
    }

    // Thread1 tobj = new Thread1();
// tobj.start();
// Thread tmain = new Thread();
// System.out.println(Thread.getName());
}


public class Concurrency {
    
    public static void main(String[] args) {

// 	thread t1 = new thread();
// 	thread t2 = new thread();
//     thread t3 = new thread();

//     t1.start();
// t2.start();   
// t3.start();
// t2.start();

Thread1 tobj = new Thread1();
tobj.start();
Thread tmain = new Thread();
System.out.println(tmain.currentThread());
System.out.println(tmain.getName());
    }
}
