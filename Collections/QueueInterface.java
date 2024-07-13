import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueInterface {

    public static void queueInterface(){
        Queue <Integer> q = new LinkedList();
        q.offer(1); //add element to queue
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println("'offer()' method adds the element to the queue "+q);

        q.poll(); //remove element from queue
        System.out.println(q);
        System.out.println("'poll()' method removes the first element from the queue "+q);

        System.out.println(q.element());        
    }

    public static void dequeClass(){
        Deque <Integer> d = new LinkedBlockingDeque<>();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.add(5);

        for(int i: d){
            System.err.println(i);
        }

        System.out.println("*************************");
        d.addFirst(0);
        System.err.println(d);
        System.out.println(d.removeLast());
    }

    public static void main(String args[]){
        // queueInterface();
        dequeClass();
    }
}
