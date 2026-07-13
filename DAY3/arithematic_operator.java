package day_2;
import java.util.*;

public class arithematic_operator {
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter a number:");
        int a= sc.nextInt();
        System.out.print("enter a number:");
        int b= sc.nextInt();

        int c=a+b;
        System.out.println("Addition:"+c);
        int d=a-b;
        float e=a/b;
        int f=a*b;
        int g=a%b;
        System.out.println("Subraction:"+d);
        System.out.println("Multiplication:"+f);
        System.out.println("Division:"+e);
        System.out.println("Modulo:"+g);
        a++;
        System.out.println("Post increment:"+a);
        ++a;
        System.out.println("Pre increment:"+a);



    }

}
