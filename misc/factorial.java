package misc;
class factorial{

    public static int fact(int n)
    {
        if(n==1||n==0){
            return 1;
        }
        int decrement=fact(n-1);
        int fact_n=n*decrement;
        System.out.println(fact_n);

        return fact_n;
    }
public static void main(String args[]){
    int num=5;
    fact(num);
   
}
}