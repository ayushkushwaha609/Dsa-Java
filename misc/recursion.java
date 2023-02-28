package misc;

import java.util.Scanner;
class recursion{
    // The crux of recursion is that the outer function does 1 step assuming that the inner function will 
    // the rest of it
    // program 1- to print numbers from 1 to 5
    public static void print(int n)
    {
        if(n==0){
            return;
    
        }
        System.out.println(n);
        print(n-1);
      
        
    }
   
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number to be printed");
        int num=in.nextInt();
        print(num);
        

        
    }
}
