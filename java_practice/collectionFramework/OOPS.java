// class Pen{
//     String color;
//     String type;// ballpoint,get, etc
//     public void write(){
//     System.out.println("writing something");
//     }
//     public void printColor(){
//         System.out.println(this.color); 
//     }
// }
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.age);
        System.out.println(this.name);
    }

    Student(String name,int age){
        this.age=age;
        this.name=name;
        // System.out.println("constructor called");//this is a non parameterized constructor


    }
    
}



public class OOPS {

    public static void main(String[] args) {
        //  Pen pen1=new Pen();
        //  pen1.color="red";
        //  pen1.type="gel";
        //  pen1.write();

        //  Pen pen2=new Pen();
        //  pen2.color="blue";
        //  pen2.type="ballpoint";

        //  pen1.printColor();
        //  pen2.printColor();
         
        Student s1=new Student("aman",24);
        // s1.name="ayush";
        // s1.age=24;
        s1.printInfo(); 
    }

}
