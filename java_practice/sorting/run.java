import java.util.Scanner;
import ;
import java.util.Arrays;
class runJava{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();
        char character[]=new char[name.length()];
        for(int i=0;i<name.length();i++)
        {
            character[i]=name.charAt(i);
            if(character[i]=='a'||character[i]=='A'){
               character[i]='f';
            }

        }
        System.out.println("The new string after modification is "+ Arrays.toString(character));
  
    }
}
