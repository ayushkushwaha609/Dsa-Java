import java.util.Map;
import java.util.HashMap;
public class LearnHashMap {
    public static void main(String[] args) {
        //creating the hashmap and entering the value
        Map<String, Integer> numbers= new HashMap<>();
         numbers.put("one",1);
         numbers.put("two",2);
         numbers.put("three",3);
         numbers.put("four",4);

         //value can be same but key key must be unique, otherwise overriding will occur
        //to avoid this you can use below methods

         if(!numbers.containsKey("two"))
         {
            numbers.put("two",23);
            System.out.println("numbers");

         }

         //or 
         numbers.putIfAbsent("two", 23);
         System.out.println(numbers);

         //get the value by iteration
         for(Map.Entry<String,Integer> e:numbers.entrySet()){
           System.out.println(e);

           System.out.println(e.getKey());
           System.out.println(e.getValue());

           //to get only the keys
           for(String key:numbers.keySet()){
            System.out.println(key);
           }
           //to get only the value items
           for(Integer value: numbers.values()){
            System.out.println(value);
            
          //to check if certain value is present in the hashmap or not
            System.out.println(numbers.containsValue(3));

          //to check if the map is empty
          System.out.println(numbers.isEmpty());
           }
         }
    }
// time complexity = O(n)

  }


