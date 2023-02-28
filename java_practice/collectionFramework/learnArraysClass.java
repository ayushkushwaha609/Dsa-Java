import java.util.Arrays;
public class learnArraysClass {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        int index=Arrays.binarySearch(numbers,4);
        System.out.println(("The index of element 4 in the array is"+index));
        
        Arrays.sort(numbers);//sorts with quick sort
        
        Arrays.fill(numbers,13);// fills 13 in every place in array
}
}
