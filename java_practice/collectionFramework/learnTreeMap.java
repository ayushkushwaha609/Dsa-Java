import java.util.Map;
import java.util.TreeMap;

//time complexity= O(logn)
    //the main difference between a treemap and hashmap is that in hashmap order of elements is
    //not guarenteed while in treemap the elements will be printed in alphabetical order
    // both treemap and hashmap, elements are stored in tree nodes
    // in treemap the elements are stroed in red-black tree.

public class learnTreeMap {
    public static void main(String[] args) {
        //creating the hashmap and entering the value
        Map<String, Integer> numbers= new TreeMap<>(); 
        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",3);
        numbers.put("four",4);
        System.out.println(numbers);
        numbers.remove("one");
        System.out.println(numbers);
    }
}
    

     
     