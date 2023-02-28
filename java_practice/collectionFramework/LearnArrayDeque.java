import java.util.ArrayDeque;
import java.util.Queue;

class LearnArrayDeque{ 
public static void main(String[] args) {
    ArrayDeque<Integer> dq=new ArrayDeque<>();
    dq.offer(23);
    System.out.println(dq);
    dq.offerFirst(12); 
     //adds element to head in contrast to adding from behind
     System.out.println(dq);
    dq.offerLast(26);//adds element from behind
    System.out.println(dq);
    //similarly poll first and poll last works the same way
}  
} 
