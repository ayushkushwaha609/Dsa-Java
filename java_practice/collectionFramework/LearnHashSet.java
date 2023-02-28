import java.util.HashSet;
import java.util.Set;
public class LearnHashSet {
    public static void main(String[] args) {
        Set<Integer> set =new HashSet<>();// all operstions happen in o(n)
        // in sets repetition is not allowed 

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        

       System.out.println(set);
       set.remove(54);

       System.out.println(set);
       System.out.println(set.contains(21));//check if the set contains the particular elemnet or not
       System.out.println(set.isEmpty());//returns true is the set is empty and false if full
       System.out.println(set.size());//returns the size of set
       set.clear();
       System.out.println(set);
//similarly treeset can be used to store and print element in sorted form
//while sets store value in random order
//treeset is implemented in binary tree, all operation take place in log n timecomplexity
    }
}
