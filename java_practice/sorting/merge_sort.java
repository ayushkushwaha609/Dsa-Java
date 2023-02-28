import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        

    }
    static int[]merge_sort(int[]arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.lenght/2;
        int []left=merge_sort(Arrays.copyOfRange(arr, 0, mid));
        int []right=merge_sort(Arrays.copyOfRange(arr,mid,arr.length ));
        return merge(left,right);
    }
    private static int[] merge(int[] firt,int[]second){
      int[] mix =new int [first.lenght+second.length];
      int i=0;
      int j=0;
      int k=0;
    }
}
