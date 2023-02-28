import java.util.Arrays;
public class selectionSort {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[]arr={3,1,5,4,2};
        
        System.out.println(Arrays.toString(arr));
        selection(arr);
        System.out.println(Arrays.toString(arr));
    
    }

    static void selection(int[]arr){
        for(int i=0;i<arr.length;i++){
            //find thr maximum item in the remaining array and swap with correct index
            int last=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
 
            swap(arr,maxIndex,last);
        }
    }
    //funtion to get the max element in every iteration
    public static int getMaxIndex(int[] arr, int start, int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
        
    }
    //function to swap the max element with the last index element
    static void swap(int[] arr,int first, int second){
       int temp=arr[first];
       arr[first]=arr[second];
       arr[second]=temp;
    

    }
}

