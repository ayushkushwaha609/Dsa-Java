import java.util.ArrayList;
import java.util.List;



public class LearnArrayList {
    public static void main(String[] args) {
        // ArrayList<String> studentName = new ArrayList<>();
        
        // studentName.add("rakesh");

        List<Integer> list=new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // System.out.println(list);
        // list.add(4);
        // System.out.println(list);
        
        // list.add(1,50); //adds element in between list
        
        // List<Integer> nyiList = new ArrayList<>();// creating a new list to insert in existing list at any index
        // nyiList.add(150);
        // nyiList.add(160);

        // list.addAll(2,nyiList);//This will add the new list at desired position
        // System.out.println(list);
        // System.out.println(list.get(1));

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        
        System.out.println(list);

        list.remove(1);//this will remove the element at index 1
        System.out.println(list);

        list.remove(Integer.valueOf(30));//this will search and remove the value 30 from the arraylist
        System.out.println(list);


        // list.clear();//clears the whole list
        // System.out.println(list);

        list.set(2,1000);
        System.out.println(list);

        System.out.println(list.contains(500));




        //for traversing the elements one by one


        for(int i=0;i<list.size();i++){
            System.out.println("the element is "+list.get(i));
        }



        // Iterator<Integer>it= list.iterator();

        // while(it.hasNext()){
        //     System.out.println("iterator+" +it.next);
        // }










    }
}

