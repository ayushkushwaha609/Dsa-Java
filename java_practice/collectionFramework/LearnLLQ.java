import java.util.Queue;
import java.util.LinkedList;

public class LearnLLQ {

    public static void main(String[] args) {
        
        Queue<Integer> queue=new LinkedList<>();
       queue.offer(12);//inserts the specified element into the queue, returns true if successful else false
       queue.offer(24);
       queue.offer(36);

       System.out.println(queue);

    //    System.out.println(queue.add(3));//adds the specified element, throws an exception if the not successfull

    

    System.out.println(queue.peek());//returns null if the queue is empty
    // System.out.println(queue.element());//throws an exception if the queue is empty
    // System.out.println(queue.remove());//returns and removes the head of the queue, trows an exception if the queue is empty
    System.out.println(queue.poll());//retuns and removes the head of the queue. returns null is empty



    }
    
}
