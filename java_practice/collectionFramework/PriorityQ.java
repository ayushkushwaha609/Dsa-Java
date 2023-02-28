import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQ {
    
public static void main(String[] args) {
   Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());//doing this will convert min heap to max heap. previously  it would return the minimum
   pq.offer(12);
   pq.offer(24); 
   pq.offer(36);
   
   System.out.println(pq);

   pq.poll();
   System.out.println(pq);

   System.out.println(pq.peek());

  //to set the priority you can add comparator in the priority queue in line 6
}

}
