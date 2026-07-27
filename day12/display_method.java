package Day12;
import java.util.*;
class E{
    int a;
    int b;
    String c;
    String d;
    E(int a){
        this.a=a;
    }
    void display(int a){
        System.out.println(a);
    }
    E(){

    }
    void display(){
        System.out.println("Display");
    }
    E(int a,int b){
        this.a=a;
        this.b=b;
    }
    void display(int a, int b){
        System.out.println(a+" "+b);
    }
    E(int a,String c){
        this.a=a;
        this.c=c;
    }
    void display(int a, String c){
        System.out.println(a+ " "+ c);
    }
    E(String c,String d){
        this.c=c;
        this.d=d;
    }
    void display(String c,String d){
        System.out.println(c+" "+d);
    }
}
public class display_method {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your value:");
        //int input=sc.nextInt();
        System.out.println("enter your value:");
        //int input1=sc.nextInt();
        String name=sc.nextLine();
        //E obj1=new E(input);
        //E obj2=new E(input1);
        E obj3=new E();


        //obj1.display(input);
        //obj2.display(input1);
          obj3.display();
    }
}
