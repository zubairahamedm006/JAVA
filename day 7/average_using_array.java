package Day07;
import java.util.*;
public class average_using_array {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter your size:");
        int a=input.nextInt();
        int [] id=new int[a];
        for(int i=0;i<a;i++){
            int b=input.nextInt();
            id[i]=b;
        }

        int length=id.length;
        int sum=0;
        for(int num:id){
            sum+=num;
        }
        float avg=(float)sum/length;
        System.out.println(sum);
        System.out.println(avg);
    }

}
